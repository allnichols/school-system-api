package com.schoolsystemapi.teacher;

import java.util.List;

public interface TeacherService {
    List<TeacherEntity> getAllTeachers();
    TeacherEntity getTeacher(Long id);

}
