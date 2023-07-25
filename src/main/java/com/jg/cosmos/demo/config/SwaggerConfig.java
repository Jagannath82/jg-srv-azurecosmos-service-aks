package com.jg.cosmos.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    /*@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller.api"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfoMetaData());
    }

    private ApiInfo apiInfoMetaData() {

        return new ApiInfoBuilder().title("API Documentation")
                .description("Describing the purpose of the API")
                .contact(new Contact("Dev-Team", "https://www.payment.example.com/", "nzuwera2002@gmail.com"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }*/
}
