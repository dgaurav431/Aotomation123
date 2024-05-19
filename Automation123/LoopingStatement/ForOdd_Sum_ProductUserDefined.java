package LoopingStatement;
import java.util.Scanner;
public class ForOdd_Sum_ProductUserDefined {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("start of main");
        System.out.println("Enter two no");
        int start= sc.nextInt();
        int end= sc.nextInt();
        int count=0;
        int sum=0;
        int product=1;
        for(; start<=end; start++) {
        	if(start%2==1) {
        		System.out.println(start);
        		count++;
        		sum+=start;
        		product= product*start;
        	}
        }
        System.out.println("total odd num is:" + count);
        System.out.println("sum of odd num is:" + sum);
        System.out.println("product of odd num is:" + product);
        System.out.println("end of main");
	}

}
