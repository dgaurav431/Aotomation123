package MethodOverRiding;

public class Rectangles extends Shape1 {

	double l;
	double w;
	Rectangles()
	{
		
	}
	Rectangles(double l, double w)
	{
		this.l=l;
		this.w=w;
	}
	public void getArea()
	{
		System.out.println("The area of Recatngle is: "+(l*w)+" Sq. Unit");
	}
	public void getPerimeter()
	{
		System.out.println("The Perimeter of Recatngle is: "+2*(l+w)+" Unit");
	}
}
