package com.example;import org.springframework.web.bind.annotation.*;@RestController public class HomeController {@GetMapping("/") public String home(){return "Spring Boot WAR deployed on Tomcat";}}
