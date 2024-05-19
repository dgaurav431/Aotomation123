package OOP_Basic;

public class BookController {
	public static void main(String[] args) {
		Book bk1 = new Book();
		bk1.display();
		bk1.setData("james",1253, "james123@gmail.com");
		System.out.println("After initializing the value of object");
		bk1.display();
		System.out.println("---------------------");
		Book bk2 = new Book();
		bk2.display();
		bk2.setData("Cristiano",1499, "cr7@gmail.com");
		System.out.println("After initializing the value of object");
		bk2.display();
	}
}
