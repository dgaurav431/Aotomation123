package MethodOverRiding;

public class Rectangle {

	double l;
	double w;
	Rectangle()
	{
		
	}
	Rectangle(double l, double w)
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
