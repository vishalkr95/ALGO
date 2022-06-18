
/*public class dandc {
public static int nowtocreat(int n,int a[]) {
	
	if(n==0 ||n==1 || n==2) {
		return 1;
	}
	if(n==3) {
		return 2;
	}
	if(a[n]!=0) {
		return a[n];
	}
	int t=nowtocreat(n-1,a);
	int t1=nowtocreat(n-3,a);
	int t2=nowtocreat(n-4,a);
	a[n]=t+t1+t2;
	return t1+t+t2;
}
	public static void main(String[] args) {
	   int n=5;
	   int a[]=new int[n+1];
	   int c=nowtocreat(n,a);//1,3,4
	   System.out.println(c);
	}

}

/*class dandc{
	public static int f(int []a,int i) {
		if(i>=a.length) {
			return 0;
		}
		int m1=a[i]+f(a,i+2);
		
		int m2=f(a,i+1);
		
		return Math.max(m1, m2);
	}
	public static void main(String[] args) {
		int a[]= {6,7,1,30,8,2,4};
		int m=f(a,0);
		System.out.println(m);
	}
}*/
/*import java.util.*;
class dandc{
 static class p implements Comparable<p>{
	  int a,b;
	  float c;
	  p(int a,int b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
	  }
	  public int compareTo(p o) {
		  if(this.c>o.c) {
			  return -1;
		  }
		  else {
			  return 1;
		  }
	  }
  }
	public static void main(String[] args) {
		int v[]= {31,26,72,17};
		int w[]= {3,1,5,2};
		int c=8;
		p a[]=new p[w.length];
	for(int i=0;i<w.length;i++) {
		a[i]=new p(w[i],v[i],(float)(w[i]*1.0)/v[i]);
	}
	Arrays.sort(a);
	float price=0;
	for(int i=a.length-1;i>=0;i--) {
		if(c>=0 && a[i].a<=c) {
			c=c-a[i].a;
			price+=a[i].b;
		}
		
	}
	System.out.println(price);
	}
}*/
/*
 * class dandc{
 */
/*(public static int maxp(int [] a,int []b,int i,int w,int p) {
	if(i==a.length || b[i]>w) {
		return p;
	}
	int m1=maxp(a,b,i+1,w-b[i],p+a[i]);
	int m2=maxp(a,b,i+1,w,p);
	return Math.max(m1, m2);

}
	public static void main(String [] args) {
		int p[]= {31,26,72,17};
		int w[]= {3,1,5,2};
		int t=7;
		int m=maxp(p,w,0,t,0);
		System.out.println(m);
	}
}
/*class dandc{
	public static int longestsequence(String s1,String s2,int i,int j) {
		if(i>=s1.length() || j>=s2.length()) {
			return 0;
		}
		int m1=0,m2=0,m3=0,m4=0;
		if(s1.charAt(i)==s2.charAt(j)) {
		 m1=1+longestsequence(s1,s2,i+1,j+1);
		}
		else {
		 m2=longestsequence(s1,s2,i+1,j);
		 m3=longestsequence(s1,s2,i,j+1);
		 m4=longestsequence(s1,s2,i+1,j+1);
		}
		return Math.max(m1, Math.max(m2, Math.max(m3, m4)));
		
	}
	public static void main(String [] args) {
		String s1="elephant";
		String s2="eretpat";
		int m=longestsequence(s1,s2,0,0);
		System.out.println(m);
	}
}*/
/*class dandc{
	public static int totalstapes(String s1,String s2,int i,int j) {
		if(i==s1.length()-1) {
			return s2.length()-j;
		}
		if(j==s2.length()) {
			return s1.length()-i;
		}
		int t1=0,t2=0,t3=0,t4=0;
		if(s1.charAt(i)==s2.charAt(i)) {
		return totalstapes(s1,s2,i+1,j+1);	
		}
		else {
			t2=1+totalstapes(s1,s2,i+1,j+1);
			t3=1+totalstapes(s1,s2,i+1,j);
			t4=1+totalstapes(s1,s2,i,j+1);
		}
		return Math.min(t2, Math.min(t3, t4));
	}
	public static void main(String [] args) {
		String s1="catch";
		String s2="carch";
		int t=totalstapes(s1,s2,0,0);
		System.out.println(t);
	}
}wrong answer*/


