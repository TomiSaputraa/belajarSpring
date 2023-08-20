package com.belajar.belajarspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// Ini adalah contoh sederhana konfigurasi swagger
@Configuration
@EnableWebMvc
public class SwaggerConfiguration implements WebMvcConfigurer {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.belajar.belajarspring"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiInfoMetaData());
    }

    private ApiInfo apiInfoMetaData() {

        return new ApiInfoBuilder().title("Tutorial Swagger")
                .description("Belajar Spring Boot")
                .contact(new Contact("Tomi Saputra", "https://tomisaputra.my.id/", ""))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.1.1")
                .build();
    }

}