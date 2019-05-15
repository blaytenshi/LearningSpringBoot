package com.jimmy.springboot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// the second generic type String is the type of the @Id of topic
public interface CourseRepository extends CrudRepository<Course, String> {
    // there's already methods to get/put/update/post (see in the CourseService)
    // all you have to do is add your custom stuff (if you have any)

    // this is a custom repository method. the format of it is:
    // findBy - tells JPA to find all items filtered by
    // Topic - the property in Course Entity
    // Id - the property inside the Topic property
    public List<Course> findByTopicId(String topidId);

}
