

/*import java.util.Arrays;

/*class v extends test {
	
	public void print(int t) {
		if(t>5)
			return;
		System.out.println("new test");
		super.print(0);
		t++;
		print(t);
	}
	public static void main(String[] args) {
		int t=0;
		v a=new v();
		a.print(t);
	}
	
}*/
/*public class v{
	public static void  main(String [] args) {
		int s=50000;
		int h=s/3600;
		s=s%3600;
		int m=s/60;
		s=s%60;
		System.out.print(h+":"+m+":"+s);
	}
	
}*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int x = in.nextInt(); 

		System.out.println(result(x));
	 } 		
	public static int result(int num) {	
		int ctr = 0;
        for(int i=1; i<=num/2; i++) {
            if(num%i==0 ) {
                ctr++;
            }
        }
        return ctr+1;
	}
 }*/
/*import java.util.*;
public class v{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter string");
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	String v="";
	for(int i=0;i<s1.length;i++) {
		String w=s1[i];
		v +=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
		
			}
	
	System.out.println(v.trim());
	}
}*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String upper_case_line = ""; 
       Scanner lineScan = new Scanner(line); 
         while(lineScan.hasNext()) {
             String word = lineScan.next(); 
             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
         }
      System.out.println(upper_case_line); 
    }
}*/
/*import java.util.*;
public class v{
	public static void main(String[] args) {
		System.out.print("enter two number");
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a<25 || b>75)
		System.out.print(false);
	int p=a%10;
	int q=b%10;
	a=a/10;
	b=b/10;
	if(a==b || p==b || a==q || p==b)
		System.out.print(true);
	
	}
}*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 System.out.print("en");
	 int a=in.nextInt();
	 int b=in.nextInt();
	 while(b>=a) {
		 b=b-a;
	 }
	 System.out.print(b);
     }
     
 }*/
/* import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 int a=100;
	 int s=1;
	 for(int i=2;i<100;i++) {
		 int q=chech(i);
		 s=s+q;
	    }
	 System.out.print(s);
}
   static  int chech(int i) {
	   for(int j=2;j<=i;j++) {
		   if(i%j==0)
			   return 0;
	   }
	   return i;
    	 
     }
  }
*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 int c=0,s=0,j=1;
	 while(c<100) {
	 j++;
		 int f=0;
	 
	 for(int i=2;i<j;i++) {
		 if(j%i==0)
		 { 
		   f=1;
		 break;}
		 }
	 if(f==0) {
	 s +=j;
	   
	 c++;
	 }
	
	 }
	 System.out.print(s+"\n"); 
     }
     
 }*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 String s="hello my name is vishal kumar";
	 
	 String s1[]=s.split(" ");
	 Arrays l1=new Arrays(s1);
	 String w="     ";
	int l=s1.length;
	for(int i=l-1;i<=l/2;i++) {
		
		s1[i+1]=s1[i];
	}
	s1[l/2]=w;
	System.out.print(Arrays.toString(s1));
 }
     }*/

/*import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 String s="vishal";
	 String s1="kumar";
	 String s2=s1.substring(1);
	 String s3=s.substring(1);
	 System.out.print(s3+s2);
			 
     }
     
 }*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 int a[]= {4,5,6,7,8,9,3};
	 int l=a.length;
	 for(int i=0;i<a.length/2;i++) {
		 int t=a[i];
		 a[i]=a[l-1-i];
		 a[l-1-i]=t;
	 }
	 for(int i=0;i<a.length;i++) {
	 System.out.print(a[i]+" , ");}
	 System.out.print(Arrays.toString(a));
     }
     
 }*//*import java.util.*;
 public class v {
     public static void main(String[] args){
    	int a[]= {1,2,3,4}; 
    	int b[]= {5,6,7,8};
    	int c[] = new int[4];
    	ArrayList l=new ArrayList();
    	int k=0;
    	for(int i=0;i<a.length;i++) {
    	l.add(a[i]*b[i]);	
    	}
    	System.out.print(l); 
     }
     
 }*/
/* import java.util.*;
 public class v {
     public static void main(String[] args){
    	int n=49;
    	int count=0;
    	while(n!=1) {
    		if(n%2==0) {
    			n=n/2;
    			count++;
    		}
    		else {
    			n=n*3+1;
    			count++;
    		}
    	}
    	System.out.print(count);

    	System.out.print(System.getSecurityManager());
    	 
     }
     
 }*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
    	 
    int []a= {2,1,4,5,6,7,5,7,5,0};
    int l=0;
    for(int i=0;i<a.length;i++) {
    if(a[i]%2!=0) {
    	int t=a[l];
    	a[l]=a[i];
    	a[i]=t;
    	l++;
    }
  }
    int i=0;
    while(a[i]%2!=0) {
    i++;
    }
    System.out.print(i);
    for(int j=0;j<i;j++) {
    	for(int k=0;k<i;k++) {
    		if(a[j]<a[k]) {
    			int t=a[j];
    			a[j]=a[k];
    			a[k]=t;
    		}
    	}
    }
    for(int j=i;j<a.length;j++) {
    	for(int k=i;k<a.length;k++) {
    		if(a[j]<a[k]) {
    			int t=a[j];
    			a[j]=a[k];
    			a[k]=t;
    		}}}
    
    System.out.print(Arrays.toString(a)); 
     }
     
 }*/


