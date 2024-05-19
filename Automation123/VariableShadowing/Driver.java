package VariableShadowing;

public class Driver {

	public static void main(String[] args) {

		Vehicle v1 = new ElectricCar();
		System.out.println(v1.a);
		System.out.println(v1.b);
		
		System.out.println("===============");
		Car c1 = new ElectricCar();
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}
