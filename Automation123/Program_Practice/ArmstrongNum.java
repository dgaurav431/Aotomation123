package Program_Practice;
public class ArmstrongNum {
	public static void main(String[] args) {
		isArmstrong (1634);
	}
	
	public static void isArmstrong (int n){
	int a=n, sum=0, b=n, count=0;
	while(n>0){
	count++;
	n=n/10;
	}
	
	while(b>0){
	int rem=b%10;
	int v=pow(rem, count);
	sum=sum+v;
	b=b/10;
	}
	if(a==sum) {
		System.out.println("It's an armstrong number");
	}
	else {
		System.out.println("It's not an armstrong number");
	  }
	
	}
	public static int pow(int a, int b) {
	int pow=1;
	while(b>0)
	{
	pow=pow*a;
	b--;
	}
	return pow;
	}
}