/*import java.util.*; 
import java.io.*; 
 public class v {
 public static void main(String[] args)
 {
	  //int[] array_nums = {10, 20, 10, 50, 20, 13, 50};
	int[] array_nums = {11, 10, 50, 50, 5, 13, 10};
      boolean testd = false;
	  int result=0;
	  int x = 10;
	      
	for(int i = 0; i < array_nums.length - 1; i++) {
        if(array_nums[i] == x && array_nums[i+1] == x)
            {
         System.out.printf( String.valueOf(true));	
         result = 1 ;
		}
                  
        if( array_nums[i] == x && array_nums[i+2] == x)
           {
         System.out.printf( String.valueOf(true));	
         result = 1 ;
		}
    }
	
	 if (result==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		System.out.printf("\n");
    }
}*/

/*import java.util.*;
 public class v {
     public static void main(String[] args){
    	 
    int []a= {2,6,3,5,2,2,7,5,0};
    int count=0,r=0;
    for(int i=0;i<a.length;i++) {
    	if(a[i]==2) {
    		count++;
    		r=1;
    	}
    }
    if(count==3) {
    	for(int i=0;i<a.length;i++) {
    		if(a[i]==2 && a[i+1]==2) {
    			r=0;
    		}
    		
    	}
    }
    if(r==1)
     System.out.print(true);
    if(r==0)
        System.out.print(false);  
     }
     
 }*/
/*import java.util.*;
 public class v {
     public static void main(String[] args){
    	 
    int []a= {1,2,3,4,5,6};
    int i=0;
    while(i<2) {
    	int t=a[0];
    	for(int j=1;j<a.length;j++) {
    		a[j-1]=a[j];
    	}
    	a[a.length-1]=t;
    	i++;
    }
    System.out.print(Arrays.toString(a));
     }
     
 }*/

/*import java.util.*;
 public class v {
     public static void main(String[] args){
    	 
    int n=23456789;
    int b=someof(n);
    while(b>9) {
    	b=someof(b);
    }
    
    System.out.print(b);
     }
     
  static int someof(int a) {
	  int s=0;
    while(a>0) {
     int t=a%10;
    	a=a/10;
        s=s+t;
    }
    	return s;  
     }
     
 }*/
/*import java.util.Scanner;
public class v {
     public static void main(String[] arg) {	
        Scanner in = new Scanner(System.in);	
       System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 
		if (n>0)
		{
           System.out.print("The single digit number is: "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
		}
		System.out.println("\n");  
    }
}*/


/*import java.util.*;
public class v {
     public static void main(String[] arg) 
	 {
        int array1[]=new int[8];
       array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
       int[] array2 = {2,5,7,8};
        System.out.println("\nArray1: "+Arrays.toString(array1));  
	    System.out.println("\nArray2: "+Arrays.toString(array2));
		int m =4, n=4;
		int i = m-1, j = n-1, index = m + n - 1;
       
        while (i >= 0) {
            array1[index--] = array1[i--];
        }
        while (j >= 0) {
            array1[index--] = array2[j--];
        }
        
           Arrays.sort(array1);
    	System.out.println("\nMerged array: "+Arrays.toString(array1));  
	}
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    	 
    	class node{
    		int data;
    		node next;
    		public node(int v) {
    			data=v;
    		}
    		public node() {}
    		
    		}
    	node head=new node(5);
    	 head.next=new node(6);
    	 head.next.next=new node(7);
    	 head.next.next.next=new node(8);
    	 head.next.next.next.next=new node(9);
    	 node pre=null;
    	 while(head!=null) {
			
        head=head.next.next;
        head.next=pre;
        pre=head;
        head=head.next;
		}
    	 while(head!=null) {
		System.out.print("->"+ head.data);
		head=head.next;
		
		}
    	
   
    	 while(head!=null) {
    			System.out.print("->"+ head.data);
    			head=head.next;}
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    	 int a[]= {-5,-1,-5,7,-7,-4};
    	 int s=Integer.MAX_VALUE;
    	
    	 int s1=0;
        for(int i=0;i<a.length;i++) {
        	s1=s1+a[i];
        	if(s1>0) {
        		s1=0;
        	}
        	if(s1<s) {
        		s=s1;
        	}
        }
        System.out.print(s);
     }}*/
   /* import java.util.*;
public class v {
     public static void main(String[] arg) {
    	int a[]= {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
    int t;
    for(int i=0;i<a.length;i++) {
    	t=1;
    	for(int j=0;j<a.length;j++) {
    		if(i==j){
    			continue;
    		}
    		else {
    	if(a[i]==a[j]) {
    		t=0;
    	}
    	else {
    	
    	}
    }}
    	 
     }
    if(t==)
    }
     
}*/
/*public class v{
	static class node{
		int data;
		node left,right;
     public node(int v) {
    	 data=v;
     }
     }
	public static node creattree(int a[]) {
		if(a.length==0)
			return null;
		return bst(a,0,a.length-1);
	}
	public static node bst(int a[], int left,int right) {
		int mid=left +(right-left)/2;
		 node root=new node(a[mid]);
		root.left=bst(a,0,mid-1);
		root.right=bst(a,mid+1,right);
		return root;
	}
	public static void traversal(node root) {
		if(root==null)
			return;
		System.out.print(root.data+">");
		traversal(root.left);
		traversal(root.right);
		
	}
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5,6,7};
		node root=creattree(a);
		traversal(root);
	}
	
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("en");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	for(int i=a;i>0;i--) {
    		if(a%i==0 && b%i==0) {
    			System.out.print(i);
    			break;
    		}
    	}
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    	int a=20;int count=0;
    	int b[]=new int[20];int i=0;
    	while(a>0) {
    		b[i++]=a%2;
    		System.out.print(a%2);
    		if(a%2==0) {
    			count++;
    		}
    		a=a/2;
    		
    		
    	}
    	
    	System.out.println(Arrays.toString(b));
    	System.out.print(count); 
     }
     
}*/

