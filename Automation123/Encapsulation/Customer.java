package Encapsulation;

import java.util.Scanner;

public class Customer {

	private int pin=4563;
	private String name;
	private int eid;
	private double salary;
	
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN Code: ");
		int x=sc.nextInt();
		if(pin==x)
		{
			System.out.println("Correct Pin Code ");
			return name;
		}
		else
		{
			System.out.println("INVALID PIN Code!!Please Enter correct Pin code");
			return null;
		}
	}
	public int getEid()
	{
		//validate
		return eid;
	}
	public double getSalary()
	{
		//validate
		return salary;
	}
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN Code: ");
		int x=sc.nextInt();
		if(pin==x)
		{
			System.out.println("Name is set");
			this.name=name;
		}
		else
		{
			System.out.println("Name is not set");
		}
			
	}
	public void setEid(int eid)
	{
		//validate
		this.eid=eid;
	}
	public void setSalary(double salary)
	{
		//validate
		this.salary=salary;
	}
	
}
