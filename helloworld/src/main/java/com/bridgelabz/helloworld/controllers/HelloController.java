package com.bridgelabz.helloworld.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello(){
        return "Hello, World";
    }

    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value="name") String name){
        return "Hello, "+name+"!";
    }

    @GetMapping("/path/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello, "+name+"!";
    }



}
