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


    public TeacherEntity createTeacher(TeacherEntity teacher) {

        if(teacher.getId() == null){
            throw new RuntimeException("Teacher id cannot be null");
        }

        if(teacherRepository.findById(teacher.getId()).isPresent()){
            throw new RuntimeException("Teacher with id " + teacher.getId() + " already exists");
        }

        return teacherRepository.save(teacher);
    }
}
