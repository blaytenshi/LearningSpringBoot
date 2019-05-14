package com.jimmy.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Spring Framework", "Spring Framework Description"),
                new Topic("2", "Spring Boot", "Spring Boot Description"),
                new Topic("3", "Spring WebMVC", "Spring WebMVC Description")
        );
    }
}
