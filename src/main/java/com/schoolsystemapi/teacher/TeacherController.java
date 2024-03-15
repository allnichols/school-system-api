package com.schoolsystemapi.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
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
    public TeacherEntity getTeacherById(Long id) {
        return teacherService.getTeacherById(id);
    }

    @MutationMapping
    public TeacherEntity createTeacher(@Argument("teacher") TeacherEntity teacher) {
        System.out.println(teacher);
//        need to create a dto for teacher creation
      if(teacher.getId() == null){
          return null;
      }

        return teacherService.createTeacher(teacher);

    }
}
