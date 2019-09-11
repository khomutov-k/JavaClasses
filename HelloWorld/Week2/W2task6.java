import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class W2task6 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			System.out.print("Input a number:");
			int number = input.nextInt();
			if (number%2 == 1) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}
	}
}
