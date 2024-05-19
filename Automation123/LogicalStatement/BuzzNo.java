package LogicalStatement;
import java.util.Scanner;
public class BuzzNo {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a num to check");
		 int num=sc.nextInt();
	      // int digit= num%10;
	       if(num%10==7 || num%7== 0) {
		    System.out.println(num +" is a buzz num");
	  }
	  else {
		  System.out.println(num +" is not a buzz num");
	}
  }
}