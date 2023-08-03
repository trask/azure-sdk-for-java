// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.tracing.opentelemetry.samples;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;

/**
 * Sample to demonstrate using the default OTLP/gRPC span exporter to export telemetry events when asynchronously
 * creating and listing secrets from a Key Vault using the {@link SecretClient}.
 */
public class ListKeyVaultSecretsOtlpExporterSample {
    private static final String VAULT_URL = "<YOUR_VAULT_URL>";

    /**
     * The main method to run the application.
     *
     * @param args Ignored args.
     */
    @SuppressWarnings("try")
    public static void main(String[] args) {
        OpenTelemetry openTelemetry = AutoConfiguredOpenTelemetrySdk.initialize().getOpenTelemetrySdk();
        Tracer tracer = openTelemetry.getTracer("sample");

        SecretClient secretClient = new SecretClientBuilder()
            .vaultUrl(VAULT_URL)
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

        Span span = tracer.spanBuilder("my-span").startSpan();
        try (Scope s = span.makeCurrent()) {
            // current span propagates into synchronous calls automatically. ApplicationInsights or OpenTelemetry agent
            // also propagate context through async reactor calls.
            secretClient.setSecret(new KeyVaultSecret("StorageAccountPassword", "password"));
            secretClient.listPropertiesOfSecrets().forEach(secretProperties -> {
                KeyVaultSecret secret = secretClient.getSecret(secretProperties.getName());
                System.out.printf("Retrieved Secret with name: %s%n", secret.getName());
            });
        } finally {
            span.end();
        }
    }
}
