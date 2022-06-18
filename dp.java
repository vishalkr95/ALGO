
/*class test{
	public static void main(String [ ]args) {
		int n=100;
		int a[]=new int[n+1];
		
		long fn=fib(n,a);
		System.out.println(fn);
	}
	public static int fib(int n,int [] a) {
		double t=System.currentTimeMillis();
		if(n==0 || n==1) {
			return n;
		}
		if(a[n]!=0) {
			return a[n];
		}
	int	fibn=fib(n-1,a)+fib(n-2,a);
	a[n]=fibn;
	double t1=System.currentTimeMillis();
	//System.out.println(t1-t);
	return fibn;
	
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int n=7;
		int a[]=new int[n+1];
		int p=totalpath(n,a);
		System.out.println(p);
	}
	public static int totalpath(int n,int []a) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(a[n]!=0) {
			return a[n];
		}
		int t1=totalpath(n-1,a);
		int t2=totalpath(n-2,a);
		int t3=totalpath(n-3,a);
		a[n]=t1+t2+t3;
		return t1+t2+t3;
	}
}
/*public class dp {
     public static int totalpath(int n) {
    	 int a[]=new int[n+1];
    	 a[0]=1;
    	 for(int i=1;i<=n;i++) {
    		 if(i==1) {
    			 a[i]=a[0];
    		 }
    		 else if(i==2) {
    			 a[i]=a[i-1]+a[i-2];
    		 }
    		 else {
    		a[i]=a[i-1]+a[i-2]+a[i-3]; 
    		 }
    	 }
    	 return a[n];
     }
	public static void main(String[] args) {
	int n=7;
	int p=totalpath(n);
	System.out.println(p);
	}

}*/

/*class dp{
	public static int totalpath(int n,int[]k) {
		int a[]=new int [n+1];
		a[0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k[i-1] && i-j>=0 ;j++) {
				a[i]+=a[i-j];
				
			}
							//wrorng answer;
		}
		return a[n];
	}
	public static void main(String [] args) {
		int n=8;
		int k[]= {2,3,4,3,5,3,1,6};
		int p=totalpath(n,k);
		System.out.println(p);
	}
}
/*class dp{
	public static int totalpath(int n,int[]k) {
		int a[]=new int [n+1];
	   a[n]=1;
	   for(int i=n-1;i>=0;i--) {
		   for(int j=1;j<=k[i] && j+i<=a.length-1;j++) {
			   a[i]+=a[i+j];
		   }
	   }
	   return a[0];
	
	}
public static void main(String []args) {
	int n=8;
	int k[]= {2,3,4,3,5,3,1,6};
	
	int p=totalpath(n,k);
	System.out.print(p);
}
}*/
/*class dp{
	public static int fib(int n) {
		
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++) {
		   a[i]=a[i-1]+a[i-2];	
		}
		
		
		return a[n-1];
	}
	public static void main(String [] args) {
		int f=10;
	
		long fb=fib(f);
		
		System.out.println(fb);
		
	}
}*/
/*class dp{
	public static int noOfWay(int n) {
		int []a=new int[n+1];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=2;
		for(int i=4;i<=n;i++) {
			a[i]=a[i-1]+a[i-3]+a[i-4];
		}
		return a[n];
	}
	public static void main(String [] args) {
		int n=7;
		int t=noOfWay(n);
		System.out.println(t);
	}
}*/
/*class dp{
	public static int f(int []a,int i,int []b) {
		if(i>=a.length) {
			return 0;
		}
		if(b[i]!=0) {
			return b[i];
		}
		int m1=a[i]+f(a,i+2,b);
		
		int m2=f(a,i+1,b);
		b[i]=Math.max(m1, m2);
		return Math.max(m1, m2);
	}
	public static void main(String[] args) {
		int a[]= {6,7,1,30,8,2,4};
		int b[]=new int[a.length];
		int m=f(a,0,b);
		System.out.println(m);
	}
}*/
/*class dp{
	public static int f(int a[]) {
		int b[]=new int[a.length+2];
		for(int i=a.length-1;i>=0;i--) {
			if(i==a.length-1) {
				b[i]=a[i];
			}
			if(i==a.length-2) {
				b[i]=Math.max(a[i], a[i+1]);
			}
			else {
				b[i]=Math.max(a[i]+b[i+2], b[i+1]);
			}
			
		}
		return b[0];
	}
public static void main(String[] args) {
		int a[]= {6,7,1,30,8,2,4};
		
		int m=f(a);
		System.out.println(m);
	}
}
/*class dp{
	public static int maxprice(int []p,int w[],int c,int i,int dp[][]) {
		if(i>=w.length || c<=0 || w[i]>c) {
			return 0;
		}
		if(dp[i][c]!=0) {
			return dp[i][c];
		}
		int p1=p[i]+maxprice(p,w,c-w[i],i+1,dp);
		int p2=maxprice(p,w,c,i+1,dp);
		dp[i][c]=Math.max(p1, p2);
		return Math.max(p1, p2);
	}
	public static void main(String [] args) {
		int p[]= {31,26,72,17};
		int w[]= {3,1,5,2};
		int c=7;
		int dp[][]=new int[p.length][c+1];
		int max=maxprice(p,w,c,0,dp);
		System.out.println(max);
	}
}
/*class dp{
	public static int maxprice(int []p,int w[],int c,int i,int pr) {
		if(i>=w.length || c<=0 || w[i]>c) {
			return pr;
		}
		int p1=maxprice(p,w,c-w[i],i+1,pr+p[i]);
		int p2=maxprice(p,w,c,i+1,pr);
		return Math.max(p1, p2);
	}
	public static void main(String [] args) {
		int p[]= {31,26,72,17};
		int w[]= {3,1,5,2};
		int c=7;
		int max=maxprice(p,w,c,0,0);
		System.out.println(max);
	}
}*/

