import javax.swing.JOptionPane;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oneString = JOptionPane.showInputDialog(null, "Please enter 1st number");
		String twoString = JOptionPane.showInputDialog(null, "Please enter 2nd number");
		int oneNumber = Integer.parseInt(oneString);
		int twoNumber = Integer.parseInt(twoString);
		JOptionPane.showMessageDialog(null, oneNumber+ "+" +twoNumber+"="+(oneNumber+twoNumber)+"\n"+
				oneNumber+ "*" +twoNumber+"="+(oneNumber*twoNumber)+"\n"+
				oneNumber+ "-" +twoNumber+"="+(oneNumber-twoNumber));
	}

}
