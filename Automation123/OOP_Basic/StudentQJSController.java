package OOP_Basic;

public class StudentQJSController {
public static void main(String[] args) {
	StudentQJS st1 = new StudentQJS();
	st1.display();
	st1.setData("Sonal", "sona123@gmail.com" , 9999999999l);
	System.out.println("After initializing the value of object");
	st1.display();
	System.out.println("---------------------");
	StudentQJS st2 = new StudentQJS();
	st2.display();
	st2.setData("Aditya", "adi123@gmail.com" , 9999999999l);
	System.out.println("After initializing the value of object");
	st2.display();
}
}
