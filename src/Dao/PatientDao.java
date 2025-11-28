package Dao;

import java.util.List;

import exceptions.PatientNotFoundException;
import model.Patient;

public interface PatientDao {

	public void save(Patient patient); // create or save patient object

	public List<Patient> findAll(); // show all patients
	// search by patient id

	public Patient findById(int id) throws PatientNotFoundException;

	// update the patient through id
	public Patient update(Patient patient) throws PatientNotFoundException;

	// delete the patient using id
	public void deleteById(int id) throws PatientNotFoundException;
}
