package OOP_Encapsulation;

public class BankAccount {
	
private long accountNumber;
private String accountName;
private double balance;

public BankAccount() {
	
}
public BankAccount(long accountNumber, String accountName, double initialBalance) {
	this.accountNumber= accountNumber;
	this.accountName= accountName;
	this.balance= initialBalance;
}

public long getAccountNumber() {
	return accountNumber;
}
	public String getAccountname() {
		return accountName;
	}
	public double getBalance() {
		return balance;
	}
	
public void deposit(double amount) {
	if (amount>0) {
		balance= balance + amount;
		System.out.println("Deposited: $" + amount);
	}else {
		System.out.println("Invalid deposit amount");
	}
}
public void withdraw(double amount) {
		if (amount>0 && amount <= balance) {
			balance= balance-amount;
			System.out.println("withdraw: $" + amount);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
}
