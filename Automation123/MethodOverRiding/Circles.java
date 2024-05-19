package MethodOverRiding;

public class Circles extends Shape1 {

	double r;
	Circles(){
		
	}

	Circles(double r){
		this.r=r;
	}
	public void findArea() {
		System.out.println("Area of circle is: "+3.14*r*r+"sq. unit");
	}
	public void findPerimeter() {
		System.out.println("Perimeter of circleis: "+2*3.14*r+"unit");
	}
}
