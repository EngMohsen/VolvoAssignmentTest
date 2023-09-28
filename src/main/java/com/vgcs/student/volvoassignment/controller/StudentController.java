package com.vgcs.student.volvoassignment.controller;

import com.vgcs.student.volvoassignment.model.Student;
import com.vgcs.student.volvoassignment.repos.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping( "/students")
    public List<Student> getAllStudents(){
        return (List<Student>) this.studentRepository.findAll();
    }

    @GetMapping( "/student/{Id}")
    public Student getStudentById(@PathVariable int Id){
        return this.studentRepository.findById(Id);
    }

    @GetMapping( "/studentByfName")
    public List<Student> getStudentByFirstName(@RequestParam(name = "firstName") String firstName){
        return this.studentRepository.findAllByFirstName(firstName);
    }
}
