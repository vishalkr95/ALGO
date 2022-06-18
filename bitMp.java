
import java.util.*;
/*public class bitMp {

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		 int n=56;
		 int i=30;//on 6th bit
		 int j=5;  //off jth bit
		 int k=7;  //toggle kth bit
		 int m=6;  //check mth bit
		 int onmask=(1<<i);
		 int ofmask=~(1<<j);
		 int tmask=(1<<k);
		 int cmask=(1<<m);
		 System.out.println((n|onmask)+" "+Integer.toBinaryString(n)+" "+Integer.toBinaryString(onmask)+" "+Integer.toBinaryString(n|onmask));
		 System.out.println((n & ofmask)+" "+Integer.toBinaryString(n)+" "+Integer.toBinaryString(ofmask));
		 System.out.println((n ^ tmask)+" "+Integer.toBinaryString(n)+" "+Integer.toBinaryString(tmask));
		int b=n & cmask;
		if(b>0) {
			System.out.println("on");
		}
		else {
			System.out.println("off");
		}

}
}*/
/*class bitMp{
	public static void main(String [] args) {
		int n=17;
		int rmsbm=(n & -n);//right most set bit mask
		System.out.println (Integer.toBinaryString(rmsbm)+" "+rmsbm);
	}
}*/
// chech how much bit is on
//but this is not right approach
/*class bitMp{
	public static void main(String [] args) {
		int n=16;
		int count=0;
		for(int i=1;i<=32;i++) {
			int cmask=(1<<i);
			int b=(n&cmask);
			if(b>0) {
			  count++;	
			}
		}
		System.out.println(count);
	}
}*/

/*class bitMp{
	public static void main(String [] args) {
		int n=57;
		int count=0;
		while(n>0) {
			int rsbm=(n & -n);
			n=n-rsbm;
			count++;
		}
		System.out.println(count);
	}
}*/
// josephus problem 
// har alternate log ko mar diya jata hai
//formula n=2*p+l;
//return 2*l+1

/*class bitMp{
	public static void main(String [] args) {
		int n=10;
		int b=josephus(n);
		System.out.println(b);
	}
    public static int josephus(int n) {
	int hp2=highestpowerOf2(n);
	int l=n-hp2;
	return 2*l+1;
}
    public static int highestpowerOf2(int n) {
	int i=1;
	while(2*i<=n) {
		i*=2;
	}
	return i;
}
}*/
/*class bitMp{
	public static void main(String [] args) {
		int n=3;
		ArrayList<String> al=nBitGrayCode(n);
		for(String s : al) {
		  System.out.println(s);	
		}
	}
	public static ArrayList<String> nBitGrayCode(int n){
		if(n==1) {
			ArrayList<String> al=new ArrayList<>();
			al.add("0");
			al.add("1");
			return al;
		}
		ArrayList<String> tl=nBitGrayCode(n-1);
		ArrayList<String> mresult=new ArrayList<>();
		for(String s : tl) {
			mresult.add("0"+s);
		}
		for(int i=tl.size()-1;i>=0;i--) {
			String s=tl.get(i);
			mresult.add("1"+s);
		}
		return mresult;
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  HashMap<String ,Integer> hm=new HashMap<>();
	  for(int i=0;i<n;i++) {
		  String s=sc.next();
		  hm.put(s,i);
	  }
	  int np=sc.nextInt();
	  int people[]=new int[np];
	  for(int i=0;i<np;i++) {
		  int skils=sc.nextInt();
		  for(int j=0;j<skils;j++) {
			 String s=sc.next();
			 int num=hm.get(s);
			 people[i]= people[i] | (1<<num);
		  }
	  }
	  MinimumNumberOfDeveloper(0,people,n,new ArrayList<>(),0);
	  System.out.println(all);
	}
	static ArrayList<Integer> all=new ArrayList<>();
	public static void MinimumNumberOfDeveloper(int i,int p[],int n,ArrayList<Integer> al,int skilsm) {
	    if(i==p.length) {
	    	if(skilsm==((1<<n)-1)) {
	    		if(all.size()==0 || al.size()<all.size() ) {
	    			all=new ArrayList<>(al);
	    		}
	    	}
	    	return ;
	    }
		int nskilm=skilsm|p[i];
		al.add(i);
		MinimumNumberOfDeveloper(i+1,p,n,al,nskilm);
		al.remove(al.size()-1);
		MinimumNumberOfDeveloper(i+1,p,n,al,skilsm);
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
		String words="vishal";
		String pezzel="lishrav";
		int m1=0;
		int m2=0;
		for(int i=0;i<words.length();i++) {
			char c=words.charAt(i);
			int v=c-'a';
			m1=(m1 |(1<<v));
			
		}
		for(int i=0;i<pezzel.length();i++) {
			char c=pezzel.charAt(i);
			int v=c-'a';
			m2=(m2 |(1<<v));
			
		}
      char c=pezzel.charAt(0);
      int cv=c-'a';                      //for besic understanding
     
      int b=(m1 & (1<<cv));
      if(b>0) {
    	  
    	  if((m1 & m2 )==m1) {
    		  System.out.println("jhdsa");
    		  return ;
    	  }
      }
      System.out.println("ghghghghvbjsdagu");
	}
}*/
import java.io.*;
import java.util.*;

