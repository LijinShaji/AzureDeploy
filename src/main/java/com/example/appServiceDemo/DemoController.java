package com.example.appServiceDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam("data") String name) {
        return "Hello " + name;
    }
}
