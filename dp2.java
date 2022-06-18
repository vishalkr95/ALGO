
/*
5 6
0 1 0 1 0 1 
1 0 1 0 1 0 
0 1 1 0 1 0 
0 0 1 1 1 0 
1 1 1 1 1 1
 */
//max square size using recursion


import java.util.*;

/*public class dp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
        int maxsqsize=0;
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a[i].length;j++) {
    		  if(a[i][j]!=0) {
    			  int size=0;
    			  size=squaresize(a,i,j);
    			  if(size>maxsqsize) {
    				  maxsqsize=size;
    			  }
    		  }
    	  }
      }
     System.out.println(maxsqsize);
	}
	 public static int squaresize(int a[][],int i,int j) {
   	      int s=0;
   	      if((a.length-i)<=(a[0].length-j)) {
   	    	  for(int k=1;k<=a.length-i;k++) {
   	    		 boolean b;
   	    		 b=istrue(a,k,i,j);
   	    		 if(b) {
   	    			 s=k;
   	    		 }
   	    	  }
   	      }
   	      else {
	    	  for(int k=1;k<=a[0].length-j;k++) {
	    		 boolean b;
	    		 b=istrue(a,k,i,j);
	    		 if(b) {
   	    			 s=k;
   	    		 }
	    	  }
	      }
   	      return s;
     }
public static boolean istrue(int a[][],int k,int i,int j) {
	for(int x=i;x<i+k;x++) {
		for(int y=j;y<j+k;y++) {
			if(a[x][y]==0) {
				return false;
			}
		}
	}
	return true;
}
}*/
/*class dp2{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
       int dp[][]=new int[n][m];
       int maxsqsize=0;
       for(int i=a.length-1;i>=0;i--) {
    	   for(int j=a[0].length-1;j>=0;j--) {
    		   if(a[i][j]==0) {
    			   dp[i][j]=0;
    		   }
    		   else if(i==a.length-1 || j==a[0].length-1) {
    			   dp[i][j]=1;
    		   }
   else {																																																																																																																																																																																																																																									
    			   int min=0;
    			   min=Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]))+1;
    			   dp[i][j]=min;
    			   if(min>maxsqsize) {
    				   maxsqsize=min;
    			   }
    		   }
    	   }
       }
       System.out.println(maxsqsize);
	}
}*/
//Longest Increasing Subsequence Recursion
/*class dp2{
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		Lis(0,a,new ArrayList<>());
		System.out.println(lis);
	}
	static int size=0;
	static ArrayList<Integer> lis;
	public static void Lis(int i,int a[],ArrayList<Integer> al) {
		if(i==a.length) {
			if(isInceasing(al)&&(al.size()>size)) {
			  lis=new ArrayList<>(al);
			  size=al.size();
			}
			return ;
		}
		al.add(a[i]);
		Lis(i+1,a,al);
		al.remove(al.size()-1);
		Lis(i+1,a,al);
	}
	public static boolean isInceasing(ArrayList<Integer> al) {
		for(int i=0;i<al.size()-1;i++) {
			if(al.get(i)>al.get(i+1)) {
				return false;
			}
		}
		return true;
	}
}*/	
/*class dp2{
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		int dp[]=new int[a.length];
		int size=0;
		for(int i=0;i<a.length;i++) {
			int s=0;
			for(int j=i;j>=0;j--) {	
				if(a[i]>a[j] && dp[j]>s) {
				   s=dp[j];	
				}
			}
			dp[i]=s+1;
			if(dp[i]>size) {
				size=dp[i];
			}
		}	
		System.out.println(size);
	}
}*/
//print all Longest Increasing SubSequence
/*class dp2{
	public static class pair{
		int l;
		int i;
		String str;
		public pair(int l,int i,String s) {
			this.l=l;
			this.i=i;
			str=s;
		}
	}
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		int dp[]=new int[a.length];
		int maxsize=0;
		int msi=0;
		for(int i=0;i<a.length;i++) {
			int s=0;
			for(int j=i;j>=0;j--) {	
				if(a[i]>a[j] && dp[j]>s) {
				   s=dp[j];	
				}
			}
			dp[i]=s+1;
			if(dp[i]>maxsize) {
				maxsize=dp[i];
				msi=i;
			}
		}
		
		Queue<pair> q=new ArrayDeque<>();
		for(int i=0;i<dp.length;i++) {
			if(dp[i]==maxsize) {
				q.add(new pair(maxsize,i,a[i]+""));
			}
		}
		while(q.size()>0) {
			pair p=q.remove();
			if(p.l==1) {
				System.out.println(p.str);
			}
			for(int j=p.i-1;j>=0;j--) {
				if(a[j]<=a[p.i]&&dp[j]==p.l-1) {
					q.add(new pair(p.l-1,j,a[j]+" "+p.str));
				}
			}
		}
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		int dp[]=new int[a.length];
		int maxsum=0;
	      for(int i=0;i<a.length;i++) {
	    	  Integer max=null;
	    	  for(int j=i-1;j>=0;j--) {
	    		  if(a[j]<=a[i]) {
	    			  if(max==null) {
	    				  max=dp[j];
	    			  }
	    			  else if(dp[j]>max){
	    				  max=dp[j];
	    			  }
	    		  }
	    	  }
	    	  if(max==null) {
	    		  dp[i]=a[i];
	    	  }
	    	  else {
	    		  dp[i]=max+a[i];
	    	  }
	    	  if(dp[i]>maxsum) {
	    		 maxsum=dp[i]; 
	    	  }
	      }
	      System.out.println(maxsum);
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		int dp[]=new int[a.length];
		int maxsum=0;
	      for(int i=0;i<a.length;i++) {
	    	 int max=0;
	    	  for(int j=i-1;j>=0;j--) {
	    		  if(a[j]<=a[i] && dp[j]>max) {
	    			 max=dp[j];
	    		  }
	    	  }
	    	  if(max==0) {
	    		  dp[i]=a[i];
	    	  }
	    	  else {
	    		  dp[i]=max+a[i];
	    	  }
	    	  if(dp[i]>maxsum) {
	    		 maxsum=dp[i]; 
	    	  }
	      }
	      System.out.println(maxsum);
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		Lis(0,a,new ArrayList<>());
		System.out.println(lis);
	}
	static int size=0;
	static ArrayList<Integer> lis;
	public static void Lis(int i,int a[],ArrayList<Integer> al) {
		if(i==a.length) {
			if(isInceasing(al)&&(al.size()>size)) {
			  lis=new ArrayList<>(al);
			  size=al.size();
			}
			return ;
		}
		al.add(a[i]);
		Lis(i+1,a,al);
		al.remove(al.size()-1);
		Lis(i+1,a,al);
	}
	public static boolean isInceasing(ArrayList<Integer> al) {
		int idx=0;
		for(int i=0;i<al.size()-1;i++) {
			if(al.get(i)<al.get(i+1)) {
				idx++;
			}
			else {
				break;
			}
		}
		if(idx==0) {
			return false;
			
		}else if(idx==al.size()) {
			return false;
		}
		else {
			for(int i=idx;i<al.size()-1;i++) {
				if(al.get(i)<al.get(i+1)) {
					return false;
				}
			}
		}
		return true;
	}
}*/
//maximum Lis sum
/*class dp2{
	public static void main(String [] args) {
		int a[]= {10,22,9,33,21,50,41,60,80,1};
		int dp[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int s=0;
			for(int j=i-1;j>=0;j--) {
				if(a[j]<a[i]&&dp[j]>s) {
					s=dp[j];
				}
			}
			dp[i]=s+1;
		}
		int dp1[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			int s=0;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[i]&&dp1[j]>s) {
					s=dp1[j];
				}
			}
			dp1[i]=s+1;
		}
		int max=0;
		for(int i=0;i<dp.length;i++) {
		  max=Math.max(dp[i]+dp1[i], max);	
		}
		System.out.println(max-1);
	}
}*/
/*
10
10 20
2 7
8 15
17 3
21 40
50 4
41 57
60 80
80 90
1 30
 */
