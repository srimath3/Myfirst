package classandobject;

import java.util.Scanner;

public class AccountDetails {
	public static Account getAccountDetails() {
		Account account = new Account();
		Scanner sc= new Scanner(System.in);
		System.out.println("Account No:");
		account.setAccNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Account Name:");
		account.setAccName(sc.nextLine());
		int bal;
		do
		{
			System.out.println("Account balance:");
			account.setBalance(sc.nextInt());
			bal=account.getBalance();
			if(bal<=0)
			{
				System.out.println("must be positive");
			}
			
		}
		while(bal<=0);
		return account;
	}
	public static int getWithdrawAccount()
	{ 
		Scanner sc= new Scanner(System.in);
		int w;
			do
			{
				System.out.println("withdrawn amount:");
				w=sc.nextInt();
				if(w<=0)
				{
					System.out.println("must be positive");
				}
				
			}
			while(w<=0);
			return w;
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account accountobj = new Account();
		accountobj= getAccountDetails();
	    int c= getWithdrawAccount();
		accountobj.withdraw(c);
		

	}


}
