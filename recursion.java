
import java.util.*;
import java.util.Arrays;
/*class dp2{
	public static void main(String [] args) {
		String str="madamadam";
		boolean b=isPalindrom(str,0,str.length()-1);
		System.out.println(b);
	}
	public static boolean isPalindrom(String str,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(str.charAt(i)==str.charAt(j)) {
			boolean b=isPalindrom(str,i+1,j-1);
			if(b) {
				return true;
			}
		}
		return false;
	}
}*/

/*public class recursion {
 public static void print(int n) {
	 if(n==0) {
		 
		 return;
	 }
	 
	 System.out.println(n);
	 print(n-1);
	 System.out.println(n);
 }
	public static void main(String[] args) {
	int n=7;
	print(n);

	}

}*/
// print power
/*class recursion{
	public static int power(int n,int p) {
		if(p==0) {
			return 1;
		}
		//return n*power(n,p-1);
		int t=power(n,p/2);
		int r=t*t;
		if(p%2!=0) {
			r=r*n;
		}
		return r;
	}
	public static void main(String [] args) {
		int n=5;
		int p=5;
		int r=power(n,p);
		System.out.println(r);
	}
}*/
//print zig zag
/*class recursion{
	public static void main(String [] args) {
		int n=3;
		print(n);
	}
	public static void print(int n) {
		if(n==0) {
			return ;
		}
		System.out.print(n+" ");
		print(n-1);
		System.out.print(n+" ");
		print(n-1);
		System.out.print(n+" ");
	}
}*/
// tower of hanoi
/*class recursion{
	
	public static void main(String [] args) {
		int n=5;
		move(n,10,11,12);
		
	}
	public static void move(int n,int a,int b,int c) {
		if(n==0) {
			return ;
		}
		move(n-1,a,c,b);
		System.out.println(n +"["+a+">"+b+"]");
		move(n-1,c,b,a);
		
	}
}*/
// print arr
/*class recursion{
	public static void main(String [] args) {
		int a[]= {10,20,30,40,50};
		print(a,0);
	}
	public static void print(int []a,int i) {
		if(i==a.length) {
			return ;
		}
		System.out.println(a[i]);
		print(a,i+1);
	}
}*/
// max of array
/*class recursion{
	public static void main(String [] args) {
		int a[]= {10,20,30,40,50};
		int m=max(a,0);
		System.out.println(m);
	}
public static int max(int []a,int i) {
	if(i==a.length) {
		return Integer.MIN_VALUE;
	}
	int m=a[i];
	int m1=max(a,i+1);
	return m>m1?m:m1;
}
}*/
// first index of n
/*class recursion{
	public static void main(String [] args) {
		int a[]= {0,10,20,30,40,50,30};
		int m=firstindex(a,0,30);
		System.out.println(m);
	}
public static int firstindex(int []a,int i,int n) {
	if(i==a.length) {
		return -1;
	}
	if(a[i]==n) {
		return i;
	}
	else {
		return firstindex(a,i+1,n);
	}
	
}}*/
// last index of n
/*class recursion{
	public static void main(String [] args) {
		int a[]= {0,10,20,30,40,50,30};
		int m=lastindex(a,0,30);
		System.out.println(m);
	}
public static int lastindex(int []a,int i,int n) {
	if(i==a.length) {
		return -1;
	}
	int li=lastindex(a,i+1,n);
	if(li!=-1) {
		return li;
	}
	else {
		if(a[i]==n) {
			return i;
		}
		else {
			return -1;
		}
	}
	
}}*/
// all index of n
/*class recursion{
	public static void main(String [] args) {
		int a[]= {0,10,20,30,40,50,30};
		ArrayList<Integer> al=new ArrayList<>();
		 al=allindex(a,0,30);
		
		System.out.println(al);
	}
public static ArrayList<Integer> allindex(int []a,int i,int n) {
	if(i==a.length) {
		return new ArrayList<>();
	}
	ArrayList<Integer> al=new ArrayList<>();
	
	al=allindex(a,i+1,n);
	if(a[i]==n) {
		al.add(i);
	}
	return al;
	
}}*/
// all index of n
/*class recursion{
	public static void main(String [] args) {
		int a[]= {30,10,20,30,40,50,30};
		
		int [] al=allindex(a,0,30,0);
		
		System.out.println(Arrays.toString(al));
	}
public static int [] allindex(int []a,int i,int n,int f) {
	if(i==a.length) {
		return new int[f];
	}
	
	//if(a[i]==n) {
	//	f++;
//	}
//	int []r=allindex(a,i+1,n,f);
	//if(a[i]==n) {
	//	r[f-1]=i;
	//}
	//return r;
	
	if(a[i]==n) {
		int r[]=allindex(a,i+1,n,f+1);
		r[f]=i;
		return r;
	}
	else {
		int r[]=allindex(a,i+1,n,f);
		return r;
	}
	
}}*/
// 
/*class recursion{
	public static void main(String [] args) {
		String s="abc";
	ArrayList<String> al=	getsubsequence(s);
	System.out.println(al);
	}
	public static ArrayList<String> getsubsequence(String s) {
		if(s.length()==0) {
		ArrayList<String> br=new ArrayList<>();
		br.add("");
			return br;
		}
		char c=s.charAt(0);
		String sub=s.substring(1);
		ArrayList<String> tem=getsubsequence(sub);
		ArrayList<String> myr=new ArrayList<>();
		for(int i=0;i<tem.size();i++) {
			myr.add(""+tem.get(i));
			myr.add(c+tem.get(i));
		}
		return myr;
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		String s="573";
		ArrayList<String> al=getkpc(s);
    System.out.println(al);
	}
	static String[] str= {"abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".;","?!"};
	public static ArrayList<String> getkpc(String s){
		if(s.length()==0) {
			ArrayList<String> al=new ArrayList<>();
			al.add("");
			return al;
		}
		char c=s.charAt(0);
		String sub=s.substring(1);
		ArrayList<String> tem=getkpc(sub);
		ArrayList<String> my=new ArrayList<>();
		String s1=str[c-'0'-1];
		for(String s2 : tem) {
			for(int i=0;i<s1.length();i++) {
				my.add(s1.charAt(i)+s2);
			}
		}
		return my;
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int n=7;
		int p=nopaths(n);
		System.out.println(p);
	}
	public static int nopaths(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		int t1=nopaths(n-1);
		int t2=nopaths(n-2);
		int t3=nopaths(n-3);
		return t1+t2+t3;
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int n=7;
		ArrayList<String> al=nopaths(n);
		System.out.println(al);
		System.out.println(al.size());
	}
	public static ArrayList<String> nopaths(int n) {
		if(n==0) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		if(n<0) {
			ArrayList<String> br=new ArrayList<>();
			
			return br;
		}
		ArrayList<String> al1=nopaths(n-1);
		ArrayList<String> al2=nopaths(n-2);
		ArrayList<String> al3=nopaths(n-3);
		ArrayList<String> mr=new ArrayList<>();
		for(int i=0;i<al1.size();i++) {
			mr.add(1+al1.get(i));
		}
		for(int i=0;i<al2.size();i++) {
			mr.add(2+al2.get(i));
		}
		for(int i=0;i<al3.size();i++) {
			mr.add(3+al3.get(i));
		}
		return mr;
		
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int [][]a=new int[3][3];
		ArrayList<String> al=allmezpaths(a,0,0);
		System.out.println(al);
	}
	public static ArrayList<String> allmezpaths(int [][]a,int i,int j){
		if(i>=a.length || j>=a[0].length) {
			return new ArrayList<>();
		}
		if(i==a.length-1 && j==a[0].length-1) {
			ArrayList<String> al=new ArrayList<>();
			al.add("");
			return al;
			
		}
		ArrayList<String> a1=allmezpaths(a,i+1,j);
		ArrayList<String> a2=allmezpaths(a,i,j+1);
		ArrayList<String> myr=new ArrayList<>();
		for(String s : a1) {
			myr.add("d"+s);
		}
		for(String s : a2) {
			myr.add("h"+s);
		}
		return myr;

	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int [][]a=new int[3][3];
		ArrayList<String> al=allmezpaths(a,0,0);
		System.out.println(al);
	}
	public static ArrayList<String> allmezpaths(int [][]a,int i,int j){
		if(i>=a.length || j>=a[0].length || i+j>=a.length+a[0].length) {
			return new ArrayList<>();
		}
		if(i==a.length-1 && j==a[0].length-1) {
			ArrayList<String> al=new ArrayList<>();
			al.add("");
			return al;
			
		}
		ArrayList<String> a1;
		ArrayList<String> a2;
		ArrayList<String> a3;
		ArrayList<String> myr=new ArrayList<>();
		for(int k=1;k<a.length;k++) {
			a1=allmezpaths(a,i+k,j);
			for(String s : a1) {
				  myr.add("v"+k+s);	
				}
		}
		for(int k=1;k<a[0].length;k++) {
			a2=allmezpaths(a,i,j+k);
			for(String s : a2) {
				  myr.add("h"+k+s);	
				}
		}
		for(int k=1;k<a.length && k<a[0].length;k++) {
			a3=allmezpaths(a,i+k,j+k);
			for(String s : a3) {
				  myr.add("d"+k+s);	
				}
		}
		return myr;
	}}*/