/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    	int a=20;int count=0;
    	String str=Integer.toBinaryString(a);
    	System.out.print(str);
    	for(char c :  str.toCharArray()) {
    		if(c=='0') {
    			count++;
    		}
    	}
    	System.out.print("\n"+count);
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    int a[]= {-2,4,-5,-6,1,9,4};
    int n=Math.abs(-4);
    for(int i=0;i<a.length;i++)
    	for(int j=i;j<a.length;j++) {
    		if(a[i]<=a[j]) {
    			int t=a[i];
    			a[i]=a[j];
    			a[j]=t;
    		}
    		}
    System.out.print(Arrays.toString(a));
    System.out.print(n);
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
     int a[]= {4,1,2,5,7,8,9};
     int n[]= {3,6,9};
     int count;
     for(int i=0;i<n.length;i++) {
    	 count=0;
    	 for(int j=0;j<a.length;j++) {
    		 if(n[i]>a[j])
    			 count++;
    	 }
    	 System.out.println(count);
     }
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
     int a[]= {4,1,2,5,7,8,9};
     String str=Arrays.toString(a);
     int b=Integer.parseInt(str);
     b=b+1;
     str=Integer.toString(b);
     char c[];
     c=str.toCharArray();
     System.out.print(Arrays.toString(c));
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    String s1="vishal is a good boy";
    String s2="vishal is a normal student";
    String s3[]=s1.split(" ");
    String s4[]=s2.split(" ");
    int f;
    for(int i=0;i<s3.length;i++) {
    f=0;
    for(int j=0;j<s4.length;j++) {
    	if(s3[i].equals(s4[j])) {
    		f=1;
    	}
     }
    if(f==0) {
    	System.out.print("\n"+s3[i]);	
    	}
    }
     }
     
}*/
/*import java.util.*;
public class v {
     public static void main(String[] arg) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("en");
    	float a=sc.nextFloat();
    	float s=0;
    	if(a<250000) {
    		s=0;
    	}
    	if(a>250000 && a<=500000) {
    		s=a*5/100;
    	}
    	if(a>500000 && a<=1000000) {
    		s=a*10/100;
    	}
    	if(a>1000000 && a<=2000000) {
    		s=a*20/100;
    	}
    	
    	System.out.print(s);
    	
    	 
     }
     
}*/
/*import java.io.*;
import java.util.*;

public class v {

   public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print(" en");
        String A=sc.next();
        String B=sc.next();
       
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else
        { System.out.println("No");}
       
           char c=A.charAt(0);
           String s= Character.toString(c);
          s=s.toUpperCase();
          char c1=B.charAt(0);
          String s1= Character.toString(c1);
          s1=s1.toUpperCase();
          System.out.print(s + A.substring(1)+" "+ s1+B.substring(1));
    }
}*/
/*import java.io.*;
import java.util.*;

public class v {

   public static void main(String[] args) {
    int a=14;
    for(int i=0;i<a/2;i++) {
    	for(int j=0;j<a/2;j++) {
    		if(i*i+j*j==a) {
    			System.out.print(i*i+j*j==a);
    			System.out.print(i +" "+j);
    			break;
    		}
    		else
    		{	System.out.print(false);
    		break;}
    	}
    }
     }
     
}*/

