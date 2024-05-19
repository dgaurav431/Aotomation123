package Number_Programming;

public class Dissarium_Num_Range {
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=100000000;i++)
		{
			if(checkDissarium(i))
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total such numbers are: "+count);
	}
	public static boolean checkDissarium(int n)
	{
		int sum=0;
		int a=n;
		int x=countDigit(n);
		while(n>0)
		{
			int rem=n%10;
			sum=sum+power(rem, x);
			x--;
			n=n/10;
		}
		return sum==a?true:false;
	}
	
	public static int power(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
	
	public static int countDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
}