/*class recursion{
	public static void main(String [] args) {
		String s="abc";
		pss(s,"");
	}
	public static void pss(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans+" ");
			return ;
		}
		char c=s.charAt(0);
	     String sub=s.substring(1);
	     pss(sub,ans);
	     pss(sub,ans+c);
	     
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		String s="573";
		getkpc(s,"");
   
	}
	static String[] str= {".;","abc","def","ghi","jkl","mnop","qrst","uv","wx","yz"};
	public static void getkpc(String s,String ans){
		if(s.length()==0) {
			System.out.println(ans);
			return ;
		}
		char c=s.charAt(0);
		String sub=s.substring(1);
		String s1=str[c-'0'];
		for(int i=0;i<s1.length();i++) {
			getkpc(sub,ans+s1.charAt(i));
		}
		
		
	}
}*//*class recursion{
	public static void main(String [] args) {
		int n=4;
		printpath(n,"");
	}
	public static void printpath(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		if(n<0) {
			return ;
		}
		printpath(n-1,ans+1);
		printpath(n-2,ans+2);
		printpath(n-3,ans+3);
		
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int n[][]=new int[3][3];
		printmezpath(n,0,0,"");
	}
	public static void printmezpath(int [][]a,int i,int j,String ans) {
		if(i>=a.length || j>=a[0].length) {
			return ;
		}
		if(i==a.length-1 && j==a[0].length-1) {
			System.out.println(ans);
			return;
		}
		printmezpath(a,i+1,j,ans+"v");
		printmezpath(a,i,j+1,ans+"h");
	}
}*/
/*class recursion{
	
	public static void main(String [] args) {
		int n[][]=new int[3][3];
		printmezpath(n,0,0,"");
		
	}
	public static void printmezpath(int [][]a,int i,int j,String ans) {
		if(i>=a.length || j>=a[0].length) {
			
			return ;
		}
		if(i==a.length-1 && j==a[0].length-1) {
			System.out.println(ans);
			
			return ;
		}
		
		for(int k=1;k<a.length;k++) {
		printmezpath(a,i+k,j,ans+"v"+k);
		}
		for(int k=1;k<a.length;k++) {
		printmezpath(a,i,j+k,ans+"h"+k);
        }
		for(int k=1;k<a.length && k<a[0].length;k++) {
		printmezpath(a,i+k,j+k,ans+"d"+k);
		}
		
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		String s="avorm";
		printper(s,"");
	}
	public static void printper(String s,String ans) {
		
		if(s.length()==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<s.length();i++) {
			String s1=s.substring(0,i);
			String s2=s.substring(i+1);
			char c=s.charAt(i);
			printper(s1+s2,ans+c);
		}
	}
}*/
/*class recursion{
	public static void main(String [] agrs) {
		String s="12103";
		printencoding(s,"");
	}
	static String []str= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
			"q","r","s","t","u","v","w","x","y","z"};

	public static void printencoding(String s,String ans) {
		if( s.length()>0 && s.charAt(0)=='0') {
			return ;
		}
		if(s.length()==0) {
			System.out.println(ans);
			return ;
		}
		char c=s.charAt(0);
		int r=c-'0';
		//String code=str[c-'0'-1];
		char code =(char)('a'+r-1);
		String sub=s.substring(1);
		printencoding(sub,ans+code);
		if(s.length()>=2) {
		String sub1=s.substring(0,2);
		int a=Integer.parseInt(sub1);
		if( a<=26) {
			//String codes1=str[a-1]
			char codes1=(char)('a'+a-1);
			printencoding(s.substring(2),ans+codes1);
		}
		}
	}
}*/
/*class recursion{
	public static void main(String []args) {
		int [][]a= {{0,0,0},
				    {1,0,1},
				    {0,0,0}};
		boolean [][]b=new boolean[a.length][a[0].length];
		printpathfloodfill(a,0,0,"",b);
	}
	public static void printpathfloodfill(int [][]a,int i,int j,String ans,boolean [][]b) {
		if(i<0 || j<0 || i>=a.length || j>=a[0].length || a[i][j]==1 || b[i][j]==true) {
			return ;
		}
		if(i==a.length-1 && j==a[0].length-1) {
			System.out.println(ans);
			return ;
		}
		b[i][j]=true;
		printpathfloodfill(a,i+1,j,ans+"d",b);
		printpathfloodfill(a,i-1,j,ans+"u",b);
		printpathfloodfill(a,i,j+1,ans+"r",b);
		printpathfloodfill(a,i,j-1,ans+"l",b);
		b[i][j]=false;
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int a[]= {10,20,30,40,50,60};
		int n=60;
		
		targetsum(a,n,0,0,"");
	}
public static void targetsum(int [] a,int n,int sum,int i,String ans) {
	
	if(i==a.length) {
		if( n==sum) {
	System.out.println(ans);
		}
	return ;
	}
	targetsum(a,n,sum+a[i],i+1,ans+" " +a[i]);
	targetsum(a,n,sum,i+1,ans);
	
}
}*/

