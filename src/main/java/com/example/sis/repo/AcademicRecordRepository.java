package com.example.sis.repo;

import com.example.sis.entity.AcademicRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicRecordRepository extends JpaRepository<AcademicRecords,Long> {

}
