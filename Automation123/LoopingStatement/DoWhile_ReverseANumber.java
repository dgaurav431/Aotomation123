package LoopingStatement;
import java.util.Scanner;
public class DoWhile_ReverseANumber {
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
      int num= sc.nextInt();
      System.out.println("reverse of " + num + " is:");
        do {
     int i= num%10;
      System.out.print(i);
      num= num/10;
       } while(num>0);
      sc.close();
}
}