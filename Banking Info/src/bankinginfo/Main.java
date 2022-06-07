package bankinginfo;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("AC NO:");
		long accountNumber=scanner.nextLong();
		System.out.println("Balance:");
		double balanceAmount=scanner.nextDouble();
		Account account=new Account(accountNumber, balanceAmount);
		double deposited=scanner.nextDouble();
		account.deposit(deposited);
		double avlbalance=account.getBalanceAmount();
		System.out.println("AvailableBalance after deposited:"+avlbalance);
		double withdrawn= scanner.nextDouble();
		account.withdraw(withdrawn);
		avlbalance=account.getBalanceAmount();
		System.out.println("AvailableBalance After withdraw:"+avlbalance);
		if(!(account.withdraw(withdrawn)))
		{
			System.out.println("Exceed the balance ");
		}
		
	
		
		

	}

	
}
