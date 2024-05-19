package Composition;

public class Driver {

	public static void main(String[] args) {
		Car c1=new Car("maruti", 364677.56);
		System.out.println("Car Obj address is: "+c1);
		System.out.println("Car Engine Obj address is: "+c1.e);
		System.out.println("=================================");
		System.out.println("Car Name is: "+c1.name);
		System.out.println("Car Price is: "+c1.price);
		System.out.println("Car ENgine HP is: "+c1.e.hp);
		System.out.println("Car Engine Strokes is: "+c1.e.strokes);
		System.out.println("Car ENgine Type is: "+c1.e.type);
		System.out.println("==================================");
		c1.displayCar();
		c1.e.start();
		System.out.println("===================================");
		Car c2=new Car("TATA", 457658.67);
		c2.displayCar();
		System.out.println("========================================");
		Car c3=new Car("Audi", 234356.67, new Engine(140, 10, "DIesel"));
		c3.displayCar();
		System.out.println("=========================================");
		Car c4=new Car("Porsche", 3547878.56);
		c4.displayCar();
	}
}
