package sthighHospital;

public class Janitor extends Employee {

	private boolean ableToClean;

	public Janitor() {

	}

	public Janitor(Boolean sweepFloor) {

		this.ableToClean = sweepFloor;

	}

	public void findCleaningAbility() {

		if (ableToClean) {
			System.out.println("Janitor able to clean the floor");
		} else {
			System.out.println("Janitor not able to clean the floor");
		}

	}

	public void toggleableToClean() {
		this.ableToClean = !this.ableToClean;
	}

	public boolean isAbleToClean() {
		return ableToClean;
	}

	public String getClean() {

		return "success";
	}

	public void toGetCleanFloor() {

	}

}
