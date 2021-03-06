package com.example.springbootapplicationevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringBootApplicationEventApplication {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(SpringBootApplicationEventApplication.class);;
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}
