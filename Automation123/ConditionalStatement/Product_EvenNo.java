package ConditionalStatement;
import java.util.Scanner;
public class Product_EvenNo {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter num range");
       System.out.println("enter start num");
       int start= sc.nextInt();
       System.out.println("enter end num");
       int end= sc.nextInt();
       int product=1;
       while(start<=end) {
    	   if(start%2==0) {
    		   System.out.println(start);
    		   product=product*start;
    	   }
    	   start++;
       }
       System.out.println("product of even num: "+product);
	}

}
