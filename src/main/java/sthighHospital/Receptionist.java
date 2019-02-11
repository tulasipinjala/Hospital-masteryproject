package sthighHospital;

public class Receptionist extends Employee {

	private boolean statusOnPhone;
	
	public Receptionist(boolean statusPhone) {
		
		this.statusOnPhone = statusPhone;
	}

	public void statusOnPhone() {

		if (statusOnPhone) {

			System.out.println("Receptionist is busy");

		} else {
			System.out.println("Receptionist is not busy");
		}

	}

	
}
