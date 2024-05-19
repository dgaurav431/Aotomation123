package OOP_Basic;

public class VehicleController {
	public static void main(String[] args) {
		Vehicle vh1 = new Vehicle();
		vh1.display();
		vh1.setData("Audi",4999999, "electric");
		System.out.println("After initializing the value of object");
		vh1.display();
		System.out.println("---------------------");
		Vehicle vh2 = new Vehicle();
		vh2.display();
		vh2.setData("Jaguar",1499999, "electric");
		System.out.println("After initializing the value of object");
		vh2.display();
	}
}
