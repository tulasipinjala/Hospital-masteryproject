package sthighHospital;

public class Surgeons extends Doctor {

	// Constructor

	public Surgeons(String Gynecology, String Orthopaedic, String Spine, String Trauma, String Oncology) {
		super(Gynecology, Orthopaedic, Spine, Trauma, Oncology);

	}

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

}
