package Interface_Part;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1=new Car();
		v1.start();
		v1.drive();
		v1.accelerate();
		System.out.println("================");
		PetrolVehicle p1=new Bike();
		p1.start();
		p1.drive();
		p1.stop();
		p1.accelerate();
	}
}
