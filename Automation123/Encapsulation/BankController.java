package Encapsulation;

public class BankController {

	public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setBankAccount(1234567898,"Aman raj",1000);
        
        System.out.println("Account Holder: " + obj.getAccountHolder());
        System.out.println("Account Number: " + obj.getAccountNumber());
        System.out.println("Initial Balance: $" + obj.getBalance());
        
        obj.deposit(500.0);
        obj.withdraw(200.0);
        
        System.out.println("Current Balance: $" + obj.getBalance());
    }
}
