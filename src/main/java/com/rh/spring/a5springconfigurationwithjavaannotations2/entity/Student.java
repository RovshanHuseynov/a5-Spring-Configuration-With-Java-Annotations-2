package com.rh.spring.a5springconfigurationwithjavaannotations2.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
    private int id;
    private String name;

    public Student(){
        System.out.println("Student no param constructor");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student constructor: " + id + " " + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    */
}