// Maximum non overLaping Bridge
/*class dp2{
	public static class pair implements Comparable<pair>{
		int n;
		int s;
		public pair(int n,int s) {
			this.n=n;
			this.s=s;
		}
		
		public int compareTo(pair o) {
			if(this.n!=o.n) {
			return this.n-o.n;
			}
			else {
				return this.s-o.s;
			}
		}
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pair []p=new pair[n];
		for(int i=0;i<n;i++) {
			p[i]=new pair(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(p);
		int dp[]=new int[n];
		int max=0;
		for(int i=0;i<dp.length;i++) {
			int s=0;
			for(int j=i-1;j>=0;j--) {
				if(p[i].s>=p[j].s&&dp[j]>s) {
					s=dp[j];
				}
			}
			dp[i]=s+1;
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		System.out.println(max);
	}
}*/
//Russian Doll
/*
11
17 5
26 18
25 34
48 84
63 72
42 86
9 55
4 70
21 45
68 76
58 51
 */
/*class dp2{
	public static class pair implements Comparable<pair>{
		int w;
		int h;
		public pair(int w,int h) {
			this.w=w;
			this.h=h;
		}
		public int compareTo(pair o) {
			return this.w-o.w;
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pair []p=new pair[n];
		for(int i=0;i<n;i++) {
			p[i]=new pair(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(p);
		int dp[]=new int[n];
		int max=0;
		for(int i=0;i<dp.length;i++) {
			int s=0;
			for(int j=i-1;j>=0;j--) {
				if(p[i].h>=p[j].h&&dp[j]>s) {
					s=dp[j];
				}
			}
			dp[i]=s+1;
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		System.out.println(max);	
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		Squares(10,10,"");
		System.out.println(min);
	}
	static int min=Integer.MAX_VALUE;
	public static void Squares(int nn,int n,String ans) {
	if(nn==0) {
		//System.out.println(ans);
		if(ans.length()<min) {
			min=ans.length();
		}
		return ;
	}
	for(int i=1;i<n && nn>0;i++) {
		
	   	Squares(nn-i*i,n,ans+""+i*i);
	}
	}
}*/
//min Squares
/*class dp2{
	public static void main(String [] args) {
		int n=10;
		int dp[]=new int[n+1];
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				min=Math.min(min,dp[i-j*j]);
			}
			dp[i]=min+1;
		}
		System.out.println(dp[n]);
	}
}*/
//Catalan Number
/*class dp2{
	public static void main(String [] args) {
		int n=10;
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int num=0;
			for(int j=0;j<i;j++) {
				num+=dp[j]*dp[i-j-1];
			}
			dp[i]=num;
		}
		System.out.println(Arrays.toString(dp));
	}
}*/
// No of Bsts 
/*class dp2{
	public static void main(String [] args) {
		int Nodes=5;
		int dp[]=new int[Nodes+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			for(int j=0;j<i;j++) {
				dp[i]+=dp[j]*dp[i-j-1];
			}
		}
		System.out.println(dp[Nodes]);
	}
}*/
// Count Valleys and Mountains
/*class dp2{
	public static void main(String [] args) {
		int noofpairs=4;
		int dp[]=new int[noofpairs+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			for(int j=0;j<i;j++) {
				dp[i]+=dp[j]*dp[i-j-1];
			}
		}
		System.out.println(dp[noofpairs]);
	
	}
}*/
// or 
/*class dp2{
	public static void main(String [] args) {
		int noofpairs=4;
		int dp[]=new int[noofpairs+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			int inside=i-1;
			int outside=0;
			while(inside>=0) {
				dp[i]+=dp[inside]*dp[outside];
				inside--;
				outside++;
			}
		}
		System.out.println(dp[noofpairs]);
	
	}
}*/
// count Brackets
/*class dp2{
	public static void main(String [] args) {
		int noofpairs=5;
		int dp[]=new int[noofpairs+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			int inside=i-1;
			int outside=0;
			while(inside>=0) {
				dp[i]+=dp[inside]*dp[outside];
				inside--;
				outside++;
			}
		}
		System.out.println(dp[noofpairs]);
	}
}*/
// Count Non Intersecring Chords
/*class dp2{
	public static void main(String [] args) {
		int points=6;
		int c=points/2;
		int dp[]=new int[c+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			int l=0;
			int r=i-1;
			while(r>=0) {
				dp[i]+=dp[r]*dp[l];
				r--;
				l++;
			}
		}
		System.out.println(dp[c]);
	}
}*/
// Ways of polygon Triangulation
// no of triangle can be draw from given points
/*class dp2{
	public static void main(String [] args) {
		int noofsides=5;
		int c=noofsides-2;
		int dp[]=new int[c+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=c;i++) {
			int l=0;
			int r=i-1;
			while(r>=0) {
				dp[i]+=dp[r]*dp[l];
				r--;
				l++;
			}
		}
		System.out.println(dp[c]);
	}
}*/
/*
10
3
3
0
2
1
2
4
2
0
0
 */
