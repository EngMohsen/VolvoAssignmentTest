package com.vgcs.student.volvoassignment.controller;

import com.vgcs.student.volvoassignment.repos.StudentRepository;
import com.vgcs.student.volvoassignment.service.StudentService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentRepository repository;

    @BeforeAll
    public static  void DATA_INITIALIZER(){
        System.out.println("before all- has started");
    }

    @AfterAll
    public static void CLEAN_UP(){
        System.out.println(" CleanUp the database- has started");

    }

    @Test
    public void shouldReturnAllStudentsMessage() throws Exception {

        this.mockMvc.perform(get("/students")).andDo(print()).andExpect(status().isOk());
    }

}
