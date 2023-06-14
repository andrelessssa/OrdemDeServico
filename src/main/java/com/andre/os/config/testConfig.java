package com.andre.os.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andre.os.services.DBService;

@Configuration
@Profile("Teste")

public class testConfig {
    @Autowired
    private DBService service;

    @Bean
    public void instaciaBD() {
        this.service.instaciaBD();
    }

}
