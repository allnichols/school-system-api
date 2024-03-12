package com.schoolsystemapi.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<TeacherEntity> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public TeacherEntity getTeacher(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }
}
