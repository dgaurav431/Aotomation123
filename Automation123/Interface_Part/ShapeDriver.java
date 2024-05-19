package Interface_Part;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape s1=new Rectangle(12, 46.8);
		s1.findArea();
		s1.findPerimeter();
		System.out.println("===================");
		Shape s2=new Circle(10);
		s2.findArea();
		s2.findPerimeter();
	}

}
