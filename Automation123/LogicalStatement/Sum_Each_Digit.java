package LogicalStatement;
import java.util.Scanner;
public class Sum_Each_Digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
        int n=sc.nextInt();
        int sum=0;
        while(n>0) {
        	int rem=n%10;
        	System.out.println(rem);
        	sum=sum+rem;
        	n=n/10;
        }
        System.out.println("sum of each digit of num is: "+sum);
	}

}
