package Task1;

public class SavingsAccount extends Account{

	@Override
	double calculateYearInterestYield() {		
		return getAnnualRate()*getBalanceEuro()/100;
	}

	@Override
	String printAccountDetails() {
		return getOwner()+": Savings account has balance of"+getBalanceEuro()+
				", with an interest rate of "+getAnnualRate()+"% per anuum at"
				+ "a rate of "+calculateYearInterestYield();
	}

}
