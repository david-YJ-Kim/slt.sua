package com.plexter.sellter.agent;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiver {
    @JmsListener(destination = "your-jms-destination")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
