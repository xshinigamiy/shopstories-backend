package com.shopstories.backend;

import com.shopstories.backend.pojo.LogInResponse;
import com.shopstories.backend.pojo.LoginRequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ApiController {

    @GetMapping(value = "/api/v1/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping(value = "/api/v1/login")
    public LogInResponse login(@RequestBody LoginRequestBody requestBody) throws InterruptedException {
        Thread.sleep(3000L);
        System.out.println(requestBody.toString());
        return new LogInResponse(UUID.randomUUID().toString());
    }

    @PostMapping(value = "/api/v1/logout/{userId}")
    public String logout(@PathVariable String userId) throws InterruptedException {
        System.out.println("user_id: " + userId);
        Thread.sleep(3000L);
        return "User Logged Out successfully";
    }
}
