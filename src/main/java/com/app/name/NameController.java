package com.app.name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/")
    public String getName(){
        return "Esteban Cristancho Railway";
    }
}
