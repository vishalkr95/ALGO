import java.util.*;
/*public class vish{
  public static void main(String [] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  int n=sc.nextInt();
	 
	  String s[]=str.split(",");
	 
	  int mat[][]=new int[n][2];
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<2;j++) {
			  mat[i][j]=sc.nextInt();
		  }
	  }
	  for(int i=0;i<s.length;i++) {
		  String ss=s[i];
		  int r=mat[i][0];
		  int c=mat[i][1];
		  char cc=ss.charAt(r);
		  char ch=(char)('a'+c);
		  
		 s[i]=ss.replaceAll(cc+"",ch+"") ;
		 
	  }
	  int arr[]=new int[s.length];
	  
	  for(int i=0;i<s.length;i++) {
		 String ns=s[i];
		
		 int c=0;
		 for(int j=0;j<ns.length();j++) {
			 char ch=ns.charAt(j);
			 if(ch!='a'&& ch!='e' && ch!='i'&& ch!='o'&& ch!='u') {
				 c++;
			 }
		 }
		 arr[i]=c;
	  }
	  int min=Integer.MAX_VALUE;
	  for(int i=0;i<arr.length;i++) {
		  min=Math.min(min,arr[i]);
	  }
	  System.out.println(s[min-1]);
  }
}
//import java.util.*;
/*class vish{
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String s[]=str.split(",");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int arr[]=new int[s.length];
	for(int i=0;i<arr.length;i++) {
		HashMap<Character,Integer> hm=new HashMap<>();
		String ss=s[i];
		for(int j=0;j<ss.length();j++) {
		   char c=ss.charAt(j);
		   hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		int maxf=0;
		for(Character ch:hm.keySet()) {
			int f=hm.get(ch);
			if(f>maxf) {
				maxf=f;
			}
		}
		arr[i]=maxf;
	}
	String temp="";
for(int i=1;i<s.length;i++) {
	int pf=arr[i-1];
	String si=s[i];
	int idx=pf%si.length();
	char c=si.charAt(idx);
	temp+=c;
}
	
int ans=generateAlluniquesubString(temp,n1,n2,new HashSet<>());
System.out.println(ans);
}
public static int generateAlluniquesubString(String str,int n1,int n2,HashSet<String> hs) {
	int c=0;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			String s=str.substring(i,j);
			if(hs.contains(s)==false && s.length()>=n1 && s.length()<=n2) {
				hs.add(s);
				c++;
			}
		}
	}
	return c;
}
}*/
/*
7
2
1
1
5
1
1
2
4
 */
/*class vish{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<>();
		for(int i=0;i<n;i++) {
			A.add(sc.nextInt());
		}
		int result=minOpreation(n,k,A);
		System.out.println(result);
	}
	public static int minOpreation(int n,int k,ArrayList<Integer> al) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int v: al) {
			hm.put(v,hm.getOrDefault(v,0)+1);
		}
		int count=0;
		for(int key:hm.keySet()) {
			if(hm.get(key)>k) {
				count++;
			}
		}
		int s=0;
		for(int key : hm.keySet()) {
			if(hm.get(key)<=k) {
				s+=hm.get(key);
			}
		}
		System.out.println(s);
		System.out.println(count);
		count+=Math.ceil(s*1.0/k);

		return count;
	}
}*/
/*
5
3
13
13
-100
19
5

6
1
11
11
11
11
11
11

5
10
10
10
-800
-500
0
 */
public class vish{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<>();
		for(int i=0;i<n;i++) {
			A.add(sc.nextInt());
		}
	    int result=solve(n,k,A);
		System.out.println(result);
	}
	
	public static int solve(int n,int k,ArrayList<Integer> al) {
		int dp[]=new int[n+1];
		dp[0]=0;
		for(int i=1;i<=n;i++) {
		   int max=Integer.MIN_VALUE;
		   for(int j=0;j<i;j++) {
			   int p=al.get(i-1)-(int)Math.pow(k,i-j)+dp[j];
			  
			   max=Math.max(max, p);
			  
		   }
		   dp[i]=max;
		}
		return dp[n];
	}
}

/*
7
4
3
8
5
9
7
1
8

7
4
3
8
8
8
1
9
6
 */
/*public class vish{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=findmin(arr,n,k);
		System.out.println(min);
	}
	public static int findmin(int arr[],int n,int k) {
		int l=0;
		int r=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j]/k;
				int len=j-i+1;
				if(sum>=k && min>len) {
					min=len;
//					l=i;
//					r=j;
				}
			}
		}
		System.out.println(l+" "+r);
		return min;
	}
}*/
/*
3
21
3
431
 */
/*public class vish{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<q;i++) {
			al.add(sc.nextInt());
		}
		int cost=findcost(q,al);
		System.out.println(cost);
	}
	public static int findcost(int q,ArrayList<Integer> al) {
		int c=0;
		for(int i=0;i<q;i++) {
			int val=al.get(i);
			int n=val;
			int idx=0;
			int f=0;
			while(n>0) {
				int r=n%10;
				n=n/10;
				if(r%2==0) {
					f=1;
					break;
				}
				else {
					idx++;
				}
			}
			if(f!=0) {
				c+=idx;
			}
			else {
				c--;
			}
		}
		return c;
	}
}
*/
/*
5
0
abcda

5
1
abcda
db

10
3
sjnvksueks
kv
uj
sn
 */
