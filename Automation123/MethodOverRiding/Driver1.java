package MethodOverRiding;

public class Driver1 {

	public static void main(String[] args) {
		Shape1 s1= new Circles(10);
		s1.findArea();
		s1.findPerimeter();
		System.out.println("===================");
		Shape1 s2= new Rectangles(20,30);
		s2.findArea();
		s2.findPerimeter();
	}
}
