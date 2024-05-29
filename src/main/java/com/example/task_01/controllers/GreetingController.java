package com.example.task_01.controllers;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {

    // will appear when client requests localhost:8080/greeting
    @GetMapping
    public Greeting greeting(@RequestParam(defaultValue = "world") String timeOfDay) {
        return new Greeting("Chuck", timeOfDay);
    }

}