/*import java.io.*;
import java.util.*;

public class v {

   public static void main(String[] args) {
   String str="visal123";
   char c[]=str.toCharArray();
   for(int i=0;i<c.length;i++)
	   for(int j=i;j<c.length;j++)
   {
	   if(c[i]>c[j]) {
		 char t=c[i];
		 c[i]=c[j];
		 c[j]=t;
	   }
   }
   int sum=0;
   for(int i=0;i<c.length;i++) {
	   char c1=c[i];
	   if(Character.isDigit(c1))
	 {
		   
		   System.out.println(c1);
		   sum=sum+(c1-'0'); 
		   
	 }
   }
   
   System.out.print(sum);
   System.out.println();
  StringBuffer s=new StringBuffer();
  for(int i=0;i<c.length;i++) {
	  
	  s.append(c[i]);
  }
  // System.out.print(Arrays.toString(c));
  System.out.println();
   System.out.print(s);
   System.out.println();
	
   }
   
}*/
/*import java.util.Scanner;
public class v {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
}*/
/*public class v{
    public static void main(String[] args) {
        int in1 = -3;
		int in2 = 3;
		System.out.println("Signed integers: " + in1 + ", " + in2);
		System.out.println("-----------------------------------------");
		int compare_Signed_num = Integer.compare(in1, in2);
		System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
		int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
    }
}*/
/*import java.util.*;
public class v{
    public static void main(String[] args) {
    System.out.println("enter two number");
    Scanner sc= new Scanner(System.in);
    float f1=sc.nextFloat();
    f1=Math.round(f1*1000);
    f1=f1/1000;
    float f2=sc.nextFloat();
    f2=Math.round(f2*1000);
    f2=f2/1000;
    if(f1==f2) {
    	System.out.println(true);
    }
    else
    	System.out.println(false);
    
    }
    
    
}*/
/*import java.math.BigInteger;
public class v {
    public static void main(String[] args) {
        BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("\nBigInteger value: "+bigval);
		long val_Long = bigval.longValue();
		System.out.println("\nConvert the said BigInteger to an long value: "+val_Long);
        int val_Int = bigval.intValue();
		System.out.println("\nConvert the said BigInteger to an int value: "+val_Int);
        short val_Short = bigval.shortValue();
        System.out.println("\nConvert the said BigInteger to an short value: "+val_Short);
        byte val_Byte = bigval.byteValue();
        System.out.println("\nConvert the said BigInteger to byte: "+val_Byte);
        long val_ExactLong = bigval.longValueExact();
		System.out.println("\nConvert the said BigInteger to exact long: "+val_ExactLong);
    }
}*/
/*public class v {
    public static void main(String[] args) {
        float fn = 0.2f;
        System.out.println("\nInitial floating number: " + fn);		
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        double dn = 0.2d;
       System.out.println("\nInitial double number: " + dn);		
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    }
}*/
/*public class v {
    public static void main(String[] args) {
    for(int i=1,k=1;i<5;i++) {	
    	for(int j=1;j<=i;j++)
    		System.out.print(k++);
    	System.out.println();
    }
    }
    
}*/
/*import java.util.*;
public class v {
    public static void main(String[] args) {
    	int a[]= {4,5,4,6,5,7,9,7,7};
    	for(int i=0;i<a.length-1;i++) {
    		for(int j=i+1;j<a.length;j++) {
                       if(a[i]==a[j]) {
    					System.out.println(a[i]);
    				}
    		}
    	}
    }
    
}*/
/*import java.util.*;
public class v {
    public static void main(String[] args) {
    	int a[]= {1,2,3,0,4,6,7,5};
    	Arrays.sort(a);
    	for(int i=0;i<a.length;i++) {
    		for(int j=i+1;j<a.length;j++) {
    			for(int k=j+1;k<a.length;k++) {
    				if((a[i]+a[j]+a[k])==7) {
    					System.out.println(a[i]+", "+a[j]+" ,"+a[k]+"\n");
    				}
    			}
    		}
    	}
    }
    
}*/

/*import java.util.Arrays;

	class v{
	
		public static void find_and_print_all_Triplets(int[] nums, int sum, int alen)
		{
		System.out.println("\nTriplets of sum "+sum);
		for (int i = 0; i <= alen - 3; i++)
			{
				int k = sum - nums[i];
				int l_index = i + 1, h_index = nums.length - 1;
	
				while (l_index < h_index)
				{
					if (nums[l_index] + nums[h_index] < k) {
						l_index++;
					}
	
				else if (nums[l_index] + nums[h_index] > k) {
						h_index--;
					}
	
					else {
						System.out.println("(" + nums[i] + " " + nums[l_index] + " " + nums[h_index] + ")");
						l_index++;
						h_index--;
					}
				}
			}
		}
		public static void main(String[] args)
		{
			int[] nums = { 1,2,3,0,4,6,7,5};
			int alen = nums.length;
			System.out.println("\nOriginal array: "+Arrays.toString(nums));
			// sort the array in ascending order
			Arrays.sort(nums);
			int sum = 7;
	
			find_and_print_all_Triplets(nums, sum, alen);
		}
	}*/

