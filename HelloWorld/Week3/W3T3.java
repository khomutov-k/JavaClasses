import java.util.*;
public class W3T3 {
	private static double total=0;
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {	
		List<Double> incomes = new ArrayList<Double>();		
		double average;
		Input(incomes);
		average = total/incomes.size();
		System.out.println("Total incomes are:"+total);
		System.out.println("Average monthly income is:"+average);
		System.out.println("Biggest monthly income is:"+Collections.max(incomes));
		in.close();
	}
	public static void Input(List<Double> incomes)
	// method for input
	{
		int ind = 1;
		while(true) {
			double temp;
			System.out.print("Enter "+ind+". month income:");
			temp = in.nextInt();
			if (temp<0) break;
			total+=temp;
			incomes.add(temp);
			ind++;
		}
	}
}

