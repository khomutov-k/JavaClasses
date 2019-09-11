import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class W2task3 {
	 public static void main(String[] args) {
		final double PI = 3.1416;
		Scanner input = new Scanner(System.in);
		System.out.print("Width = ");
		double width = input.nextFloat();
		System.out.print("Height = ");
		double height = input.nextFloat();
		double perimeter = 2*(width+height);
		double area = width*height;
		System.out.println("Perimeter is 2*("+width+"+"+height+") = "+perimeter);
		System.out.print("Area is "+width+"*"+height+"= "+area);
	}
}
