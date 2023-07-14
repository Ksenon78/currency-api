package com.example.currency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyRepositoryConfig {

    @Bean
    public CurrencyRepository currencyRepository() {
        return new CurrencyRepositoryImpl();
    }
}

