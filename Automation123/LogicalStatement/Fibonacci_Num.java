package LogicalStatement;
import java.util.Scanner;
public class Fibonacci_Num {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int first=0;
      int second=1;
      System.out.println("enter the num");
      int num=sc.nextInt();
      for(int i=1;i<=num;i++) {
    	  System.out.println(i);
      }
      num++;
	}

}
