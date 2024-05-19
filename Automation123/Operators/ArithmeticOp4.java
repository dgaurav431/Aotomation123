package Operators;

public class ArithmeticOp4 {

	public static void main(String[] args) {

		int i=4;
		int j=-2;
		int k= i*j;
		--k;
		--k;
		j= (i*j)+i;
		--j;
		j= j++;
		i= --i;
		System.out.println(k--);
		System.out.println(k);
		System.out.println(i--);
		System.out.println(--j);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(i+j+k);
	
	}

}
