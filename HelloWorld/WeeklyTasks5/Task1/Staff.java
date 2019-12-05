package Task1;

import java.util.Scanner;

public class Staff extends Person{
	private int employeeNumber;
	private String location;
	private String title;
	
	public void printStaff() {
		System.out.println(this.getPersonData()+" Employee number:"
				+this.employeeNumber+" Location:" +this.location
				+ " Title:" +this.title);
	}

	public Staff(String name, String address, String dateOfBirth, int employeeNumber, String location, String title) {
		super(name, address, dateOfBirth);
		this.employeeNumber = employeeNumber;
		this.location = location;
		this.title = title;
	}
	public Staff(Scanner cin){
		super(cin);
		System.out.print("Enter employee number:");
		employeeNumber = cin.nextInt(); cin.nextLine();
		System.out.print("Enter location:");
		location = cin.nextLine();
		System.out.print("Enter title:");
		title = cin.nextLine();
	}
	
}
