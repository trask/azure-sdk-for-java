// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.tracing.opentelemetry.samples;

import com.azure.data.appconfiguration.ConfigurationClient;
import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;

import java.util.Map;

/**
 * Sample to demonstrate using the logging span exporter to export telemetry events when creating a configuration
 * in App Configuration through the {@link ConfigurationClient}.
 */
public class CreateConfigurationSettingLoggingExporterSample {
    private static final String CONNECTION_STRING = "<YOUR_CONNECTION_STRING>";

    /**
     * The main method to run the application.
     *
     * @param args Ignored args.
     */
    @SuppressWarnings("try")
    public static void main(String[] args) {
        OpenTelemetry openTelemetry = AutoConfiguredOpenTelemetrySdk.builder()
            .addPropertiesSupplier(() -> Map.of("otel.traces.exporter", "logging"))
            .build()
            .getOpenTelemetrySdk();

        ConfigurationClient client = new ConfigurationClientBuilder()
            .connectionString(CONNECTION_STRING)
            .buildClient();

        Tracer tracer = openTelemetry.getTracer("sample");

        Span span = tracer.spanBuilder("my-span").startSpan();
        try (Scope s = span.makeCurrent()) {
            // current span propagates into synchronous calls automatically. ApplicationInsights or OpenTelemetry agent
            // also propagate context through async reactor calls.
            client.setConfigurationSetting("hello", "text", "World");
        } finally {
            span.end();
        }
    }
}
