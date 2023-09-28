package com.vgcs.student.volvoassignment.service;

import com.vgcs.student.volvoassignment.repos.StudentRepository;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //add methods and validation
}
