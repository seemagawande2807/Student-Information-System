package com.example.sis.controller;

import com.example.sis.entity.Student;
import com.example.sis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Controller")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public Student createStudent(@RequestBody Student student){
        return studentService.create(student);
    }
    @PostMapping("/saveAllStudents")
    public List<Student> saveAllStudents(@RequestBody List<Student> students) {
        return studentService.saveAll(students);
    }
     @GetMapping("/getAllStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
