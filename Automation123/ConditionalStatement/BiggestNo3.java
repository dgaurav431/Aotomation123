package ConditionalStatement;
import java.util.Scanner;
public class BiggestNo3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter three numbers");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int s1=(n1>n2?n1:n2);
	int max=(s1>n3?s1:n3);
	System.out.println("maximum number is :" + max);
	sc.close();
}
}
