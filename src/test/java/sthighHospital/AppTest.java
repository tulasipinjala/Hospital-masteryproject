package sthighHospital;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	AppTest underTest;

	

	@Before
	public void setup() {
		underTest = new AppTest();
	}

	@Test
	public void ableToGetFirstName() {
		String first_name = underTest.getNameOfEmployee();
		underTest.ableToGetFirstName();
		assertEquals(first_name,  "David");

	}

	@Test
	public void ableToGetLastName() {
		String last_name = underTest.getNameOfEmployee();
		underTest.ableToGetLastName();
		assertEquals(last_name,  "Wilson");
	}
	@Test
	public void ableToGetId() {
		String employee_id = underTest.getNameOfEmployee();
		underTest.ableToGetId();
		assertEquals(employee_id,  "one");
		
}
	
	 
	public String getNameOfEmployee() {
		return null;
	}

	
}