/*public class bitMp {

  public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
    HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
    for(int i=0;i<26;i++) {
    	hm.put(i, new ArrayList<>());
    }
    for(String s : words) {
    	int bitm=0;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		int cv=c-'a';
    		bitm=(bitm | (1<<cv));
    	}
    	HashSet<Character> hs=new HashSet<>();
    	for(char c : s.toCharArray()) {
    		if(hs.contains(c)==false) {
    			hs.add(c);
    		int cv=c-'a';
    		hm.get(cv).add(bitm);
    		}
    	}
    }
    ArrayList<Integer> result=new ArrayList<>();
    for(String s : puzzles) {
    	int pbitm=0;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		int cv=c-'a';
    		pbitm=(pbitm | (1<<cv));
    	}
    	char c=s.charAt(0);
    	int cv=c-'a';
    	ArrayList<Integer> mask=hm.get(cv);
    	int count=0;
    	for(int m : mask) {
    		if((m & pbitm)==m) {
    			count++;
    		}
    	}
    	result.add(count);
    	
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] words = new String[n];
    for (int i = 0 ; i < words.length; i++) {
      words[i] = scn.next();
    }
    int m = scn.nextInt();
    String[] puzzles = new String[m];
    for (int i = 0 ; i < m ; i++) {
      puzzles[i] = scn.next();
    }
    ArrayList<Integer> ans = findNumOfValidWords(words, puzzles);
    for (int i = 0 ; i < m ; i++) {
      System.out.println(puzzles[i] + " -> " + ans.get(i));
    }
  }

}*/
// find number which comes once;
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {2,7,8,3,8,3,2};
		int b=0;
		for(int i=0;i<a.length;i++) {
			b=b^a[i];
		}
		System.out.println(b);
	}
}*/
//trere are two number which come once
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {36,50,24,56,36,24,42,50};
		int u2=0;
		for(int i=0;i<a.length;i++) {
			u2=u2^a[i];
		}
		int rsbm=(u2 & -u2);
		int val1=0;
		int val2=0;
		for(int val : a) {
			if((rsbm & val)==0){
				val1=val1^val;
			}
			else {
				val2=val2^val;
			}
		}
		System.out.println(val1 +" "+ val2);
		
	}
}*/
//find missing and duplicate number
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {1,2,3,5,2,6,7};
		int xor=0;
		for(int v : a) {
			xor=xor^v;
		}
		for(int i=0;i<=a.length;i++) {
			xor=xor^i;
		}
		int rsbm=(xor & -xor);
		int x=0;int y=0;
		for(int v : a) {
			if((v & rsbm)==0) {
				x=x^v;
			}
			else {
				y=y^v;
			}
		}
		for(int i=0;i<=a.length;i++) {
			if((i & rsbm)==0) {
				x=x^i;
			}
			else {
				y=y^i;
			}
		}
    for(int v : a) {
    	if(v==x) {
    		System.out.println("reapiting nu  "+x);
    		System.out.println("missing nu    "+y);
    		break;
    	}
    	else if(v==y){
    		System.out.println("reapiting nu  "+y);
    		System.out.println("missing nu    "+x);
    		break;
    	}
    }
	}
}*/
//find triplate
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {1,2,3};
		int count=0;
		for(int i=0;i<a.length;i++) {
			int v=0;
			for(int k=i;k<a.length;k++) {
				v=v^a[k];
				if(v==0) {
				System.out.println(i+" "+k);
					count+=(k-i);
				}
				
			}
		}
		System.out.println(count);
	}
}*/
//brut force approach
/*class bitMp{
	public static void main(String [] args) {
		int n=123;
		int min=FindminTo1(n);
		System.out.println(min);
	}
	public static int FindminTo1(int n) {
		if(n==1) {
			return 0;
		}
		if(n%2==0) {
			int count=FindminTo1(n/2);
			count+=1;
			return count;
		}
		else {
			int c1=FindminTo1(n-1);
			int c2=FindminTo1(n+1);
			
			return Math.min(c1, c2)+1;
		}
	}
}*/
// brut force approach
/*class bitMp{
	public static void main(String [] args) {
		int n=12;
		int c=FindSameNumberOfBitSet(n);
		System.out.println(c);
	}
	public static int FindSameNumberOfBitSet(int n) {
		int count=0;
		int t=n;
		int rsbm=(n & -n);
		while(t>0) {
			t=t-rsbm;
			rsbm=(t & -t);
			count++;
		}
		int c=0;
		for(int i=1;i<n;i++) {
			int v=i;
			int rsbm1=(v & -v);
			int c1=0;
			while(v>0) {
				v=v-rsbm1;
				rsbm1=(v & -v);
				c1++;
			}
			if(c1==count) {
				c++;
				
			}
		}
		return c;
	}
	
}*/
/*class bitMp{
	public static void main(String [] args) {
		long n=12;
		int k=cbs(n);
	long c=FindSameNumberOfBitSet(n,k,63);
	System.out.println(c);
	}
	public static int cbs(long n) {
		int r=0;
		while(n>0) {
			long rbsm=(n & -n);
			n-=rbsm;
			r++;
		}
		return r;
	}
	public static long  FindSameNumberOfBitSet(long n,int k,int i) {
		if(i==0) {
			return 0;
		}
		long m=(1L<<i);
		long result=0;
		if((n & m)==0) {
			result=FindSameNumberOfBitSet(n,k,i-1);
		}
		else {
	       long res1=FindSameNumberOfBitSet(n,k-1,i-1);
	       long res0=ncr(i,k);
	       result=res1+res0;
		}
		return result;
	}
	public static long ncr(int i,int k) {
		if(i<k) {
			return 0;
		}
	  long res=1;
	  for(long j=0L;j<k;j++) {
		  res=res*(i-j);
		  res/=(j+1);
	  }
	  return res;
	}
}*/
// find xor of sum of all 2 pair
//brut force approach
/*class bitMp{
	
  public static void main(String [] args) {
	  int a[]= {1,2,3,4,5,6};
	  int xor=0;
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<a.length;j++) {
			xor=xor^(a[i]+a[j]);  
		  }
	  }
	  System.out.println(xor);
  }
}*/
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5,6};
		int xor=0;
		for(int i=0;i<a.length;i++) {
			xor=xor^(2*a[i]);
		}
		System.out.println(xor);
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
		String str="pep";
		for(int i=0;i<(1<<str.length());i++) {
			String s="";
			int c=0;
			for(int j=str.length()-1;j>=0;j--) {
				if((i & (1<<j))==0) {
					if(c>0) {
						s+=c;
						c=0;
					s+=str.charAt(str.length()-1-j);
					}
					else {
						s+=str.charAt(str.length()-1-j);
					}
				}
				else {
					c++;
				}
			}
			if(c>0) {
			System.out.println(s+c);
			}
			else {
				System.out.println(s);
			}
		}
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {1,2,3,4};
	boolean	b=isarrAUTF8incoding(a);
	System.out.println(b);
	}
	public static boolean isarrAUTF8incoding(int a[]) {
		int rofb=0;
		for(int v : a) {
			if(rofb==0) {
				if((v>>7)==0b0) {
					rofb=0;
				}
				else if((v>>5)==0b110) {
					rofb=1;
				}
				else if((v>>4)==0b1110) {
					rofb=2;
				}
				else if((v>>3)==0b11110){
					rofb=3;
				}
			}
			else {
				if((v>>6)==0b10) {
					rofb--;
				}
				else {
					return false;
				}
			}
		}
		if(rofb==0) {
			return true ;
		}
		else {
			return false;
		}
	}
}*/
/*
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0
 */
