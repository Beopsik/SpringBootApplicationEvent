package com.example.springbootapplicationevent;

import com.example.springbootapplicationevent.config.BaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private BeobSikProperties beobSikProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("====================");
        System.out.println(hello);
        System.out.println(beobSikProperties.getName());
        System.out.println(beobSikProperties.getFullName());
        System.out.println("====================");
    }
}
