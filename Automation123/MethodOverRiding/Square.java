package MethodOverRiding;

public class Square {

	double side;
	Square()
	{
		
	}
	Square(double side)
	{
		this.side=side;
	}
	public void getArea()
	{
		System.out.println("The area of Square is: "+(side*side)+" Sq. Unit");
	}
	public void getPerimeter()
	{
		System.out.println("The Perimeter of Square is: "+4*side+" Unit");
	}

}
