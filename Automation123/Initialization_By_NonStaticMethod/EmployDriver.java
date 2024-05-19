package Initialization_By_NonStaticMethod;

public class EmployDriver {

	public static void main(String[] args) {
	
	Employ e1=new Employ();
	Employ e2=new Employ();
	Employ e3=new Employ();
	Employ e4=new Employ();
	
	e1.setValue("Mohan", 123, 123456.789);
	e2.setValue("Sohan", 231, 345678.789);
	e3.setValue("Manmohan", 321, 65454.789);
	e2.setValue("Jagmohan", 431, 657878.789);
	
	e1.displayDetails();
	e2.displayDetails();
	e3.displayDetails();
	e4.displayDetails();
	}
}
