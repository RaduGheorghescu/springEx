package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Student findOne(Long id);
    List<Student> findAll();
    Page<Student> findAllPage(Pageable pageable);
    Student save(Student student);
    void delete(Student student);
    List<Student> findAllByNume(String nume);
}
