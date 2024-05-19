package Initialization_By_NonStaticMethod;

public class Fruit {

	String name;
	int price;
	double weight;
	
	public void setValue(String name,int price, double weight) {
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	
	public void displayDetails(){
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
	}
}
