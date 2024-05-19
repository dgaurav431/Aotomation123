package LoopingStatement;

public class ForA_BB_CCC {

	public static void main(String[] args) {

		int line=3;
		char ch='A';
				for(int i=1; i<=line; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(ch);
					}
					ch++;
					System.out.println();
				}
	}

}