// print all paths with Minimum Jumps
/*class dp2{
	public static class pair{
		int i;
		int j;
		int s;
		String ans;
		public pair(int i,int j,int s,String ans) {
			this.i=i;
			this.j=j;
			this.s=s;
			this.ans=ans;
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();	
		}
		Integer dp[]=new Integer[n];
		dp[n-1]=0;
		for(int i=n-2;i>=0;i--) {
			int min=Integer.MAX_VALUE;
			if(arr[i]==0) {
				dp[i]=null;
			}
			else {
			for(int j=1;j<=arr[i]&&j+i<dp.length;j++) {
				if(dp[i+j]!=null) {
				min=Math.min(dp[i+j],min);
				}
			}
			}
			if(min==Integer.MAX_VALUE) {
				dp[i]=null;
			}
			else {
				dp[i]=min+1;
			}
		}
		Queue<pair> q=new ArrayDeque<>();
		q.add(new pair(0,arr[0],dp[0],0+""));
		while(q.size()>0) {
			pair p=q.remove();
			if(p.i==arr.length-1) {
				System.out.println(p.ans);
			}
			for(int j=1;j<=p.j && p.i+j<dp.length;j++) {
				if(dp[p.i+j]!=null && dp[p.i+j]==p.s-1) {
					q.add(new pair(p.i+j,arr[p.i+j],dp[p.i+j],p.ans+" "+(p.i+j)));
				}
			}
		}
	}
}*/
//print all paths with min cost
/*
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
 */
