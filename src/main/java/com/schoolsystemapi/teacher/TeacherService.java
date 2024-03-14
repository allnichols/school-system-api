package com.schoolsystemapi.teacher;

import com.schoolsystemapi.teacher.dto.TeacherCreationDTO;

import java.util.List;

public interface TeacherService {
    List<TeacherEntity> getAllTeachers();
    TeacherEntity getTeacher(Long id);

    TeacherEntity createTeacher(TeacherEntity teacher);

}
