package Task2;

public class StudentUtils {
	static Student CheckInformation(Student student){
		
		if (student.getFirstName().isEmpty() ||
				student.getLastName().isEmpty()||
				student.getAddress().isEmpty() || 
				student.getStudentNumber().isEmpty()){
			System.out.println("Error:Some of the fields are empty");
			return null;
		}
			
		
		if (!isValid(student.getFirstName())) {
			String newFirstName = fixName(student.getFirstName());
			student.setFirstName(newFirstName);
		}
		if (!isValid(student.getLastName())) {
			String newLastName = fixName(student.getLastName());
			student.setLastName(newLastName);
		}
		
		try{
			Integer.parseInt(student.getStudentNumber());
		}
		catch (NumberFormatException e){
			System.out.println("Error:Student number should only "
					+ "contain numbers");
			return null;
		}
		
		return student;
	}
	
	private static String fixName(String name) {
		String endOfName = name.substring(1).toLowerCase();
		String startOfName = name.substring(0, 1).toUpperCase();
		return startOfName + endOfName;
	}
	
	private static boolean isValid(String name) {
		return name.matches("[A-Z][a-z]*");
	}
	
}

