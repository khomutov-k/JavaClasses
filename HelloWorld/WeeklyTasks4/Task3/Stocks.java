package Task3;
import java.util.*;
public class Stocks {

	public static void main(String[] args) {
		
		List<Share> shareList = new ArrayList<>();
		Scanner cin = new Scanner(System.in); 
		String ans;
		
		do {
			System.out.println("Add new share (y/e)?");
			ans = cin.nextLine();
			if (ans.equalsIgnoreCase("y")) {
				Share newShare = new Share();
				shareList.add(newShare);
			}
			else break;
			}while(true);
		
		System.out.print("Enter rate of increase(%): ");
		int growthRate =cin.nextInt();
		System.out.print("Enter time period(in years): ");
		int timePeriod =cin.nextInt();
		int totalShareCapital = 0;
		
		for (Share oneShare:shareList) {
			System.out.println("Calculation total income for "+oneShare.getName()+":");
			totalShareCapital += oneShare.PrintValue(growthRate, timePeriod);
		}
		
		System.out.println("Total share capital is "+totalShareCapital);
		cin.close();
	}

}
