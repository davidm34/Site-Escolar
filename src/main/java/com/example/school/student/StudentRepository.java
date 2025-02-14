package com.example.school.student;

import org.springframework.data.jpa.repository.JpaRepository;

                                                        // tipo de entidade do reporsitorio , tipo do identificador único (id)
public interface StudentRepository extends JpaRepository<Student, String> {




}
