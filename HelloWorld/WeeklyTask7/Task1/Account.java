package Task1;

public abstract class Account {
	private String accountNumber;
	private String owner;
	private double balanceEuro;
	private double annualRate;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalanceEuro() {
		return balanceEuro;
	}
	public void setBalanceEuro(double balanceEuro) {
		this.balanceEuro = balanceEuro;
	}
	public double getAnnualRate() {
		return annualRate;
	}
	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}
	
	abstract double calculateYearInterestYield();
	abstract String printAccountDetails();
}
