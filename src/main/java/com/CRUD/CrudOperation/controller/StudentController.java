package com.CRUD.CrudOperation.controller;

import com.CRUD.CrudOperation.entity.Student;
import com.CRUD.CrudOperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List <Student> getAllStudents() {
       List <Student> students = repo.findAll();
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
       Student student = repo.findById(id).get();
        return student;

    }

    @PostMapping ("/students/add")
    public void CreateStudent(@RequestBody Student student){
        repo.save(student);
    }
}
