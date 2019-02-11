package sthighHospital;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	private static final Object PatientList = null;
	Nurse underTest;

	@Before
	public void setup() {
		underTest = new Nurse();
	}

	@Test
	public void drawBlood() {
		Patient p = new Patient("firstname", "lastname", 1);
		Assert.assertEquals("success", new Nurse().drawblood(p));
	}

	@Test
	public void careForPatient() {
		
		Patient h = new Patient("firstname", "lastname", 1);
        Assert.assertEquals("success",new Nurse().getHealthOfPatient(h));
	}
	@Test
	 public void getPatientList() {
		Patient p = underTest.getPatient("firstname","lastname",2);
		underTest.toGetPatientList();
		Assert.assertEquals(PatientList, p);
		
		
	}

}