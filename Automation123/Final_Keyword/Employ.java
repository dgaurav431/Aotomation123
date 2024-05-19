package Final_Keyword;

public class Employ {

	final static String COMP_NAME="The Great Company";
	String name;
	final int eid;//it must be initialized at every constructor that we will design
	double salary;
	Employ(int eid)
	{
		this.eid=eid;
	}
	Employ(String name, int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	Employ(String name, int eid, double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Name: "+name+" ID: "+eid+" Salary: "+salary);
	}

}
