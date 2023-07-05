package com.han.springCloud.alibaba.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 6/24/2023 20:31
 * @Description: com.han.redisjedis.config
 */
@Configuration
public class SwaggerUIConfig {


    /**
     * 分组设置
     * @return
     */
    @Bean
    public GroupedOpenApi OrderApi() {
        return GroupedOpenApi.builder()
                .group("所有")
                .pathsToMatch("/*/**")
                .build();
    }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("SpringCloudTestAPI")
                        .description("Spring Cloud sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}
