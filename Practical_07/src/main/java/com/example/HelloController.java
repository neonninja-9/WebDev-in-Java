package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class HelloController {

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Student") String name, Model m) {
        m.addAttribute("message", "Welcome to Spring MVC, " + name + "!");
        return "greet";
    }

    @GetMapping("/about")
    public String about(Model m) {
        m.addAttribute("message", "Advanced Java Programming Lab - Spring MVC");
        return "greet";
    }
}
