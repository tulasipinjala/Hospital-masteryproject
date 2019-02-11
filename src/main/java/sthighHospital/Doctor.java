package sthighHospital;

import java.util.Arrays;
import java.util.List;

public  class Doctor extends Employee {

	private String Gynecology;
	private String Orthopaedic;
	private String Trauma;
	private String Spine;
	private String Oncology;

	public Doctor(String Gynecology, String Orthopaedic, String Spine, String Trauma,String Oncology) {
		this.specialty = Gynecology;
		this.specialty = Orthopaedic;
		this.specialty = Spine;
		this.specialty = Trauma;
		this.specialty = Oncology;
	}
	
	public Doctor(String FirstName) {
		
	}

	public Doctor() {
		
	}

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}
	@Override
	public String toString() {
		return "Surgeon specialty: " + Gynecology + ",Surgeon specialty:"  + Orthopaedic + ",Surgeon specialty:" +
				Spine + ",Surgeon specialty:" + Trauma + ",Surgeon specialty:" + Oncology ;
	}
	
	public int calculatePay() {
		return 0;

		

	}

}
