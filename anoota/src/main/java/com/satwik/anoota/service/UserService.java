// UserService.java
package com.satwik.anoota.service;

import com.satwik.anoota.repository.UserRepository;
import com.satwik.anoota.service.NotificationService.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final NotificationService notificationService;

    public UserService(
            @Qualifier("EmailNotification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void getUserName(){
        System.out.println(userRepository.getUsername());
    }

    public void display() {
        notificationService.sendNotification();
    }
}