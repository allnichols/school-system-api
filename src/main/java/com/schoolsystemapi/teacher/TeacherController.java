package com.schoolsystemapi.teacher;
import com.schoolsystemapi.teacher.dto.TeacherCreationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    private TeacherCreationDTO teacherCreationDTO;

    @GetMapping
    public List<TeacherEntity> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public TeacherEntity getTeacherById(@PathVariable("id") Long id) {
        return teacherService.getTeacherById(id);
    }


    public List<TeacherEntity> searchTeachers(@RequestParam String name) {
        return teacherService.searchTeachers(name);
    }

    @PostMapping
    public TeacherEntity createTeacher(@RequestBody TeacherCreationDTO teacher) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setFirstName(teacher.getFirstName());
        teacherEntity.setLastName(teacher.getLastName());
        teacherEntity.setDob(teacher.getDob());
        teacherEntity.setEmail(teacher.getEmail());

        return teacherService.createTeacher(teacherEntity);

    }

}
