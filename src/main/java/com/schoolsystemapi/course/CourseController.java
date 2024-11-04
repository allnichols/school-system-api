package com.schoolsystemapi.course;

import com.schoolsystemapi.course.dto.CreateCourseDto;
import com.schoolsystemapi.teacher.TeacherEntity;
import com.schoolsystemapi.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Controller
public class CourseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CourseController.class);
        @Autowired
        private CourseService courseService;

        @Autowired
        private TeacherService teacherService;

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
           LOGGER.info("Teacher ID: " + createCourse);
            return courseService.createCourse(courseEntity);
        }

}
