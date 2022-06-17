package com.layersegrigation.spring.EntityF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "student")
public class Student {
    @Id
	// this will add the auto increment to id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int rollno;
    @Column
    private String name;
    @Column
    private String subject;
    public Student() {
    }
    public Student(int rollno, String name, String subject) {
        this.rollno = rollno;
        this.name = name;
        this.subject = subject;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }


}
