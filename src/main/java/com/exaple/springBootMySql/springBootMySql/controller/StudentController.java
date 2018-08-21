/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exaple.springBootMySql.springBootMySql.controller;

import com.exaple.springBootMySql.springBootMySql.model.Student;
import com.exaple.springBootMySql.springBootMySql.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luis.leon
 */
@RestController
@RequestMapping(value = "/servicesStudent")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping()
    public Iterable<Student> retrieveAllStudents() {
        return studentRepository.findAll();
    }
    
   
    @PostMapping
    public Student retrieveAllStudents(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
