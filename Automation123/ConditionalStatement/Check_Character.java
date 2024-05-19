package ConditionalStatement;
import java.util.Scanner;
public class Check_Character {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') ) {
			System.out.println("character is alphabet");
		}
		else if(ch>='1' && ch<='9') {
			System.out.println("character is digit");
		}
		else {
			System.out.println("character is special character");
		}
	}

}
