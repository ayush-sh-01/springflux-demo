package com.example.reactivedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/")
    public Mono<String> home() {
        return Mono.just("✅ Spring WebFlux app is running successfully!");
    }

    @GetMapping("/hello")
    public Mono<String> sayHello() {
        return Mono.just("Hello from Spring WebFlux!");
    }
}
