package com.layersegrigation.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.layersegrigation.spring.EntityF.Student;
import com.layersegrigation.spring.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService StudentService;

    @GetMapping("/")
    public List<Student> getStudentAll(){
        return StudentService.getStudent();
    }


    @PostMapping("/")
    public List<Student> postStudent(@RequestBody Student st){
        return StudentService.postStudent(st);
    }


    @PutMapping("/")
    public List<Student> putStudent(@RequestBody Student st){
        return StudentService.putStudent(st);
    }


    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        return StudentService.deleteStudent(id);
    }



}
