package MethodOverRiding;

public class Circle {

	double r;
	Circle()
	{
		
	}
	Circle(double r)
	{
		this.r=r;
	}
	public void getArea()
	{
		System.out.println("The area of Circle is: "+(3.14*r*r)+" sq. unit");
	}
	public void getPerimeter()
	{
		System.out.println("The Perimeter of Circle is: "+(2*3.14*r)+" unit");
	}
}
