package com.vgcs.student.volvoassignment.config;

import com.vgcs.student.volvoassignment.model.Student;
import com.vgcs.student.volvoassignment.repos.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"local","default"})
@Configuration
public class DataLoad implements CommandLineRunner {

    private StudentRepository studentRepository;

    public DataLoad(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student();
        s1.setFirstName("ahmed");
        s1.setSecondName("mohsen");
        studentRepository.save(s1);


        Student s2 = new Student();
        s2.setFirstName("ahmed");
        s2.setSecondName("mohsen");
        studentRepository.save(s2);

    }
}
