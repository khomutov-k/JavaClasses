package Task1;

public class Test {
	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount();
		SuperSavingsAccount account2 = new SuperSavingsAccount();
		account1.setOwner("Tom");
		account1.setBalanceEuro(1000);
		account1.setAnnualRate(10.5);
		System.out.println(account1.printAccountDetails());
		account2.setOwner("Nick");
		account2.setBalanceEuro(500);
		account2.setAnnualRate(10.5);
		System.out.println(account2.printAccountDetails());
		
	}
}
