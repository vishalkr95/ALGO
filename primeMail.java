import java.util.*;
/*public class primeMail {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int dp[]=new int[n+1];
	dp[0]=0;
	dp[1]=0;
	for(int i=2;i<=n;i++) {
		if(isPrime(i)) {
			dp[i]=dp[i-1]+1;
		}
		else {
			dp[i]=dp[i-1];
		}
	}
	
	int c=1;
	while(n>1) {
		c++;
		n=n-dp[n];
	}
	System.out.println(c);
}
public static boolean isPrime(int n) {
	for(int i=2;i*i<=n;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
}*/
