package com.example.RestAssuredIntegration.Contorllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @GetMapping("/greetings")
    public String controller1()
    {
       return "Hi vigix";
    }
}