/*import java.util.*;

public class bitMp {

  public static void display(int[][] arr){
    for (int ii = 0; ii < arr.length; ii++) {
      for (int jj = 0; jj < arr.length; jj++) {
        System.out.print(arr[ii][jj] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void solveSudoku(int[][] arr, int[] rows, int[] cols, int[][] grid, int i, int j) {
	  if(i==arr.length) {
		  
		  display(arr);
		  return ;
	  }
    int ni=0;
    int nj=0;
    if(j==arr.length-1) {
    	ni=i+1;
    	nj=0;
    }
    else {
    	ni=i;
    	nj=j+1;
    }
    if(arr[i][j]!=0) {
    
    	solveSudoku(arr,rows,cols,grid,ni,nj);
    }
    else {
    for(int k=1;k<10;k++) {
    	if((rows[i] &(1<<k))==0 && (cols[j] & (1<<k))==0 && (grid[i/3][j/3] & (1<<k))==0) {
    		arr[i][j]=k;
    		rows[i] ^=(1<<k);
    		cols[j] ^=(1<<k);
    		grid[i/3][j/3] ^=(1<<k);
    		solveSudoku(arr,rows,cols,grid,ni,nj);
    		arr[i][j]=k;
    		rows[i] ^=(1<<k);
    		cols[j] ^=(1<<k);
    		grid[i/3][j/3] ^=(1<<k);
    		arr[i][j]=0;
    	}
    }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    int[] rows = new int[9];
    int[] cols = new int[9];
    int[][] grid = new int[3][3];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        int digit = scn.nextInt();
        arr[i][j] = digit;
        rows[i] |= (1 << digit);
        cols[j] |= (1 << digit);
        grid[i / 3][j / 3] |= (1 << digit);
      }
    }

    solveSudoku(arr, rows, cols, grid, 0, 0);
  }

}*/
// all number occurs trice and one once find num which occurs once
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {1,2,1,2,1,2,3};
		int n=0;
		for(int i=0;i<32;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
			  if((a[j] & (1<<i))>0) {
				  c++;
			  }
			}
			if(c%3!=0) {
				n |= (1<<i);
			}
		}
		System.out.println(n);
	}
}*/
//all number occurs trice and one once find num which occurs once
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {1,2,1,2,1,2,3,3,3,5,5,5,4,4,4,6};
      int n3=Integer.MAX_VALUE;
      int n3p1=0;
      int n3p2=0;
      for(int i=0;i<a.length;i++){
    	int c3=(n3 & a[i]);
    	int c3p1=(n3p1 & a[i]);
    	int c3p2=(n3p2 & a[i]);
    	n3 =n3 & (~c3);
    	n3p1=n3p1 | c3;
    	n3p1 =n3p1 ^ c3p1;
    	n3p2=n3p2 | c3p1;
    	n3p2 =n3p2 ^ c3p2;
    	n3=n3 | c3p2;
    	
      }
      System.out.println(n3p1);
	}
}*/
// how many min bit fli so that a become b and b become a
/*class bitMp{
	public static void main(String [] args) {
		int a=2;
		int b=3;
		int x=a^b;
		int c=0;
	 while(x >0) {
		 int rsbm=(x & -x);
		 x=x-rsbm;
		 c++;
	 }
	 System.out.println(c);
	}
}*/
//copy bit set in range
/*class bitMp{
	public static void main(String [] args) {
		int a=10;
		int b=16;
		int i=1;
		int j=3;
	int m=(1<<(j-i+1));
        m=m-1;
	    m=m<<i;
	    int m1=a&m;
	    int copy=b|m1;
	    System.out.println(copy);
	}
}*/
// is number is power of 2 or not
//2 power n int the form of 100000
//n-1 =011111;
//n & n-1 ==000000;

