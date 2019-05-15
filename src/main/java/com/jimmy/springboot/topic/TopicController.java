package com.jimmy.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topicId}")
    // could have mapped it to {id} to match the parameter being passed into getTopic
    // but did this to show we can map what we wanna map
    public Topic getTopic(@PathVariable("topicId") String id) {
        return topicService.getTopic(id);
    }

    // if you wanna be verbose you can set the method=Request.GET for default @RequestMappings
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    // @RequestBody takes a JSON object in the request body and map it to the topic object
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
