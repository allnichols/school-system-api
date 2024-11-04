package com.schoolsystemapi.course.dto;

import com.schoolsystemapi.teacher.TeacherEntity;
import lombok.*;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCourseDto {
    @Setter
    private String courseName;

    @Setter
    private String gradeLevel;

    @Setter
    private Long teacherId;


}
