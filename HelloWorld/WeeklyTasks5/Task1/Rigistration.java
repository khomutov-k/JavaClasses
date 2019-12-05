package Task1;
import java.util.*;

import Task3.Share;
public class Rigistration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		List<Person> personList = new ArrayList<>();
		do {
			System.out.print("Add new person (y/n)?");
			String ans = cin.nextLine();
			if (ans.equalsIgnoreCase("y")) {
				checkClassAndFillList(cin,personList);
			}
			else break;
			}while(true);
		
		for (Object person: personList) {  
			// identify student  
			if (person instanceof Student) 
			{   
			final Student st = (Student) person;   
			st.printStudent();   
			}                            
		}
		for (Object person: personList) {  
			// identify staff  
			if (person instanceof Staff) 
			{   
			final Staff st = (Staff) person;   
			st.printStaff();   
			}                            
		}
		cin.close();	
	}
	public static void checkClassAndFillList(Scanner cin,List<Person> personList) {
		System.out.print("Person is student or staff?");
		String ans = cin.nextLine();
		if (ans.equalsIgnoreCase("student")) {
			Student newStudent = new Student(cin);
			personList.add(newStudent);
		}
		else if(ans.equalsIgnoreCase("staff")) {
			Staff newStaff = new Staff(cin);
			personList.add(newStaff);
		}
		else System.out.print("Incorrect answer. Repeat please");
	}
}
