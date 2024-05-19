package Interface_Part;

public class Rectangle implements Shape {
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
	public double findArea()
	{
		double area=l*w;
		System.out.println("The area of Rectangle is: "+area+" Sq. Unit");
		return area;
	}
	public double findPerimeter()
	{
		double peri=2*(l+w);
		System.out.println("The perimeter of rectangle is: "+peri+" Unit");
		return peri;
	}


}
