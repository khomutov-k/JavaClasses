package Task3;
import java.util.*;
public class Module {
	private Scanner cin = new Scanner(System.in);
	private String name;
	private int grade;
	private int credits;
	public Module(){
		System.out.print("Input module name:");
		this.name = cin.nextLine();
		System.out.print("Input grade:");
		this.grade = cin.nextInt();
		System.out.print("Input credits(ECTS):");
		this.credits = cin.nextInt();
	}
	@Override
	public String toString() {
		return "Module [name=" + name + ", grade=" + grade + ", credits=" + credits + "]";
	}

}
