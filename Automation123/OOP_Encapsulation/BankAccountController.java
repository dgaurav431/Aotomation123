package OOP_Encapsulation;

public class BankAccountController {
public static void main(String[] args) {
	BankAccount account= new BankAccount(123546789, "John", 1000.0);
	System.out.println("Account Number: " + account.getAccountNumber());
	System.out.println("Account name: " + account.getAccountname());
	System.out.println("Initial balance: " + account.getBalance());
	account.deposit(500.0);
	account.withdraw(200.0);
	System.out.println("Current balance: $" + account.getBalance());
}
}
