package com.example.jenkinspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinspipelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinspipelineApplication.class, args);
    }

    @GetMapping
    public String get() {
        return "Hello Jenkins";
    }
}
