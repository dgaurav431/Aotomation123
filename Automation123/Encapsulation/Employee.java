package Encapsulation;

import java.util.Scanner;

public class Employee {
	private int pin=3487;
	private String name;
	private int id;
	private double salary;
	
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Password: ");
		int x=sc.nextInt();
		if(pin==x) {
			System.out.println("Validation is successfull");
			return name;
		}
		else {
			System.out.println("Invalid Password!!");
			return null;
		}	
	}
	public int getId()
	{
		//validation
		return id;
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
		int x=sc.nextInt();
		if(pin==x)
		{
			System.out.println("Validation Is Successfull and Name is Set");
			this.name=name;
		}
		else
			System.out.println("INVALID Password!! Name is not Set!");
		
	}
	public void setId(int id)
	{
		//validation
		this.id=id;
	}
	public void setSalary(double salary)
	{
		//validation
		this.salary=salary;
	}

}
