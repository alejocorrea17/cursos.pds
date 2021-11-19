package com.example.clase211021.services;

import com.example.clase211021.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course create(Course course);
}
