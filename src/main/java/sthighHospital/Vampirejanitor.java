package sthighHospital;

public class Vampirejanitor extends Employee {

	private boolean ableToSweep;

	public Vampirejanitor(boolean sweepFloor) {
		this.ableToSweep = sweepFloor;
	}

	public void findSweepingAbility() {

		if (ableToSweep) {
			System.out.println("VampireJanitor able to sweep the floor");
		} else {
			System.out.println("VampireJanitor not able to sweep the floor");
		}

	}

	public void toggleableToSweep() {
		this.ableToSweep = !this.ableToSweep;
	}

	public boolean isAbleToSweep() {
		return ableToSweep;
	}

	
}
