package com.example.sis.serviceimpl;

import com.example.sis.entity.AcademicRecords;
import com.example.sis.entity.Student;
import com.example.sis.repo.AcademicRecordRepository;
import com.example.sis.service.AcademicRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicRecordServiceImpl implements AcademicRecordService {


    @Autowired
    private AcademicRecordRepository academicRecordRepository;
    @Override
    public AcademicRecords create(AcademicRecords academicRecords){
        return academicRecordRepository.save(academicRecords);
    }

    @Override
    public List<AcademicRecords> getAllAcademicRecords() {
        return academicRecordRepository.findAll();
    }

    @Override
    public AcademicRecords updateAcademicRecords(AcademicRecords academicRecords) {
        AcademicRecords a =new AcademicRecords();
        a.setId(academicRecords.getId());
        a.setGrade(academicRecords.getGrade());
        a.setSubject(academicRecords.getSubject());
        Student s = new Student();
        s.setId(academicRecords.getId());
        return academicRecordRepository.save(academicRecords);
    }

    @Override
    public String  deleteAcademicRecord(Long id) {
        if (academicRecordRepository.existsById(id)) {
            academicRecordRepository.deleteById(id);
        } else {
            throw new RuntimeException(" Record not found with id: " + id);
        }
return  "record deleted";
    }

} 
