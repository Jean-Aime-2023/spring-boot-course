package com.example.runners;


import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage(){
        return "Welcome to my fisrt professional spring boot app";
    }
}
