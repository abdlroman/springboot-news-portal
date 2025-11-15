package com.example.newsportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class NewsPortalApplication {

    @GetMapping("/")
    public String home() {
        return "Welcome to Abdul's News Portal 🚀";
    }

    public static void main(String[] args) {
        SpringApplication.run(NewsPortalApplication.class, args);
    }
}
