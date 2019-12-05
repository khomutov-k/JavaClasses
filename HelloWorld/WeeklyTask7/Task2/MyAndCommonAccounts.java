package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyAndCommonAccounts {
	public SavingsAccount myAccount;
	public SuperSavingsAccount commonAccount;
	
	public  MyAndCommonAccounts() {	
		myAccount = new SavingsAccount();
		commonAccount = new SuperSavingsAccount();
		enterAccount(myAccount,"your account");
		enterAccount(commonAccount,"common account");
		System.out.println(myAccount.printAccountDetails());
		System.out.println(commonAccount.printAccountDetails());
		
	}
	public void enterAccount(Account account, String prompt) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Entering information about "+prompt);
		System.out.print("Enter the name of owner:");
		account.setOwner(cin.nextLine());
		System.out.print("Enter account balance in euro:");
		account.setBalanceEuro(cin.nextDouble());
		
		boolean isDone;
		do {
			try {
				System.out.print("Enter annual rate:");
				account.setAnnualRate(cin.nextDouble());
				isDone = true;
			} 
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Please try again.");
				isDone = false;
			}
			catch (InputMismatchException e) {
					System.out.println("Incorrect formate of double. Please try again.");
					cin.next();
					isDone = false;
			}
		} while (!isDone);	
	}
}
