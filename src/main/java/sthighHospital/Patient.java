package sthighHospital;

public class Patient {

	private String Pfirst_name;
	private String plast_name;
	private int patient_id;
	private int bloodlevel;
	private int healthlevel;
	private Doctor doctor;

	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 20;
	
	public  Patient(String firstname,String lastname,int id) {
	this.Pfirst_name = firstname;
	this.plast_name = lastname;
	this.patient_id = id;
	}

	public Patient(int i) {
		
	}

	public String getPfirst_name() {
		return Pfirst_name;
	}

	public String getPlast_name() {
		return plast_name;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public Doctor getDoctor() {
		return doctor;
	}
	
	
	public void toggleBloodLevel() {
		this.bloodlevel = BLOOD_LEVEL +10 ;
	}

	public int getbloodlevel() {
		return bloodlevel;
	}
	public void toggleHealthLevel() {
		this.healthlevel = HEALTH_LEVEL +10;
	}

	public int gethealthlevel() {
		return healthlevel;
	}
}
