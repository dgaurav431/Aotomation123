package OOP_Basic;
import java.util.Scanner;
public class Code {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a character");
	char ch= sc.next().charAt(0);
	
	if(ch>='A' && ch<='Z') {
		char result= (char) (ch+32);
		System.out.println(ch + " => " + result);
	}
}
}
