package dj.poc.spring.security.ldap.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agrawald on 8/7/17.
 */
@RestController
public class ApplicationController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
