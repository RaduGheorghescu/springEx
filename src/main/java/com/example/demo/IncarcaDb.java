package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class IncarcaDb implements ApplicationRunner {

    @Autowired
    private final StudentService studentService;

    public IncarcaDb(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Random random = new Random();
        for(int i =0; i<30; i++){
            studentService.save(new Student("Nume "+i, "Prenume "+i, random.nextInt(9)+1));
        }
    }
}
