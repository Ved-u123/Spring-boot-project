package com.app.hospital.Service;

import com.app.hospital.Entity.Doctor;
import com.app.hospital.Repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepo.findById(id).orElse(null);
    }

    public void deleteDoctor(Long id) {
        doctorRepo.deleteById(id);
    }
}
