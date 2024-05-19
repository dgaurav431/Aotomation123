package Inheritance;

public class SavingAccount extends Account{

	double amount;
	String ifsc;
	
	SavingAccount(){
		
	}
	
    SavingAccount(String name,int accno,String address,double amount,String ifsc){
		super(name, accno, address);
			this.amount=amount;
			this.ifsc=ifsc;
	}
    
    public void displaySavingAccount() {
    	super.displayDetails();
    	System.out.println("Amount is: "+amount);
    	System.out.println("Ifsc is: "+ifsc);
    }
}
