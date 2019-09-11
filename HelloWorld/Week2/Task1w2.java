import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class Task1w2 {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number:");
		int number = input.nextInt();
		for (int i =1;i<11;i++) {
			System.out.println(number+" x "+i+" = "+(number*i));
		}
	}
}
