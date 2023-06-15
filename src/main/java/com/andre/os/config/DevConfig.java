package com.andre.os.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andre.os.services.DBService;

@Configuration
@Profile("dev")

public class DevConfig {
    @Autowired
    private DBService service;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Bean
    public boolean instaciaBD() {
        if (ddl.equals("create")) {
            this.service.instaciaBD();
        }
        return false;
    }

}
