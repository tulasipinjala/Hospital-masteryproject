package sthighHospital;

public class Janitor extends Employee {

	private boolean ableToClean;

	public void findCleaningAbility() {

		if (ableToClean) {
			System.out.println("Janitor able to sweep the floor");
		} else {
			System.out.println("Janitor not able to sweep the floor");
		}

	}

	public boolean isAbleToClean() {
		return ableToClean;
	}
}