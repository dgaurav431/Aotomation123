package Program_Practice;
import java.util.Scanner;
public class HCF {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	      System.out.println("enter 1st num");
		  int x=sc.nextInt();
		  System.out.println("enter 2nd num");
		  int y=sc.nextInt();
		  System.out.println("enter 3rd num");
		  int z=sc.nextInt();
		  printHCF(x,y,z);
	}
  public static void printHCF(int a, int b, int c) {
	  int small= (a<b)?(a<c?a:c):(b<c?b:c);
	  int hcf=1;
  	for(int i=small;i>=1;i--) {
  		if(a%i==0 && b%i==0 && c%i==0) {
  			hcf=i;
  			break;
  		}
  	}
  	System.out.println("HCF is :"+hcf);
 }

}