/*import java.util.*;
public class v {
    public static void main(String[] args) {
    	int a[]= {1, 2, 3, 0, 4, 6};
    	Arrays.sort(a);
    	int n=1,sum=0;
    	for(int i=1;i<a.length;i++) {
    		n=n*10;
    	}
    	for(int i=a.length-1;i>0;i--) {
    	sum=sum+a[i]*n;
    	n=n/10;
    	}
    	System.out.print(sum);
    	}
    
}*/
/*import java.util.*;
public class v {
    public static void main(String[] args) {
    	String s="vishal is a student";
    	    	String s4="al";
    	System.out.print(s.contains(s4));
    	Calendar c=Calendar.getInstance();
    	System.out.println(c);
    	
    }
    
}*/
/*import java.util.*;
public class v {
    public static void main(String[] args) {
    pentagonal(20);
    
    }
    public static void pentagonal(int a) {
    	int k;
    	for(int i=1;i<=20;i++) {
    	k=(i*(i-1)+(i*(i+1))/2);
    	System.out.print(k+" ");
    	}
    	
    }
    
}*/
/*import java.util.*;
public class v {
    public static void main(String[] args) {
    	int a=23;
    	int f=0;
    	while(a!=1) {
    		if(a%5==0)
    			a/=5;
    		else if(a%3==0)
    			a/=3;
    		else if(a%2==0)
    			a/=2;
    		else {
    			System.out.println("not ugly");
    			f=1;
    			break;
    		}
    	}
    	if(f==0) {
    		System.out.println(" ugly");
    	}
    }
    
}*/
/*public class v{
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8};
		int l=a.length-1;
		int sum=resum(a,l);
		System.out.print(sum);
			}
	static int resum(int a[],int l) {
		if(l==0)
			return a[0];
		int t=resum(a,l-1);
		return a[l]+t;
		
	}
}*/
/*public class v{
	public static void main(String[] args) {
		int a=5;
		int b=3;
		int exp=power(a,b);
		System.out.print(exp);
	}
	static int power(int a,int b) {
		if(b==1)
			return a;
		int t=power(a,b-1);
		return a*t;
	}
}*/

/*public class v{
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7};
		int l=a.length-1;
		a=rev(a,2,3);
		System.out.print(Arrays.toString(a));
	}
	static int [] rev(int b[] ,int left,int l) {
		if(left>l)
			return b;
		int t=b[left];
		b[left]=b[l];
		b[l]=t;
		rev(b,left+1,l-1);
		return b;
		
	}
}*/
/*public class v{
	public static void main(String[] args) {
		int x=5,y=2;
		int t=fun1(x,y);
		System.out.print(t);
	}

static int fun1(int x, int y)
{
	if (x == 0)
		return y;
	else
		return fun1(x - 1, x + y);
}
}*/
/*import java.util.*;
public class v{
	public static void main(String[] args) {
	int a[]= {2,3,4,5,3,6,3,3,3};
	int b[]=indexes(a,0,0,3);
	System.out.print(Arrays.toString(b));
	}
	static int[] indexes(int b[],int index,int f,int d) {
		if(index==b.length) {
			return new int[f];
		}
		if(b[index]==d) {
			int arr[]=indexes(b,index+1,f+1,d);
					arr[f]=index;
					return arr;
		}
		else {
			int arr[]=indexes(b,index+1,f,d);
			return arr;
		}
	}
	
}*/
/*import java.util.*;
public class v{
	public static void main(String[] args) {
	int a=10;
	int b=5;
	int t=pow(a,b);
	System.out.print(t);	
	}
	static int pow(int x,int y) {
		if(y==0)
			return 1;
	/*int t=pow(x,y-1);
	return t*x;*/
		/*int t=pow(x,y/2);
		int r=t*t;
	if(y%2==1) {
		r=r*x;
	}
	return r;
	}
	
}*/
/*import java.util.*;
public class v{
	public static void main(String[] args) {
	int a[]= {2,3,4,5,3,6,3,3,3};
	int max=fmax(a,0);
	System.out.print(max);
	}
	static int fmax(int a[] ,int index) {
		if(index==a.length-1) {
			return a[a.length-1];
		}
		int t=fmax(a,index+1)>a[index]?fmax(a,index+1):a[index];
		return t;
	}
	
}*/
/*import java.util.*;
public class v{
	public static void main(String[] args) {
		int n=2;
		int t1=1;
		int t2=2;
		int t3=3;
		tower(n,t1,t2,t3);
	}
	static void tower(int n,int t1,int t2,int t3) {
		if(n==0)
			return ;
		tower(n-1,t1,t3,t2);
		System.out.println(n+" "+t1+" >"+t2);
		tower(n-1,t3,t2,t1);
	}
}*/
/*class c{
	int a=5;
	int b=10;
	int c[]= {2,3,4};
	public String toString() {
		return " v{a="+a +" b="+b+" c=}";
	}
}
class v{
	public static void main(String [] args) {
	c obj =new c();	
	System.out.print(obj);
	}
}*/
/*import java.util.*;
class v{
	public static void main(String[] args) {
		String str="576";
		ArrayList<String> result =new ArrayList<>();
		result=allcombo(str);
		System.out.print(result);
	}
	static String code[]= {",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	static ArrayList<String> allcombo(String str){
		if(str.length()==0) {
			ArrayList<String> temp =new ArrayList<>();
			temp.add("");
			return temp;
		}
		char c=str.charAt(0);
		String t=str.substring(1);
		ArrayList<String> dumy =allcombo(t);
		ArrayList<String> myresult = new ArrayList<>();
		String codes=code[c-'0'];
		for(int i=0;i<codes.length();i++) {
			char c1=codes.charAt(i);
			for(String s2 : dumy) {
				myresult.add(c1+s2);
			}
		}
		return myresult;
	}
}*/
/*class v{
	public static void main(String [] args) {
		String str="567";
		print(str,"");
	}
	static String code[]= {",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	static void print(String str,String ans) {
	if(str.length()==0)
		{System.out.println(ans);
		return ;}
	char c=str.charAt(0);
	String s=str.substring(1);
	String s1=code[c-'0'];
	
	for(int i=0;i<s1.length();i++) {
		char c1=s1.charAt(i);
	print(s,ans+c1);
	}
	}
}*/


