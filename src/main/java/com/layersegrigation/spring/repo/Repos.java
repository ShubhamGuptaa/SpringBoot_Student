package com.layersegrigation.spring.repo;

import org.springframework.stereotype.Repository;

import com.layersegrigation.spring.EntityF.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Repos extends JpaRepository<Student, Integer> {

}
