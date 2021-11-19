package com.example.clase211021.controller;

import com.example.clase211021.entities.Course;
import com.example.clase211021.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Course")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    List<Course> findAll(){
        return service.findAll();
    }

    @PostMapping
    public  Course create(@RequestBody Course course){
        return service.create(course);
    }
}
