package Methods;
import java.util.Scanner;
public class SumOfEachDigitSquare {

	public static int sumOfEachDigitSquare(int num) {
		int sum=0;
		while(num>0) {
			int digit = num%10;
			sum= sum + (digit*digit);
			num= num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no");
		int num1= sc.nextInt();
		//System.out.println("sum of each digit square:" + sumOfEachDigitSquare(num1));
	    int j= sumOfEachDigitSquare(num1);
	    System.out.println("sum of each digit square:" + j);
	}
}
