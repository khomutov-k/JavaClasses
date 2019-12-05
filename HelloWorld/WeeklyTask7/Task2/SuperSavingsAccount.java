package Task2;

public class SuperSavingsAccount extends Account{

	@Override
	double calculateYearInterestYield() {
		
		if (getBalanceEuro() > 10000) {
			return (getAnnualRate()+3.0)*getBalanceEuro()/100;
		}
		else return getAnnualRate()*getBalanceEuro()/100;
	}

	@Override
	String printAccountDetails() {
		return getOwner()+": The super-savings account has balance of "+getBalanceEuro()+
				", with an interest rate of "+ getAnnualRate()+"% on an annual"
				+ " rate of "+calculateYearInterestYield();
	}

}