/*class dp2{
	public static class pair{
		int i;
		int j;
		
		String ans;
		public pair(int i,int j,String ans) {
			this.i=i;
			this.j=j;
			
			this.ans=ans;
		}
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int dp[][]=new int[n][m];
	
	for(int i=n-1;i>=0;i--) {
		for(int j=m-1;j>=0;j--) {
			if(i==n-1 && j==m-1) {
				dp[i][j]=arr[i][j];
			}
			else if(i==dp.length-1) {
				dp[i][j]=arr[i][j]+dp[i][j+1];
			}
			else if(j==dp.length-1) {
				dp[i][j]=arr[i][j]+dp[i+1][j];
			}
			else {
				dp[i][j]=arr[i][j]+Math.min(dp[i+1][j], dp[i][j+1]);
			}
		}
	}
	Queue<pair> q=new ArrayDeque<>();
	q.add(new pair(0,0,""));
	while(q.size()>0) {
		pair p=q.remove();
		if(p.i==dp.length-1 && p.j==dp.length-1) {
		
			System.out.println(p.ans);
			
		}
		else if(p.j==dp.length-1) {
		   q.add(new pair(p.i+1,p.j,p.ans+"V"));	
		}
		else if(p.i==dp.length-1) {
			q.add(new pair(p.i,p.j+1,p.ans+"H"));
		}else {
			if(dp[p.i][p.j]-arr[p.i][p.j]!=dp[p.i+1][p.j]) {
				q.add(new pair(p.i,p.j+1,p.ans+"H"));		
			}
			else if(dp[p.i][p.j]-arr[p.i][p.j]==dp[p.i+1][p.j]&& dp[p.i][p.j]-arr[p.i][p.j]==dp[p.i][p.j+1]){
				q.add(new pair(p.i+1,p.j,p.ans+"V"));
				q.add(new pair(p.i,p.j+1,p.ans+"H"));
			}
			else {
				q.add(new pair(p.i+1,p.j,p.ans+"V"));
			}
		}
	}
	}
}*/
/*
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
 */
// print all path with maximum gold
/*class dp2{
	static class pair{
		int i;
		int j;
		String ans;
		public pair(int i,int j,String ans) {
			this.i=i;
			this.j=j;
			this.ans=ans;
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int dp[][]=new int[n][m];
		for(int j=m-1;j>=0;j--) {
			for(int i=0;i<n;i++) {
				if(j==m-1) {
				dp[i][j]=arr[i][j];
				}
				else if(i==0){
					dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
				}
				else if(i==n-1) {
					dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
				}
				else {
					dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));
				}
			}
		}
		int mi=0;
		int mj=0;
		int max=dp[0][0];
		for(int i=0;i<n;i++) {
			if(dp[i][0]>max) {
				max=dp[i][0];
				mi=i;
			}
		}
		Queue<pair> q=new ArrayDeque<>();
		q.add(new pair(mi,mj,mi+""));
		while(q.size()>0) {
			pair p=q.remove();
			if(p.j==dp[0].length-1) {
				System.out.println(p.ans);
			}
			else if(p.i==0) {
				int cm=Math.max(dp[p.i][p.j+1],dp[p.i+1][p.j+1]);
				if(dp[p.i][p.j+1]==cm) {
					q.add(new pair(p.i,p.j+1,p.ans+"d2"));
				}
				if(dp[p.i+1][p.j+1]==cm) {
					q.add(new pair(p.i+1,p.j+1,p.ans+"d3"));
				}
			}
			else if(p.i==dp.length-1) {
				int cm=Math.max(dp[p.i][p.j+1],dp[p.i-1][p.j+1]);
				if(dp[p.i-1][p.j+1]==cm) {
					q.add(new pair(p.i-1,p.j+1,p.ans+"d1"));
				}
				if(dp[p.i][p.j+1]==cm) {
					q.add(new pair(p.i,p.j+1,p.ans+"d2"));
				}
				
			}else {
				int cm=Math.max(dp[p.i][p.j+1],Math.max(dp[p.i-1][p.j+1],dp[p.i+1][p.j+1]));
				if(dp[p.i-1][p.j+1]==cm){
					q.add(new pair(p.i-1,p.j+1,p.ans+"d1"));
				}
				if(dp[p.i][p.j+1]==cm) {
					q.add(new pair(p.i,p.j+1,p.ans+"d2"));
				}
			    if(dp[p.i+1][p.j+1]==cm) {
					q.add(new pair(p.i+1,p.j+1,p.ans+"d3"));
				}
			    
			}
		}
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		int a[][]= {{1,2,3,4},
				    {1,2,3,4},
				    {1,2,3,4}};
		int b[][]= {{1,2,3},
			       {1,2,3},
			       {1,2,3},
			       {1,2,3}};
		int c[][]=new int[3][3];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				for(int k=0;k<b.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	for(int arr[]:c) {
		for(int v: arr) {
			System.out.print(v+" ");
		}
		System.out.println();
	}
	}
}*/
// rod cuting recursion
/*class dp2{
public static void main(String [] args) {
	int n=8;
	int p[]= {1,5,8,9,10,17,17,20};
	maxprice(n,p,0,"");
	System.out.println(max);
}
static int max=Integer.MIN_VALUE;
public static void maxprice(int n,int []p,int s,String ans) {
	if(n==0) {
		if(s>max) {
			max=s;
		}
		return ;
	}
	for(int i=1;i<=n;i++) {
		maxprice(n-i,p,s+p[i-1],ans+i+" ");
	}
}
} */
/*class dp2{
	public static void main(String [] args) {
	   int n=8;
	   int p[]= {0,1,5,8,9,10,17,18,20};
	   int dp[]=new int[n+1];
	   dp[0]=0;
	   dp[1]=p[1];
	   for(int i=2;i<dp.length;i++) {
		   int max=Integer.MIN_VALUE;
		   for(int j=1;j<=i/2;j++) {
			   max=Math.max(dp[j]+dp[i-j],max);
		   }
		   max=Math.max(p[i], max);
		   dp[i]=max;
	   }
	   System.out.println(Arrays.toString(dp));
	}
}*/
/*class dp2{
	public static void main(String[] arg) {
		String str="abccbc";
		palindromicpartition(str,"",str.length());
	}
	public static void palindromicpartition(String str,String ans,int l) {
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
			String s=str.substring(0,i+1);
			if(isPalindrom(s)) {
				String ros=str.substring(i+1);
				palindromicpartition(ros,ans+"("+s+")",l);
			}
		}
	}
	public static boolean isPalindrom(String str) {
		int l=0;
		int r=str.length()-1;
		while(r>l) {
			if(str.charAt(l)!=str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}*/
