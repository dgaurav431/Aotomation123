package Initialization_By_Method;

public class CarDriver {
	public static void main(String[] args) {
		System.out.println("This is CarDriver");
		Car c1=new Car();
		c1.setValue("TATA", 2353678, "WHite");
		Car c2=new Car();
		c2.setValue("Maruti", 3467568, "Black");
		
		c1.displayCar();
		c2.displayCar();
	}
}
