package com.example.demo5.repositories;

import com.example.demo5.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentById (long kw);




}
