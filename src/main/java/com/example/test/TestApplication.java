package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {


    // echo "# cicdtest" >> README.md
    //git init
    //git add README.md
    //git commit -m "first commit"
    //git branch -M main
    //git remote add origin git@github.com:TahaGargourii/cicdtest.git
    //git push -u origin main
    @GetMapping("/hello")
    public String hello (){
        return "hello" ;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
