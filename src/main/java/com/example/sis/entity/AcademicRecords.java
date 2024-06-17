package com.example.sis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AcademicRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private Double grade;

    public Long getId() {
        return id;
    }

    public Double getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
