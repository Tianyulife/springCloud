package com.han.springCloud.alibaba.config;

import brave.baggage.BaggageFields;
import brave.baggage.CorrelationScopeConfig;
import brave.context.slf4j.MDCScopeDecorator;
import brave.propagation.CurrentTraceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/3/2023 20:13
 * @Description: com.han.springCloud.config
 */
@Configuration
public class ZipkinConfig {
    @Bean
    CurrentTraceContext.ScopeDecorator legacyIds() {
        return MDCScopeDecorator.newBuilder()
                .clear()
                .add(CorrelationScopeConfig.SingleCorrelationField.newBuilder(BaggageFields.TRACE_ID)
                        .name("X-B3-TraceId").build())
                .add(CorrelationScopeConfig.SingleCorrelationField.newBuilder(BaggageFields.PARENT_ID)
                        .name("X-B3-ParentSpanId").build())
                .add(CorrelationScopeConfig.SingleCorrelationField.newBuilder(BaggageFields.SPAN_ID)
                        .name("X-B3-SpanId").build())
                .add(CorrelationScopeConfig.SingleCorrelationField.newBuilder(BaggageFields.SAMPLED)
                        .name("X-Span-Export").build())
                .build();
    }
}
