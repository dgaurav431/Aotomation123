package packageCar;
//import bike.Hero;
import packageBike.*;
public class DriverOfCar {
	public static void main(String[] args) {
		System.out.println("From different package car");
		System.out.println(Hero.x);
		Hero.test();
		Hero h1=new Hero();
		System.out.println();
	}

}
