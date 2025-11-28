package Dao;

import java.util.ArrayList;
import java.util.List;

import exceptions.PatientNotFoundException;
import model.Patient;

public class PatientDaoImpl implements PatientDao{
	List<Patient> patientList = new ArrayList<>();
	@Override
	public void save(Patient patient) {
		patientList.add(patient); // add patient object to the list		
	}

	@Override
	public List<Patient> findAll() {
			return patientList;
	}

	@Override
	public Patient findById(int id) throws PatientNotFoundException {
		for(Patient p : patientList) {
			if(p.getId() == id) {
				return p;
			}
		}
		throw new PatientNotFoundException("Patient With Id: "+ id + "Not Found");
	}

	@Override
	public Patient update(Patient patient) throws PatientNotFoundException {
		for(int i=0;i<patientList.size();i++) {
			if(patientList.get(i).getId()==patient.getId()) {
				patientList.set(i, patient);
				return patient;
			}
		}
		throw new PatientNotFoundException("Patient With Id: "+ patient.getId() + "Not Found");
	}

	@Override
	public void deleteById(int id) throws PatientNotFoundException {
			boolean found = false;
			for(int i=0;i<patientList.size();i++) {
				if(patientList.get(i).getId() == id){
					patientList.remove(i);
					found = true;
					break;
				}
			}
			if(!found) {
				throw new PatientNotFoundException("Patient With Id: "+ id + "Not Found");
			}
	}
	
}
