package com.example.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students") // endpoint chamado
public class StudentsController {

    @GetMapping // quando o endpoint for chamado no método get a função será executada
    public void getAll(){

    }

}
