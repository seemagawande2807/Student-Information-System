package com.example.sis.controller;

import com.example.sis.entity.AcademicRecords;
import com.example.sis.service.AcademicRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Controller")
public class AcademicRecordController {
    @Autowired
    private AcademicRecordService academicRecordService;
    @PostMapping("/saveAcademicRecords")
    public AcademicRecords createAcademicRecords(@RequestBody AcademicRecords academicRecords){
        return academicRecordService.create(academicRecords);
    }
    @GetMapping("/getAllAcademicRecords")
    public List<AcademicRecords> getAllAcademicRecords() {
        return academicRecordService.getAllAcademicRecords();
    }

    @PutMapping("/updateAcademicRecords")
    public AcademicRecords updateAcademicRecords(@RequestBody AcademicRecords academicRecords){
        return academicRecordService.updateAcademicRecords(academicRecords);
    }
    @DeleteMapping("/deleteAcademicRecords/{id}")
    public String deleteAcademicRecord(@PathVariable Long id) {
        academicRecordService.deleteAcademicRecord(id);
        return "record deleted sucessfully ";
    }

}
