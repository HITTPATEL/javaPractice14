package day14.Q1;

public class Account {
     String accountNumber;
     double balance;
     public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Your account balance is "+balance);
	}
     
     public double withdraw(double amount) throws InsufficientFundsException {
		   if(balance>amount) {
			   balance=balance-amount;
			   return amount;
		   }
		   else {
			   InsufficientFundsException insufficientFundsException=new InsufficientFundsException();
			   throw insufficientFundsException;
		   }
	}
}
