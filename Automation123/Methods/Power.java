package Methods;
import java.util.Scanner;
public class Power {
public static int power (int base, int exp) {
	int result=1;
	while(exp > 0) {
		result = result* base;
		exp--;
	}
		return result;
}

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two no");
	int num1= sc.nextInt();
	int num2= sc.nextInt();
	//System.out.println("result of power:" + power(num1,num2));
    int j= power(num1,num2);
    System.out.println("result of power:" + j);
}
}