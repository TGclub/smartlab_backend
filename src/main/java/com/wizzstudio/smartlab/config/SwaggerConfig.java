package com.wizzstudio.smartlab.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;

@Import(SpringDataRestConfiguration.class)
@Configuration
public class SwaggerConfig {
    @Value("${swaggerhost}")
    private String swaggerHost;
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).host(swaggerHost)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("SmartLab")
                        .description("XDU 物理实验计算器 后端")
                        .version("0614.0125")
                        .contact(new Contact("Qht","https://www.117503445.top","t117503445@gmail.com"))
                        .build());
    }
}