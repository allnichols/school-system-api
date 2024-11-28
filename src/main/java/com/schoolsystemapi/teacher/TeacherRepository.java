package com.schoolsystemapi.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
    boolean existsByEmail(String email);

    List<TeacherEntity> findByFullNameContainingIgnoreCase(String name);
}
