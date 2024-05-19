package MethodChaining;

public class Driver {

	public static void main(String[] args) {
		Employ e1=new Employ("Mohan singh", 203, 46457.67, 23, "NOIDA");
		Employ e2=new Employ("Sohan singh", 305, 36457.67, 21, "Delhi");
		Employ e3=new Employ("Rohan singh", 406, 56457.67, 27, "Kanpur");
		
		e1.getName().getAge().getAddress().getAddress();
		System.out.println("======================");
		e2.getName().getEid();
		System.out.println("=======================");
		e3.getEid().getSalary().getAge();
		
		
	}
}
