package com.docker.dockerexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private static final Logger log = LoggerFactory.getLogger(MessageController.class);
    @GetMapping("")
    public String getMessageDefault() {
        log.info("Hello Docker Default");
        return "Hello Docker Default";
    }
    @GetMapping("/message")
    public String getMessage() {
        log.info("Hello Docker");
     return "Hello Docker";
    }
}
