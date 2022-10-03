package io.prodigy.PatientAPI.service;

import io.prodigy.PatientAPI.model.Patient;
import io.prodigy.PatientAPI.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class PatientService {
    private final PatientRepo patientRepo;

    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient addPatient(Patient patient) {
        patient.setPatientCode(UUID.randomUUID().toString());
        return patientRepo.save(patient);
    }

    public List<Patient> findAllPatients() {
        return patientRepo.findAll();
    }

    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepo.deletePatientById(id);
    }
}