/*public class vish{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		List<String> l=new ArrayList<>();
		for(int i=0;i<m;i++) {
			l.add(sc.nextLine());
		}
		//System.out.print(s);
		int len=findmax(n,m,s,l);
		System.out.println(len);
	}
	public static int findmax(int n,int m,String s,List<String> al) {
		HashMap<Character,Character> hm=new HashMap<>();
		for(String str : al) {
			hm.put(str.charAt(0),str.charAt(1));
		}
		int dp[][]=new int[s.length()][s.length()];
		for(int g=0;g<s.length();g++) {
			for(int i=0,j=g;j<s.length();j++,i++) {
				if(g==0) {
					dp[i][j]=1;
				}
				else if(g==1) {
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=2;
					}
					else {
                        char c1=s.charAt(i);
                        char c2=s.charAt(j);
                        if(hm.getOrDefault(c1,null)!=null && hm.getOrDefault(c1,null)==c2) {
                        	dp[i][j]=2;
                        }
                        else if(hm.getOrDefault(c2,null)!=null && hm.getOrDefault(c2,null)==c1) {
                        	dp[i][j]=2;
                        }
                        else if(hm.getOrDefault(c2,null)!=null && hm.getOrDefault(c1,null)!=null && hm.getOrDefault(c1,null)==hm.getOrDefault(c2,null)){
                        	dp[i][j]=2;
                        }
                        else {
                        	dp[i][j]=1;
                        }
					}
				}
				else {
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=Math.max(2+dp[i+1][j-1],Math.max(dp[i+1][j-1],dp[i][j-1]));
					}
					
					else {
						char c1=s.charAt(i);
                        char c2=s.charAt(j);
                        if(hm.getOrDefault(c1,null)!=null && hm.getOrDefault(c1,null)==c2) {
                        	dp[i][j]=2+dp[i+1][j-1];
                        }
                        else if(hm.getOrDefault(c2,null)!=null && hm.getOrDefault(c2,null)==c1) {
                        	dp[i][j]=2+dp[i+1][j-1];
                        }
                        else if(hm.getOrDefault(c2,null)!=null && hm.getOrDefault(c1,null)!=null && hm.getOrDefault(c1,null)==hm.getOrDefault(c2,null)){
                        	dp[i][j]=2+dp[i+1][j-1];
                        }
                        else {
                        	dp[i][j]=Math.max(dp[i+1][j-1],dp[i][j-1]);
                        }
					}
				}
			}
		}
		return dp[0][s.length()-1];
	}
}
 */

 
/*class vish{
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	minmaxdigit(n);
	}
	public static void minmaxdigit(int num) {
		int cd=0;
		int n=num;
		while(n>0) {
			n=n/10;
			cd++;
		}
		int arr[]=new int[cd];
		int i=arr.length-1;
		n=num;
		while(i>=0) {
			arr[i--]=n%10;
			n=n/10;
		}
		int minnum=findmin(arr);
		int maxnum=findmax(arr);
		System.out.println(minnum);
		System.out.print(maxnum);
	}
	public static int findmin(int arr[]) {
		int i=0;
		while(arr[i]==1) {
			i++;
		}
		int val=arr[i];
		int minnum=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==val) {
				minnum+=(int)(1*Math.pow(10,arr.length-j-1));
			}
			else {
				minnum+=(int)(arr[j]*Math.pow(10,arr.length-j-1));
			}
		}
		return minnum;
	}
	public static int findmax(int arr[]) {
		int i=0;
		while(arr[i]==9) {
			i++;
			
		}
		int val=arr[i];
		int maxnum=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==val) {
				maxnum+=(int)(9*Math.pow(10,arr.length-j-1));
			}
			else {
				maxnum+=(int)(arr[j]*Math.pow(10,arr.length-j-1));
			}
		}
		return maxnum;
	}
}
*/
/*class vish{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=findb(n);
		System.out.println(f);
	}
	public static int findb(int n) {
		int c=0;
		long l=(int)Math.pow(10,n-1);
		long h=(int)Math.pow(10,n);
		for(long i=l;i<h;i++) {
			if(isbueatyfull(i)) {
				
				c++;
			}
		}
		
		return c%1000003;
	}
	public static boolean isbueatyfull(long v) {
		if(checkleading0(v)) {
			if(isprimein3(v)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public static boolean isprimein3(long val) {
		long n=val;
		while(n>99){
			long num=n%1000;
			n=n/10;
			if(isprime(num)==false) {
				return false;
			}
		}
		return true;
	}
	public static boolean isprime(long num) {
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkleading0(long val) {
		long n=val;
		n=n/100;
		while(n>9) {
			long r=n%10;
			n=n/10;
			if(r==0) {
				return false;
			}
		}
		return true;
	}
}
*/





























