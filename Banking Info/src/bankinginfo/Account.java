package bankinginfo;

public class Account {
	private long accountNumbmer;
	private double balanceAmount;
	public long getAccountNumbmer() {
		return accountNumbmer;
	}
	public void setAccountNumbmer(long accountNumbmer) {
		this.accountNumbmer = accountNumbmer;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Account(long accountNumbmer, double balanceAmount) {
		super();
		this.accountNumbmer = accountNumbmer;
		this.balanceAmount = balanceAmount;
	}
	public void deposit(double depositedAmount)
	{
		balanceAmount=balanceAmount+depositedAmount;
	}
	public boolean withdraw(double withdrawAmount)
	{ 
		if(withdrawAmount<=balanceAmount)
		{
			balanceAmount=balanceAmount-withdrawAmount;
			return true;
		}
		return false;
		
	}

}
