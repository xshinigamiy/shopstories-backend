package com.shopstories.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/api/v1/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
