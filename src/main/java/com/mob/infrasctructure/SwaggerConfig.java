package com.mob.infrasctructure;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI baseOpenAPI(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("RTI Performance API")
                                .description("API responsible for managing patients.")
                                .version("v1")
                                .license(
                                        new License()
                                                .name("Proprietary License")
                                                .url(""))
                                .contact(new Contact().name("Thayrone").email("thayrone.dev@gmail.com")));
    }
}
