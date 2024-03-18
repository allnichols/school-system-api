package com.schoolsystemapi.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "class")
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name", nullable = false)
    private String className;

    @Column(name = "class_teacher", nullable = false)
    private String classTeacher;
}
