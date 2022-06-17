package com.layersegrigation.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.layersegrigation.spring.EntityF.Student;

@Service
public interface StudentService {
    public List<Student> getStudent();
    public List<Student> postStudent(Student st);
    public List<Student> putStudent(Student st);
    public String deleteStudent(int id);
}
