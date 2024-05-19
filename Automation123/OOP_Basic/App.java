package OOP_Basic;

public class App {
static int usercount=0;
static {
	System.out.println("Welcome to the App: ");
}
{
	usercount++;
	System.out.println("Welcome user:" + usercount);
	}
public static void main(String[] args) {
	App User1 = new App();
	App User2 = new App();
	App User3 = new App();
System.out.println(usercount);
}
}
