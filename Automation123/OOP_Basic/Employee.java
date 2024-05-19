package OOP_Basic;

public class Employee {
	String name;
	int age;
	String emailId;
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Email:" + emailId);
	}
	public void setData(String name, String emailId, int age) {
		this.name= name;
		this.emailId= emailId;
		this.age= age;
	}
}
