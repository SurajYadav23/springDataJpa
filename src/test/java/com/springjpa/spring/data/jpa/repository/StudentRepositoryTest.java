package com.springjpa.spring.data.jpa.repository;

import com.springjpa.spring.data.jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("surajy989**@gmail.com")
                .firstName("suraj")
                .lastName("yadav")
                .GuardianName("surya")
                .GuardianEmail("hsgdh@gmail.com")
                .GuardianMobile("999999999").build();
        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> ll= studentRepository.findAll();
        System.out.println("students"+ll);
    }
}