/*class dp{
	public static int longestsequence(String s1,String s2,int i,int j,int dp[][]) {
		if(i>=s1.length() || j>=s2.length()) {
			return 0;
		}
		int m1=0,m2=0,m3=0,m4=0;
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		if(s1.charAt(i)==s2.charAt(j)) {
		 m1=1+longestsequence(s1,s2,i+1,j+1,dp);
		}
		else {
		 m2=longestsequence(s1,s2,i+1,j,dp);
		 m3=longestsequence(s1,s2,i,j+1,dp);
		 m4=longestsequence(s1,s2,i+1,j+1,dp);
		}
		dp[i][j]=Math.max(m1, Math.max(m2, Math.max(m3, m4)));
		return Math.max(m1, Math.max(m2, Math.max(m3, m4)));
		
	}
	public static void main(String [] args) {
		String s1="elephant";
		String s2="eretpat";
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		int m=longestsequence(s1,s2,0,0,dp);
		System.out.println(m);
	}
}*/
/*class dp{
	public static int longestsequence(String s1,String s2) {
		int dp[][]=new int[s1.length()][s2.length()];
		for(int i=s1.length()-1;i<=0;i++) {
			for(int j=s2.length()-1;j<=0;j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
				dp[i][j]=Math.max(1+dp[i-1][j-1],Math.max(dp[i][j+1],dp[i+1][j]));
				}
				else {
					dp[i][j]=Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String [] args) {
		String s1="elephant";
		String s2="eretpat";
		
		int m=longestsequence(s1,s2);
		System.out.println(m);
	}
}wrong answr*/

