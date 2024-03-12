package com.schoolsystemapi.teacher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@DgsComponent
@Controller
public class TeacherDataFetcher {
    @Autowired
    private TeacherService teacherService;

    @DgsQuery(field = "teachers")
    public List<TeacherEntity> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
}
