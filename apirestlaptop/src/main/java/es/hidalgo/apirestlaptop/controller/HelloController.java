package es.hidalgo.apirestlaptop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola/laptop")
    public String holaLaptop(){
        return " Hola Laptop";
    }
}
