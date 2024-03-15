package com.schoolsystemapi.teacher;


import java.util.List;

public interface TeacherService {
    List<TeacherEntity> getAllTeachers();
    TeacherEntity getTeacherById(Long id);

    TeacherEntity createTeacher(TeacherEntity teacher);

}
