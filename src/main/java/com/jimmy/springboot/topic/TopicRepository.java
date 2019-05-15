package com.jimmy.springboot.topic;

import org.springframework.data.repository.CrudRepository;

// the secong generic type String is the type of the @Id of topic
public interface TopicRepository extends CrudRepository<Topic, String> {
    // there's already methods to get/put/update/post (see in the TopicService)
    // all you have to do is add your custom stuff (if you have any)
}
