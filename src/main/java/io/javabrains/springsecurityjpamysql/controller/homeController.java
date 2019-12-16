package io.javabrains.springsecurityjpamysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class homeController {

    @GetMapping("/")
    public String homePage() {
        return "home page";
    }

    @GetMapping("/user")
    public String userHomePage() {
        return "Users home page";
    }

    @GetMapping("/admin")
    public String adminHomePage() {
        return "Admin home page";
    }

}