/*class dp{
	public static int minc(int a[][],int i,int j,int b[][]) {
		if(i<0 || j<0) {
			return Integer.MAX_VALUE;
		}
		if(i==0 && j==0) {
			return a[i][j];
		}
		if(b[i][j]!=0) {
			return b[i][j];
		}
		int c1=minc(a,i-1,j,b);
		int c2=minc(a,i,j-1,b);
		b[i][j]=Math.min(c1, c2)+a[i][j];
		return Math.min(c1, c2)+a[i][j];
	}
	public static void main(String [] args) {
		int a[][]= {{4,7,8,6,4},
				    {6,7,3,9,2},
				    {3,8,1,2,4},
				    {7,1,7,3,7},
				    {2,9,8,9,3}};
		int b[][]=new int[a.length][a[0].length];
		int c=minc(a,a.length-1,a[0].length-1,b);
		System.out.println(c);
	}
}
/*class dp{
	public static int minc(int a[][]) {
		int b[][]=new int[a.length][a[0].length];
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[0].length-1;j>=0;j--) {
				if(i==a.length-1 && j==a[0].length-1) {
					b[i][j]=a[i][j];
				}
				else if(i==a.length-1) {
					b[i][j]=a[i][j]+b[i][j+1];
				}
				else if(j==a[0].length-1) {
					b[i][j]=a[i][j]+b[i+1][j];
				}
				else {
					b[i][j]=a[i][j]+Math.min(b[i][j+1],b[i+1][j]);
				}
			}
		}
		return b[0][0];
	}
	public static void main(String [] args) {
		int a[][]= {{4,7,8,6,4},
				    {6,7,3,9,2},
				    {3,8,1,2,4},
				    {7,1,7,3,7},
				    {2,9,8,9,3}};
		
		int c=minc(a);
		System.out.println(c);
	}
}*/
/*class dp{
    public static int minc(int [][]a,int i,int j,int c,int b[][]) {
    	if(i==a.length || j==a[0].length) {
    		return 0;
    	}
    	if(i==a.length-1 && j==a[0].length-1) {
    		if(c-a[a.length-1][a[0].length-1]==0) {
    		return 1;}
    	}
    	if(b[i][j]!=0) {
    		return b[i][j];
    	}
    	int t1=minc(a,i+1,j,c-a[i][j],b);
    	int t2=minc(a,i,j+1,c-a[i][j],b);
    	b[i][j]=t1+t2;
    	return t1+t2;
    	 
    }
	public static void main(String [] args) {
		int a[][]= {{4,7,1,6},
			        {5,7,3,9},
			        {3,2,1,2},
			        {7,1,6,3}};
		int c=25;
		int b[][]=new int[a.length][a[0].length];
		int m=minc(a,0,0,c,b);
		System.out.println(m);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=10;
		int r=totalpaths(n);
		System.out.println(r);
	}
	public static int totalpaths(int n) {
		int a[]=new int[n+1];
		a[0]=1;
		a[1]=1;
		for(int i=2;i<=n ;i++) {
	      if(i==2) {
	    	  a[i]=a[i-1]+a[i-2];
	      }
	      else {
	    	  a[i]=a[i-1]+a[i-2]+a[i-3];
	      }
		}
		return a[n];
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int n=5;
		int []j= {2,3,1,1,4,6};
		
		int r=totalpathswithvariablejump(n,j);
		System.out.println(r);
	}
	public static int totalpathswithvariablejump(int n,int []j) {
		int dp[]=new int[n+1];
		dp[0]=1;
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=j[i] && i-k>=0;k++) {
				dp[i]+=dp[i-k];
			}
		}
		return dp[n];
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=10;
		int []j= {1,1,1,4,9,8,1,1,10,1};
		int m=printminmove(n,j);
		System.out.println(m);
	}
	public static int printminmove(int n,int []j) {
		int dp[]=new int[n+1];
		dp[n]=0;
		for(int i=dp.length-2;i>=0; i--) {
			dp[i]=dp[i+1];
			for(int k=1;k<=j[i] && i+k<dp.length;k++) {
				if(dp[i+k]<dp[i]) {
					dp[i]=dp[i+k];
				}
			}
			dp[i]=dp[i]+1;
		}
		return dp[0];
	}
	
}*/
/*class dp{
	public static void main(String [] args) {
		int n=10;
		int []j= {1,1,1,4,9,8,1,1,10,1};
		int m=printminmove(n,j);
		System.out.println(m);
	}
	public static int printminmove(int n,int []j) {
		Integer []dp=new Integer[n+1];
		dp[n]=0;
		for(int i=n-1;i>=0;i--) {
			if(j[i]>0) {
			int m=Integer.MAX_VALUE;
			for(int k=1;k<=j[i] && i+k<dp.length;k++) {
				if(dp[i+k]!=null) {
				m=Math.min(m, dp[i+k]);
				}
			}
			if(m!=Integer.MAX_VALUE) {
			dp[i]=m+1;
			}
			}
		}
		return dp[0];
	}
	
}*/
/*class dp{
	public static void main(String [] args) {
		int [][]a= {{0,1,4,2,8,2},
				    {4,3,6,5,0,4},
				    {1,2,4,1,4,6},
				    {2,0,7,3,2,2},
				    {3,1,5,9,2,4},
				    {2,7,0,8,5,1}};
		int t=goldmine(a);
		System.out.println(t);
		
	}
	public static int goldmine(int [][]a) {
		int dp[][]=new int[a.length][a[0].length];
		for(int j=a[0].length-1;j>=0;j--) {
			for(int i=a.length-1;i>=0;i--) {
				if(i==a.length-1 && j==a[0].length-1) {
					dp[i][j]=a[i][j];
				}
				else if(i==a.length-1) {
					dp[i][j]=a[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
				}
				else if(j==a[0].length-1) {
					dp[i][j]=a[i][j];
				}
				else if(i==0) {
					dp[i][j]=a[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
				}
				else {
					dp[i][j]=a[i][j]+Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length;i++) {
				if(dp[i][j]>max) {
					max=dp[i][j];
				}
			}
		}
		return max;
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int a[]= {4,2,7,1,3};
		int n=10;
		boolean b=targetsum(a,n,0,0);
		System.out.println(b);
	}
	public static boolean targetsum(int []a,int n,int s,int i) {
		if(i==a.length) {
			if(n==s) {
				return true;
			}
			return false;
		}
	  boolean b= targetsum(a,n,s+a[i],i+1);
	 boolean b1=  targetsum(a,n,s,i+1);
	 if(b==true || b1==true) {
		 return true;
	 }
	 else {
		 return false;
	 }
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int a[]= {4,2,7,1,3};
		int n=10;
		boolean b=targetsum(a,n);
		System.out.println(b);
	}
	public static boolean targetsum(int []a ,int n) {
		boolean dp[][]=new boolean[a.length+1][n+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<n+1;j++) {
				if(i==0 && j==0) {
					dp[i][j]=true;
				}
				else if(j==0) {
					dp[i][j]=true;
				}
				else if(i==0) {
					dp[i][j]=false;
				}
				else {
					if(dp[i-1][j]==true) {
						dp[i][j]=true;
					}
					else {
						int v=a[i-1];
						if(j>=v) {
							if(dp[i-1][j-v]==true) {
								dp[i][j]=true;
							}
						}
					}
				}
			}
		}
		return dp[a.length][n];
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int a[]= {2,3,5};
		int n=7;
		int b=coinchangecombi(a,n);
		System.out.println(b);
	}
	public static int coinchangecombi(int []a,int n) {
		int dp[]=new int[n+1];
		dp[0]=1;
		for(int i=0;i<a.length;i++) {
			for(int j=a[i];j<dp.length;j++) {
				dp[j]+=dp[j-a[i]];
			}
		}
		return dp[n];
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int a[]= {2,3,5};
		int t=7;
		int v=coinchangepermu(a,t);
		System.out.println(v);
	}
	public static int coinchangepermu(int []a,int t) {
		int dp[]=new int[t+1];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i>=a[j]) {
				dp[i]+=dp[i-a[j]];
				}
				
			}
		}
		return dp[t];
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int p[]= {15,14,10,45,30};
        int w[]= {2,5,1,3,4};
        int n=7;
        int dp[][]=new int[p.length][n+1];
        int maxprofi=max(p,w,0,n,dp);
        System.out.println(maxprofi);
	}
	public static int max(int []p,int []w,int i,int n,int dp[][]) {
		if(i==p.length || n<0 || w[i]>n ) {
			return 0;
		}
		if(dp[i][n]!=0) {
			return dp[i][n];
		}
		System.out.println("hello");
		int m1=p[i]+max(p,w,i+1,n-w[i],dp);
		int m2=max(p,w,i+1,n,dp);
		dp[i][n]=m1>m2?m1:m2;
		return m1>m2?m1:m2;
	}
}*/
/*class dp{

	public static void main(String [] args) {
		int p[]= {15,14,10,45,30};
        int w[]= {2,5,1,3,4};
        int n=7;
        int dp[][]=new int[w.length+1][n+1];
      int max=maxpro(p,w,n,dp);
      System.out.println(max);
	}
	public static int maxpro(int [] p,int w[],int n,int [][]dp) {
		for(int i=1;i<=p.length;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j]=dp[i-1][j];
					if(j>=w[i-1]) {
						int v=p[i-1];
						int pv=dp[i-1][j];
						int k=j-w[i-1];
						if(v+dp[i-1][k]>pv) {
							dp[i][j]=v+dp[i-1][k];
						}
						else {
							dp[i][j]=pv;
								}
					}
			}
		}
		return dp[p.length][n];
	}
}*/

