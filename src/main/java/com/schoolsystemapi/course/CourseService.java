package com.schoolsystemapi.course;

import com.schoolsystemapi.course.dto.CreateCourseDto;

import java.util.List;

public interface CourseService {

    List<CourseEntity> getAllCourses();
    CourseEntity getCourseById(Long id);
    CourseEntity createCourse(CourseEntity classEntity);
}