/*class bitMp{
	public static void main(String [] args) {
		int n=641;
		if((n & (n-1))==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}*/
//divide two int without / ope
// 7n/8 form
/*class bitMp{
	public static void main(String [] args) {
		int n=13;
	System.out.println(((n<<3)-n)>>3);	
	}
}*/
// swap all odd and even bits
/*class bitMp{
	public static void main(String [] args) {
		int n=15;
		int m1=0xAAAAAAAA;
		int even=n& m1;
		int m2=0x55555555;
		int odd=m2&n;
		int swaped=(even>>1)|(odd<<1);
		System.out.println(swaped);
	}
}*/
//sum of bit differance among all pair
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {12,13,14,15};
		long d=count(a);
		System.out.println(d);
	}
	public static long count(int a[]) {
		long res=0;
		for(int i=0;i<32;i++) {
			long c0=0;
			long c1=0;
			for(int j=0;j<a.length;j++) {
				if((a[j] & (1<<i))==0) {
					c0++;
				}
				else {
					c1++;
				}
			}
			res+=c0*c1*2;
		}
		return res;
	}
}*/
//check binary string is divisible by 3 or not
/*class bitMp{
	public static void main(String [] args) {
		//String str="1111110000111";
		String str=Integer.toBinaryString(18000);
		System.out.println(str);
		int odd=0;
		int even=0;
		for(int i=0;i<str.length();i++) {
			int b=str.charAt(i)-'0';
			if(i%2==0) {
				even+=b;
			}
			else {
				odd+=b;
			}
		}


		int delta=even-odd;
		if(delta%11==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}*/
