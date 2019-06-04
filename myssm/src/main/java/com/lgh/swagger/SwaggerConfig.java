package com.lgh.swagger;

import com.common.util.PropertiesUtil;
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
    PropertiesUtil propertiesUtil = new PropertiesUtil("/bussconf.properties");
    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.lgh.controller")).build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(propertiesUtil.getString("SWAGGER.TITEL")).description(propertiesUtil.getString("SWAGGER.DESCRIPTON")).termsOfServiceUrl(propertiesUtil.getString("SWAGGER.URL")).version(propertiesUtil.getString("SWAGGER.VERTION")).build();
    }
}