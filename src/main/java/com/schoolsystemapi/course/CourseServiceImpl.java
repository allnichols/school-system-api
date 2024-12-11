package com.schoolsystemapi.course;

import com.schoolsystemapi.course.dto.CreateCourseDto;
import com.schoolsystemapi.teacher.TeacherEntity;
import com.schoolsystemapi.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TeacherService teacherService;

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
        Optional<CourseEntity> doesCourseExist = courseRepository.findByCourseNameAndGradeLevel(
                createCourseDto.getCourseName(), createCourseDto.getGradeLevel()
        );

        if(doesCourseExist.isPresent()) {
            throw new IllegalArgumentException("Course already exists");
        }

        TeacherEntity teacher = teacherService.getTeacherById(createCourseDto.getTeacherId());
        CourseEntity course = new CourseEntity();
        course.setCourseName(createCourseDto.getCourseName());
        course.setGradeLevel(createCourseDto.getGradeLevel());
        course.setTeacher(teacher);



        return courseRepository.save(course);
    }

    public CourseEntity updateCourse(Long id, CreateCourseDto createCourseDto) {
        System.out.println(id);
        if(id == null) {
            throw new IllegalArgumentException("Course ID is required");
        }

        CourseEntity course = courseRepository.findById(id).orElse(null);

        if(course == null) {
            System.out.println("Course does not exist");
            throw new IllegalArgumentException("Course does not exist");
        }

        if(createCourseDto.getCourseName() != null){
            course.setCourseName(createCourseDto.getCourseName());
        }

        if(createCourseDto.getGradeLevel() != null) {
            course.setGradeLevel(createCourseDto.getGradeLevel());
        }

        if(createCourseDto.getTeacherId() != null) {
            TeacherEntity teacher = teacherService.getTeacherById(createCourseDto.getTeacherId());
            course.setTeacher(teacher);
        }

        return courseRepository.save(course);
    }

}
