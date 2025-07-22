package com.codewithkartik.knotification.services.impl;

import com.codewithkartik.knotification.services.NotificationService;
import org.springframework.stereotype.Service;

@Service("sms")
public class MessagelNotificationService implements NotificationService {

    @Override
    public void sendMessage(String message) {
         System.out.println("Sending SMS notification: " + message);
    }
}