//count set bits in first N natural number
/*class bitMp{
	public static void main(String [] args) {
		int n=20;
		int c=countbit(n);
		System.out.println(c);
	}
	public static int countbit(int n) {
		if(n==0) {
			return 0;
		}
	int x=Largestpowerof2(n);
	int btp2x=x*(1<<(x-1));
	int bomsbton=n-(1<<x)+1;
	int rest=n-(1<<x);
	int ans=btp2x+bomsbton+countbit(rest);
	return ans;
	}
	public static int Largestpowerof2(int n) {
		int r=0;
		while((1<<r)<=n) {
			r++;
		}
		return r-1;
	}
}*/
//reverse bits
/*class bitMp{
	public static void main(String [] args) {
		int n=11;
		int fo=0;
		for(int i=31;i>=0;i--) {
			int mask=(1<<i);
			if((n&mask)>0) {
				fo=i;
				break;
			}
		}
		int rn=0;
		for(int i=fo;i>=0;i--) {
			int mask=(1<<i);
			if((n&mask)>0) {
				System.out.print(1);
				int rmask=(1<<(fo-i));
				rn=rn|rmask;
			}
			else {
				System.out.print(0);
			}
		}
		System.out.println();
		System.out.println(rn);
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {4,2,0,5,7};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
			int xor=a[i]^a[j];
			System.out.println(xor+" "+a[i]+" "+a[j]);
			  if(xor<min) {
				  min=xor;
			  }
			}
		}
		System.out.println(min);
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
			int xor=a[i]^a[j];
			if(xor==min) {
				System.out.println(a[i]+" "+a[j]);
			}
			}
		}
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
		int a[]= {4,2,0,5,7};
		ArrayList<String> al=minxorpair(a);
		for(String s : al) {
			System.out.println(s);
		}
	}
	public static ArrayList<String> minxorpair(int a[]){
		ArrayList<String> al=new ArrayList<>();
		Arrays.sort(a);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++) {
			int xor=a[i]^a[i+1];
			
			if(xor<min) {
				al=new ArrayList<>();
				al.add(a[i]+" "+a[i+1]);
				min=xor;
			}
			else if(xor==min) {
				al.add(a[i]+" "+a[i+1]);
			}
		}
		return al;
	}
}*/
/*class bitMp{
	public static void main(String [] args) {
		int n=17;
		int b=NthPalandromicBinary(n);
		System.out.println(b);
	}
	public static int NthPalandromicBinary(int n) {
		int l=1;int c=1;
		while(c<n) {
			l++;
			c+=(1<<(l-1)/2);
		}
		c-=(1<<(l-1)/2);
		int ofset=n-c-1;
		
		int ans=(1<<(l-1));
		  ofset=(ofset<<(l/2));
		  ans|=ofset;
		  
		  int var=(ans>>l/2);
		  int rev=getrev(var);
		  ans|=rev;
		  return ans;
	}
	public static int getrev(int var) {
		int r=0;
		while(var!=0) {
			int lb=(1&var);
			r|=lb;
			r<<=1;
			var>>=1;
		}
		r>>=1;
		return r;
	}
}*/





















































































































































































































































































































