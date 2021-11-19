package com.example.clase211021.controller;

import com.example.clase211021.entities.Instructor;
import com.example.clase211021.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Instructor")
public class InstructorController {

    @Autowired
    private InstructorService service;

    @GetMapping
    List<Instructor> findAll(){
        return service.findAll();
    }
    @PostMapping
    public Instructor create(@RequestBody Instructor instructor){
        return service.create(instructor);
    }
}
