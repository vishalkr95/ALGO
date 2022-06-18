import java.util.*;

/*class ttt{
	public static void main(String [] args) {
		int a[]= {1,1,0,1,0,0};
		int move=sort(a);
		System.out.println(move);
		System.out.println(Arrays.toString(a));
	}
	public static int sort(int a[]) {
		
		int move=partition(a,0);
		return move;
	}
	public static int partition(int a[],int p) {
		int move=0;
		int i=0;
		int j=0;
		while(i<a.length) {
			if(a[i]>p) {
				
				i++;
			}
			else {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j++;
				move++;
			}
		}
		return move;
	}
}*/
/*class ttt{
public static void main(String [] args) {
	int a[]= {1,1,0,1,0,0};
	int move=0;
	int k=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==1) {
			k++;
			continue;
		}
		else {
			break;
		}
		}
	for(int j=k+1;j<a.length;j++) {
		if(a[j]==1) {
			move++;
		}
	}
	System.out.println(move);
}
}*/
/*class ttt{
	public static void main(String [] args) {
		int a[]= {3,11,16,5,13};
		b=new boolean[a.length];
		checmaxpair(a,0,0);
	}
	static boolean b[];
	public static void checmaxpair(int []a,int i,int tp) {
		if(i==a.length-1) {
		System.out.println(tp);
			return ;
		}
		int p=0;
		for(int j=0;j<a.length;j++) {
			if(i==j) {
				continue;
			}
			else {
				
				if(b[i]==false && b[j]==false) {
					if(isvailedpair(a[i],a[j])) {
						System.out.println(a[i]+" "+a[j]);
						b[i]=true;
						b[j]=true;
						p++;
					}
				}
			}
		}
		System.out.println(p);
		checmaxpair(a,i+1,tp+p);
		
	}
	public static boolean isvailedpair(int p1,int p2) {
		int n=p1+p2;
		return (int)Math.floor((Math.log(n)/Math.log(2)))==(int)Math.ceil((Math.log(n)/Math.log(2)));
			
			}
}*/
/*class ttt{
	public static void main(String [] args) {
		int a[]= {1,1,0,1,1,1,0,0,0,1,1,1,0,1,1,1,0};
		int i=0;
		int j=a.length-1;
		int count=0;
		while(i!=j) {
			while(i!=j && a[i]!=0) {
				i++;
			}
			while(i!=j&&a[j]!=1) {
				j--;
			}
			if(i<j && a[i]==0 && a[j]==1) {
				int t=a[i];
			     a[i]=a[j];
			     a[j]=t;
			   count++;  
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(count);
	}
}*/
/*class ttt{
	public static void main(String [] args) {
		int a[]= {1,2,4,7};
		maxxor(a,0,0,0);
		System.out.println(max);
	}
	static int max=0;
	public static void maxxor(int a[],int i,int s,int x) {
		if(i==a.length) {
			if(s<=(a.length)/2 && x>max) {
				
				max=x;
			}
			return ;
		}
		maxxor(a,i+1,s,x);
		x=x^a[i];
		maxxor(a,i+1,s+1,x);
		x=x^a[i];
	}
}*/

