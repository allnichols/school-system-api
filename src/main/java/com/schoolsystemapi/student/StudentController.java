package com.schoolsystemapi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class StudentController {

    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @QueryMapping
    public StudentEntity getStudentById(@Argument("id") Long id) {
        return studentService.getStudentById(id);
    }



}
