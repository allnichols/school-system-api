package com.schoolsystemapi.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherEntity> getAllTeachers() {
        if(teacherRepository.findAll().isEmpty()){
            return List.of();
        }
        return teacherRepository.findAll();
    }

    public TeacherEntity getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }


    public List<TeacherEntity> searchTeachers(String name) {
        return teacherRepository.findByFullNameContainingIgnoreCase(name);
    }

    public TeacherEntity createTeacher(TeacherEntity teacher) {

        if(teacherRepository.existsByEmail(teacher.getEmail())){
            throw new IllegalArgumentException("Email already in use");
        }

        return teacherRepository.save(teacher);
    }
}