/*class recursion{
	public static void main(String [] args) {
		int [][]a=new int[8][8];
		printNQ(a,0,"");
	}
	public static void printNQ(int [][]a,int i,String ans) {
		if(i==a.length) {
			System.out.println(ans);
			return ;
			
		}
		for(int j=0;j<a.length;j++) {
			if(isQueenSafe(a,i,j)==true) {
			a[i][j]=1;
			printNQ(a,i+1,ans+i+j+" ");
			a[i][j]=0;
			}
		}
	}
	public static boolean isQueenSafe(int [][]a,int i,int j) {
		for(int k=i-1;k>=0;k--) {
			if(a[k][j]==1) {
				return false;
			}
		}
		for(int k=i-1,l=j-1;k>=0 && l>=0 ;k--,l--) {
			if(a[k][l]==1) {
				return false;
			}
		}
		for(int k=i-1,l=j+1;k>=0 && l<a.length;k--,l++) {
			if(a[k][l]==1) {
				return false;
			}
		}
		return true;
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int [][]a=new int[8][8];
		
				
				printknighttour(a,0,1,1);
			
	   }
	public static void printknighttour(int [][]a,int i,int j,int move) {
		if(i<0 || j<0 || i>=a.length || j>=a.length || a[i][j]>0 ) {
			return ;
		}
		if(move==64) {
			a[i][j]=move;
			display(a);
			a[i][j]=0;
			return ;
		}
		
		a[i][j]=move;
		printknighttour(a,i-1,j+2,move+1);
		printknighttour(a,i-2,j+1,move+1);
		printknighttour(a,i-1,j-2,move+1);
		printknighttour(a,i-2,j-1,move+1);
		printknighttour(a,i+1,j+2,move+1);
		printknighttour(a,i+2,j+1,move+1);
		printknighttour(a,i+1,j-2,move+1);
		printknighttour(a,i+2,j-1,move+1);
		a[i][j]=0;
	}
	public static void display(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}*/
/*class recursion{
	public static void main(String [] args) {
		int n=4;
		print(n,"");
	}
	public static void print(int n,String s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		for(int i=1;i<=n;i++) {
			if(s.length()>0 && (s.charAt(s.length()-1)-'0')>=i) {
			print(n-i,s+i);
			}
			else if(s.length()==0){
				print(n-i,s+i);
			}
		}
	}
}*/
/*class recursion{
	public static void main(String [] args) {
		int n=2 ;
		int a[]= {1,2,3,4,5};
		print(a,0,n,"");
	}
	public static void print(int []a,int i,int r,String s) {
	     if(s.length()==r) {
	    	 System.out.print(s+" ");
	    	 return ;
	     }
		if(i<a.length) {
		print(a,i+1,r,s+a[i]);
		print(a,i+1,r,s);
		}
	}
}*/
//   SubStrings
/*class dp2{
	public static void main(String [] args) {
		String str="abcabc";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
	}
}*/





















































































































































































































































































































