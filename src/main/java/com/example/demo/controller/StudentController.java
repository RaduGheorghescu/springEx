package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/findByNume/{nume}")
    public List<Student> findAllByNume(@PathVariable String nume) {
        return studentService.findAllByNume(nume);
    }

    @GetMapping("/findByNume")
    public List<Student> findAllByNumeVer(@RequestParam String nume) {
        return studentService.findAllByNume(nume);
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findAllPage")
    public List<Student> findAll(Pageable pageable){
        return studentService.findAll();
    }

    @GetMapping("/findOne")
    public Student findOne(@RequestParam Long id){
        return studentService.findOne(id);
    }

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/edit")
    public Student edit(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/delete")
    public void  delete(@RequestBody Student student){
        studentService.delete(student);
    }
}
