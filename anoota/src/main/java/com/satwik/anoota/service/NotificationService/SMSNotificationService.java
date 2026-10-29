// SMSNotificationService.java
package com.satwik.anoota.service.NotificationService;

import com.satwik.anoota.service.NotificationService.NotificationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("SMSNotification")
public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
    }
}