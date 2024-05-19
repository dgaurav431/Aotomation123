package Copy_Constructor;

public class Fruit {

	String name;
	int price;
	double weight;
	Fruit()
	{
		
	}
	Fruit(Fruit p)
	{
		this.name=p.name;
		this.price=p.price;
		this.weight=p.weight;
	}
	Fruit(Fruit p, double weight)
	{
		this.name=p.name;
		this.price=p.price;
		this.weight=weight;
	}
	Fruit(String name, int price, double weight)
	{
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	public void displayFruit()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
		System.out.println("====================");
	}

}
