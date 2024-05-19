package LoopingStatement;
import java.util.Scanner;
public class Product_NaturalNo2 {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num");
      int num=sc.nextInt();
      int fact=1;
      int i=1;
      while(i<=num) {
    	  fact=fact*i;
    	  i++;
      }
      System.out.println(num + "!=" + fact);
	}
}
