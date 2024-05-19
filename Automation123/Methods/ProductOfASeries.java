
package Methods;
import java.util.Scanner;
public class ProductOfASeries {
	public static int product(int start, int end) {
		int product=1;
		while(start<=end) {
			product= product*start;
			start++;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter starting no");
		int num1= sc.nextInt();
		System.out.println("Enter end no");
		int num2= sc.nextInt();
		//System.out.println("product of a series:" + product(num1,num2));
	    int j= product(num1,num2);
	   System.out.println("product:" + j);
	}
}
