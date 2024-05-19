package LoopingStatement;

import java.util.Scanner;

public class WhileCount_Product_sum {

	
		public static void main(String[] args) {
				
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Enter a number");
				int num= sc.nextInt();
				System.out.println("Number:" + num + "\n All Factors of above no");
				
				int i=1;
				int count=0;
				int product= 1;
				int sum=0;
				
				while (i<=num) {
				if (num%i==0) {
				System.out.println(i);
				count++;
				product= product*i;
				sum= sum + i;
				}
				i++;
				}
				System.out.println("Count of factor is:" + count);
				System.out.println("Product of factor is:" + product);
				System.out.println("Sum of factor" + sum);
				sc.close();
			}
			}	