/*class dp{

	public static void main(String [] args) {
		int p[]= {15,14,10,45,30};
        int w[]= {2,5,1,3,4};
        int n=7;
      int max=maxpro(p,w,n);
      System.out.println(max);
	}
	public static int maxpro(int [] p,int w[],int n) {
		int []dp=new int[n+1];
			dp[0]=0;
		for(int i=1;i<=n;i++) {
			int max=0;
			for(int j=0;j<w.length;j++) {
				
				if(i>=w[j]) {
					int k=i-w[j];
					int v=dp[k]+p[j];
					if(v>max) {
						max=v;
					}
				}
				
			}
			dp[i]=max;	
		}
		return dp[n];
		
	}
	
}*/
/*class dp{
	public static void main(String [] args) {
		int n=3;
	    int zo[]=new int[n+1];
	    int on[]=new int[n+1];
	   zo[1]=1;
	   on[1]=1;
	    
	    for(int j=2;j<zo.length;j++) {
	    	zo[j]=on[j-1];
	    	on[j]=zo[j-1]+on[j-1];
	    }
	    System.out.println(zo[n]+on[n]);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=3;
		int prez=1;
		int preo=1;
		int newz=0;
		int newo=0;
		for(int j=2;j<=n;j++) {
			newz=preo;
			newo=preo+prez;
			prez=newz;
			preo=newo;
		}
		System.out.println(newz+newo);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		String str="21123";
		int dp[]=new int[str.length()];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) {
			if(str.charAt(i-1)=='0' && str.charAt(i)=='0') {
				dp[i]=0;
			}
			else if(str.charAt(i-1)=='0' && str.charAt(i-1)!='0') {
				dp[i]=dp[i-1];
			}
			else if(str.charAt(i-1)!='0' && str.charAt(i)=='0') {
				if(str.charAt(i-1)=='1' && str.charAt(i-1)=='2') {
					dp[i]=(i>=2?dp[i-2]:1);
				}
				else {
					dp[i]=0;
				}
			}
			
			else {
				String sub=str.substring(i-1,i+1);
				if(Integer.parseInt(sub)<=26) {
					dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
				}
				else {
					dp[i]=dp[i-1];
				}
			}
		}
		System.out.println(dp[str.length()-1]);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		String str="abcabc";
	    int a=0;
	    int ab=0;
	    int abc=0;
	    for(int i=0;i<str.length();i++) {
	    	char c=str.charAt(i);
	    	if(c=='a') {
	    		a=2*a+1;
	    	}
	    	else if(c=='b') {
	    		ab=2*ab+a;
	    	}
	    	else if(c=='c') {
	    		abc=2*abc+ab;
	    	}
	    }
	    System.out.println(abc);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int a[]= {5,10,10,100,5,6};
		
		int max=maxadjecetsum(a,0,0);
		System.out.println(max);
	}
	public static int maxadjecetsum(int []a,int i,int s) {
		if(i>=a.length) {
			return s;
		}
		
		System.out.println("hello");
		int m1=maxadjecetsum(a,i+2,s+a[i]);
		int m2=maxadjecetsum(a,i+1,s);
	
		return m1>m2?m1:m2;
	}
}*//*class dp{
	public static void main(String[] args) {
		int []a= {5,10,10,100,5,6};
		int exclud=0;
		int includ=a[0];
		int newex=0;
		int newin=0;
		for(int i=1;i<a.length;i++) {
			newin=exclud+a[i];
			newex=Math.max(exclud,includ);
			exclud=newex;
			includ=newin;
			
		}
		System.out.println(Math.max(exclud,includ));
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int r[]= {1,5,3,1};
		int b[]= {5,8,2,2};
		int g[]= {7,4,9,4};
		int r1=r[0];
		int b1=b[0];
		int g1=g[0];
		int nr1=0,nb1=0,ng1=0;
		for(int i=1;i<r.length;i++) {
			nr1=r[i]+Math.min(b1, g1);
			nb1=b[i]+Math.min(r1, g1);
			ng1=g[i]+Math.min(r1, b1);
			r1=nr1;
			b1=nb1;
			g1=ng1;
		}
		System.out.println(Math.min(r1, Math.max(b1, g1)));
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int color[][]= {{1,5,7},
					    {5,8,4},
					    {3,2,9},
					    {1,2,4}};
		int dp[][]=new int[color.length][color[0].length];
		dp[0][0]=1;
		dp[0][1]=5;
		dp[0][2]=7;
		
		for(int i=1;i<dp.length;i++) {
			dp[i][0]=color[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
			dp[i][1]=color[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
			dp[i][2]=color[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
			}
		int m=Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			if(dp[dp.length-1][i]<m) {
				m=dp[dp.length-1][i];
			}
		}
		System.out.println(m);
		}
	}*/
