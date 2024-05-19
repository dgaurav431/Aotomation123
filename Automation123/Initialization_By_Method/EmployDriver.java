package Initialization_By_Method;

public class EmployDriver {
	public static void main(String[] args)
	{
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		Employ e4=new Employ();
		e1.setValue("Mohan", 231, 346457.56);
		e2.setValue("Sohan", 238, 316457.56);
		e3.setValue("Rohan", 321, 246457.56);
		e4.setValue("ManMohan", 451, 716457.56);
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		e4.displayDetails();
	}
}
