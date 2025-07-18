// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.monitor.opentelemetry.autoconfigure.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.azure.monitor.opentelemetry.autoconfigure.implementation.models.ContextTagKeys;
import com.azure.monitor.opentelemetry.autoconfigure.implementation.models.TelemetryItem;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceId;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.data.StatusData;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

class SpanDataMapperTest {

    @Test
    void testMicrosoftUserIdMapping() {
        SpanData spanData = createSpanData(Attributes.builder().put("microsoft.user.id", "test-user-123").build());

        SpanDataMapper mapper = new SpanDataMapper(false, (b, r) -> {
        }, (e, s) -> false, (s, e) -> false);
        TelemetryItem result = mapper.map(spanData);

        assertNotNull(result);
        assertNotNull(result.getTags());
        assertEquals("test-user-123", result.getTags().get(ContextTagKeys.AI_USER_ID.toString()));
    }

    @Test
    void testMicrosoftSessionIdMapping() {
        SpanData spanData
            = createSpanData(Attributes.builder().put("microsoft.session.id", "test-session-456").build());

        SpanDataMapper mapper = new SpanDataMapper(false, (b, r) -> {
        }, (e, s) -> false, (s, e) -> false);
        TelemetryItem result = mapper.map(spanData);

        assertNotNull(result);
        assertNotNull(result.getTags());
        assertEquals("test-session-456", result.getTags().get(ContextTagKeys.AI_SESSION_ID.toString()));
    }

    @Test
    void testBothMicrosoftAttributesMapping() {
        SpanData spanData = createSpanData(Attributes.builder()
            .put("microsoft.user.id", "test-user-789")
            .put("microsoft.session.id", "test-session-101")
            .build());

        SpanDataMapper mapper = new SpanDataMapper(false, (b, r) -> {
        }, (e, s) -> false, (s, e) -> false);
        TelemetryItem result = mapper.map(spanData);

        assertNotNull(result);
        assertNotNull(result.getTags());
        assertEquals("test-user-789", result.getTags().get(ContextTagKeys.AI_USER_ID.toString()));
        assertEquals("test-session-101", result.getTags().get(ContextTagKeys.AI_SESSION_ID.toString()));
    }

    private SpanData createSpanData(Attributes attributes) {
        return new SpanData() {
            @Override
            public String getName() {
                return "test-span";
            }

            @Override
            public SpanKind getKind() {
                return SpanKind.INTERNAL;
            }

            @Override
            public SpanContext getSpanContext() {
                return SpanContext.create(TraceId.fromLongs(12345L, 67890L), SpanId.fromLong(12345L),
                    TraceFlags.getDefault(), TraceState.getDefault());
            }

            @Override
            public SpanContext getParentSpanContext() {
                return SpanContext.getInvalid();
            }

            @Override
            public StatusData getStatus() {
                return StatusData.create(StatusCode.OK, "");
            }

            @Override
            public long getStartEpochNanos() {
                return Instant.now().toEpochMilli() * 1_000_000;
            }

            @Override
            public Attributes getAttributes() {
                return attributes;
            }

            @Override
            public List<EventData> getEvents() {
                return Collections.emptyList();
            }

            @Override
            public List<LinkData> getLinks() {
                return Collections.emptyList();
            }

            @Override
            public long getEndEpochNanos() {
                return getStartEpochNanos() + 1_000_000;
            }

            @Override
            public boolean hasEnded() {
                return true;
            }

            @Override
            public int getTotalRecordedEvents() {
                return 0;
            }

            @Override
            public int getTotalRecordedLinks() {
                return 0;
            }

            @Override
            public int getTotalAttributeCount() {
                return attributes.size();
            }

            @Override
            public InstrumentationScopeInfo getInstrumentationScopeInfo() {
                return InstrumentationScopeInfo.create("test-scope", null, null);
            }

            @Override
            public Resource getResource() {
                return Resource.empty();
            }

            @Override
            public io.opentelemetry.sdk.common.InstrumentationLibraryInfo getInstrumentationLibraryInfo() {
                return io.opentelemetry.sdk.common.InstrumentationLibraryInfo.create("test-scope", null);
            }
        };
    }
}
