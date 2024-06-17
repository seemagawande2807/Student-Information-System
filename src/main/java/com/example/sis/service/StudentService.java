package com.example.sis.service;

import com.example.sis.entity.Student;

import java.util.List;

public interface StudentService {

    Student create(Student student);

    List<Student> getAllStudent();

    Student updateStudent(Student student);

    void deleteStudent(Long id);



    List<Student> saveAll(List<Student> students);
}
