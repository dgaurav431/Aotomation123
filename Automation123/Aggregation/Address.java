package Aggregation;

public class Address {

	String city;
	String state;
	int pin;
	Address()
	{
		
	}
	Address(String city, String state, int pin)
	{
		this.city=city;
		this.state=state;
		this.pin=pin;
	}
	public void displayAddress()
	{
		System.out.println("City is: "+city);
		System.err.println("STate is: "+state);
		System.out.println("PIN is: "+pin);
	}
}
