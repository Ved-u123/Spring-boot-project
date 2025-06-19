package com.app.hospital.Service;

import com.app.hospital.Entity.Patient;
import com.app.hospital.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepo.findById(id).orElse(null);
    }

    public void deletePatient(Long id) {
        patientRepo.deleteById(id);
    }

    public Page<Patient> getAllPatients(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return patientRepo.findAll(pageable);
    }
}
