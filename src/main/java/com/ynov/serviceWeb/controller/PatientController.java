package com.ynov.serviceWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.serviceWeb.dto.PatientDTO;
import com.ynov.serviceWeb.model.Patient;
import com.ynov.serviceWeb.service.PatientService;
import com.ynov.serviceWeb.util.ObjectMapperUtils;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	public PatientService patientService;

	@GetMapping(value = "/")
	public List<PatientDTO> getAllPatients() {
		return ObjectMapperUtils.mapAll(patientService.findAll(), PatientDTO.class);
	}

	@GetMapping("/byId/{PatientId}")
	public PatientDTO getPatientByPatientId(@PathVariable("PatientId") String patientId) {
		return ObjectMapperUtils.map(patientService.findPatientById(patientId), PatientDTO.class);
	}

	@GetMapping(value = "/byName/{name}")
	public PatientDTO getPatientByName(@PathVariable("name") String name) {
		return ObjectMapperUtils.map(patientService.findPatientByName(name), PatientDTO.class);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<?> saveOrUpdatePatient(@RequestBody PatientDTO PatientDTO) {
		patientService.saveOrUpdatePatient(ObjectMapperUtils.map(PatientDTO, Patient.class));
		return new ResponseEntity("Patient added successfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deletePatientByPatientId(@PathVariable("id") String id) {
		patientService.deletePatientById(id);
		return new ResponseEntity("Patient deleted successfully", HttpStatus.OK);
	}

}
