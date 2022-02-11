package com.java.coffeeblend.coffeeblend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
)
public class CoffeeBlendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeBlendApplication.class, args);
    }

}
