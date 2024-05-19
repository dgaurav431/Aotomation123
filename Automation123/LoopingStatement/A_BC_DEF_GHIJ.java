package LoopingStatement;

public class A_BC_DEF_GHIJ {
	public static void main(String[] args) {
		int line=5;
		char ch='A';
				for(int i=1; i<=line; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(ch);	
						ch++;
					}
					System.out.println();
				}
	}

}
