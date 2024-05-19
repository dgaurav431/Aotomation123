package LoopingStatement;


import java.util.Scanner;

public class WhilePrime2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int i=2;
		int count= 0;
		if(num>1) {
		while(i<=num/2) {
			if (num%i==0) {
				count++;
			}
			i++;
		}
		if(count==0) {
			System.out.println(num + ":Is Prime");
		}else {
			System.out.println(num + ":Is not Prime");
		}
		}
		else {
			System.out.println(num + ":Is not Prime");
		}
		sc.close();
	}
}