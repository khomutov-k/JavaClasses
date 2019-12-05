package Task3;

public class CourseTest {
	public static void main(String[] args) {
		Course myCourse = new Course();
		System.out.println("Course name: "+myCourse.getName());
		System.out.println("Start date: "+myCourse.getStartDate());
		System.out.println("End date: "+myCourse.getEndDate());	
		myCourse.getModules();
	}
}
