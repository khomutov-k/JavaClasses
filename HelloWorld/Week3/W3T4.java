import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
public class W3T4 {
	public static Scanner cin = new Scanner(System.in);
	public static void main(String[] args)  {	
		List<Integer> myNumbers = new ArrayList<Integer>();	//Container for read numbers
		List<Integer> winNumbers = new ArrayList<Integer>();//Container for generated numbers	
		String fileName = "C:\\Users\\Xiaomi\\git\\HelloWorld\\HelloWorld\\Week3\\hey.txt"; 
		
		// Read lottery numbers
		try(Scanner fin= new Scanner(new FileInputStream(fileName)))
	        {
	           
				int ind = 0;
				while(fin.hasNext()) {
					int number = fin.nextInt();
					if (number > 40 || ind > 6) {
						throw new Exception("Amount of rows or numbers are not eligible");
					}
					ind++;
					myNumbers.add(number);
				}
			}        
	    catch(Exception ex){
	             System.out.println(ex.getMessage());
	             return;
	        }
		
		//Printing numbers, that have already read
		String tempNumb ="";
		for (int number:myNumbers) {
			tempNumb += number+",";
		}
		System.out.println("Lottery numbers are: "+tempNumb.substring(0, tempNumb.length()-1));
		
		//Organizing loop and asking 
		while(true){
			System.out.print("Do you want to draw a lottery numbers (y = yes, n = no)?");
			String answer = cin.nextLine();
			if (answer.charAt(0)=='n') {
				System.out.print("Thank you and bye bye!");
				break;
			}
			
			//Generating lottery numbers
			System.out.print("Program draw a numbers ");
			String winNumberStr ="";
			for (int i = 0; i < 6; i++) {
				int rand = new Random().nextInt(40) + 1;
				winNumberStr += rand+",";
				winNumbers.add(rand);
			}
			System.out.println(winNumberStr.substring(0,winNumberStr.length()-1));
			
			// Handling lists to count equals 
			String equalNumbers ="";
			int counter=0;
			for (int myNumber:myNumbers) {
				for (int winNumber:winNumbers)
				if (myNumber == winNumber) {
					counter++;
					equalNumbers = equalNumbers.concat(myNumber+",");
				}
			}
			
			//Printing result
			int equalLength = equalNumbers.length()-1;
			System.out.print("Correct: "+counter);
			if (counter!=0) {
				System.out.println(","+ "which were "+equalNumbers.substring(0,equalLength));
			}
			else System.out.println();
		}
		cin.close();
		
	}
}

