package com.schoolsystemapi.course;

import com.schoolsystemapi.teacher.TeacherEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "course_teacher_id", nullable = false)
    private TeacherEntity courseTeacher;

    @Column(name = "grade_level", nullable = false)
    private String gradeLevel;

}