/*class dp{
	public static void main(String [] args) {
		int color[][]= {{1,5,7},
			    {5,8,4},
			    {3,2,9},
			    {1,2,4}};
		int dp[][]=new int[color.length][color[0].length];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				if(i==0) {
					dp[i][j]=color[i][j];
				}
				else {
					dp[i][j]=color[i][j]+min(dp,i-1,j);
				}
			}
		}
	//	int m=Integer.MAX_VALUE;
	//	for(int k=0;k<dp[0].length;k++) {
	//		if(dp[dp.length-1][k]<m) {
	//			m=dp[dp.length-1][k];
	//		}
	//	}
	//	System.out.println(m);
		System.out.println(min(dp,dp.length-1,-1));
	}
	public static int min(int [][]dp,int i,int j) {
		int m=Integer.MAX_VALUE;
		for(int k=0;k<dp[i].length;k++) {
			if(k==j) {
				continue;
			}
			else {
				if(dp[i][k]<m) {
					m=dp[i][k];
				}
			}
		}
		return m;
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int color[][]= {{1,5,7},
			    {5,8,4},
			    {3,2,9},
			    {1,2,4}};
		int dp[][]=new int[color.length][color[0].length];
		int least=Integer.MAX_VALUE;
		int sleast=Integer.MAX_VALUE;
		for(int j=0;j<dp[0].length;j++) {
			
				dp[0][j]=color[0][j];
				if(dp[0][j]<least) {
					sleast=least;
					least=dp[0][j];
				}
				else if(dp[0][j]<sleast){
					sleast=dp[0][j];
					
				}
				
			}
		
		for(int i=1;i<dp.length;i++) {
			int nleast=Integer.MAX_VALUE;
			int nsleast=Integer.MAX_VALUE;
			for(int j=0;j<dp[i].length;j++) {
			
      				if(dp[i-1][j]==least) {
						dp[i][j]=color[i][j]+sleast;
						
						
					}
					else {
						dp[i][j]=color[i][j]+least;
					}
					
					if(dp[i][j]<=nleast) {
						nsleast=nleast;
						nleast=dp[i][j];
					}
					else if(dp[i][j]<=nsleast){
						nsleast=dp[i][j];
					}
					
				}
				
				least=nleast;
			sleast=nsleast;	
			
		}
		//
		System.out.println(least);
	
		
	}
	
}*/
/*class dp{
	public static void main(String [] args) {
		int n=8;
		int tcolor=3;
		int same=tcolor*1;

		int diff=tcolor*(tcolor-1);
		int total=same+diff;
		for(int i=3;i<=n;i++) {
			same=diff;
			diff=total*(tcolor-1);
			total=same+diff;
			
		}
		System.out.println(total);
			
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int n=10;
		int t=tiling(n);
		System.out.println(t);
	}
	public static int tiling(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(n<=0) {
			return 0;
		}
		return tiling(n-1)+tiling(n-2);
	}
}*/

