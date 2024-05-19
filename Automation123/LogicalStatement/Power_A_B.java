package LogicalStatement;
import java.util.Scanner;
public class Power_A_B {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         char ch;
		do {
			System.out.println("enter the num");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int i=1;
			int pow=1;
			while(i<=b) {
				pow=pow*a;
				i++;
			}
			System.out.println(a +" to power " +b+ " is: "+pow);
			System.out.println("enter Y/y to continue or any other character to stop");
			ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		System.out.println("thank you! program is completed");				
	}
}
