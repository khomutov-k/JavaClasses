import javax.swing.JOptionPane;
	import java.util.Random;
	import java.util.Scanner;
public class W4Task4 {
	static Scanner in = new Scanner(System.in);
	static double width,height;
	public static void main(String[] args) {
		try {inputValues();}
		catch(Exception ex) {
			System.out.println("Input mistake:invalid value");
			return;
		}
		double perimeter = 2*(width+height);
		double area = width*height;
		System.out.format("Perimeter is 2*(%.2f+%.2f) = %.2f\n",width,height,perimeter);
		System.out.format("Area is %.2f+%.2f = %.2f",width,height,area);
	}
	static void inputValues(){
		System.out.print("Width = ");
		width = in.nextFloat();
		System.out.print("Height = ");
		height = in.nextFloat();	
		
	}
}
