package LoopingStatement;

import java.util.Scanner;

public class ForMultipleOf3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("start of main");
        System.out.println("Enter two no");
        int start= sc.nextInt();
        int end= sc.nextInt();
        int count=0;
        int sum=0;
        int product=1;
        for(; start<=end; start++) {
        	if(start%3==0 && start%5==0) {
        		System.out.println(start);
        		count++;
        		sum= sum+start;
        		product= product*start;
        	}
        }
        System.out.println("total odd num is:" + count);
        System.out.println("sum of odd num is:" + sum);
        System.out.println("product of odd num is:" + product);
        System.out.println("end of main");
	}

        	}
        