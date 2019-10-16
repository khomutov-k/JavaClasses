import javax.swing.JOptionPane;
	import java.util.Random;
	import java.util.Scanner;
public class W4Task3 {
	public static void main(String[] args) {
		final double PI = 3.1416;
		Scanner input = new Scanner(System.in);
		System.out.print("Radius = ");
		double radius = input.nextFloat();
		double perimeter = 2*PI*radius;
		double area = PI * radius*radius;
		System.out.println("Perimeter is = "+perimeter);
		System.out.print("Area is = "+area);
		input.close();
	}
}
