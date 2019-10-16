import javax.swing.JOptionPane;
	import java.util.Random;
	import java.util.Scanner;
public class W4Task1 {
		 public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Input first number:");
			int one = in.nextInt();
			System.out.print("Input second number:");
			int two = in.nextInt();
			System.out.print("Input third number:");
			int three = in.nextInt();
			int least = findLeast(one,two,three);
			System.out.print("The smallest value "+least);
			in.close();			
		}
		 static int findLeast(int ...numbers) {
			 int leastVal = numbers[0];
			 for (int num:numbers) {
				 if (leastVal > num) leastVal = num;
			 }
			 return leastVal;
		 }
	}
