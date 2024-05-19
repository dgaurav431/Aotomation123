package OOP_Basic;

public class StudentQJSController3 {
	
	public static void main(String[] args) {
		StudentQJS st1 = new StudentQJS();
		System.out.println(st1.name);
		System.out.println(st1.phone);
		System.out.println(st1.emailId);
		
		st1.name= "Sonal";
		st1.emailId= "sona123@gmail.com";
		System.out.println(st1.name);
		System.out.println(st1.phone);
		System.out.println(st1.emailId);
		System.out.println("------------------");
		
		StudentQJS st2 = new StudentQJS();
		System.out.println(st1.name);
		System.out.println(st1.phone);
		System.out.println(st1.emailId);
	}
	
}
