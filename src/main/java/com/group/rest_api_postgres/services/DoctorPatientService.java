/**
 * 
 */
package com.group.rest_api_postgres.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.group.rest_api_postgres.entities.Doctor;
import com.group.rest_api_postgres.entities.Patient;
import com.group.rest_api_postgres.repositories.DoctorRepository;
import com.group.rest_api_postgres.repositories.PatientRepository;


@Service
public class DoctorPatientService {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	PatientRepository patientRepository;

	public DoctorPatientService() {

	}

	public Doctor addDoctor(@NonNull Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public Patient addPatient(@NonNull Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}
	
	
}
