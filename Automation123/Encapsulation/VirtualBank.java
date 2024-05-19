package Encapsulation;

import java.util.Scanner;

public class VirtualBank {
	
	
	private int pin;
	private String name;
	private double balance;
	Scanner sc = new Scanner(System.in);
	
	public VirtualBank(int pin,String name,double balance) {
		this.pin=pin;
		this.name=name;
		this.balance=balance;
		
	}
	public void deposit() {
		System.out.println("enter pin");
		int userPin = sc.nextInt();
		if(isVerify(userPin)){
			System.out.println("enter an amount to be deposit:");
			double amt =sc.nextDouble();
			this.balance += amt;
			  System.out.println("Deposit successful. Current balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance.");
        }
	}
		public void withdraw() {
		System.out.println("enter pin");
		int userPin= sc.nextInt();
		if(isVerify(userPin)) {
			System.out.println("enter an amount to be withdraw");
			double amt = sc.nextDouble();
			this.balance -= amt;
			  System.out.println("Withdrawal successful. Current balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance.");
        }
	}
		public void transfer() {
			System.out.println("enter pin");
				int userPin= sc.nextInt();
				if(isVerify(userPin)) {
				System.out.println("enter an amount to be transfer");
					double amt = sc.nextDouble();
					this.balance -= amt;
					  System.out.println("Transfer successful. Current balance: " + this.balance);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
		}
		
		private boolean isVerify(int userPin) {
			
			return true;
		}
		
		public static void main(String[] args) {
	        VirtualBank bank= new VirtualBank(123,"John", 12345);
	        bank.deposit();
	        bank.withdraw();
	        bank.transfer();
	    }
}
