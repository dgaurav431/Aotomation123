package Default;
import java.util.Scanner;
public class Practice1 {
	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
			System.out.println("enter a num");
			int num=sc.nextInt();
			int count=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("it is a prime num");
			}
			else {
				System.out.println("it is not a prime num");
			}
		}
	}
