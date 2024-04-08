package com.schoolsystemapi.course;

import com.schoolsystemapi.course.dto.CreateCourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> getAllCourses() {
        if(courseRepository.findAll().isEmpty()){
            return List.of();
        }
        return courseRepository.findAll();
    }

    public CourseEntity getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public CourseEntity createCourse(CreateCourseDto createCourseDto) {
        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setCourseName(createCourseDto.getCourseName());
        courseEntity.setCourseTeacher(createCourseDto.getCourseTeacher());
        courseEntity.setGradeLevel(createCourseDto.getGradeLevel());
        return courseRepository.save(courseEntity);
    }

}
