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

        private CreateCourseDto createCourseDto;

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
            CourseEntity courseEntity = new CourseEntity();
            courseEntity.setCourseName(createCourse.getCourseName());
            courseEntity.setGradeLevel(createCourse.getGradeLevel());
            courseEntity.setCourseTeacher(createCourse.getCourseTeacher());

            return courseService.createCourse(courseEntity);
        }

}
