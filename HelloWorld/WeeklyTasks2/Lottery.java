import javax.swing.JOptionPane;
import java.util.*;
public class Lottery {
	public static void main(String[] args)  {	
			boolean[] userNumbers = new boolean[41];	//Array for user numbers
			boolean[] mainNumbers = new boolean[41]; 	//Array for generated main numbers	
			boolean[] bonusNumbers = new boolean[41]; 	//Array for generated bonus numbers				
			
			//1.Generating lottery numbers
			
			//1.1.Main numbers
			
			for (int i = 0; i < 7; i++) {
				int rand = new Random().nextInt(40) + 1;
				mainNumbers[rand] = true;
			}
			
			 //1.2.Bonus numbers
			
			int newNumbersCount = 0;
			do{
				int rand = new Random().nextInt(40) + 1;
					if (!mainNumbers[rand]){ 
						bonusNumbers[rand] = true;
						newNumbersCount++;
					}				
				}
			while(newNumbersCount < 3);
			
			//2.User input	
			
			int userNumbersCount = 1;
			do {
				String input =  JOptionPane.showInputDialog(null, 
						"Give number #"+userNumbersCount,"Input", JOptionPane.QUESTION_MESSAGE);
				int in = Integer.parseInt(input);
				if ((in<0 || in>40) || (userNumbers[in])) {
					JOptionPane.showMessageDialog(null,
							"Given number is used or out of limits(1-40).Please try again");
					continue;
				}
				userNumbers[in] = true;
				userNumbersCount++;
			}while(userNumbersCount<8);
			
			//3.Printing data
			
			printNumbers(mainNumbers,"Main numbers:");
			printNumbers(bonusNumbers,"Bonus numbers:");
			printNumbers(userNumbers,"User numbers:");
			
			//4.Counting amount of correct numbers and printing it
			
			int mainValue = countNumbers(mainNumbers,userNumbers);
			System.out.println("Main numbers correct: "+mainValue);
			int bonusValue = countNumbers(bonusNumbers,userNumbers);
			System.out.println("Bonus numbers correct: "+bonusValue);
			
			
	}
	private static int countNumbers(boolean[] Numbers, boolean[] userNumbers) {
		int temp=0;
		for (int i = 1; i < 41 ;i++) {
			if (Numbers[i]&userNumbers[i]) temp++;
		}
		return temp;
	}
	private static void printNumbers(boolean[] Numbers,String label) {
		System.out.print(label);
		for (int j = 1; j < 41; j++) {
			if (Numbers[j] == true) System.out.print(j+" ");
		}
		System.out.println();
	}
	

}
