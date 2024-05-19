package LoopingStatement;

import java.util.Scanner;

public class DoWhilePrime {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int i=1;
		int count= 0;
		do {	
			if (num%i==0) {
				count++;
			}
			i++;
			
		}while(i<=num);
		if(count==2) {
			System.out.println(num + ":Is Prime");
		}else {
			System.out.println(num + ":Is not Prime");
		}
		sc.close();
    }
	}