//recursion of minimum cut for palindromic parition
/*class dp2{
	public static void main(String [] args) {
		String str="aaaaacbcbbb";
		int mincut=mincutToPalindrom(str);
		System.out.println(mincut);
		
	}
	public static int mincutToPalindrom(String str) {
		if(str.length()==1 || isPalindrom(str)) {
			
			return 0;
		}
		int min=Integer.MAX_VALUE;
		
		for(int i=1;i<str.length();i++) {
			String ls=str.substring(0,i);
			String rs=str.substring(i);
			//System.out.println(ls+" "+rs);
			int ml=mincutToPalindrom(ls);
			int mr=mincutToPalindrom(rs);
		   int c=ml+mr+1;
		   if(c<min) {
			 
			   min=c;
		   }
		}
		
		return min;
	}
	public static boolean isPalindrom(String str) {
		int l=0;
		int r=str.length()-1;
		while(r>l) {
			if(str.charAt(l)!=str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
*/
/*class dp2{
	public static void main(String [] args) {
		int n=4;
		int dp[]=new int[n+1];
		int c=catalan(n,dp);
		
		System.out.println(c);
	}
	public static int catalan(int n,int dp[]) {
		if(n==0 || n==1) {
			return 1;
		}
		int c=0;
		if(dp[n]!=0) {
			return dp[n]; 
		}
		for(int i=0;i<n;i++) {
			c+=catalan(i,dp)*catalan(n-i-1,dp);
		}
		dp[n]=c;
		return c;
	}
}*/
// count palindromic substrings 
/*class dp2{
	public static void main(String [] args) {
		String str="abccbc";
		boolean dp[][]=new boolean[str.length()][str.length()];
		int count=0;
		for(int g=0;g<str.length();g++) {
			for(int i=0,j=g;j<dp.length;i++,j++) {
				if(g==0) {
					
					dp[i][j]=true;
				}
				else if(g==1) {
					dp[i][j]=str.charAt(i)==str.charAt(j);
				}
				else {
					if(str.charAt(i)==str.charAt(j)) {
						dp[i][j]=dp[i+1][j-1];
					}
					else {
						dp[i][j]=false;
					}
				}
				if(dp[i][j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}*/
