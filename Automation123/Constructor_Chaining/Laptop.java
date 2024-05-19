package Constructor_Chaining;

public class Laptop {

	String name;
	int price;
	double weight;
	
	Laptop(){
		
	}
	Laptop(String name)
	{
		this();
		this.name=name;
	}
	Laptop(String name, int price)
	{
		this(name);
		this.price=price;
	}

	Laptop(String name, int price, double weight)
	{

		this(name,price);
		this.weight=weight;
	}
	Laptop(int price,String name,  double weight)
	{

		this(name,price);
		this.weight=weight;
	}
}
