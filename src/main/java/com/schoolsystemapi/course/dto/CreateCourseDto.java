package com.schoolsystemapi.course.dto;

import com.schoolsystemapi.teacher.TeacherEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCourseDto {

    private String courseName;

    private TeacherEntity courseTeacher;

    private String gradeLevel;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public TeacherEntity getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(TeacherEntity courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
