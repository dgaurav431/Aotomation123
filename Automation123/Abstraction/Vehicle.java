package Abstraction;

public abstract class Vehicle {

	public abstract void drive();
	public abstract void start();
	
	Vehicle()
	{
		System.out.println("Vehicle class no-arg constructor");
	}
	Vehicle(int x)
	{
		System.out.println("Vehicle class constructor");
	}
	
	public void accelerate()
	{
		System.out.println("Accelerate the Vehicle");
	}
	public void stop()
	{
		System.out.println("Stop the Vehicle");
	}
	
}
