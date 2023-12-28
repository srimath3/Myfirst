package classandobject;

public class Account {
	public int accNo;
	public String accName;
	public int balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean withdraw(int w) {
		if(getBalance()<w)
		{
			System.out.println("Not Valid Transaction");
			return false;
			
		}
		else
		{
			System.out.println(getBalance()-w);
			System.out.println("Valid Transaction and Amount after withdrawn");
			return true;
		}
		
	}

}
