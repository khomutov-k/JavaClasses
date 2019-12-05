import java.util.*;
public class StudentListTest {

	public static void main(String[] args) {
		// Main method
		Scanner cin = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		boolean flag = true;
		
		//Asking loop
		do {
			System.out.print("Do you want to add new student(y/n)?");
			String answer = cin.nextLine();
			if (answer.charAt(0) == 'y') {
				Student newStudent = new Student();
				studentList.add(newStudent);
			}
			else flag=false;
		}
		while(flag);
		
		//Printing students
		System.out.println("Enrolled students:");
		for(Student oneStudent:studentList) {
			System.out.println(oneStudent.getFirstName()
					+" "+oneStudent.getLastName());
		}
		cin.close();
		System.out.println("Program has finished.Status code:0");
	}

}
