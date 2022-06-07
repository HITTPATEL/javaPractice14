package day14.Q1;

import java.util.Scanner;

public class AccountDemo {

	
	
	   public static void main(String[] args) {
		Account account=new Account();
		account.accountNumber="12323421354";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter amount to deposit");
		double depAmount=scanner.nextDouble();
			account.deposit(depAmount);
			
			System.out.println("Please Enter amount to withdraw");
			double withAmount=scanner.nextDouble();	
			
		try {
			     double paisa=account.withdraw(withAmount);
			     System.out.println("Withdraw amount is "+paisa);
		} catch (InsufficientFundsException ife) {
			System.out.println("Insufficient balance in your account");
		}
		
	}
}
