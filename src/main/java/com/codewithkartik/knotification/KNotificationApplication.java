package com.codewithkartik.knotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KNotificationApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(KNotificationApplication.class, args);

        NotificationManager manager = context.getBean("notificationManager", NotificationManager.class);
        manager.sendNotification("Hello, this is a test notification!");

    }

}
