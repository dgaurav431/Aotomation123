package UpCasting_DownCasting;

public class Driver {

	public static void main(String[] args) {
		System.out.println("UpCasting===============");
		Object o1=new ElectricCar();
		
		Vehicle v1=new ElectricCar();
		v1.test();
		System.out.println("===========================");
		Vehicle v2=new Car();
		v1.test();
		System.out.println("===========================");
		Car c1=new ElectricCar();
		c1.test();
		System.out.println("===========================");
		System.out.println("Downcasting==============");
		Object o=new ElectricCar();//upcasting
		Vehicle v=(Vehicle)o;//downcasting
		Car c=(Car)o;//downcasting
		ElectricCar e=(ElectricCar)o;//downcasting
		
	}
}
