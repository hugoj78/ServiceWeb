package com.ynov.serviceWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynov.serviceWeb.model.Patient;
import com.ynov.serviceWeb.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	public PatientRepository patientRepository;

	@Override
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}

	@Override
	public Patient findPatientById(String id) {
		return patientRepository.findPatientById(id);
	}

	@Override
	public Patient findPatientByName(String name) {
		return patientRepository.findPatientByName(name);
	}

	@Override
	public Patient saveOrUpdatePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public void deletePatientById(String id) {
		patientRepository.deleteById(id);

	}

}
