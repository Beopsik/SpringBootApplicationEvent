package com.example.springbootapplicationevent;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("foo: "+args.containsOption("foo"));
        System.out.println("bar: "+args.containsOption("bar"));
    }
}
