package Methods;
import java.util.Scanner;
public class Check_Prime {

	public static void main(String[] args) {

		checkPrime();
	}
  public static void checkPrime() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a num");
		int num=sc.nextInt();
		int count=0;
		if(num>1) {
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
		else {
			System.out.println("it is not a prime num");}
		}
  }

