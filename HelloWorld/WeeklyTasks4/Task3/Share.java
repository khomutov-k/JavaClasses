package Task3;
import java.util.*;
public class Share {
	private String name;
	private int purchasePrice;
	public Share(){
		Scanner cin = new Scanner(System.in);
		System.out.println("Input share name:");
		name = cin.nextLine();
		System.out.println("Input purchase price:");
		purchasePrice = cin.nextInt();
	}
	public int PrintValue(int annualGrowth,int timePeriod) {
		if (timePeriod>0) {	
			int previousCapital = PrintValue(annualGrowth,--timePeriod);
			int currentCapital = previousCapital+calculateRecoveryForOneYear(annualGrowth,previousCapital);
			System.out.println("After "+(timePeriod+1)+" year(s) capital "
					+ "will be "+currentCapital);
			return currentCapital;
		}
		return purchasePrice;
		
	}
	private int calculateRecoveryForOneYear(int annualGrowth, int capital) {
		return capital*annualGrowth/100;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
