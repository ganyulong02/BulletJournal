package com.bulletjournal.controller;

import com.bulletjournal.clients.UserClient;
import com.bulletjournal.controller.models.User;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/api/myself")
    public User getUser() {
        String username = MDC.get(UserClient.USER_NAME_KEY);
        return userClient.getUser(username);
    }
}
