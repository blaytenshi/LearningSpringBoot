package com.jimmy.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        // topics::add is known as a 'method reference', it's essentially letting you to call the .add() method
        // for each topic that gets returned from findAll()
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        // Hmmm what is .get()
        // return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id);
    }

    public void addCourse(Course topic) {
        courseRepository.save(topic);
    }

    public void updateCourse(Course topic) {
        courseRepository.save(topic);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
