package com.bihan.boilerplate.rest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
    @Profile("dev")
    @Bean
    public void devDatabaseConnection() {
        System.out.println("Current Profile: Dev");
    }

    @Profile("prod")
    @Bean
    public void prodDatabaseConnection() {
        System.out.println("Current Profile: Prod");
    }

}
