package com.vgcs.student.volvoassignment.config;

import com.vgcs.student.volvoassignment.model.Student;
import com.vgcs.student.volvoassignment.repos.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"dev"})
@Configuration
public class DataLoadDev implements CommandLineRunner {

    private StudentRepository studentRepository;

    public DataLoadDev(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student();
        s1.setFirstName("Joachim");
        s1.setSecondName("Bjork");
        studentRepository.save(s1);


        Student s2 = new Student();
        s2.setFirstName("simon");
        s2.setSecondName("ma5lof");
        studentRepository.save(s2);

    }
}
