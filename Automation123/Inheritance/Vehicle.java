package Inheritance;

public class Vehicle {

	static
	{
		System.out.println("Static Vehicle");
	}
	{
		System.out.println("Non-static Vehicle");
	}
	
	Vehicle()
	{
		System.out.println("Vehicle no arg constructor");
	}
	/*Vehicle(int x)
	{
		System.out.println("Vehicle int arg constructor");
	}*/
}
