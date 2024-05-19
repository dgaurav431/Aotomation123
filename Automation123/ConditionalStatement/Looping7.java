package ConditionalStatement;
import java.util.Scanner;
public class Looping7 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a num");
     int num= sc.nextInt();
     if(num>10 && num<20) {
    	 System.out.println("num is: "+num);
     }else {
    	 System.out.println("enter valid input");
     }
	}
}
