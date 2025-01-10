package com.schoolsystemapi.student;

import com.schoolsystemapi.course.CourseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "full_name", nullable = false)
    private String fullName = "";

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "dob", nullable = false)
    private String dob;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity course;

    @PrePersist
    @PreUpdate
    public void setFullName() {
        this.fullName = this.firstName + " " + this.lastName;
    }
}
