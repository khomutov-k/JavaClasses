package Task1;

import java.util.Scanner;

public class Person {
	private String name;
	private String address;
	private String dateOfBirth;
	
	protected String getPersonData(){
		return "Personal data:"+getName()+","+address+","+dateOfBirth;
	}
	public String getName() {
		return name;
	}
	
	public Person(String name, String address, String dateOfBirth) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	public Person(Scanner cin) {
		System.out.print("Enter name:");
		name = cin.nextLine();
		System.out.print("Enter address:");
		address = cin.nextLine();
		System.out.print("Enter date of birth:");
		dateOfBirth = cin.nextLine();
	}
	
}
