package sthighHospital;

public abstract class Receptionist extends Employee {

	private boolean statusOnPhone;

	public void statusOnPhone() {

		if (statusOnPhone) {

			System.out.println("Receptionist is busy");

		} else {
			System.out.println("Receptionist is not busy");
		}

	}

}
