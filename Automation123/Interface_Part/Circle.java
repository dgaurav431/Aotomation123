package Interface_Part;

public class Circle implements Shape {
	double r;
	Circle()
	{
		
	}
	Circle(double r)
	{
		this.r=r;
	}
	public double findArea()
	{
		double area=Math.PI*r*r;
		System.out.println("The area of Circle is: "+area+" Sq. Unit");
		return area;
	}
	public double findPerimeter()
	{
		double peri=2*Math.PI*r;
		System.out.println("The perimeter of Circle is: "+peri+" Unit");
		return peri;
	}


}
