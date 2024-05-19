package LoopingStatement;
import java.util.Scanner;
public class Count_Factor {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num= sc.nextInt();
		int count=0;
		int factor=1;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
				factor= factor*i;
			}
		}
		System.out.println("count of factor is: "+count);
	}

}
