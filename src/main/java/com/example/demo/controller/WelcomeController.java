package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller("welcome")
public class WelcomeController {
    public WelcomeController() {
        System.out.println("WelcomeController");
    }

    public void welcome() {
    System.out.println("Welcome to Spring Boot");
}

}
