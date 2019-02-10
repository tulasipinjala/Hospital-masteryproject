package sthighHospital;

import java.util.HashMap;

public class Hospital {

	private HashMap<String, Patient> patientList = new HashMap<String, Patient>();

	private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();

	private String hospitalClean;
	private String statusOfReceptionist;

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

	// Constructor
	public Hospital() {

	}

	public String statusOnPhone() {

		return statusOfReceptionist;

	}

	public static void tickAll(int timeElapsed) {
		
		
	}
}
