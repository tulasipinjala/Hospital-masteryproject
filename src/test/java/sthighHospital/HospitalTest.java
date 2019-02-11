package sthighHospital;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Janitor underTest;

	@Before
	public void setUp() {
		underTest = new Janitor();
	}

	@Test

	public void getHospitalClean() {
		String cleanFloor = underTest.getClean();
		underTest.toGetCleanFloor();

		equals("cleanFloor");
	}
}
