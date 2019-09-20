import java.util.Scanner;
public class W3T1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Give share name:");
		String shareName = in.nextLine();
		System.out.print("Give profit percentage:");
		double profitPercent = in.nextDouble();
		System.out.print("Give amount of money:");
		int money = in.nextInt();
		System.out.print("Share "+ shareName+" return of capital "+money+" is "+money*profitPercent/100);
		in.close();
	}
}
