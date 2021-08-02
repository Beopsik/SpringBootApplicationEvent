package com.example.springbootapplicationevent;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartingEvent) {
        System.out.println("=========================");
        System.out.println("Application is Started");
        System.out.println("=========================");
    }
}
