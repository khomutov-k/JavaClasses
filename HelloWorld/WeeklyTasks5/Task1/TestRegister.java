package Task1;

public class TestRegister {
	public static void main(String[]args) {
		Person tom = new Person("Tom", null, null);
		Student nick = new Student("Nick", "Home st.,15", "4 Nov 1998", 10, "1 sep 2016");
		Staff sam = new Staff("Sam", "James st.,1", "1st Jan 1990", 1, "Canthia", "Manager");
		sam.printStaff();
		nick.printStudent();
		tom = nick;
		System.out.println(tom.getName());
	}
}
