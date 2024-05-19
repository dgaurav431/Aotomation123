package OOP_Basic;
import java.util.Scanner;
public class Code2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);
		
		if(ch>='0' && ch<='9') {
			int value = ch-48;
			System.out.println(value+0);
		}
	}
}
