package LoopingStatement;

import java.util.Scanner;

    public class ForPositiveEven{
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("start of main");
	System.out.println("Enter two num");
    int start= sc.nextInt();
    int end= sc.nextInt();
    int count=0;
    int sum=0;
    int product=1;
    for(; start<=end; start++){
    	if(start%2==0 || start==0) {
    		System.out.println(start);
    	count++;
    	sum= sum+start;
    	product= product*start;
    }
	}
    System.out.println("total even num is:" + count);
    System.out.println("sum of even num is:" + sum);
    System.out.println("product of even num is:" + product);
        sc.close();
	}
}