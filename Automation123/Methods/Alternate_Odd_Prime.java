package Methods;

public class Alternate_Odd_Prime {

	public static void main(String[] args) {

			int count=0;
			for(int i=2;i<=500;i++) {
				if(checkPrime(i)) {
					count++;
					if(count%2==1) 
					{
					System.out.println(i);
					}
				}
			}
		}

		public static boolean checkPrime(int n) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
