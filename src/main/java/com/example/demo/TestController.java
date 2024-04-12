package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/msg")
    public String welcome() {
        return "welcome message";
    }

    @PostMapping("msg")
    public String welcome(@RequestParam String str) {
        return "welcome message:" + str;
    }

}
