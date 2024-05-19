package Inheritance;

public class Account {

	String name;
	int accno;
	String address;
	
	Account(){
		
	}
	
    Account(String name,int accno,String address){
		this.name=name;
		this.accno=accno;
		this.address=address;
	}
    public void displayDetails() {
    	System.out.println("Name is: "+name);
    	System.out.println("Accno is: "+accno);
    	System.out.println("Address is: "+address);
    }
	
}
