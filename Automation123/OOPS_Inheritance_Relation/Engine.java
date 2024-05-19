package OOPS_Inheritance_Relation;

public class Engine {
		String brand;
		String model;
	    int power;
	    int capacity;
	    
	public Engine(String brand, String model,  int power, int capacity) {
		this.brand= brand;
		this.model= model;
		this.power= power;
		this.capacity= capacity;
	}
	public void displayEngine() {
		System.out.println("Brand:" + this.brand);
		System.out.println("Model:"+ this.model);
		System.out.println("Power:" + this.power);
		System.out.println("Capacity:" + this.capacity);
	}
}