// length of longest palingromic string
/*class dp2{
	public static void main(String [] args) {
		String str="abccbc";
	boolean dp[][]=new boolean[str.length()][str.length()];
	int len=1;
	for(int g=0;g<str.length();g++) {
		for(int i=0,j=g;j<str.length();i++,j++) {
			if(g==0) {
				dp[i][j]=true;
			}
			else if(g==1) {
				dp[i][j]=str.charAt(i)==str.charAt(j);
			}
			else {
				if(str.charAt(i)==str.charAt(j)) {
					dp[i][j]=dp[i+1][j-1];
				}
				else {
					dp[i][j]=false;
				}
			}
			if(dp[i][j]) {
				len=g+1;
			}
		}
	}
	System.out.println(len);
	}
}*/																									
// Longest palindromic sub string 
/*class dp2{
	public static void main(String [] args) {
		String str="abccbc";
		String lon=LongestPalindromicString(str);
		System.out.println(lon);
	}
	public static String LongestPalindromicString(String str) {
		boolean dp[][]=PalindromicSubString(str);
		for(int g=str.length()-1;g>=0;g--) {
			for(int i=0,j=g;j<str.length();i++,j++) {
				if(dp[i][j]) {
					return str.substring(i,j+1);
				}
			}
		}
		return "";
	}
	public static boolean[][] PalindromicSubString(String str){
		boolean dp[][]=new boolean[str.length()][str.length()];
		for(int g=0;g<str.length();g++) {
			for(int i=0,j=g;j<dp.length;i++,j++) {
				if(g==0) {
					
					dp[i][j]=true;
				}
				else if(g==1) {
					dp[i][j]=str.charAt(i)==str.charAt(j);
				}
				else {
					if(str.charAt(i)==str.charAt(j)) {
						dp[i][j]=dp[i+1][j-1];
					}
					else {
						dp[i][j]=false;
					}
				}
				
			}
		}
		return dp;
	}
}*/
// total distict SubString
/*class dp2{
	public static void main(String [] args) {
		String str="abcbac";
		int dp[]=new int[str.length()+1];
		dp[0]=1;
		HashMap<Character,Integer> lo=new HashMap<>();
		for(int i=1;i<dp.length;i++) {
			char c=str.charAt(i-1);
			dp[i]=2*dp[i-1];
			if(lo.containsKey(c)) {
				int j=lo.get(c);
				dp[i]=dp[i]-dp[j-1];
			}
			lo.put(c, i);
		}
		System.out.println(dp[str.length()]);
		
	}
}*/
//  count palindromic subSequence
/*class dp2{
	public static void main(String [] args) {
		String str="abccbc";
		int c=countPalindromicSubSequences(str);
		System.out.println(c);
	}
	public static int countPalindromicSubSequences(String str) {
		int dp[][]=new int[str.length()][str.length()];
		for(int g=0;g<str.length();g++) {
			for(int i=0,j=g;j<dp.length;j++,i++) {
				if(g==0) {
					dp[i][j]=1;
				}
				else if(g==1) {
					if(str.charAt(i)==str.charAt(j)) {
						dp[i][j]=3;
					}
					else {
						dp[i][j]=2;
					}
				}
				else {
					if(str.charAt(i)==str.charAt(j)) {
						dp[i][j]=dp[i][j-1]+dp[i+1][j]+1;
					}
					else {
						dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
					}
				}
			}
		}
		
		return dp[0][str.length()-1];
	}
}*/
//Length of Longngest Palindromic Subsequence
class dp2{
	public static void main(String [] args) {
		String str="abccbc";
		int dp[][]=new int[str.length()][str.length()];
		for(int g=0;g<str.length();g++) {
			for(int i=0,j=g;j<dp.length;i++,j++) {
				if(g==0) {
					dp[i][j]=1;
				}
				else if(g==1) {
					dp[i][j]=str.charAt(i)==str.charAt(j)?2:1;
				}
				else {
					if(str.charAt(i)==str.charAt(j)) {
						dp[i][j]=2+dp[i+1][j-1];
					}
					else {
						dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
					}
				}
			}
		}
		for(int a[]:dp) {
			for(int v:a) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		System.out.println(dp[0][str.length()-1]);
	}
}
// length Longest commonsubSuquence
/*class dp2{
	public static void main(String [] args) {
		String str1="abcd";
		String str2="aebd";
	int l=LengthofLongestCommonSubSequence(str1,str2);	
	System.out.println(l);
	}
	public static int LengthofLongestCommonSubSequence(String str1,String str2) {
		int dp[][]=new int[str1.length()+1][str2.length()+1];
		for(int i=str1.length();i>=0;i--) {
			for(int j=str2.length();j>=0;j--) {
				if(i==str1.length() || j==str2.length()) {
					dp[i][j]=0;
				}
				else {
					if(str1.charAt(i)==str2.charAt(j)) {
						dp[i][j]=1+dp[i+1][j+1];
					}
					else {
						dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
					}
				}
			}
		}
		return dp[0][0];
	}
}*/
//Wildcard Matching  pattern matching
/*class dp2{
	public static void main(String [] args) {
		
		String str1="ba*a?";
		String str2="baaabab";
		boolean b=wildcardMatching(str1,str2);
		System.out.println(b);
	}
	public static boolean wildcardMatching(String str1,String str2) {
		boolean dp[][]=new boolean[str1.length()+1][str2.length()+1];
		for(int i=dp.length-1;i>=0;i--) {
			for(int j=dp[0].length-1;j>=0;j--) {
				
				if(i==dp.length-1 && j==dp[0].length-1) {
					dp[i][j]=true;
				}
				else if(i==dp.length-1) {
					dp[i][j]=false;
				}
				else if(j==dp[0].length-1){
					if(str1.charAt(i)=='*') {
						dp[i][j]=dp[i+1][j];
					}
					else {
						dp[i][j]=false;
					}
				}
				else {
					char c1=str1.charAt(i);
					char c2=str2.charAt(j);
				    if(c1=='?' ||c1==c2){
						dp[i][j]=dp[i+1][j+1];
					}
					else if(c1=='*') {
						dp[i][j]=(dp[i+1][j]||dp[i][j+1]);
					}
					else {
						dp[i][j]=false;
					}
				}
				
			}
		}
		return dp[0][0];
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		String str="mississppi";
		String ptr="mis*i.*p*i";
		RegularExpression(str,0,ptr,0);
	}
	public static void RegularExpression(String str,int i,String ptr,int j) {
		if(i>=str.length() || j==ptr.length()) {
			if(i==str.length() && j==ptr.length()) {
				System.out.println("true");
			}
			return ;
		}
		char c=ptr.charAt(j);
		System.out.println(j);
		if(c=='*') {
			System.out.println(j);
			RegularExpression(str,i,ptr,j+1);
			System.out.println(j);
			for(int k=i;k+i<str.length();k++) {
				if(str.charAt(i+k)==str.charAt(j-1)) {
				RegularExpression(str,i+k,ptr,j+1);
				}
				else {
					break;
				}
			}
		}
		else {
			char c1=str.charAt(i);
			if(c=='.' || c==c1) {
				RegularExpression(str,i+1,ptr,j+1);
			}
			
		}
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		 int a[]= {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1}; 
		 int msum=0;
		 int sum=0;
		 for(int i=0;i<a.length;i++) {
			 sum+=a[i];
			 if(sum>msum) {
				 msum=sum;
			 }
			 if(sum<0) {
				 sum=0;
			 }
		 }
		 System.out.println(msum);
	}
}*/
// latter combination of phone number
/*class dp2{
	public static void main(String [] args ) {
		int n=2;
		int dp[][]=new int[n+1][10];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<10;j++) {
				if(i==0) {
					dp[i][j]=0;
				}
				else if(i==1) {
					dp[i][j]=1;
				}
				else if(j==0) {
					dp[i][j]=dp[i-1][0]+dp[i-1][8];
				}
				else if(j==1) {
					dp[i][j]=dp[i-1][1]+dp[i-1][2]+dp[i-1][4];
				}
				else if(j==2) {
					dp[i][j]=dp[i-1][2]+dp[i-1][1]+dp[i-1][3]+dp[i-1][5];
				}
				else if(j==3) {
					dp[i][j]=dp[i-1][3]+dp[i-1][2]+dp[i-1][6];
				}
				else if(j==4) {
					dp[i][j]=dp[i-1][4]+dp[i-1][1]+dp[i-1][7]+dp[i-1][5];
				}
				else if(j==5) {
					dp[i][j]=dp[i-1][5]+dp[i-1][4]+dp[i-1][2]+dp[i-1][6]+dp[i-1][8];
				}
				else if(j==6) {
					dp[i][j]=dp[i-1][6]+dp[i-1][3]+dp[i-1][5]+dp[i-1][9];
				}
				else if(j==7) {
					dp[i][j]=dp[i-1][7]+dp[i-1][4]+dp[i-1][8];
				}
				else if(j==8) {
					dp[i][j]=dp[i-1][8]+dp[i-1][0]+dp[i-1][7]+dp[i-1][9]+dp[i-1][5];
				}
				else if(j==9) {
					dp[i][j]=dp[i-1][9]+dp[i-1][8]+dp[i-1][6];
				}
			}
		}
		for(int a[] :dp) {
			for(int v:a) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int j=0;j<dp[0].length;j++) {
			sum+=dp[n][j];
		}
		System.out.println(sum);
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		String s1="pqabcxy";
		String s2="xyzabcp";
		int l=LongestCommonSubString(s1,s2);
		System.out.println(l);
	}
	public static int LongestCommonSubString(String s1,String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		int l=0;
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[i].length;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else {
					dp[i][j]=0;
				}
				if(dp[i][j]>l) {
					l=dp[i][j];
				}
			}
		}
		return l;
	}
}*/
// K concatination maximum sum 
/*public class dp2 {
public static int kadanes(int a[]) {
	int sum=a[0];int maxsum=a[0];
	for(int i=1;i<a.length;i++) {
		sum+=a[i];
		if(sum>maxsum) {
			maxsum=sum;
		}
		if(sum<a[i]) {
			sum=a[i];
		}
	}
	return maxsum;
}
public static int kadanesof2(int a[]) {
	int arr[]=new int[2*a.length];
	for(int i=0;i<a.length;i++) {
		arr[i]=a[i];
	}
	int idx=a.length;
	for(int i=0;i<a.length;i++) {
		arr[idx++]=a[i];
	}
	int sum=arr[0];int maxsum=arr[0];
	for(int i=1;i<arr.length;i++) {
		sum+=arr[i];
		if(sum>maxsum) {
			maxsum=sum;
		}
		if(sum<arr[i]) {
			sum=arr[i];
		}
	}
	return maxsum;
}
  public static long Kconcatinationmaximumsum(int[] arr, int k, long sum) {
   if(k==1) {
	   int s=kadanes(arr);
	   return s;
   }
   else {
	   int s=kadanesof2(arr);
	   if(sum<0) {
		return s;
	   }
	   else {
		  return s+(k-2)*sum; 
	   }
   }
  }

  public static void main(String[] args) {
   int arr[]= {3,-1,-2,-3,2,2};
     int  k=3;
    long sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    
    System.out.println(Kconcatinationmaximumsum(arr, k, sum));
  }

}*/
//Knight probability on chess board

/*public class dp2 {
public static boolean isVailed(int ni,int nj,int n) {
	if(ni>=0&& nj>=0&& ni<n&& nj<n) {
		return true;
	}
	return false;
}
	public static void Knightprobability(int r, int c, int n, int k) {
		double curr[][]=new double[n][n];
		double next[][]=new double[n][n];
		curr[r][c]=1;
		for(int m=1;m<=k;m++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(curr[i][j]!=0) {
						int ni=0;
						int nj=0;
						ni=1+2;
						nj=j+1;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1+1;
						nj=j+2;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1+2;
						nj=j-1;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1+1;
						nj=j-2;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1-2;
						nj=j+1;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1-1;
						nj=j+2;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1-2;
						nj=j-1;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
						ni=1-1;
						nj=j-2;
						if(isVailed(ni,nj,n)) {
							next[ni][nj]+=curr[i][j]/8;
						}
						
					}
					
			}
				
		}
			curr=next;
			next=new double[n][n];
			
		}
		double sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum+=curr[i][j];
			}
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		int r = 0;
		int c = 0;
		
		Knightprobability(r, c, n, k);
	}

}*/
// Maximum DIFFERENCE OF ZEROES AND ONES
/*class dp2{
	public static void main(String [] args) {
		String str="11000010001";
		char c=str.charAt(0);
		int diff=0;
		int maxdiff=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int d;
			if(ch-'0'==0) {
				d=1;
			}
			else {
				d=-1;
			}
			diff+=d;
			if(diff>maxdiff) {
				maxdiff=diff;
			}
			if(diff<d) {
				diff=d;
			}
		}
		System.out.println(maxdiff);
	}
}*/
/*class dp2{
	public static void main(String [] args) {
		int a[]= {2,3,1,-7,6,-5,-4,4,3,3,2,-9,-3,6,1,2,1,4};
		int k=4;
		int sum=MaxsumwithAtleastK(a,k);
		System.out.println(sum);
	}
public static int MaxsumwithAtleastK(int []a,int k) {
	int c=0;
   int []maxtilli=new int[a.length];
   for(int i=0;i<a.length;i++) {
	   c+=a[i];
	   if(c<a[i]) {
		   c=a[i];
	   }
	   maxtilli[i]=c;
   }
   int excextk=0;
   int morek=0;
   int ans=0;
   for(int i=0;i<k;i++) {
	   excextk+=a[i];
   }
   ans=excextk;
   for(int i=k;i<a.length;i++) {
	   excextk=excextk+ a[i]-a[i-k];
	   morek=excextk+maxtilli[i-k];
	   if(excextk>ans) {
		   ans=excextk;
		   
	   }
	   if(morek>ans) {
		   
		   ans=morek;
	   }
   }
   return ans;
}
}*/


// optimal Strategy for a game 

/*class dp2{
	public static void main(String [] args) {
		int a[]= {20,30,2,2,2,10};
		int dp[][]=new int[a.length][a.length];
		int m=maxGame(a,0,a.length-1,dp);
		System.out.println(m);
	}
	public static int maxGame(int a[],int i,int j,int dp[][]) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int l=a[i]+Math.min(maxGame(a,i+2,j,dp),maxGame(a,i+1,j-1,dp));
		
		int r=a[j]+Math.min(maxGame(a,i,j-2,dp),maxGame(a,i+1,j-1,dp));
		System.out.println(l+" "+r);
		dp[i][j]=Math.max(l, r);
		return Math.max(l, r);
	}
}*/
     //OR
//m2
/*class dp2{
	public static void main(String [] args) {
		int a[]= {20,30,2,2,2,10};
		int dp[][]=new int[a.length][a.length];
		for(int g=0;g<dp.length;g++) {
			for(int i=0,j=g;j<dp.length;j++,i++) {
				if(g==0) {
					dp[i][j]=a[i];
				}
				else if(g==1) {
					dp[i][j]=Math.max(a[i], a[j]);
				}
				else {
					int v1=a[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);
					int v2=a[j]+Math.min(dp[i][j-2],dp[i+1][j-1]);
					dp[i][j]=Math.max(v1, v2);
				}
			}
		}
		System.out.println(dp[0][a.length-1]);
	}
}*/
/*public class dp2{

	public static int eggDrop(int n, int k,int dp[][]){
		
      if(k==0) {
    	  return 0;
      }
      else if(n==1) {
    	  return k;
      }
      else if(k==1) {
    	  return 1;
      }
      if(dp[n][k]!=0) {
    	  return dp[n][k];
      }
      int m=Integer.MAX_VALUE;
      for(int i=1;i<=k;i++) {
    	  int b=eggDrop(n,k-i,dp);
    	  int t=eggDrop(n-1,i-1,dp);
    	  int max=Math.max(t, b)+1;
    	  m=Math.min(m,max); 
      }
      System.out.println(m);
      dp[n][k]=m;
		return m;
	} 

	public static void main(String[] args) {
		
		//n -> number of eggs and k -> number of floors
		int n = 3;
		int k = 7;
		int dp[][]=new int[n+1][k+1];
		System.out.println(eggDrop(n,k,dp));
	}
	
}*/













































































































































































































































































































































































