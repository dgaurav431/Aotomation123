package OOP_Basic;

public class StudentQJSController4 {
	public static void main(String[] args) {
		StudentQJS st1 = new StudentQJS();
		st1.display();
		st1.name = "Sonal";
		st1.emailId = "sona123@gmail.com";
		System.out.println("After initializing the value of object");
		st1.display();
		System.out.println("---------------------");
		StudentQJS st2 = new StudentQJS();
		st2.display();
		st2.name = "Aditya";
		System.out.println("After initializing the value of object");
		st2.display();
	}
	}
