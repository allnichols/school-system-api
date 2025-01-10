package com.schoolsystemapi.course;

import com.schoolsystemapi.student.StudentEntity;
import com.schoolsystemapi.teacher.TeacherEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
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

    @Column(name = "grade_level", nullable = false)
    private String gradeLevel;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private TeacherEntity teacher;

    @OneToMany(mappedBy = "course")
    private List<StudentEntity> students;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setTeacher(TeacherEntity teacher) { this.teacher = teacher; }
}
