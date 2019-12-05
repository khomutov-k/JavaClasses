package Task2;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		Student newStudent = new Student();
		newStudent = StudentUtils.CheckInformation(newStudent);
		
		if (newStudent != null) System.out.print(newStudent);
		cin.close();
	}

}
