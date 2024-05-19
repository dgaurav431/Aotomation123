package Program_Practice;

public class Armstrong_In_A_Range {
	public static void main(String[] args) {
		printArmstrong(10000);
	}
	
	public static void printArmstrong (int n){
		for(int i=1;i<=n;i++) {
	int a=i, sum=0, b=i, count=0; 
	int c=i;
	while(c>0){
	count++;
	c=c/10;
	}
	
	while(b>0){
	int rem=b%10;
	int v=pow(rem, count);
	sum=sum+v;
	b=b/10;
	}
	if(a==sum) {
		System.out.print(i+ " ");
	    }
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
