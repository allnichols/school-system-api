package com.schoolsystemapi.teacher.dto;

import com.schoolsystemapi.teacher.TeacherEntity;

public class TeacherMapper {

    public static TeacherCreationDTO toDTO(TeacherEntity teacherEntity) {
        return new TeacherCreationDTO();
    }

}
