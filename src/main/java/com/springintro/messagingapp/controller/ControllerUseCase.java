package com.springintro.messagingapp.controller;
//Import required packages
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Base Path for all Endpoints
@RequestMapping("/request")
public class ControllerUseCase {
    //UC-01 Use of Get Request Method
    @GetMapping("/hello")
    public String callHello(){
        return "Hello From BridgeLabz"; //Return the message
    }

    //UC-02 Use Get Request and pass name and display results
    @GetMapping("/query")
    public String callQuery(@RequestParam String name){
        return "Hello "+name+" From BridgeLabz";
    }
}
