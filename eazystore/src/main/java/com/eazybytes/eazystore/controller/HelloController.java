package com.eazybytes.eazystore.controller;

@RestController
public class HelloController {
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }
}
