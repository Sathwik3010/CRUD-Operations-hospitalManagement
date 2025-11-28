package service;

import java.util.List;

import exceptions.PatientNotFoundException;
import model.Patient;

public interface PatientService {
	public void addPatient(Patient patient);

	public List<Patient> getAllPatients();

	public Patient getPatientById(int id) throws PatientNotFoundException;

	public Patient updatePatient(Patient patient) throws PatientNotFoundException;

	public void deletePatient(int id) throws PatientNotFoundException;
}
