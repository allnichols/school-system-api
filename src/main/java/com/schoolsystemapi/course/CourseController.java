package com.schoolsystemapi.course;

import com.schoolsystemapi.course.dto.CreateCourseDto;
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


        @MutationMapping
        public CourseEntity createCourse(@Argument("course") CreateCourseDto createCourse) {
            return courseService.createCourse(createCourse);
        }

        @MutationMapping
        public CourseEntity updateCourse(@Argument("id") Long id, @Argument("course") CreateCourseDto createCourse) {
            return courseService.updateCourse(id, createCourse);
        }


}
