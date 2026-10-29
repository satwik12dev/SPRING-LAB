package com.satwik.anoota.service.NotificationService;


import org.springframework.stereotype.Service;


@Service("EmailNotification")
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Email Notification");
    }
}
