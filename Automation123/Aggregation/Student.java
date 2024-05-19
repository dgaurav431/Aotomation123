package Aggregation;

public class Student {

	String name;
	int rollno;
	Address a=new Address();
	Student()
	{
		
	}
	Student(String name, int rollno, Address a)
	{
		this.name=name;
		this.rollno=rollno;
		this.a=a;
	}
	public void displayStudent()
	{
		System.err.println("Student name is: "+name);
		System.out.println("Student roll number is: "+rollno);
		a.displayAddress();
		System.out.println("=============================");
	}
}
