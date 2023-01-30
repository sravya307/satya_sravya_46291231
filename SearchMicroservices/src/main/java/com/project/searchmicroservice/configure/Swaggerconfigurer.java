package com.project.searchmicroservice.configure;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;


@EnableSwagger2
//@Configuration
public class Swaggerconfigurer {


    @Bean
    Docket searchApi()
    {
        return new Docket(DocumentationType.SWAGGER_2)  //enabling swagger2
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.project.searchmicroservice"))
                .paths(PathSelectors.any())

                .build();
    }
}