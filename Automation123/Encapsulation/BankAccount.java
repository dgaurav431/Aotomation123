package Encapsulation;

public class BankAccount {
	
	static {
		  System.out.println("welcome to sbi atm");
		  System.out.println("-----------------------");
	  }

	      private long accountNumber;
	      private  String accountHolder;
	      private  double balance;
      public void  setBankAccount(long accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }
	    public long getAccountNumber() {// if we want to make hidden data members only readable then create only getmethod.
	        return accountNumber;
	    }
	    public String getAccountHolder() {
	        return accountHolder;
	    }
	    public double getBalance() {
	        return balance;
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;//balance = balance + amount
	            System.out.println("total balance after deposit: $" + this.balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;//balance = balance - amount
	            System.out.println("total balance after withdraw : $" + this.balance);
	            
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
}
