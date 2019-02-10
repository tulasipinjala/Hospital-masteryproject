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

	public void drawblood(Patient p) {

		System.out.println("Draw Blood per patient" + p.getPatient_id());

	}

}
