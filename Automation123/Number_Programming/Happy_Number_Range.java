package Number_Programming;

public class Happy_Number_Range {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(checkHappy(i))
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Such Numbers are: "+count);
	}
	public static boolean checkHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
			}
			n=sum;
		}
		return n==1 || n==7;
	}


}
