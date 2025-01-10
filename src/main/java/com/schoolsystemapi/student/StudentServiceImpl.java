package com.schoolsystemapi.student;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    public List<StudentEntity> getAllStudents() {
        if(studentRepository.findAll().isEmpty()){
            return List.of();
        }

        return studentRepository.findAll();
    }

    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return null;
    }

    public StudentEntity updateStudent(Long id, StudentEntity studentEntity) {
        return null;
    }

}
