package ConditionalStatement;

public class IfElsePrime {

	public static void main(String[] args) {

		int num=11;
		int count=0;
		int i=2;
		while(i<=num/2) {
			if(num%i==0) {
				count++;
			}
			i++;
		} if(count==0) {
			System.out.println("prime");
		}else {
		System.out.println("not prime");
	}
	}
}
