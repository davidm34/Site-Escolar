package com.example.school.controller;

import com.example.school.student.Student;
import com.example.school.student.StudentRepository;
import com.example.school.student.StudentResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student") // endpoint chamado
public class StudentController {

    @Autowired
    private StudentRepository repository;
    @GetMapping // quando o endpoint for chamado no método get a função será executada
    public List<StudentResponseDTO> getAll(){

        List<StudentResponseDTO> studentList = repository.findAll().stream().map(StudentResponseDTO::new).toList();
        return studentList;
    }

}
