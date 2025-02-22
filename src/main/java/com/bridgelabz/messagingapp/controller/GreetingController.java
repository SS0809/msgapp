package com.bridgelabz.messagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    //Get Mapping
    @GetMapping("/sayhello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
    //Post Mapping
    @PostMapping("/hello")
    public String postHello(@RequestBody String name){
        return "hello for "+ name + " from Post";
    }
    //Put Mapping
    @PutMapping("/hello")
    public String putHello(@RequestBody String name){
        return "hello for "+ name +" from Put";
    }
    //Delete Mapping
    @DeleteMapping("/deletehello")
    public String deleteHello(@RequestBody String name){
        return "hello "+name+" deleted";
    }
}
