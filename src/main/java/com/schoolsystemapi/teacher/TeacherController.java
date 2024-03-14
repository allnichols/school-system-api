package com.schoolsystemapi.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TeacherController {
    private TeacherService teacherService;


    @QueryMapping
    public List<TeacherEntity> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
}