/*class dandc{
	public static int longestpalindromsubsequence(String s,int i,int j) {
		if(i>j) {
			return 0;
		}
		if(i==j) {
			return 1;
		}
		int m1=0,m2=0,m3=0,m4=0;
		if(s.charAt(i)==s.charAt(j)) {
			m1=2+longestpalindromsubsequence(s,i+1,j-1);
		}
		else {
			m2=longestpalindromsubsequence(s,i,j-1);
			m3=longestpalindromsubsequence(s,i+1,j);
			m4=longestpalindromsubsequence(s,i+1,j-1);
		}
		return Math.max(m1, Math.max(m2, Math.max(m3, m4)));
	}
	public static void main(String [] args) {
		String s="elrmenmet";
		int t=longestpalindromsubsequence(s,0,s.length()-1);
		System.out.println(t);
		
	}
}*/
/*class dandc{
	public static int longestpalindromsubString(String s,int i,int j) {
		if(i>j) {
			return 0;
		}
		if(i==j) {
			return 1;
		}
		int m1=0,m2=0,m3=0,m4=0;
		if(s.charAt(i)==s.charAt(j)) {
			int b=j-i-1;
			if(b==longestpalindromsubString(s,i+1,j-1) ) {
			m1=2+longestpalindromsubString(s,i+1,j-1);
			}
		}
		else {
			m2=longestpalindromsubString(s,i,j-1);
			m3=longestpalindromsubString(s,i+1,j);
			m4=longestpalindromsubString(s,i+1,j-1);
		}
		return Math.max(m1, Math.max(m2, Math.max(m3, m4)));
	}
	public static void main(String [] args) {
		String s="viamadama";
		int t=longestpalindromsubString(s,0,s.length()-1);
		System.out.println(t);
		
	}
}*/
/*class dandc{
	public static int minc(int a[][],int i,int j) {
		if(i>=a.length ||  j>=a[0].length ) {
					return Integer.MAX_VALUE;
		}
		if(i==a.length-1 && j==a[0].length-1) {
			
			return a[a.length-1][a[0].length-1];
		}
		int c=minc(a,i+1,j);
		int c1=minc(a,i,j+1);
		
		return Math.min(c, c1)+a[i][j];
	}
	public static void main(String [] args) {
		int a[][]= {{4,7,8,6,4},
				    {6,7,3,9,2},
				    {3,8,1,2,4},
				    {7,1,7,3,7},
				    {2,9,8,9,3}};
		int c=minc(a,0,0);
		System.out.println(c);
	}
}*/
/*class dandc{
	public static int minc(int a[][],int i,int j) {
		if(i<0 ||  j<0 ) {
					return Integer.MAX_VALUE;
		}
		if(i==0 && j==0) {
			
			return a[0][0];
		}
		int c=minc(a,i-1,j);
		int c1=minc(a,i,j-1);
		
		return Math.min(c, c1)+a[i][j];
	}
	public static void main(String [] args) {
		int a[][]= {{4,7,8,6,4},
				    {6,7,3,9,2},
				    {3,8,1,2,4},
				    {7,1,7,3,7},
				    {2,9,8,9,3}};
		int c=minc(a,a.length-1,a[0].length-1);
		System.out.println(c);
	}
}*/
class dandc{
	public static int minc(int a[][],int i,int j,int v) {
	if(i<0 || j<0) {
		return 0;
	}
	if((i==0 && j==0) && v==a[0][0]) {
		return 1;
	}
	int t1=minc(a,i-1,j,v-a[i][j]);	
	int t2=minc(a,i,j-1,v-a[i][j]);	
	return t1+t2;
	}
	public static void main(String [] args) {
		int a[][]= {{4,7,1,6},
				    {5,7,3,9},
				    {3,2,1,2},
				    {7,1,6,3}};
		int c=minc(a,a.length-1,a[0].length-1,25);
		System.out.println(c);
	}
}


























































































































