/*class dp{
	public static void main(String []args) {
		int n=10;
		int dp[]=new int[n+1];
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.println(dp[n]);
	}
}*/
/*class dp{
	public static void main(String[] args) {
		int m=3;
		int n=8;
		int t= tiling(n,m);
		System.out.println(t);
	}
	public static int tiling(int n,int m) {
		if(m==n) {
			return 2;
		}
		if(m>n) {
			return 1;
		}
		return tiling(n-1,m)+tiling(n-m,m);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int m=3;
		int n=8;
		int dp[]=new int[n+1];
		for(int i=1;i<=n;i++) {
			if(i<m) {
				dp[i]=1;
			}
			else if(i==m) {
				dp[i]=2;
			}
			else {
				dp[i]=dp[i-1]+dp[i-m];
			}
		}
		System.out.println(dp[n]);
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int n=5;
		int p=friendpair(n);
		System.out.println(p);
	}
	public static int friendpair(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		return friendpair(n-1)+(n-1)*friendpair(n-2);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=5;
		int dp[]=new int[n+1];
		dp[1]=1;
		dp[2]=2;							//if we use f(n)=n*f(n-1)+nC2f(n-2) then we found permutation
		for(int i=3;i<=n;i++) {				//so we use f(n)=f(n-1) +(n-1)*f(n-2)
			dp[i]=dp[i-1]+(i-1)*dp[i-2];
		}
		System.out.println(dp[n]);
	}
}*/
// ppartisionof n frinend into k team
/*class dp{
	public static void main(String [] args) {
		int n=4;
		int k=3;
		int t=partision(n,k);
		System.out.println(t);
	}
	public static int partision(int n,int k) {
		if(n==0 || k==0 || n<k) {
			return 0;
		}
		if(n==k || k==1) {
			return 1;
		}
		return k*partision(n-1,k)+partision(n-1,k-1);
	}
}*/
/*class dp{
	public static void main(String []args) {
		int n=4;
		int k=3;
		if(n==0 || k==0 || n<k) {
			System.out.println(0);
			return ;
		}
		long dp[][]=new long[k+1][n+1];
		for(int t=1;t<=k;t++) {
			for(int p=1;p<=n;p++) {
				if(t>p) {
					dp[t][p]=0;
				}
				else if(p==t) {
					dp[t][p]=1;
				}
				else {
					dp[t][p]=t*dp[t][p-1]+dp[t-1][p-1];
				}
			}
		}
		System.out.println(dp[k][n]);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=9;
		int p[]= {11,6,7,19,4,1,6,18,4};
		int dp[]=new int[n+1];
		int least=p[0];
		dp[0]=0;
		for(int i=1;i<=n;i++) {
			if(p[i-1]<least) {
				least=p[i-1];
				dp[i]=0;
			}
			else {
				dp[i]=p[i-1]-least;
			}
		}
		int m=dp[0];
		for(int i=0;i<=n;i++) {
			if(dp[i]>m) {
				m=dp[i];
			}
		}
		System.out.println(m);
		
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=9;
		int p[]= {11,6,7,19,4,1,6,18,4};
		
		int least=Integer.MAX_VALUE;
		int tdp=0;
		int pr=0;
		for(int i=0;i<n;i++) {
			if(p[i]<least) {
				least=p[i];
			}
			tdp=p[i]-least;
			if(tdp>pr) {
				pr=tdp;
			}
		}
		System.out.println(pr);
	}
	
}*/

