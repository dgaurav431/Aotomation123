package LogicalStatement;
public class PrimeNo_Range {
		public static void main(String[] args) {
			int prCount=0;
			for(int a=2;a<=100;a++) {
				int n=a;
				int count=0;
						  
				for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(n);
				prCount++;
			}			
		}
				System.out.println("total prime num in range is: "+prCount);}
}