package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// @RestController is shorthand for @Controller and @ResponseBody
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // Jackson 2 is on classpath, so Spring's MappingJackson2HttpMessageConverter
    // is automatically chosen to convert the Greeting instance to JSON
    // curl http://localhost:8080/greeting
    // curl http://localhost:8080/greeting?name=SpringOne
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
