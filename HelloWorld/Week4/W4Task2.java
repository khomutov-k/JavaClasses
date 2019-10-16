import javax.swing.JOptionPane;
	import java.util.Random;
	import java.util.Scanner;
public class W4Task2 {
	public static void main(String[] args) {	
			Scanner in = new Scanner(System.in);
			System.out.print("Input third number:");
			int number = in.nextInt();
			for (int i =1;i<11;i++) {
				System.out.println(number+" x "+i+" = "+(number*i));
			}		
			in.close();
		}
}
