package Initialization_By_Method;

public class Employ {
	String emp_name;
	int eid;
	double salary;
	public void setValue(String n, int e, double s)
	{
		emp_name=n;
		eid=e;
		salary=s;
	}
	public void displayDetails()
	{
		System.out.println("Name is: "+emp_name);
		System.out.println("EID is: "+eid);
		System.out.println("Salary is: "+salary);
		System.out.println("=======================");
	}
}
