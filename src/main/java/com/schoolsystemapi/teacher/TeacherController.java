package com.schoolsystemapi.teacher;
import com.schoolsystemapi.teacher.dto.TeacherCreationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @QueryMapping
    public List<TeacherEntity> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @QueryMapping
    public TeacherEntity getTeacher(Long id) {
        return teacherService.getTeacher(id);
    }

    @QueryMapping
    public TeacherEntity createTeacher(TeacherEntity teacher) {
        return teacherService.createTeacher(teacher);
    }
}
