package com.ynov.serviceWeb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ynov.serviceWeb.model.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {

	Patient findPatientByName(String name);

	Patient findPatientById(String id);
}
