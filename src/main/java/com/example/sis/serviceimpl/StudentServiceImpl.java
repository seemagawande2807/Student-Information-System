package com.example.sis.serviceimpl;

import com.example.sis.entity.Student;
import com.example.sis.repo.StudentRepository;
import com.example.sis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        Student s = new Student();
        s.setId(student.getId());
        s.setFirst_name(student.getFirst_name());
        s.setLast_name(student.getLast_name());
        s.setEmail(student.getEmail());
        s.setBirthDate(student.getBirthDate());
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(Long studentId) {
        if (studentRepository.existsById(studentId)) {
            studentRepository.deleteById(studentId);
        } else {
            throw new RuntimeException("Student not found with id: " + studentId);
        }
    }

    @Override
    public List<Student> saveAll(List<Student> students) {
        return studentRepository.saveAll(students);
    }



}
