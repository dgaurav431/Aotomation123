package Initialization_By_NonStaticMethod;

public class Employ {

	String name;
	int eid;
	double salary;
	
	public void setValue(String n,int e, double s) {
		name=n;
		eid=e;
		salary=s;
	}
	
	public void displayDetails(){
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+eid);
		System.out.println("Weight is: "+salary);
		System.out.println("======================");
	}
}