/*class dp{
	public static void main(String [] args) {
		int n=9;
		int p[]= {11,6,7,19,4,1,6,18,4};
        
		int sp=p[0];
		int bp=p[0];
		int mp=0;
		for(int i=1;i<n;i++) {
			if(p[i]>=sp) {
				sp=p[i];
			}
			else{
				mp+=sp-bp;
				bp=p[i];
				sp=p[i];
			}
		}
		mp+=sp-bp;
		System.out.println(mp);
		
	}
	
}*/
/*wrong answer busause we can earn more than that;
class dp{
	public static void main(String [] args) {
		int n=12;
		int p[]= {10,15,17,20,16,18,22,20,22,20,23,25};
        int fee=3;
		int sp=p[0];
		int bp=p[0];
		int mp=0;
		for(int i=1;i<n;i++) {
			if(p[i]>=sp) {
				sp=p[i];
			}
			else {
				if(sp-bp>=fee) {
					mp+=sp-bp-fee;
					bp=sp=p[i];
				}
				else {
					if(p[i]<bp && p[i]<sp) {
						bp=sp=p[i];
					}
					else {
						sp=p[i];
					}
				}
				
			}
		}
		if(sp-bp>fee) {
			mp+=sp-bp-fee;
		}
		
		System.out.println(mp);
		
	}
	
}*/
/*class dp{
	public static void main(String [] args) {
		int n=12;
		int p[]= {10,15,17,20,16,18,22,20,22,20,23,25};
        int fee=3;
        int b=p[0];
       
        int s=0;
        for(int i=1;i<n;i++) {
         int nb=0;
         int ns=0;
        if((p[i]-s)<b) {
        		nb=p[i]-s;
        		
        	}
        else {
        	nb=b;
        }
        	if((p[i]-b-fee)>s) {
        	   ns=p[i]-b-fee;
        	}
        	else {
        		ns=s;
        	}
        	b=nb;
        	s=ns;
        }
        System.out.println(s);
	}
	
}*/
/*class dp{
	public static void main(String [] args) {
	int n=12;
	int p[]= {10,15,17,20,16,18,22,20,22,20,23,25};
	int b=p[0];
	int s=0,c=0;
	for(int i=1;i<n;i++) {
		int nb,ns,nc=0;
		if(p[i]-c<b) {
			nb=p[i]-c;
		}
		else {
			nb=b;
		}
		if(p[i]-b>s) {
			ns=p[i]-b;
		}
		else {
			ns=s;
		}
		if(s>c) {
			nc=s;
		}
		else {
			nc=c;
		}
		s=ns;
		b=nb;
		c=nc;
	}
	System.out.println(s);
	
	}
	
	
}*/
/*class dp{
	public static void main(String [] args) {
		int n=12;
		int p[]= {10,15,17,20,16,18,22,20,22,20,23,25};
		int least=p[0];
		
		int maxpt=0;
		int dp[]=new int[n];
		
		for(int i=1;i<n;i++) {
			if(p[i]<least) {
				least=p[i];
			}
			maxpt=p[i]-least;
			if(maxpt>dp[i-1]) {
				dp[i]=maxpt;
			}
			else {
				dp[i]=dp[i-1];
			}
		}
		int maxb=p[n-1];
		int mbpt=0;
		int dp1[]=new int[n];
		for(int i=n-2;i>=0;i--) {
			if(maxb<p[i]) {
				maxb=p[i];
			}
		 mbpt=maxb-p[i];
		 if(mbpt>dp1[i+1]) {
			 dp1[i]=mbpt;
		 }
		 else {
			 dp1[i]=dp1[i+1];
		 }
		}
		int m=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
		  if(dp[i]+dp1[i]>m) {
			  m=dp[i]+dp1[i];
		  }
		}
		System.out.println(m);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int n=6;
		int p[]= {9,6,7,6,3,8};
		int t=3;
		int dp[][]=new int[t+1][n];
		for(int i=1;i<=t;i++) {
			for(int j=1;j<n;j++) {
				int max=Integer.MIN_VALUE;
				for(int k=0;k<j;k++) {
					int ppd=dp[i-1][k];
					int tdp=p[j]-p[k];
					if(ppd+tdp>max) {
						max=ppd+tdp;
					}
				}
				dp[i][j]=Math.max(dp[i][j-1],max);
			}
		}
		System.out.println(dp[t][n-1]);
	}
}*/

