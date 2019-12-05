package Task2;
import java.util.*;
public class Student {
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentNumber=" + studentNumber
				+ ", address=" + address + "]";
	}
	public Student() {
		Scanner cin = new Scanner(System.in);
		System.out.println("Input first name:");
		firstName = cin.nextLine();
		System.out.println("Input last name:");
		lastName = cin.nextLine();
		System.out.println("Input student number:");
		studentNumber = cin.nextLine();
		System.out.println("Input address:");
		address = cin.nextLine();
		cin.close();
	}
	private String firstName;
	private String lastName;
	private String studentNumber;
	private String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
