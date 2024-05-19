package Constructor;

public class Fruit1 {
	String name;
	int price;
	double weight;
	Fruit1()
	{
		
	}
	Fruit1(String name)
	{
		this.name=name;
	}
	Fruit1(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	Fruit1(String name, int price, double weight)
	{
		this(name, price);
		this.weight=weight;
	}
	public void displayFruit1()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
		System.out.println("====================");
	}

}
