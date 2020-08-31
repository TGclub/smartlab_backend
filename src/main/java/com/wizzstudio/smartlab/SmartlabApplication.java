package com.wizzstudio.smartlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
@EnableOpenApi
@SpringBootApplication
public class SmartlabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartlabApplication.class, args);
    }

}
