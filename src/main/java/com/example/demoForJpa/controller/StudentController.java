package com.example.demoForJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demoForJpa.entity.Student;
import com.example.demoForJpa.repo.StudentRepo;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}