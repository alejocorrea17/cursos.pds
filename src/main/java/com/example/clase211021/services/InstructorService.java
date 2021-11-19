package com.example.clase211021.services;

import com.example.clase211021.entities.Instructor;

import java.util.List;

public interface InstructorService {
    List<Instructor> findAll();
    Instructor create(Instructor instructor);
}
