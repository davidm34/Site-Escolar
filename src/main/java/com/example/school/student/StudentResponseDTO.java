package com.example.school.student;

public record StudentResponseDTO(Long id, String name, String series, String login, String password) {

    public StudentResponseDTO(Student student){
        this(student.getId(), student.getName(), student.getSeries(), student.getLogin(), student.getPassword());
    }

}
