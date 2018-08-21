/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exaple.springBootMySql.springBootMySql.repository;

import com.exaple.springBootMySql.springBootMySql.model.Student;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author luis.leon
 */
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    
}
