package sthighHospital;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

public  class Nurse extends Employee  {

	List<Patient> patientList;

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
	
	public String drawblood(Patient p) {

		System.out.println("Draw Blood per patient" + p.getPatient_id());
		return "success";
	}

	public String getHealthOfPatient(Patient h) {
		System.out.println("Check health level per patient" + h.getPatient_id());
		return  "success";
	}

	public Patient getPatient(String string, String string2, int i) {
	
		return null;
	}

	public void toGetPatientList() {
		
		
	}

	
}
