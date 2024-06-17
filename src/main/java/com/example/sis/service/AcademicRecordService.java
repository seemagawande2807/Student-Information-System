package com.example.sis.service;

import com.example.sis.entity.AcademicRecords;

import java.util.List;

public interface AcademicRecordService {

    AcademicRecords create(AcademicRecords academicRecords);

    List<AcademicRecords> getAllAcademicRecords();

    AcademicRecords updateAcademicRecords(AcademicRecords academicRecords);

    String deleteAcademicRecord(Long id);
}
