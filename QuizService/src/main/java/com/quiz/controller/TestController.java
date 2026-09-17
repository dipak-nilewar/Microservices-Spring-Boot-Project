package com.quiz.controller;

import org.springframework.web.bind.annotation.RestController;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/quiz-test")
public class TestController {

    @GetMapping
    public String gateway() {
        return "thiss is a test controller";
    }

}
