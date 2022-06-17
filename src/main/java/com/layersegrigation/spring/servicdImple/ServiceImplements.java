package com.layersegrigation.spring.servicdImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.layersegrigation.spring.EntityF.Student;
import com.layersegrigation.spring.repo.Repos;
import com.layersegrigation.spring.service.StudentService;

@Component
public class ServiceImplements implements StudentService{

    @Autowired
    Repos repos;

    @Override
    public List<Student> getStudent() {
        return repos.findAll();
    }

    @Override
    public List<Student> postStudent(Student st) {
        repos.save(st);
        return repos.findAll();
    }

    @Override
    public List<Student> putStudent(Student st) {
        Optional<Student> student = repos.findById(st.getRollno());
    //    List<Student> student = repos.findAll();   
        if(st.getRollno() == student.get().getRollno()){
            repos.save(st);
        }
        return repos.findAll();
    }

    @Override
    public String deleteStudent(int id) {
        repos.deleteById(id);;
        return "Deleted!";
    }
    
}
