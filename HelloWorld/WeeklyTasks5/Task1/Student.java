package Task1;

import java.util.Scanner;

public class Student extends Person {
	private int studentNumber;
	private String startDate;
	
	public void printStudent() {
		System.out.println(this.getPersonData()+" Student number:"
				+this.studentNumber+" Start date:" +this.startDate);
		
	}

	public Student(String name, String address, String dateOfBirth, int studentNumber, String startDate) {
		super(name, address, dateOfBirth);
		this.studentNumber = studentNumber;
		this.startDate = startDate;
	}
	
	public Student(Scanner cin) {
		super(cin);
		System.out.print("Enter student number:");
		studentNumber = cin.nextInt();cin.nextLine();
		System.out.print("Enter start date:");
		startDate = cin.nextLine();
	}
	
}
