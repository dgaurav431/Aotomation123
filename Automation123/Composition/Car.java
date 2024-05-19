package Composition;

public class Car {

	String name;
	double price;
	Engine e=new Engine(120, 6, "Petrol");
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	Car(String name, double price, Engine e)
	{
		this.name=name;
		this.price=price;
		this.e=e;
	}
	public void displayCar()
	{
		System.out.println("Car NAME IS: "+name);
		System.out.println("Car Price is: "+price);
		e.displayEngine();
	}
}
