package Program_Practice;
public class Print_50_Prime {
	public static void main(String[] args) {
   int primecount=0;
    for(int i=2; ; i++) {

	if(checkPrime(i)) {
		System.out.println(i+ " ");
		primecount++;
		if(primecount==50) {
			break;
			}
		}
	  }
   }
     public static boolean checkPrime(int n) {
    	 int count=0;
    	 for(int i=2;i<=n;i++) {
    		 if(n%i==0) {
    			 count++;
    	    	 break;
    		 }
    	 }
    	 return count==0?true:false;
     }
}
