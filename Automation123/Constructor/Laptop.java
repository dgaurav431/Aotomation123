package Constructor;

public class Laptop {

	String name;
	int price;
	double weight;
	Laptop()
	{
		
	}
	Laptop(String name)
	{
		this.name=name;
	}
	Laptop(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	Laptop(String name, int price, double weight)
	{
		this(name, price);
		this.weight=weight;
	}
	public void displayDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
		System.out.println("====================");
	}

}
