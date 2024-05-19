package ConstructorOverLoading;

public class Laptop {
	String name;
	int price;
	double weight;
	
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
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	Laptop(int price,String name,  double weight)
	{
		this.price=price;
		this.name=name;
		this.weight=weight;
	}
}
