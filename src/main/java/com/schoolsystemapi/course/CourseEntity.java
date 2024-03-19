package com.schoolsystemapi.course;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "course_teacher", nullable = false)
    private String courseTeacher;

    @Column(name = "grade_level", nullable = false)
    private String gradeLevel;
// add a enum here for grade level?



    public CourseEntity() {
    }

    public CourseEntity(Long id, String courseName, String courseTeacher) {
        this.id = id;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
