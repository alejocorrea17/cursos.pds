package com.example.clase211021.repository;

import com.example.clase211021.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