/*class dp{
	public static void main(String [] args) {
		int n=6;
		int p[]= {9,6,7,6,3,8};
		int t=3;
		int dp[][]=new int[t+1][n];
		for(int i=1;i<=t;i++) {
			int pm=dp[i-1][0]-p[0];
			for(int j=1;j<n;j++) {
				if(dp[i-1][j-1]-p[j-1]>pm) {
				  pm=dp[i-1][j-1]-p[j-1];	
				}
				dp[i][j]=Math.max(dp[i][j-1], pm+p[j]);
			}
		}
		System.out.println(dp[t][n-1]);
	}
}*/
/*class dp{
	public static void main(String [] args) {
		int l=20;//length of road
		int n=5;
		int location[]= {6,7,12,14,15};
		int income[]= {5,8,5,3,1};
		int mind=3;
		int dp[]=new int [n];
		  dp[0]=income[0];
		  int ans=0;
		for(int i=1;i<n;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				if(location[i]-location[j]>mind) {
					max=Math.max(max, dp[j]);
				}
			}
			dp[i]=max+income[i];
			ans=Math.max(ans,dp[i]);
		}
		System.out.println(ans);
	}
}*/
//import java.util.*;
/*class dp{
	public static void main(String [] args) {
		int l=20;//length of road
		int n=5;
		int location[]= {6,7,12,14,15};
		int income[]= {5,8,5,3,1};
		int mind=3;
		int dp[]=new int [l+1];
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			hm.put(location[i],income[i]);
		}
		dp[0]=0;
		for(int i=1;i<=l;i++) {
		int	max=dp[i-1];
			if(hm.containsKey(i)) {
				
				int currentv=hm.get(i);
				if(i>=mind+1) {
					currentv+=dp[i-mind-1];
				}
			   max=Math.max(max, currentv);
			}
			dp[i]=max;
		}
		
		System.out.println(dp[l]);
	}
}
*/

























































































































































































































































































































































































































































































































