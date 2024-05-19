
package LoopingStatement;

public class ForA_AB_ABC_ABCD_ABCDE {

	public static void main(String[] args) {
		int line=5;
					for(int i=1; i<=line; i++) {
					char ch='A';
					for(int j=1; j<=i; j++) {
						System.out.print(ch);
					ch++;
					}
					System.out.println();
				}
	}

}
