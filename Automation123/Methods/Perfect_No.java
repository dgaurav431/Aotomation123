package Methods;

public class Perfect_No {

	public static void main(String[] args) {
		for(int i=1;i<=10000;i++) {
		checkPerfect(i);
	}
}
	public static void checkPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
			if(n==sum) {
				System.out.println(sum);
			}
		}
	}
