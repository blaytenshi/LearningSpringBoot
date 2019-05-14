package com.jimmy.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // this is only for GET methods
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi!";
    }

}