/*class v{
	public static void main(String [] args) {
	int m=3;
	int n=3;
	print(1,1,m,n,"");
		}
	static void print(int sr,int sc, int dr ,int dc, String ans ) {
		if(sr==dr && sc==dc) {
		System.out.println(ans);
		return ;
		}
		if(sr<dr) {
		print(sr+1,sc,dr,dc,ans+"h1");
		print(sr+2,sc,dr,dc,ans+"h2");
		print(sr+3,sc,dr,dc,ans+"h3");
		}
		if(sc<dc) {
			print(sr,sc+1,dr,dc,ans+"v1");
			print(sr,sc+2,dr,dc,ans+"v2");
			print(sr,sc+3,dr,dc,ans+"v3");
			}
		if(sc<dc && sr<dr) {
			print(sr+1,sc+1,dr,dc,ans+"v1");
			print(sr+2,sc+2,dr,dc,ans+"v2");
			print(sr+3,sc+3,dr,dc,ans+"v3");
			}
		
	}
	
}*/
/*class v{
	public static void main(String [] args) {
	String str="abc";
	printpermu(str,"");
	}
	static void printpermu(String str ,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			String l=str.substring(0,i);
			String r=str.substring(i+1);
			String f=l+r;
			printpermu(f,ans+c);
		}
	}
	
}*/

/*class v{
	public static void main(String [] args) {
	int m=4;
	int n=3;
	int arr[][]= {{0,0,1},
			      {0,0,1},
			      {1,0,0},
			      {0,1,0}};
	boolean b[][]=new boolean[m][n];
	printpath(arr,0,0,m,n,b,"");
	}
	static void printpath(int arr[][],int sr,int sc,int dr,int dc,boolean b[][],String ans) {
		if(sr==dr-1 && sc==dc-1) {
		System.out.println(ans);
		return;
		}
		if(b[sr][sc]==true || sr==arr.length || sc==arr[0].length || arr[sr][sc]==1) {
			return;
		}
		b[sr][sc]=true;
		if(sr<dr-1) {
			printpath(arr,sr+1,sc,dr,dc,b,ans+"d");
		}
		if(sc<dc-1) {
			printpath(arr,sr,sc+1,dr,dc,b,ans+"r");
		}
		if(sr>0) {
			printpath(arr,sr-1,sc,dr,dc,b,ans+"t");
		}
		if(sc>0) {
			printpath(arr,sr,sc-1,dr,dc,b,ans+"u");
		}
		b[sr][sc]=false;
	}
	
}*/
/*class v{
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		int n=5;
		printset(a,0,n,0,"");
		}
	
	static void printset(int a[] ,int index,int target,int sum , String str ) {
		if(index==a.length){ 
			if(sum==target) {
			System.out.println(str);}
			return;
		}
		if(index==a.length) {
			return;
		}
		printset(a,index+1,target,sum+a[index],str+a[index]);
		printset(a,index+1,target,sum,str);
	}
}*//*public class v{
	public static void main(String[] args) {
		int a[]= {9,3,4,5};
		int b[]= {3,2,3,4};
		int c[]= new int[b.length];
		int l=a.length,k=b.length;
		int d=0;
		for(int j=b.length-1;j>=0;j--) {
			int t1=0;
			if(l>0) {
				t1=a[--l];
			}
			int t2=0;
			if(k>0) {
				t2=b[--k];
			}	
			int t=t1+t2+d;
			c[j]=t%10;
			d=t/10;
		}
		System.out.print(d);
		for(int q:c) {
			System.out.print(q);
		}
		//System.out.print(Arrays.toString(c));
		if(d>0) {
			int r[]=new int[b.length+1];
			r[0]=d;
			int k1=0;
			for(int i=0;i<b.length;i++) {
			r[++k1]=c[i];	
			}
			System.out.println(Arrays.toString(r));
		}
		
	}
}*/

 /*class v{
	public static void main(String[] args) {
		int a[]= {1,0,0,0};
		int b[]= {1};
		int c[]= new int[a.length];
		int l=a.length,k=b.length;
		int d=0;
		while(l>0) {
			int t1=d;
			if(l>0) {
				t1+=a[--l];
			}
			int t2=0;
			if(k>0) {
				t2=b[--k];
			}
			if(t1<t2) {
				t1=t1+10;
				d=-1;
			}
			int t=t1-t2;
			c[l]=t;
		}
		System.out.print(Arrays.toString(c));
	}
	
}*/
/*class v{
	public static void main(String[] args) {
		int a[]= {1,0,0,0};
		for(int i=0;i<=a.length;i++) {
			for(int j=i;j<=a.length;j++) {
				for(int k=i;k<j;k++) {
				 System.out.print(a[k]);}
				System.out.println();
			}
		}
	}
	
}*/

