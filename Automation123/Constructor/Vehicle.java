package Constructor;

public class Vehicle {
	static int count=0;
	Vehicle()
	{
		count++;
	}
	
	public static void getTotalObject()
	{
		System.out.println("Total Object Created is: "+count);
	}
}
