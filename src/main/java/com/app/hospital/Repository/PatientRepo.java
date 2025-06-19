package com.app.hospital.Repository;

import com.app.hospital.Entity.Patient;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

    
}