/*import java.io.*;

import java.util.*;

public class v {
  private static class Node {
    int data;
    ArrayList< Node> children = new ArrayList< >();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack< Node> st = new Stack< >();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("enter");
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(",");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    display(root);
  }

}*/
import java.io.*;
import java.util.*;

/*public class v {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Yes"); 
        String A=sc.next();
       int i=0;
       int j=A.length()-1;
       int f=1;
       while(j>i){
    	   
       if(A.charAt(i)!=A.charAt(j)){
          System.out.print("No");
          f=0;
        return; }
           i++;
           j--;
       }
       if(f==1){
        System.out.print("Yes");   
       }
    }
}*/

/*public class v{
	public static float percenteg(int a[]) {
		float sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+a[i];
		}
		return (sum)/5;
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[5];
		int a1[]=new int[5];
		for(int i=0;i<5;i++) {
		System.out.print("enter name of subject");
		s1[i]=sc.nextLine();
		System.out.print("enter the marks of"+s1[i]);
		a1[i]=sc.nextInt();
		}
		float p=percenteg(a1);
		System.out.print(p);
		
	}
}*/

/*public class v {
  static class Edge {
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt) {
      this.src = src;
      this.nbr = nbr;
      this.wt = wt;
    }
  }
  public static void print(ArrayList<Edge>[] a) {
	  System.out.print(a[0].get(0));
		  
  }
  public static void main(String[] args) throws Exception {
    int vertices = 7; //0 1 2 3 4 5 6
    ArrayList<Edge> []graph = new ArrayList[7];

    //This is as per the diagram (fig-13)

    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 20));

    graph[0].add(new Edge(1, 0, 10));
    graph[0].add(new Edge(1, 2, 30));
    graph[0].add(new Edge(1, 3, 50));
    graph[0].add(new Edge(1, 4, 40));

    graph[0].add(new Edge(2, 0, 20));
    graph[0].add(new Edge(2, 1, 30));
    graph[0].add(new Edge(2, 5, 80));

    graph[0].add(new Edge(3, 1, 50));
    graph[0].add(new Edge(3, 5, 70));

    graph[0].add(new Edge(4, 1, 40));
    graph[0].add(new Edge(4, 2, 80));
    graph[0].add(new Edge(4, 5, 60));

    graph[0].add(new Edge(5, 3, 70));
    graph[0].add(new Edge(5, 4, 60));
 
    print(graph);
  }
}*/





/*public class v {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

static class Result {

    /*
     * Complete the 'reversePrint' function below.
     *
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

  /*  public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
    	 if(llist ==null){
    		    return;
    		    }
    		    reversePrint(llist.next);
    		    System.out.print(llist.data);
    		    

}}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.print("eeee");
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

           Result.reversePrint(llist.head);
        }

        scanner.close();
    }
}*/

/*import java.io.*;
import java.util.*;

public class v {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string");
       
        String s = scan.nextLine();
        // Write your code here.
        s=s.replaceAll("[!,?._'@]"," ");
       // s=s.trim();
        String str[]=s.split("\\s+");
        System.out.println(str.length);
        
        for(int i=0;i<str.length;i++){
         System.out.println(str[i]);   
        }
        scan.close();
    }
}

/*import java.io.*;
import java.util.*;

public class v {

    public static void main(String[] args) {
    	String s=" ";
    	
    	String a[]=s.split(" ");
    	System.out.print(a.length);
    	System.out.print(Arrays.toString(a));
    }}*/

