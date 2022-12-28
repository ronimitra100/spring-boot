package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1L,"Learn AWS","in28Minutes"),
                new Course(2L, "Learn DevOps", "in28Minutes"),
                new Course(3L, "Learn Azure", "in28Minutes"),
                new Course(4L, "Learn GCP", "in28Minutes")
        );
    }
}
