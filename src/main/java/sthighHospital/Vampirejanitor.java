package sthighHospital;

public class Vampirejanitor extends Employee {

	private boolean ableToSweep;

	public void findSweepingAbility() {

		if (ableToSweep) {
			System.out.println("VampireJanitor able to sweep the floor");
		} else {
			System.out.println("VampireJanitor not able to sweep the floor");
		}

	}

	public boolean isAbleToClean() {
		return ableToSweep;
	}

	
}
