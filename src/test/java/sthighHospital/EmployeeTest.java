package sthighHospital;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class EmployeeTest {
	

	private Doctor underTest;
	@Before
      public void setup() {
		underTest = new Doctor();
	}

	@Test
	public void ableToGetFirstName() {
		// Arrange
		Doctor underTest = new Doctor("David");
		// Act
		String expected = underTest.getFirst_name();
		// Assert
		equals("David");
	}
	@Test
	public void ableToGetLastName() {
		// Arrange
		Doctor underTest = new Doctor("Wilson");
		// Act
		String expected = underTest.getLast_name();
		// Assert
		equals("wilson");
	}
	@Test
	public void ableToGetEmployee_id() {
		// Arrange
		Doctor underTest = new Doctor("123");
		// Act
		int expected = underTest.getEmployee_id();
		// Assert
		equals("123");
	}
	@Test
	public void ableToGetCalculatePay() {
		// Arrange
		Doctor underTest = new Doctor("12000");
		// Act
		int expected = underTest.getCalculatePay();
		// Assert
		equals("12000");
	}
	@Test
	public void ableToGetSpecialty() {
		// Arrange
		Doctor underTest = new Doctor("Heart");
		// Act
		String expected = underTest.getSpecialty();
		// Assert
		equals("Heart");
	}
	

	
}
