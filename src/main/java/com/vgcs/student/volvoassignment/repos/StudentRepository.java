package com.vgcs.student.volvoassignment.repos;

import com.vgcs.student.volvoassignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
     Student findById(long Id);
     List<Student> findAllByFirstName(String firstName);

     List<Student> findAllBySecondName(String secondName);

}
