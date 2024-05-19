/*
 * package OOP_Encapsulation;
import java.util.Scanner;
public class VirtualBank {
	
    private String name;
    private double balance;
    private long acno;
    private int pin;
    private long phone;
    Scanner sc= new Scanner(System.in);

   public VirtualBank(String name, long acno, long phone) {
	   this.name= name;
	   this.acno=acno;
	   this.phone=phone;
   }
   public void deposite() {
	   System.out.println("Enter pin : " );
	   int userpin = sc.nextInt();
	   
	   if (isVerify()) {
		   System.out.println("Enter amount to deposit : ");
		   double amt= sc.nextDouble();
		   this.balance +=amt;
	   }else {
		   System.out.println("Invalid pin : ");
	   }
   }
    public void withdraw(double amt) {
    	System.out.println("Enter pin : ");
    	int userpin = sc.nextInt();
    	if ((this.balance-amt) > 0) {
    		System.out.println("Pocessing the amount ");
    		this.balance -=amt;
    	}else {
    		System.out.println("Insufficient Balance");
    	}else {
    	System.out.println("Invalid pin");
    }
}
     private boolean isVerify(int userpin) {
    	 return this.pin == userpin;
     }
}
*/
package OOP_Encapsulation;
import java.util.Scanner;

public class VirtualBank {

    private String name;
    private double balance;
    private long acno;
    private int pin;
    private long phone;
    private Scanner sc;

    public VirtualBank(String name, long acno, long phone, int pin) {
        this.name = name;
        this.acno = acno;
        this.phone = phone;
        this.pin = pin;
        this.balance = 0.0;
        sc = new Scanner(System.in);
    }

    public void deposit() {
        System.out.print("Enter pin: ");
        int userpin = sc.nextInt();

        if (isVerify(userpin)) {
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            this.balance += amt;
            // this.balance = balance+amount;
            System.out.println("Deposit successful. Current balance: " + this.balance);
        } else {
            System.out.println("Invalid pin.");
        }
    }

    public void withdraw(double amt) {
        System.out.print("Enter pin: ");
        int userpin = sc.nextInt();

        if (isVerify(userpin)) {
            if ((this.balance - amt) >= 0) {
                System.out.println("Processing the withdrawal.");
                this.balance -= amt;
                // balance= balance-amt;
                System.out.println("Withdrawal successful. Current balance: " + this.balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid pin.");
        }
    }

    private boolean isVerify(int userpin) {
        return this.pin == userpin;
    }

    public static void main(String[] args) {
        VirtualBank bankAccount = new VirtualBank("John Doe", 123, 98, 123);
        bankAccount.deposit();
        bankAccount.withdraw(100.0);
    }
}
