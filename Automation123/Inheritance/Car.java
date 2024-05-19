package Inheritance;

public class Car {

	static
	{
		System.out.println("Static Car");
	}
	{
		System.out.println("Non-static Car");
	}
	
	Car()
	{
		//super(12);
		System.out.println("No arg car constructor");
	}
	/*Car(int x)
	{
		//super();
		System.out.println("int arg car constructor");
	}*/

}
