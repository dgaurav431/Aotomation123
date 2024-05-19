package MethodShadowing;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new ElectricCar();
		v1.test();
		
		Car c1 = new ElectricCar();
		c1.test();
	}	
	
}
