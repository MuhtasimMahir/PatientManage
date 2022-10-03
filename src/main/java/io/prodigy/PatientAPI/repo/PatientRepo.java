package io.prodigy.PatientAPI.repo;

import io.prodigy.PatientAPI.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {

    void deletePatientById(Long id);
}
