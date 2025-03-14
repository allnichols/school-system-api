package com.schoolsystemapi.course;

import com.schoolsystemapi.course.dto.CreateCourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
        @Autowired
        private CourseService courseService;

        @GetMapping
        public List<CourseEntity> getAllCourses() {
            return courseService.getAllCourses();
        }

        @GetMapping("/{id}")
        public CourseEntity getCourseById(@PathVariable Long id) {
            return courseService.getCourseById(id);
        }


        @PostMapping
        public CourseEntity createCourse(@RequestBody CreateCourseDto createCourse) {
            return courseService.createCourse(createCourse);
        }

//        @PutMapping("/{id}")
//        public CourseEntity updateCourse(@PathVariable Long id, @Argument("course") CreateCourseDto createCourse) {
//            return courseService.updateCourse(id, createCourse);
//        }


}
