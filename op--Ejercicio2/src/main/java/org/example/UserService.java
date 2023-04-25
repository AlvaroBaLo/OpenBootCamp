package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;
    public UserService(NotificationService notificationService){
        System.out.println("Ejecutando gestor de notificacion de usuario.");
        this.notificationService=notificationService;
    }
}
