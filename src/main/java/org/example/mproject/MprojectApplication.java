package org.example.mproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "hi")
public class MprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MprojectApplication.class, args);

    }
    @GetMapping
    public String print(){
        return "Hello World";
    }


}
