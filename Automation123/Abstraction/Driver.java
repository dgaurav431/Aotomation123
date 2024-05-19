package Abstraction;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1=new ElectricCar();
		v1.start();
		v1.accelerate();
		v1.drive();
		v1.start();
		v1.stop();
		System.out.println("==================");
		Car c1= new Maruti();
		c1.drive();
		c1.start();
		c1.openGate();
	}
}
