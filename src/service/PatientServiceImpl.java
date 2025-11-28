package service;

import java.util.List;

import Dao.PatientDao;
import Dao.PatientDaoImpl;
import exceptions.PatientNotFoundException;
import model.Patient;

public class PatientServiceImpl implements PatientService{
	PatientDao dao = new PatientDaoImpl();
	@Override
	public void addPatient(Patient patient) {
		dao.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return dao.findAll();
	}

	@Override
	public Patient getPatientById(int id) throws PatientNotFoundException {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Patient updatePatient(Patient patient) throws PatientNotFoundException {
		return dao.update(patient);
	}

	@Override
	public void deletePatient(int id) throws PatientNotFoundException {
		dao.deleteById(id);
	}


}
