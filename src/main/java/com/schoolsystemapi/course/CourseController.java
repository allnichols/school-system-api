package com.schoolsystemapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {

        @Autowired
        private CourseService courseService;

        @QueryMapping
        public List<CourseEntity> getAllCourses() {
            return courseService.getAllCourses();
        }

        @QueryMapping
        public CourseEntity getCourseById(@Argument("id") Long id) {
            return courseService.getCourseById(id);
        }

}
