package Encapsulation;

import java.util.Scanner;

public class Employ {

	private int pwd=2237;
	private String name;
	private int eid;
	private double salary;
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Password: ");
		int u_pwd=sc.nextInt();
		if(pwd==u_pwd)
		{
			System.out.println("Validation is successfull");
			return name;
		}
		System.out.println("Validation is NOT successfull");
	return null;
	}
	public int getEid()
	{
		//validation
		return eid;
	}
	public double getSalary()
	{
		//validation
		return salary;
	}
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Password: ");
		int user_pwd=sc.nextInt();
		if(pwd==user_pwd)
		{
			System.out.println("Validation is successfull and name is set!");
			this.name=name;
		}
		else
		{
			System.out.println("Invalid Password!! Name is not Set!!");
		}
		
	}
	public void setEid(int eid)
	{
		//validation
		this.eid=eid;
	}
	public void setSalary(double salary)
	{
		//validation
		this.salary=salary;
	}

}
