package com.dikea.gh.actions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Value("${spring.profiles.active}")
    private String activeProfile;
    
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from SpringBoot!");
    }

    @GetMapping("/profile")
    public String getActiveProfile() {
        return "Active Profile: " + activeProfile;
    }
}
