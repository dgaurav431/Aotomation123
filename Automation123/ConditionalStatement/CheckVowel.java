package ConditionalStatement;
import java.util.Scanner;
public class CheckVowel {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a character");
	char ch=sc.next().charAt(0);
	if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
		if(ch=='a'||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch=='A'||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
			System.out.println(ch + ": is a vowel");
		}else{
			System.out.println(ch + ": is a consonant");
		}
	}
	sc.close();
}
}
