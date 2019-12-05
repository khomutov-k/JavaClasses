import java.util.*;

public class Student {
	static public Scanner cin = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private int studentNumber;
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
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public Student() {
		askData();
	}
	public Student(String firstName, String lastName, int studentNumber, String adress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.address = adress;
	}
	private void askData() {
		
		this.firstName = inputData("Input student first name:");
		this.lastName = inputData("Input student last name:");
		this.address = inputData("Input student address:");
		
		System.out.print("Input student number:");
		this.studentNumber = cin.nextInt(); 
		
	}
	private String inputData(String string) {
		do {
			System.out.print(string);
			String lastName = cin.nextLine();
			if (lastName.equals("")) System.out.println("Line is empty.");
			else {
				return lastName;
			}
		}while(true);		
	}
	
}
