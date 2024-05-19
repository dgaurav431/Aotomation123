package Methods;
import java.util.Scanner;
public class List_Of_Operation {
	public static int sum(int a, int b) {
		int result= a+b;
		return result;
		}
	
		public static int sub(int a, int b) {
			int result= a-b;
			return result;
		}
		public static int mul(int a, int b) {
				int result= a*b;
				return result;
		}
		public static int div(int a, int b) {
					int result= a/b;
					return result;
		}
	
	public static void main(String[] args) {
        System.out.println("start of the program");
		Scanner sc= new Scanner(System.in);
		System.out.println("List of operation:");
		System.out.println("Press 1 for add");
		System.out.println("Press 2 for sub");
		System.out.println("Press 3 for mul");
		System.out.println("Press 4 for div");
		int choice= sc.nextInt();
		
		if (choice==1) {
			System.out.println("enter 2 num");
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println("sum of two no:" + sum(a,b));	
		}
		else if (choice==2) {
			System.out.println("enter 2 num");
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println("sub of two no:" + sub(a,b));
		}	
		else if (choice==3) {
			System.out.println("enter 2 num");
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println("mul of two no:" + mul(a,b));
		}
		else if (choice ==4){
			System.out.println("enter 2 num");
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println("div of two no:" + div(a,b));
		}
		else {
			System.out.println("please enter valid data");
		}
		System.out.println("end of the program");
		sc.close();
}
}