import java.util.Scanner;
/*public class ttt {
 public static void main(String [] args) {
  Scanner sc = new Scanner(System.in);
  String instr = sc.nextLine();
  char chnum[] =instr.toCharArray();
  int sum=0;
  for(int i=0;i<chnum.length-1;i++){
  
    if(instr.charAt(i)>=48 && instr.charAt(i)<=57 && instr.charAt(i+1)==' ') {
     int a = Integer.parseInt(String.valueOf(chnum[i]));
     sum=sum+a;
     }
  }
  if(sum==0) {

   System.out.println(-1);
   System.exit(0);
  }
  if(chnum[chnum.length-1]>=48 && chnum[chnum.length-1]<=57 ) {
    int b=Integer.parseInt(String.valueOf(chnum[chnum.length-1]));
    sum=sum+b;
  }
   System.out.println("Sum="+sum);
  
   for(int d=2;d<sum;d++) {
    if(sum%d==0) { 
     break;
    }
    else {
     System.out.println(sum);
     System.exit(0);
    }
   }
   String sum1=String.valueOf(sum);
   char ch [] = sum1.toCharArray();
   int i=0;
   int j=ch.length-1;
   while(i<j) {
    char temp = ch[i];
    ch[i]=ch[j];
    ch[j]=temp;
    i++;
    j--;
   }
   int sumfinal  = Integer.parseInt(String.valueOf(ch));
   //System.out.println("Reverse:"+sumfinal);
   for(int d=2;d<sumfinal;d++) {
    if(sumfinal%d==0) { 
     break;
    }
    
   }
   int count=0;
    for(i=1;i<=sumfinal;i++)
          {
              if(sumfinal%i==0)
              count++; 
          }
    System.out.println(count);
 } 
 
 }*/
/*import java.util.*;
class ttt{
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String str[]=s.split(",");
	int a[]=new int[str.length];
	for(int i=0;i<str.length;i++) {
		a[i]=Integer.parseInt(str[i]);
	}
	int sum=0;
	for(int i=0;i<a.length;i++) {
		int v=a[i];
		if(itcontains6(v)) {
			v=replaceby9(v);
			int rev=reverse(v);
			
			
			a[i]=rev;
		}
		sum+=a[i];
	}
	double ave=sum*1.0/a.length*1.0;
	
	ave=(Math.round(ave*100.0))/100.0;
	System.out.println(ave);
	}
	public static boolean itcontains6(int v) {
		while(v>0) {
			int r=v%10;
			v=v/10;
			if(r==6) {
				return true;
			}
		}
		return false;
	}
	public static int replaceby9(int v) {
		String str=v+"";
		str=str.replaceAll("6","9");
		int val=Integer.parseInt(str);
		return val;
	}
	public static int reverse(int v) {
		int l=0;
		int d=v;
		while(d>0) {
			d=d/10;
			l++;
		}
		int rv=0;
		while(v>0) {
			int r=v%10;
			v=v/10;
			rv+=r*Math.pow(10, l-1);
			l--;
		}
		return rv;
	}
}*/
/*class ttt{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
       str1=str1.replaceAll(",","");
       String str2=sc.nextLine();
        String arr[]=str2.split(",");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        generateAll(str1,"",str1.length());
        ArrayList<String> nal=arrangestr(al,s1,s2,arr);
        System.out.println(nal);
       
	}
	static ArrayList<String> al=new ArrayList<>();
	public static void generateAll(String str,String ans,int l){
		
		if(l==ans.length()) {
			
			al.add(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			String ls=str.substring(0,i);
			String rs=str.substring(i+1);
			generateAll(ls+rs,ans+c,l);
		}
	}
	public static ArrayList<String> arrangestr(ArrayList<String> al,String s1,String s2,String []str) {
		ArrayList<String> nal=new ArrayList<>();
		for(int i=0;i<str.length;i++) {
			char c=str[i].charAt(0);
		   for(int j=0;j<al.size();j++) {
			  String s=al.get(j);
			  char ch=s.charAt(0);
			  char ch1=s1.charAt(0);
			  char ch2=s2.charAt(0);
			  if(ch==c) {
				  nal.add(s);
			  }
			  else if(ch1==c) {
				  nal.add(s1);
			  }
			  else if(ch2==c) {
				  nal.add(s2);
			  }
		   }
		}
		return nal;
	}
}*/
/*class ttt{
	public static void main(String [] args) {
		System.out.println((char)('a'+1));
		String s="vishalvisah";
		System.out.print(s.replaceAll("a", "b"));
	}
}*/

class ttt{
	public static void main(String [] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		int a[]= {100,100,50,40,20,10};
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}




















































