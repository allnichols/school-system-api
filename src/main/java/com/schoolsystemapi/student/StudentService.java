package com.schoolsystemapi.student;

import java.util.List;

public interface StudentService {

    List<StudentEntity> getAllStudents();

    StudentEntity getStudentById(Long id);

    StudentEntity createStudent(StudentEntity studentEntity);

    StudentEntity updateStudent(Long id, StudentEntity studentEntity);

}
