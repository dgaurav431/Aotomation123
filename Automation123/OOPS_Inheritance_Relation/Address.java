package OOPS_Inheritance_Relation;

public class Address {
	String houseno;
    String street;
    int pincode;
    String city;
    String state;
    
public Address(String houseno, String street,  int pincode, String city, String state) {
	this.houseno= houseno;
	this.street= street;
	this.pincode= pincode;
	this.city= city;
	this.state= state;
}
public void displayAddress() {
	System.out.println("Houseno:" + this.houseno);
	System.out.println("Street:"+ this.street);
	System.out.println("Pincode:" + this.pincode);
	System.out.println("City:" + this.city);
	System.out.println("State:" + this.state);
}
}
