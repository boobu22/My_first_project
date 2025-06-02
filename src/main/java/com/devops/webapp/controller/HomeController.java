package com.devops.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to DevOps CI/CD Pipeline Demo!");
        model.addAttribute("version", "v1.0.0");
        return "index";
    }
    
    @GetMapping("/health")
    public String health(Model model) {
        model.addAttribute("status", "Application is running successfully!");
        return "health";
    }
}
