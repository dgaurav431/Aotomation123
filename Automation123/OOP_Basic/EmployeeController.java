package OOP_Basic;

public class EmployeeController {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.display();
		em1.setData("Gaurav", "gaurav123@gmail.com" , 26);
		System.out.println("After initializing the value of object");
		em1.display();
		System.out.println("---------------------");
		Employee em2 = new Employee();
		em2.display();
		em2.setData("Saurav", "saurav123@gmail.com" , 26);
		System.out.println("After initializing the value of object");
		em2.display();
	}
}
