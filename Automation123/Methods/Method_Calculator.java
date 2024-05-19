package Methods;
import java.util.Scanner;
public class Method_Calculator {

	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static int sub(int n1,int n2) {
		return n1-n2;
	}
	public static int mul(int n1,int n2) {
		return n1*n2;
	}
	public static int div(int n1,int n2) {
		return n1/n2;
	}
	public static int mod(int n1,int n2) {
		return n1/n2;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
         System.out.println("-------------List of operations-------------");
         System.out.println("Press + for add");
         System.out.println("Press - for sub");
         System.out.println("Press * for mul");
         System.out.println("Press / for div");
         System.out.println("Press % for mod");
      char input= sc.next().charAt(0);
      
      if (input == '+') {
    	  System.out.println("Enter two numbers for addition: ");
    	  int n1= sc.nextInt();
    	  int n2= sc.nextInt();
    	  System.out.println(n1+n2);
    	  //System.out.println(add (sc.nextInt(), sc.nextInt()));
      }
      else if (input == '-') {
    	  System.out.println("Enter two numbers for subtraction: ");
    	  System.out.println(sub (sc.nextInt(), sc.nextInt()));
      }
      else if (input == '*') {
    	  System.out.println("Enter two numbers for multiplication: ");
    	  System.out.println(mul (sc.nextInt(), sc.nextInt()));
      }
      else if (input == '/') {
    	  System.out.println("Enter two numbers for division: ");
    	  int n1= sc.nextInt();
    	  int n2= sc.nextInt();
    	  int i=n1/n2;
    	  System.out.println(i);
	}
      else if (input == '%') {
    	  System.out.println("Enter two numbers for modulus");
    	  int n1= sc.nextInt();
    	  int n2= sc.nextInt();
    	  int i=n1%n2;
    	  System.out.println(i);
      }
      else {
    	  System.out.println("Please enter valid input");
      }
	sc.close();
	}
}
