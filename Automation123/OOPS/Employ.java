package OOPS;

public class Employ {
	static String emp_name="Mohan";
	int emp_id;
	int emp_age;
	String version;
	
	public static void giveBiometric()
	{
		System.out.println("emp should give biometric");
	}
	public void work()
	{
		System.out.println("emp can work");
	}
	public void dance()
	{
		System.out.println("emp can dance");
	}
	public void eat()
	{
		System.out.println("emp can eat");
	}
	
	public static void main(String[] args) {
		System.out.println("main method starts");
		System.out.println(emp_name);
		System.out.println(Employ.emp_name);
		giveBiometric();
		
		Employ e1 = new Employ();
		System.out.println(e1.emp_name);
	}
}
