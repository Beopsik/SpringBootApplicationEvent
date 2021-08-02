package com.example.springbootapplicationevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationEventApplication {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(SpringBootApplicationEventApplication.class);
        app.addListeners(new SampleListener());
        app.run(args);
    }
}
