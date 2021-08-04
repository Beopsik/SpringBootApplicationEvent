package com.example.springbootapplicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    BeobSikProperties beobSikProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("====================");
        System.out.println(beobSikProperties.getName());
        System.out.println(beobSikProperties.getAge());
        System.out.println(beobSikProperties.getFullName());
        System.out.println("====================");
    }
}
