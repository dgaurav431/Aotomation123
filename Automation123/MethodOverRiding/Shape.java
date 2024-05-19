package MethodOverRiding;

import java.util.Scanner;

public class Shape {

	public static void selectShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Circle");
		System.out.println("Press 2 for Rectangle");
		System.out.println("Press 3 for Square");
		int option=sc.nextInt();
		switch(option)
		{
			case 1: 
				System.out.println("You have selected Circle");
				System.out.println("Enter the radius of Circle: ");
				double r=sc.nextDouble();
				Circle c1=new Circle(r);
				c1.getArea();
				c1.getPerimeter();
				break;
			case 2: 
				System.out.println("You have selected Rectangle");
				System.out.println("Enter the length of Rectangle: ");
				double l=sc.nextDouble();
				System.out.println("Enter the width of Rectangle: ");
				double w=sc.nextDouble();
				Rectangle r1=new Rectangle(l, w);
				r1.getArea();
				r1.getPerimeter();
				break;
			case 3: 
				System.out.println("You have selected Square");
				System.out.println("Enter the side of Square: ");
				double side=sc.nextDouble();
				
				Square s1=new Square(side);
				s1.getArea();
				s1.getPerimeter();
				break;
			default: 
				System.out.println("This is not a valid Option!!");
		}
	}

}
