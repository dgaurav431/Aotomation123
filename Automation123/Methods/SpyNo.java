package Methods;
import java.util.Scanner;
public class SpyNo {
	public static boolean isSpy(int num) {
		int sum=0;
		int product=1;
		for(; num>0; num=num/10) {
			int digit= num%10;
			sum= sum+digit;
			product= product*digit;
		}
		if(sum == product) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a num");
      if(isSpy(sc.nextInt()) == true) {
    	  System.out.println("entered num is a spy num");
      }
      else {
    	  System.out.println("entered num is not a spy num");
      }
   }
}
