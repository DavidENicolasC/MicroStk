package com.valhalla.microstk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    String holaMundo() 
    {
        return "Hola Mundo";
    }
}