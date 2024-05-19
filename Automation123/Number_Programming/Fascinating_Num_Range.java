package Number_Programming;

public class Fascinating_Num_Range {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10000;i++) {
		if(isFascinating(i)) {
			System.out.println(i);		count++;
		}
		}
		System.out.println("Total Such Numbers are: "+count);
	}
	public static boolean isFascinating(int n)
	{
		String s1=n+""+n*2+n*3;
		for(char c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(c==s1.charAt(i))
					count++;
			}
			if(count==0 || count>1)
				return false;
		}
		return true;
	}
}
