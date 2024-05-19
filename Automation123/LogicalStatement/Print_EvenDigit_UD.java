package LogicalStatement;
import java.util.Scanner;
public class Print_EvenDigit_UD {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter num");
       long n=sc.nextLong();
       int count=0;
       while(n>0) {
       	long rem=n%10;
       	if(rem%2==0) {
       		count++;
       		System.out.println(rem);
       	}
       	n=n/10;
       	}
       System.out.println("count is: "+count);
	}

}
