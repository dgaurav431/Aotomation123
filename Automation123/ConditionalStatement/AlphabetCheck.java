package ConditionalStatement;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a character");
		char inputchar= s.next().charAt(0);
		
		if((inputchar>= 'A' && inputchar<= 'Z') || (inputchar>= 'a' && inputchar<= 'z'))
		{		
		System.out.println("Character is alphabet");
		}
		else {
			System.out.println("Character is not alphabet");
		}
		s.close();
	}

}
