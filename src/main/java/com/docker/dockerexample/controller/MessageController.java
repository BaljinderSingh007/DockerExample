package com.docker.dockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("")
    public String getMessageDefault() {
        return "Hello Docker Default";
    }
    @GetMapping("/message")
    public String getMessage() {
     return "Hello Docker";
    }
}
