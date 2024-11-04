package com.schoolsystemapi.teacher;
import com.schoolsystemapi.teacher.dto.TeacherCreationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    private TeacherCreationDTO teacherCreationDTO;

    @QueryMapping
    public List<TeacherEntity> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @QueryMapping
    public TeacherEntity getTeacherById(@Argument("id") Long id) {
        return teacherService.getTeacherById(id);
    }

    @MutationMapping
    public TeacherEntity createTeacher(@Argument("teacher") TeacherCreationDTO teacher) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setFirstName(teacher.getFirstName());
        teacherEntity.setLastName(teacher.getLastName());
        teacherEntity.setDob(teacher.getDob());
        teacherEntity.setEmail(teacher.getEmail());

        return teacherService.createTeacher(teacherEntity);

    }

}
