package Number_Programming;

public class Automorphic_Num_Range {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10000;i++) {
			if(isAutomorphic(i)) {
				System.out.println(i);		count++;
			}
		}
		System.out.println("Total Such Numbers are: "+count);	
	}
	public static boolean isAutomorphic(int n)
	{
		int sq=n*n;
		while(n>0)
		{
			if(n%10!=sq%10)
				return false;
			n=n/10;
			sq=sq/10;
		}
		return true;
	}
}
