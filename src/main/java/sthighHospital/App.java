package sthighHospital;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
	static String userInput;
	static String userAction;
	static String userOption;
	static long startTime;
	static long endtime;
	static String[] userInputSplit;
	private static String specialty;
	private static String surgeonspecialty;
	private static long endTime;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();

		System.out.println("Do you wanna add Employees or Patients?");
		userInput = input.next();
		startTime = System.nanoTime();

		if ("Employees".equalsIgnoreCase(userInput)) {

			System.out.println("Here is the lists of employees in St.Hospital:");
			System.out.println("1. Doctor");
			System.out.println("2. Surgeon");
			System.out.println("3. Nurse ");
			System.out.println("4. Receptionist");
			System.out.println("5. Janitor");
			System.out.println("6. VauserInputmpire Janitor");
			addEmployee(input);
		} else {
			System.out.println("Add list of your Patients:");
			addPatient(input);
		}
		endTime = System.nanoTime();
		System.out.println("Total time taken:" + (startTime - endTime));
		userInput = input.next();
	}

	public static void addEmployee(Scanner input) {

		String userInput = input.next();

		switch (userInput) {
		case "1":
			addDoctor(input);
		case "2":
			addSurgeons(input);
		case "3":
			addNurse(input);
		case "4":
			addReceptionist(input);
		case "5":
			addJanitor(input);
		case "6":
			addVampireJanitor(input);
		}

	}

	private static void addDoctor(Scanner input) {
		System.out.println("Please enter your doctor firstname:");
		input.next();
		System.out.println("Please enter your doctor lastname:");
		input.next();
		System.out.println("Please enter your doctor id:");
		input.next();
		System.out.println("Please enter your doctor Specialty:");
		specialty = "";
		specialty = specialtyChoiceChecker(specialty, input);

	}

	private static String specialtyChoiceChecker(String userInput, Scanner input) {
		Set<String> doctorList = new HashSet<String>(Arrays.asList("Heart", "Eyes", "Ear", "Dentist", "Brain"));
		if (!doctorList.contains(userInput)) {
			System.out.println("Please choose from list:");
			System.out.println("1. Heart");
			System.out.println("2. Eyes");
			System.out.println("3. Ear");
			System.out.println("4. Dentist");
			System.out.println("5. Brain");
			userInput = input.next();
		}
		switch (userInput) {
		case "Heart":
			System.out.println("Heart doctor salary is 90000");
			break;
		case "Eyes":
			System.out.println("Eyes doctor salary is 80000");
			break;
		case "Ear":
			System.out.println("Ear doctor salary is 70000");
			break;
		case "Dentist":
			System.out.println("Dentist doctor salary is 75000");
			break;
		case "Brain":
			System.out.println("Brain doctor salary is 120000");
			break;
		}

		return userInput;
	}

	private static void addSurgeons(Scanner input) {
		System.out.println("Please enter your Surgeon firstname:");
		input.next();
		System.out.println("Please enter your Surgeon lastname:");
		input.next();
		System.out.println("Please enter your Surgeon id:");
		input.next();
		System.out.println("Please enter your Surgeon Specialty:");
		surgeonspecialty = "";
		surgeonspecialty = surgeonSpecialtyChoiceChecker(surgeonspecialty, input);

	}

	private static String surgeonSpecialtyChoiceChecker(String userInput, Scanner input) {
		Set<String> surgeonList = new HashSet<String>(
				Arrays.asList("Gynecology", "Orthopaedic", "Spine", "Trauma", "Oncology"));

		if (!surgeonList.contains(userInput)) {
			System.out.println("Please choose from list:");
			System.out.println("1. Gynecology");
			System.out.println("2. Orthopaedic");
			System.out.println("3. Spine");
			System.out.println("4. Trauma");
			System.out.println("5. Oncology");
			userInput = input.next();
		}
		switch (userInput) {
		case "Gynecology":
			System.out.println("Gynecology Surgeon salary is 120000");
			break;
		case "Orthopaedic":
			System.out.println("Orthopaedic Surgeon salary is 125000");
			break;
		case "Spine":
			System.out.println("Spine Surgeon salary is 130000");
			break;
		case "Trauma":
			System.out.println("Trauma Surgeon salary is 140000");
			break;
		case "Oncology":
			System.out.println("Oncology Surgeon salary is 125000");
			break;
		}
		return userInput;
	}

	private static void addNurse(Scanner input) {
		System.out.println("Please enter your nurse firstname:");
		input.next();
		System.out.println("Please enter your nurse lastname:");
		input.next();
		System.out.println("Please enter your nurse id:");
		input.next();

		System.out.println("Please enter how many patients do want to add?");
		int count = Integer.parseInt(input.next());
		for (int i = 0; i < count; i++) {
			System.out.println("adding the patient number:" + i + 1);
			addPatient(input);
		}
		System.out.println("Please enter blooddraw ability to your nurse:True or False?");
		String value = input.next();
		if (value.equalsIgnoreCase("True"))
			new Nurse().drawblood(new Patient("firstname", "lastname", 1));
		else
			System.out.println("Nurse is not available for blooddrawl");
	}

	private static void addReceptionist(Scanner input) {
		System.out.println("Please enter your Receptionist firstname:");
		input.next();
		System.out.println("Please enter your Receptionist  lastname:");
		input.next();
		System.out.println("Please enter your Receptionist  id:");
		input.next();
		System.out.println("Please enter weather receptionist is on phone or not: True or False ?");
		String reply = input.next();
		if (reply.equalsIgnoreCase("True"))
			new Receptionist(Boolean.TRUE).statusOnPhone();
		else
			System.out.println("Receptionist is not on phone");

	}

	private static void addJanitor(Scanner input) {
		System.out.println("Please enter your Janitor firstname:");
		input.next();
		System.out.println("Please enter your Janitor lastname:");
		input.next();
		System.out.println("Please enter your Janitor id:");
		input.next();
		System.out.println("Please enter wheather Janitor is able to clean the floor: True or False ?");
		String clean = input.next();
		if (clean.equalsIgnoreCase("True"))
			new Janitor(Boolean.TRUE).isAbleToClean();
		else
			System.out.println("Janitor is not able clean the floor");
	}

	private static void addVampireJanitor(Scanner input) {
		System.out.println("Please enter your VampireJanitor firstname:");
		input.next();
		System.out.println("Please enter your VampireJanitor lastname:");
		input.next();
		System.out.println("Please enter your VampireJanitor id:");
		input.next();
		System.out.println("Please enter wheather VampireJanitor is able to sweep the floor: True or False ?");
		String sweep = input.next();
		if (sweep.equalsIgnoreCase("True"))
			new Vampirejanitor(Boolean.TRUE).isAbleToSweep();
		else
			System.out.println("Janitor is not able sweep the floor");
	}

	public static String exitChecker(String userWord) {
		if (userWord.equalsIgnoreCase("exit")) {
			System.exit(0);
		}

		return userWord;
	}

	public static void addPatient(Scanner input) {

		System.out.println("Please enter your Patient firstname:");
		input.next();
		System.out.println("Please enter your Patient lastname:");
		input.next();
		System.out.println("Please enter your Patient id:");
		input.next();

	}

}
