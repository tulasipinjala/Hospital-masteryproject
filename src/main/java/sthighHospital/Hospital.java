package sthighHospital;

import java.util.HashMap;

public class Hospital {

	private String hospitalClean;
	private String statusOfReceptionist;

	private HashMap<String, Patient> patientList = new HashMap<String, Patient>();

	private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();

	// Accessor method
	public String getHospitalClean() {
		return hospitalClean;
	}

	public HashMap<String, Patient> getPatient() {
		return patientList;
	}

	public HashMap<String, Employee> getEmployee() {
		return employeeList;
	}

	public String statusOnPhone() {

		return statusOfReceptionist;

	}
	
}