/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class v{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("emye");
        String n = bufferedReader.readLine();
       
        
        int s=0;
        for(int i=0;i<n.length();i++){
            int t=n.charAt(i)-'0';
            s+=t;
        }
        int k=n.charAt(n.length()-1)-'0';
        if(k==0 && k==2 && k==4 && k==6 && k==8){
            System.out.print("not prime");
        }
        else if(s%3==0 ){
            System.out.print("not prime");
        }
        else{
            System.out.print("prime");
        }
        System.out.print(s);
        bufferedReader.close();
    }
    
}*/

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class v {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("dncdnsnm");
        String n = bufferedReader.readLine();
        int t=Integer.parseInt(n);
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
          String n1 = bufferedReader.readLine();
          String s[]=n1.split(" ");
          int k=Integer.parseInt(s[0]);
          
          
          ArrayList<Integer> a1=new ArrayList<>();
          for(int j=1;j<=k;j++){
        	 
           a1.add(Integer.parseInt(s[j]));
          }
          
         a.add(a1); 
        }
        String s1=bufferedReader.readLine();
        int t1=Integer.parseInt(s1);
        
        for(int i=0;i<t1;i++){
          String n2 = bufferedReader.readLine();
         
          String s2[]=n2.split(" ");
        
          int t3=Integer.parseInt(s2[0]);
          int t4=Integer.parseInt(s2[1]);
          
          
         ArrayList q=a.get(t3-1);
         
          if(q.size()>=t4){
              System.out.println(q.get(t4-1));
          }
          else{
             System.out.println("ERROR!"); 
          }
            
        }
    }
}*/
/*import java.io.*;
import java.util.*;
class v{
	public static void main(String [] args)throws Exception {
		Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9]*[.]pdf");
		int count=0;
		File f=new File("C:\\Users\\vishal kumar\\OneDrive\\Desktop\\Camera Roll\\New\\oop");
		String s[] =f.list();
		for(String s1:s) {
			Matcher m=p.matcher(s1);
			while(m.find()) {
				System.out.println(s1);
				count++;
			}
			
		}
		System.out.println(count);
	}
}*/
/*import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class v{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p =Pattern.compile("([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])");
        System.out.print("enter");
        String s=br.readLine();
        while(s!=null){
            
         Matcher m=p.matcher(s);
         if(m.find()){
             System.out.println(true);
         }
         else{
             System.out.println(false);
         } 
         s=br.readLine();   
        }
       
    }
}*/
/*import java.util.*;
class v{
    public static void main(String [] args) {
    int n=613254;
    int digit=1;
    int sum=0;
    while(n>0) {
    	int q=n%10;
    	n=n/10;
    	sum=sum+digit*((int)Math.pow(10, q-1));
    	digit++;
    }
    System.out.print(sum);
}
}*/
public class v{
	public static int precidence(char c) {
		if(c=='+') {
			return 1;
		}
		else if(c=='-') {
			return 1;
		}
		else	if(c=='*') {
			return 2;
		}
		else {
			return 2;
		}
	}
	public static int colculation(int v1,int v2, char c) {
		if(c=='+') {
			return v2+v1;
		}
		else if(c=='-') {
			return v2-v1;
		}
		else	if(c=='*') {
			return v2*v1;
		}
		else {
			return v2/v1;
		}
	}
	public static void main(String [] args) {
		String exp="2+(5-3*6/6)";
		 HashMap<Integer,Integer> hm=new HashMap<>();
		System.out.println('z'-97);
		Stack<Character> stc =new Stack<>();
		Stack<Integer> sti =new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(c=='(') {
				stc.push(c);
			}
			else if(Character.isDigit(c)) {
				sti.push(c-'0');
			}
			else if(c=='+' || c=='-' || c=='*' || c=='/') {
				
				while(stc.size()>0 && stc.peek()!='(' && precidence(c)>=precidence(stc.peek())) {
					int v1=sti.pop();
					int v2=sti.pop();
					char ch=stc.pop();
					sti.push(colculation(v1,v2,ch));
				}
				stc.push(c);
			}
			else {
				while(stc.size()>0 && stc.peek()!='(') {
					char ch=stc.pop();
					int v1=sti.pop();
					int v2=sti.pop();
					sti.push(colculation(v1,v2,ch));
				}
				stc.pop();
			}
		}
		while(stc.size()>0) {
			char ch=stc.pop();
			int v1=sti.pop();
			int v2=sti.pop();
			sti.push(colculation(v1,v2,ch));	
		}
		System.out.println(sti.pop());
	}
}















































	
     




























