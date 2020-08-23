package com.louie.config;

import com.louie.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.louie.pojo")
public class ConfigLouie {

    @Bean
    public User user() {
        return new User();
    }
}
