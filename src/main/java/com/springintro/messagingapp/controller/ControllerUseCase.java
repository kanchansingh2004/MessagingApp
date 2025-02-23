package com.springintro.messagingapp.controller;
//Import required packages
import org.springframework.web.bind.annotation.*;

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

    //UC3- use GET request method & pass name as path variable
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello "+name+" from BridgeLabz";
    }

    //UC-04 use POST request method
    @PostMapping("/post")
    public String callPost(@RequestBody UserDTO user){
        return "Hello "+ user.getFirstName() + " " + user.getLastName() + " From BridgeLabz";
    }
}
