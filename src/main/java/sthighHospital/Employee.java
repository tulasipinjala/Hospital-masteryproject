package sthighHospital;

import java.util.Scanner;

public abstract class Employee {
// Properties
	private String first_name;
	private String last_name;
	private int employee_id;
	private int salary;
	
	public Employee() {
		
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public int getCalculatePay() {
		return salary;
	}
	
	
}
	
	