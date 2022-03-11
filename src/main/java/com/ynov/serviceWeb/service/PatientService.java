package com.ynov.serviceWeb.service;

import java.util.List;

import com.ynov.serviceWeb.model.Patient;

public interface PatientService {

	public List<Patient> findAll();

	public Patient findPatientByName(String name);

	public Patient findPatientById(String id);

	public Patient saveOrUpdatePatient(Patient student);

	public void deletePatientById(String id);

}
