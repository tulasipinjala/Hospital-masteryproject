package sthighHospital;

public class Doctor extends Employee {

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	public int calculatePay() {

		return getSalary() * 5;

	}

}
