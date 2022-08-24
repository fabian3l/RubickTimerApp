package pl.lepsy.rubicktimerapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;

@RestController
public class Test {


    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
