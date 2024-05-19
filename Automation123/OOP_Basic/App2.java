package OOP_Basic;

public class App2 {
	static int usercount=0;
	static {
		System.out.println("Welcome to the App: ");
	}
	{
		usercount++;
		System.out.println("Welcome user:" + usercount);
		usercount= 5;
		}
	public static void main(String[] args) {
		App2 User1 = new App2();
		App2 User2 = new App2();
		App2 User3 = new App2();
	System.out.println(usercount);
	}
}
