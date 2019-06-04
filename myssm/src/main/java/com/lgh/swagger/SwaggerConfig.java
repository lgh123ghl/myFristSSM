package com.lgh.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LGH
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages="com.lgh.controller")
public class SwaggerConfig {
    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.lgh.controller")).build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("李光辉的 API").description("学习DEMO（SSM）方便线上测试，集成SWAGGER").termsOfServiceUrl("http://localhost:8080").version("1.0").build();
    }
}