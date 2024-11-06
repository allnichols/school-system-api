package com.schoolsystemapi.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    Optional<CourseEntity> findByCourseNameAndGradeLevel(String courseName, String gradeLevel);
}
