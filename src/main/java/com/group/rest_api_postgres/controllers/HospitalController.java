package com.group.rest_api_postgres.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.rest_api_postgres.entities.Doctor;
import com.group.rest_api_postgres.entities.Patient;
import com.group.rest_api_postgres.services.DoctorPatientService;



@RestController
@RequestMapping("hospital")
public class HospitalController {
	
	
	@Autowired DoctorPatientService doctorPatientService;
	
	@PostMapping("add-doctor")	
	public Doctor addDoctor(@RequestBody @NonNull Doctor doctor) {
		return doctorPatientService.addDoctor(doctor);
	}
	
	@PostMapping("add-patient")	
	public Patient addPatient(@RequestBody @NonNull Patient patient) {
		return doctorPatientService.addPatient(patient);
	}
	
	
	@GetMapping("all-doctors")
	public List<Doctor> getAllDoctorList() {
		return doctorPatientService.getAllDoctors();
	}
	
	@GetMapping("all-patients")
	public List<Patient> getAllPatientsList() {
		return doctorPatientService.getAllPatients();
	}
}
