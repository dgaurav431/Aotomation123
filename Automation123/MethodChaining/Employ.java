package MethodChaining;

public class Employ {

	String name;
	int eid;
	double salary;
	int age;
	String address;
	Employ()
	{
		
	}
	Employ(String name, int eid, double salary, int age, String address)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.age=age;
		this.address=address;
	}
	public Employ getName()
	{
		System.out.println("Name is: "+name);
		return this;
	}
	public Employ getEid()
	{
		System.out.println("Employ ID is: "+eid);
		return this;
	}
	public Employ getSalary()
	{
		System.out.println("Salary is: "+salary);
		return this;
	}
	public Employ getAge()
	{
		System.out.println("Age is: "+age);
		return this;
	}
	public Employ getAddress()
	{
		System.out.println("Address is: "+address);
		return this;
	}
}
