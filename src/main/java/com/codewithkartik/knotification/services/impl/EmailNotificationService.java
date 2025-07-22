package com.codewithkartik.knotification.services.impl;

import com.codewithkartik.knotification.services.NotificationService;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendMessage(String message) {
         System.out.println("Sending email notification: " + message);
    }
}
