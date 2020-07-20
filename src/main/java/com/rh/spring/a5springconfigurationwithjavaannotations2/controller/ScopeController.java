package com.rh.spring.a5springconfigurationwithjavaannotations2.controller;

import com.rh.spring.a5springconfigurationwithjavaannotations2.entity.Employee;
import com.rh.spring.a5springconfigurationwithjavaannotations2.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@RestController
public class ScopeController {
    @PostConstruct
    public void postConstrcuct(){
        System.out.println("bean construction is finished");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("bean destroyment is going to begin");
    }

    @RequestMapping("/stud")
    public void createStudent(){
        Student s = new Student();
        System.out.println(s);
    }

    @RequestMapping("/emp")
    public void createEmployee(){
        Employee e = new Employee();
        System.out.println(e);
    }
}
