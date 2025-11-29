package controller;

import java.util.List;

import exceptions.PatientNotFoundException;
import model.Patient;
import service.PatientService;
import service.PatientServiceImpl;
public class PatientController {
	public static void main(String[] args) {
		PatientService service = new PatientServiceImpl();
		
		//add service
		service.addPatient(new Patient(1, "Raju", 400000));
		service.addPatient(new Patient(2, "Dev", 900000));
		service.addPatient(new Patient(3, "Kiran", 800000));
		service.addPatient(new Patient(4, "dhruva", 280000));
		service.addPatient(new Patient(5, "siddu", 460000));

		System.out.println("Patient added successfully");
		System.out.println("----------------------------");
		// getting all patients details
		List<Patient> patient = service.getAllPatients();
		for(Patient p: patient) {
			System.out.println(p);
		}
		
		// get patient by id 2
		System.out.println("Fetching Patient With ID: 2");
		try {
			Patient fetchPatient = service.getPatientById(1);
			System.out.println(fetchPatient);
		} catch (PatientNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// update the patient with id 3
		System.out.println("Updating Patient With ID: 3");
		try {
			Patient update = service.updatePatient(new Patient(3, "Kiran", 20000));
			System.out.println(update);
		} catch (PatientNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// delete the patient with 5
		System.out.println("Deleting Patient With ID: 5");
		try {
			service.deletePatient(5);
			System.out.println("pateint deleted Successfully");
		} catch (PatientNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("After all modificaitons patient list");
		System.out.println("-------------------------------------");
		List<Patient> patients = service.getAllPatients();
		for(Patient p: patients) {
			System.out.println(p);
		}

	}
}
