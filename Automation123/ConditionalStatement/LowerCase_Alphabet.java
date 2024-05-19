package ConditionalStatement;
import java.util.Scanner;
public class LowerCase_Alphabet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println(ch+ ": is lower case alphabet");
		}
		else {
			System.out.println(ch+ ": is not lower case alphabet");
		}
	}

}
