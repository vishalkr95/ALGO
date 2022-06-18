import java.util.Scanner;

/*public class jj{
public static void main(String [] args){
  if(args.length==0){
     System.out.println("NO VALUE");
   }
  else{
      for(int i=0;i<args.length-1;i++){
         System.out.print(args[i]+",");
    }
      System.out.println(args[args.length-1]);
   }
 }
}*/
/*class jj{
	public static void main(String [] args){
		int sp=3;
		int st=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*");
			}
			System.out.println();
			sp--;
			st+=2;
		}
	}
}*/
/*class jj{
	static boolean is_k_palin(String str, int k)
	    {
		   int l=h(str,0,str.length()-1);
		   return str.length()-l<=k?true:false ;
	    }
	    public static int h(String s,int i,int j){
	        if(i>j){
	            return 0;
	        }
	        if(i==j){
	            return 1;
	        }
	        if(s.charAt(i)==s.charAt(j)){
	            return 2+h(s,i+1,j-1);
	        }
	        else{
	            return Math.max(h(s,i+1,j),h(s,i,j-1));
	        }
	    }
	public static void  main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		System.out.println(is_k_palin(s,k));
	}
}*/
/*class jj{
	public static void main(String [] args) {
		int n=13;
		int sp=n/2;
		int isp=-1;
		int osp=n/2;
		for(int i=0;i<n;i++) {
			if(i==n/2) {
			   for(int j=0;j<2*n;j++) {
				   System.out.print("*"); 
			   }
			   isp--;
			   sp++;
			   osp++;
			   System.out.println();
			}
			else {
				for(int j=0;j<sp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				for(int j=0;j<osp;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<sp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				if(i<n/2) {
					isp++;
					sp--;
					osp--;
				}
				else {
					isp--;
					sp++;
					osp++;
				}
				System.out.println();
				
			}
		}
		n=13;
		sp=n/2;
	    isp=-1;
	    osp=n/2;
		for(int i=0;i<n;i++) {
			if(i==n/2) {
			   for(int j=0;j<2*n;j++) {
				   System.out.print("*"); 
			   }
			   isp--;
			   sp++;
			   osp++;
			   System.out.println();
			}
			else {
				for(int j=0;j<sp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				for(int j=0;j<osp;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<sp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0;j<isp;j++) {
					System.out.print(" ");
				}
				if(i!=0 && i!=n-1) {
					System.out.print("*");
				}
				if(i<n/2) {
					isp++;
					sp--;
					osp--;
				}
				else {
					isp--;
					sp++;
					osp++;
				}
				System.out.println();
				
			}
		}
	}
}
*/
import java.util.*;
/*class jj{
	public static void main(String [] args) {
		String s="session";
		HashSet<Character> hs=new HashSet<>();
		
//		hs.add('v');
//		hs.add('v');
//		System.out.print(hs);
//		int l=(int)Math.log1p(4);
//	    System.out.println(l);
		int result = (int)(Math.log(8) / Math.log(2));
		System.out.println(result);
		
	}
}*/
/*class jj{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				int c=0;
				for(int j=0;j<=i;j++) {
					System.out.print(c);
					if(c==1) {
						c--;
					}
					else {
						c++;
					}
				}
				System.out.println();
			}
			else {
				int c=1;
				for(int j=0;j<=i;j++) {
					System.out.print(c+" ");
					if(c==1) {
						c--;
					}
					else {
						c++;
					}
				}
				System.out.println();
			}
		}
	}
}*/
/*class jj{
	public static void main(String [] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	  int a[]=new int[n];
	  HashMap<Integer,Integer> hm=new HashMap<>();
	   for(int i=0;i<n;i++) {
		   a[i]=sc.nextInt();
		   hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	   }
	  for(int i=0;i<n;i++) {
		  int f=hm.getOrDefault(a[i],0);
		  if(f>1) {
			 System.out.println(a[i]+" "+f);
			 hm.remove(a[i]);
			 
		  }
	  }
	}
}*/
class jj{
	public static void main(String [] args) {
		int n=11;
		int m=99;
		int i=2;
		
		while(i*i<=n && i*i<=m ) {
			while(n%i==0 && m%i==0) {
				n/=i;
				m/=i;
			}
			i++;
		}
		System.out.println(n);
		System.out.println(m);
	}
}






































