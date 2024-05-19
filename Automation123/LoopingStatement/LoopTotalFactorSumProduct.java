package LoopingStatement;
import java.util.Scanner;
public class LoopTotalFactorSumProduct {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("start of main");
        System.out.println("Enter a no");
        int num= sc.nextInt();
        System.out.println("Factor of given num");
        int count=0;
        int sum=0;
        int product=1;
        for(int i=1; i<=num; i++) {
        	if(num%i==0) {
        		System.out.println(i);
        		count++;
        		sum= sum+i;
        		product= product*i;
        	}
        }
        	System.out.println("total factor is:" + count);
        	System.out.println("sum of factor is:" + sum);
        	System.out.println("product of factor is:" + product);
        	  sc.close();
        }
      }