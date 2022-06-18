import java.util.Scanner;

/*   public class fristjava {
	public static void main (String[] args) {
		System.out.println("hell");
		System.out.println("hii");
	}

}  *///import java.io.*;
/*public class fristjava{
	public static void main(String [] args)
	{
		Box b1=new Box();
	b1.setDimension(12,10,8);
	b1.SendBox();
	
		}
}
class Box{
	private int l,b,h;
	public void setDimension(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
		System.out.println("length " +l+"\nbase"+b+"\nheight"+h);
	}
	public void SendBox()
	{GiftTaker gf =new GiftTaker();
      gf.acceptgift(this);		
	}
}*//*import java.util.*;
import java.lang.*;
public class fristjava{
	public static void main(String[] args)
	{
		System.out.println("enter two number");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a +"\tb="+b);
	}
}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int s=0;

		while(a!=0)
		{
			s=s*10+a%10;
			a=a/10;
		}
		System.out.println("reverse number is"+s);
	}
	}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
StringBuffer sb =new StringBuffer(String.valueOf(a));
StringBuffer rev =sb.reverse();
System.out.print(rev);

	}
}*/

/*import java.util.*;
public class fristjava{
	public static void main(String[] args)
{
		System.out.println("enter your name");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		String rev="";
		for(int i=l-1;i>=0;i--) {
	           rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
		}
}*/

/*import java.util.*;
public class fristjava{
	public static void main(String[]args) {
		System.out.println("enter a number" );
		Scanner sc =new Scanner(System.in);
	long a =sc.nextLong();		int even_count=0;
		int odd_count=0;
		while(a!=0) {
			long rem=a%10;
			if(rem%2==0) {
				even_count++;
			}else
					odd_count++;
				
			a=a/10;
		}
		System.out.println("total even number is " + even_count +"\ntotal odd number is"+odd_count);
		
		
	}
}*/

/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter three number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	
	int greatest =a>b?(a>c?a:c):(b>c?b:c);
	System.out.println(greatest);
	}
}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter 10 element");
		int arr[] =new int[10];
		int sum=0;
		Scanner sc =new Scanner(System.in);

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		//sum=sum+arr[i];
		}
		//int sum=0;
		//for(int i=0;i<arr.length;i++) {
			//sum=sum+arr[i];
	//	}
		for(int value:arr) {
			sum=sum+value;
		}
		System.out.println(sum);
		
		
	}
}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter ten number");
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0) {
				System.out.println("even number"+a[i]);
			}else
				{System.out.println("odd number"+a[i]);
					
				}
				
			}
		}
	}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter 10 element" + "\nenter 10 element");
		int a[]=new int[10];
		int b[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
	boolean status=Arrays.equals(a, b);
	if(status==true) {
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equall");
	}
	
		
	}
}*/
/*import java.util.*;

public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter 10 nummber");
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				
			}
		}
		System.out.println(max);
	}
}*//*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		int seaching =10;
		System.out.println("enter 10 element");
		int a[]=new int[10];
		int j=0
				;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(seaching==a[i])
			{ j=a[i];}
			}
		System.out.println(j+1);

	}
}*//*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("10 number");
		int a[]=new int[10];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		int kye=3;
		int l=0;
		int h=a.length-1;
		int m;
		boolean status=false;
		while(h>=l) {
			m=(l+h)/2;
			if(kye==m) {
				System.out.println("element found at"+m);
				status=true;
				break;
			}
			if(kye>m) {
				l=m+1;
			}
			if(kye<m) {
				h=m-1;
			}
		}
		if(status==false) {
			System.out.println("not found");
		}
	}
}*//*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int key = 4;
		int k =Arrays.binarySearch(a,key);
		if(k>=0) {
			System.out.println("element fount at"+k +"number is"+a[k]);
		}
		else
		{
			System.out.println("element not found");
		}	
	}
}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		int a[] = {2,1,7,5,6,9};
		int l=a.length;
		for(int i=0;i<=l-1;i++) {
			for(int j=0;j<l-1;j++) {
				if(a[j]<a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	System.out.println(Arrays.toString(a));
		
		
	}
}*//*import java.util.*;
public class fristjava{
	public static void main(String[] args){
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replaceAll("vishal","suraj");
		System.out.println(s);
		
	}
}*//* import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
					{count++;
				}
					}
		
System.out.println(count);
	}
}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=6-i) {
					System.out.print(j );
					
				}
				else
					System.out.print("&");
			}
	System.out.println();
		}
		for( a=1,b=10,c=11,d=20,e=21,f=30;a<=10; a++, b--,c++,d--,e++,f--) {
				System.out.println(a +" "+ b + " "+c+" "+e+" "+f+" ");}
		 for(int i=1 ;i<=6;i++) {
			 for(int j=1;j<=6;j++) {
				 if(i>=j) {
					 System.out.print(j);
				 }
				 else
					 System.out.print("*");
		 }			System.out.println(); 
		 }
	}
}*/
/*public class fristjava{
	int a[]=null;
	public fristjava(int size) {
		a=new int[size];
		for(int i=0;i<a.length;i++)
		a[i]=Integer.MIN_VALUE;
	}
	public void traverse() {
		try {
			for(int i=0;i<a.length;i++)
		System.out.println(a[i]);}
			catch(Exception e) {
				System.out.println("out of bound");
				}
		
	}
	public void insert(int indexNumber ,int value) {
try {
	if(a[indexNumber]==Integer.MIN_VALUE)
    {
	a[indexNumber]=value;
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}
	else
		System.out.println("index occupied");
}catch(Exception e) {
	System.out.println("index out bound");
}
	}
	public void mannageindex(int indexNumber) {
		try {
			System.out.println(a[indexNumber]);
			}
		catch(Exception e) {
			System.out.println("out of bound");
			}
		}
	public void deletvalue(int i) {
		try {
			a[i]=Integer.MIN_VALUE ;
			System.out.println(a[i]);}
		catch(Exception e) {
			System.out.println("out of bound");
		}
		
	}
	
	public static void main(String[] args) {
		fristjava vis=new fristjava(10);
		vis.traverse();
		System.out.println();
		vis.insert(5,50);
		System.out.println();
		vis.mannageindex(12);
		System.out.println();
		vis.deletvalue(5);
		
		
	}
	
}*/




/*import java.util.*;
import java.io.*;
import java.math.*;
class fristjava
{
static void towerOfHanoi(int n, char from_rod,
                    char to_rod, char aux_rod)
{
    if (n == 1)
    {
        System.out.println(
                           from_rod+""+to_rod);
        return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println(""+ n + " " +
                       from_rod +" " + to_rod );
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
 
// Driver code
public static void  main(String args[])
{
    int n = 4; // Number of disks
    towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
}
}*/
/*public class fristjava{
	public static void main(String [] args) {
		int f=5;
		int a=fact(f);
		System.out.print(a);
		
	}
	 static int fact(int f) {
		 if(f==1)
		return 1;
		 else
		 {
			 f= f*fact(f-1);
			 System.out.print("hello"+" ");
			int a=2,b=6;
			System.out.print(a+b);
			 return f;
		 }
		
	}
}*/
/*public class fristjava{
             static	String s="vishal";

	public static void main(String [] args) {
		String s="vishal";
		int h=sascii("vishal", 16);
		System.out.println(h);
		String k=hashtable(h);
		System.out.println(k);
	}
	public static int sascii(String x,int m) {
		char c[]=x.toCharArray();
		int i=0,sum=0;
		for(i=0;i<x.length();i++)
			sum=sum+c[i];
		return sum%m;
		
	}
	public static String hashtable(int h ) {
		String a[]=new String[10];
		a[h]="vishal";
		return a[h];
		
	}
	
}*/
/*import java.util.*;
public class fristjava{
	int vertices;
	int edge;
	int matrix[][];
	public fristjava(int ver, int ed) {
		vertices=ver;
		edge=ed;
		matrix=new int[vertices][vertices];
		}
	public void addEdge(int source, int destination) {
		matrix[source][destination]=1;
		matrix[destination][source]=1;}
	public void print() {
		for(int i=0;i<edge;i++) {
			for(int j=0;j<edge;j++) {
				System.out.print(matrix[i][j]);
	}
		System.out.println();	
		}
	}
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of vertices");
		int v=s.nextInt();
		
		System.out.println("enter number of edges");
		int e=s.nextInt();
		fristjava fj=new fristjava(v,e);
		for(int i=0;i<e;i++)
		{
			System.out.println("enter source vertices");
			int a=s.nextInt();
			System.out.println("enter the destination");
			int b =s.nextInt();
			fj.addEdge(a,b);
		}
		fj.print();
	}
}
*///import java.util.
/*public class fristjava{
	node start;
	node top;
	class node{
		int data ;
		node next;
		public node() {}
		public node(int data)
		{this.data=data;
			}}
		public node creatnode() {
			node root =new node();
			return root;
		}
		public void enqueue(int v ,node root) {
			node rt= new node();
			rt.data=v;
			if(start==null)
			{
				start=rt;
				top=rt;
				rt.next=null;
			}
			else
				top.next=rt;
			top=rt;
			rt.next=null;
		
	}
		
		public void dequeue(node root) {
			node tp =new node();
			tp=start;
			start=start.next;
			System.out.print(tp.data);
			}
		public static void main(String[] args) {
			fristjava fj =new fristjava();
			node root=fj.creatnode();
			Scanner s=new Scanner(System.in);
System.out.println("how much number you want to enter");
int c=s.nextInt();
for(int i=0;i<c;i++) {
			System.out.println("enter value");
			int a=s.nextInt();
			fj.enqueue(a,root);}
for(int i=0;i<c;i++) {
	
	fj.dequeue(root);
	
}
}
		
}*/
/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++){
			System.out.println(" enter number");
			int b=s.nextInt();
			a[i]=b;
		}
	//	for(int i=0;i<a.length;i++) {
		//	System.out.println(a[i]);
		//}
	/*	int sum1=Integer.MIN_VALUE;int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum2=sum2+a[i];
			if(sum2>sum1)
				sum1=sum2;
		//	if(sum2<0)
			//	sum2=0;
		}
		System.out.println(sum1);*/
	/*	for(int i =0;i<(a.length)/2;i++) {
			int t=a[i];
	            a[i]=a[a.length-1-i];
	            a[a.length-1-i]=t;
			
		}for(int i=0;i<(a.length);i++)
		System.out.println(a[i]);
	}
}*/
/*public class fristjava{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{	{for(int j=i;j<=n;j++)
				{System.out.print(" ");}//System.out.println();
		}
		{for(int j=1;j<=i;j++)
			System.out.print("* ");
		System.out.println();}
		}
	}
}*/
/*import java.util.*;
public class fristjava{
	static class node{
		int data;
		node left,right;
	public node(int v) {
		data=v;
	}
	node(){}
	}
	node root;
	public node creatnode() {
		node root =new node();
		return root;
	}
	
	
	public static node insert(node root ,int v) {
		if(root==null)
			{root=new node(v);
		return root;}
		else { 
			Queue<node> q=new LinkedList<node>();
			q.add(root);
			while(!q.isEmpty()) {
				node temp=q.peek();
				q.remove();
				if(temp.left==null)
					{temp.left=new node(v);break;}
				else
					q.add(temp.left);
				if(temp.right==null)
					{temp.right=new node(v);break;}
				else
					q.add(temp.right);}
			return root;}
		}
	public void traversal(node root) {
		if(root==null)
			return;
		else {
			traversal(root.left);
			System.out.print(root.data +" ");
			traversal(root.right);
			
		}
	}
	public void posttra(node root) {
		if(root==null)
			return;
		else
		{
			System.out.print(root.data+" ");
			posttra(root.left);
			posttra(root.right);
		}
	}
	public static int search(node root ,int v) {
		if(root.data==v)
		return root.data;
	else  {
			search(root.left,v);
			search(root.right,v);
				}
		return root.data;
	}
	public static void delet(node root ,int v) {
		node n=new node(search(root,v));
		if(root==n) {if(root.left==null&&root.right==null)
			root=null;}
		
		else {
		Queue<node> q= new LinkedList<node>();
		q.add(root);
		while(!q.isEmpty()){
			node temp=q.peek();
			q.remove();
			if(temp.left==null &&temp.right==null)
			{
			n=temp;	
			}
			else
				q.add(temp.left);
			q.add(temp.right);
			}
	}}
	public static void main(String[] args) {
		fristjava fj=new fristjava();
	node root=	fj.creatnode();
	 root=new node(22);
	 root.left=new node(12);
	 root.right=new node(13);
	
	insert(root, 5);
	insert(root,6);
	insert(root,10);
	insert(root,23);
	 //fj.insert(root, 3);
	 //fj.insert(root, 9);
	 //fj.insert(root, 8);
	 //fj.insert(root, 6);
	fj.traversal(root);
	System.out.println();
	fj.posttra(root);
	System.out.println();
	search(root,5);
	delet(root,10);
	fj.traversal(root);
	
	}
}*/
/*import java.util.*;
public class fristjava{
	static class node{
		int data;
		node left,right;
		public node() {}
		public node(int n) {
			data=n;
		}}
		node root;
		public static node insert(node root,int v) {
			if(root==null)
		{root=new node(v); 
			return root;}
			else
			{	Queue<node> q=new LinkedList<node>();
				q.add(root);
				while(!q.isEmpty()) {
					node tem=q.peek();
					q.remove();
					if(tem.left==null)
					{	tem.left=new node(v);
					break;}
					else
						q.add(tem.left);
					if(tem.right==null)
					{	tem.right=new node(v);
					break;}
					else
						q.add(tem.right);
				}
				return root;
				}
		}
		public static void traversal(node root) {
			if(root ==null)
				return;
			else
				System.out.println(root.data);
			traversal(root.left);
			traversal(root.right);
			

		}
	public static void delet(node root,int v) {
		node n=new node(v);
		if(root==null)
		return;
		else
			{if(root==n) {
				
			if(root.left==null&&root.right==null)
	          root=null;
			else {
				Queue<node> q=new LinkedList<node>();
				q.add(root);
				while(!q.isEmpty()) {
					node tem=q.peek();
					q.remove();
					if(tem.left==null&&tem.right==null)
					{	n=tem;
					tem=null;}
					else {
						q.add(tem.left);
						q.add(tem.right);
					}}}}
			else
			{delet(root.left,v);
			delet(root.right,v);
			}
			}
	}
	public static node search(node root,int v) {
		if(root ==null)
	      return null;
		else {
		if(root.data==v)
			return root;
		else 
		{
			search(root.left,v);
			search(root.right,v);
			return root;
		}}
}
		
	public static void main(String [] args) {
		fristjava fj=new fristjava();
		node root =new node(3);
		root.left=new node(1);
		root.right=new node(4);
		insert(root,5);
		insert(root,6);
		traversal(root);
		delet(root,1);
		search(root,4);
	}
}*/
/*import java.util.*;
public class fristjava{
	static class node{
		int data;
		node left,right;
		public node(int v) {
			data=v;
		}
	}
	node root;
	public static node insert(node root,int v) {
		if(root==null)
			root= new node(v);
		if(v>root.data) 
			root.right=insert(root.right,v);
		if(v<root.data)
			root.left=insert(root.left,v);
		return root;
	}
	public  static void delet(node root,int v) {
		node n=new node(v);
		if(root==n)
		{
			if(root.right==null)
				n=null;
			else {
		while(root.right.left!=null)
			root.right.left=root.right.left.left;
		n=root.right.left;}
		
		}
	if(root.data>n.data)
		delet(root.right,v);
	if(root.data<n.data)
		delet(root.left,v);
	
	}
	public static void traversal(node root) {
		if(root==null)
			return;
		else
			{traversal(root.left);
		System.out.print(root.data);
		traversal(root.right);}
	}
	public static void main(String[] args) {
		node root=new node(5);
		root.left=new node(4);
		root.right=new node(6); 
		insert(root,7);
		insert(root,8);
		traversal(root);
		delet(root,7);
		traversal(root);
		
	}
}*//*import java.util.*;
public class fristjava{
	class vertix{
		char lable;
		boolean isvisited;
		public vertix(char l) {
			lable=l;
			isvisited=false;
			
		}
	}
    int a[][];
    vertix vertixlist[];
    int nvertix;
    int totalvertix=20;
    public fristjava() {
    	this.totalvertix=totalvertix;
    	a= new int[totalvertix][totalvertix];
    	vertixlist=new vertix[totalvertix];
    	
    }
    public void addvertix(char k,int v) {
    	vertixlist[v]=new vertix(k);
    	
    }
    public void addedge(int u,int v) {
    	a[u][v]=1;
    	a[v][u]=1;
    }
    public  void printmatrix() {
    	for(int i=0;i<4;i++)
    		{for(int j=0;j<4;j++)
    			System.out.print(a[i][j]);}
    	System.out.println();
    }
	public void printvertix(int v) {
		System.out.println(vertixlist[v].lable);
	}
	public int adjvertix(int v) {
		for(int i=0;i<=5;i++) {
			if(a[v][i]==1 && vertixlist[i].isvisited==false)
				return i;}
		
				return -1;
		}
	public void bfs() {
		vertixlist[0].isvisited=true;
		printvertix(0);
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(0);
		int v2;
		while(!q.isEmpty()) {
			int v1 =q.remove();
	
			while( adjvertix(v1)!=-1) {
				v2=adjvertix(v1);
				printvertix(v2);
				vertixlist[v2].isvisited=true;
				q.add(v2);
				}
			}
		}
	public static void main(String[] args) {
		
		System.out.println("enter total number of vertix");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		fristjava fj =new fristjava();
		for(int i=0;i<a;i++)
		{
	
			System.out.println("enter name of vertix");
		   char b=s.next().charAt(0);
		   fj.addvertix(b, i);
		}
	System.out.println("enter total number of  edges");
	int  c=s.nextInt();
	for(int i=0;i<c;i++) {
		System.out.println("enter staring vertix less than"+a);
		int d=s.nextInt();
		System.out.println("enter end vertix less than"+a);
		int e=s.nextInt();
		fj.addedge(d, e);
		
	}
	fj.printmatrix();
	fj.bfs();
		}}*/

/*import java.util.*;
public class fristjava{
	class vertix{
	    char lable;
	    boolean isvisited;
	    int incident=0;
	    public vertix(char lable){
	    	this.lable=lable;
	    	isvisited=false;
	    	incident=0;
	    	
	    }
	}
	int a[][];
	vertix vertixlist[];
	int totalvertix=20;
	int nvertix;
	public fristjava() {
		a=new int[totalvertix][totalvertix];
		vertixlist=new vertix[totalvertix];
		totalvertix=20;
		nvertix=0;
	}
	public void addvertix(char lab) {
		vertixlist[nvertix++]=new vertix (lab);
	}
	public void addedge(int u,int v) {
		a[u][v]=1;
		vertixlist[v].incident=vertixlist[v].incident+1;
		
	}
	public void display(int v) {
		System.out.println(vertixlist[v].lable);
		
	}
	public void displaymatrix(){
		for(int i=0;i<=4;i++)
		{	for(int j=0;j<=4;j++)
			{	System.out.print(a[i][j]);}
		System.out.println();}

		
	}
	public int adjvertix(int v) {
		for(int i=0;i<=4;i++) {
			if(a[v][i]==1 && vertixlist[i].isvisited==false && vertixlist[i].incident==0)
				return i;
		}
		return -1;
	}
	public int startingvertix() {
	
		for(int i=0;i<=4;i++) {
			if(vertixlist[i].isvisited==false && vertixlist[i].incident==0)
			{	vertixlist[i].isvisited=true;
				return i;
			}
			}
		return -1;
		}
	public void removevertix(int v) {
		for(int i=0;i<=4;i++) {
			if(a[v][i]==1)
			{

				vertixlist[i].incident=vertixlist[i].incident-1;
			}
		}
		
	}
		
	public void topologicalsort() {
		//int h=startingvertix();
		while(startingvertix()!=-1) {
			int h=startingvertix();
		Queue<Integer> q= new LinkedList<Integer>();
			vertixlist[h].isvisited=true;
			display(h);
			q.add(h);
			int v2;
			while(!q.isEmpty()) {
				int v1=q.remove();
				removevertix(v1);
				while( adjvertix(v1)!=-1) {
					v2=adjvertix(v1);
					vertixlist[v2].isvisited=true;
					display(v2);
					q.add(v2);
					
				}}}}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	fristjava fj=new fristjava();
	System.out.println("enter total number of vertix");
	int a=s.nextInt();
	for(int i=0;i<a;i++) {
		System.out.println("enter name of vertix");
		char c=s.next().charAt(0);
		fj.addvertix(c);
	}
	System.out.println(" enter total edge");
	int e=s.nextInt();
	for(int i=0;i<e;i++) {
		System.out.println("enter staring point");
		int st=s.nextInt();
		System.out.println("enter destination");
		int d=s.nextInt();
		fj.addedge(st, d);
	}
	fj.displaymatrix();
	fj.topologicalsort();
}}*/
/*import java.util.*;
public class fristjava{
	int a[];
	int size=40;
	int cell=1;
	int lastcell=1;
	public fristjava() {
		this.size=40;
		a=new int[size+1];
		}
	public void swap(int cell) {
		if(a[cell]>a[cell/2]) {
			int k=a[cell];
			a[cell]=a[cell/2];
			a[cell/2]=k;
		}
		swap(cell/2);
	
	
	}
	public void insert(int v) {
		a[cell]=v;
		swap(cell);
		cell++;
		
		
	}

	public void print() {
	for(int i=1;i<size;i++)
		System.out.println(a[i]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of heap");
		int a=s.nextInt();
		fristjava fj=new fristjava();
	for(int i=1;i<=a;i++)
		{System.out.println("enter number");
		int c=s.nextInt();
		fj.insert(c);
		}
	fj.print();

		
	}
	}*/
/*import java.util.*;
public class fristjava{
	class node{
	int data;
	node next;
	public node(int v) {
		data=v;
	}
	}
	node start;
	public void insert(int v) {
		if(start==null)
			start=new node(v);
		else
		{
			node t=start;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=new node(v);
			new node(v).next=null;
		}
	
	}
	public void print() {
		for(node nod=start;nod!=null;nod=nod.next) {
			System.out.print(nod.data);
			
		}
	}
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		fristjava fj =new fristjava();
		System.out.println(" enter number");
		fj.insert(s.nextInt());
		System.out.println(" enter number");
		fj.insert(s.nextInt());
		System.out.println(" enter number");
		fj.insert(s.nextInt());
		fj.print();
	}
}*/
/*import java.util.*;
public class fristjava{
	class vertix{
		int indegree;
		char label;
		boolean visited;
		public vertix() {}
		public vertix( char label) {
			this.label=label;
			visited=false;
			indegree=0;
			
		}
	}
	int a[][];
	int maxsize=20;
	int vtcount;
	vertix vertices[];
	public fristjava() {
		a= new int[maxsize][maxsize];
		vtcount=0;
		vertices=new vertix[maxsize];
	}
	public void addvertix( char label) {
		vertices[vtcount++]=new vertix(label);
	}
	public void addedge(int u,int v) {
		a[u][v]=1;
		vertices[v].indegree++;
		printindegree(v);

	}
	public void printvertix(int v) {
	System.out.println(	vertices[v].label);
	}
	public void printindegree(int v) {
	System.out.println(	vertices[v].indegree);
	}
	public int adjacent(int v) {
		for(int i=0;i<maxsize;i++)
			{if(a[v][i]==1 && vertices[i].visited==false && vertices[i].indegree==0)
				return i;}
		return -1;
	}
	public void topological() {
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<maxsize;i++)
		{
			if(vertices[i].indegree==0 && vertices[i].visited==false)
			{
				vertices[i].visited=true;
			for(int k=0;k<maxsize;k++)
			{
				if(a[i][k]==1)
					vertices[k].indegree--;
			}
				printvertix(i);
				q.add(i);
				int v2;
				while(!q.isEmpty())
				{
				int v1=	q.remove();
				for(int j=0;j<maxsize;j++)
				{
					if(a[v1][i]==1)
						vertices[i].indegree--;
				}
				while(adjacent(v1)!=-1)
				{
					v2=adjacent(v1);
					vertices[v2].visited=true;
					printvertix(v2);
					q.add(v2);
					
				}
					
				}
				
			}
				
		}
	}
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		fristjava fj =new fristjava();
		System.out.println("enter total number of vertix");
		int a=s.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("enter vertix");
			char c=s.next().charAt(0);
			fj.addvertix(c);
		}
		System.out.println(" enter total vertix");
		int v=s.nextInt();
		for(int i=0;i<=v;i++)
		{
			System.out.println("enter source and destination");
			int f=s.nextInt();
			int d=s.nextInt();
			fj.addedge(f,d);
			
		}
		fj.topological();
	
		
		
	}
}


/*import java.util.*;
public class fristjava{
	public static void main(String[] args) {
		String s="hi vishal@!@#%%$";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toCharArray());
		String str=" hi this is burdwan";
		String []w=str.split(" ");
		for(int i=0;i<=(w.length-1)/2;i++) {
			String s1=w[i];
			w[i]=w[w.length-1-i];
			w[w.length-1-i]=s1;
			
		}
		System.out.println(Arrays.toString(w));
		String s2=Arrays.deepToString(w);
		System.out.println(s2);
		String rev="";
		for(int i=0;i<w.length-1;i++) {
			rev=rev+" "+w[i];
		}
		System.out.println(rev);
		String s3= "HI VISHAL";
	    String s4="hi vishal";
	    System.out.println(s3.compareTo(s4));
	    System.out.println(s3.equals(s4));
	    System.out.println(s3.equalsIgnoreCase(s4));
	    System.out.println(s3.indexOf('V',4));
	}
}*/

	/*import java.util.*;
	public  class fristjava{
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int a[][]=new int[3][3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++) {
					System.out.println("enter number");
					a[i][j]=sc.nextInt();
				}
			}
			int sum;
			for(int i=0;i<3;i++)
			{sum=0;
				for(int j=0;j<3;j++)
					{sum=sum+a[i][j];}
				System.out.println(sum);
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<a[i].length;i++) {
				Arrays.sort(a[j]);
				System.out.println(a[j]);
				}
			}
		}
	}*/
/*import java.util.*;
public class fristjava{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
	//	System.out.println("enter");
		if(s1.compareTo(s2)>0) {
			System.out.println("yes");
			}
		else
			System.out.println("no");
		
	}
	
}*/
/*import java.util.*;	
class fristjava{
 public static void main(String [] args) {
	 LinkedList<Integer> l=new LinkedList<>();
	 int a[]= {3,2,4,6,6,9};
	 for(int i=0;i<a.length;i++) {
		 l.add(a[i]);
	 }
	 for(int v : l) {
		 System.out.println(v);
	 }
 }
}*/
/*class fristjava{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->=0)
		{
			int r=sc.nextInt();
			int col=sc.nextInt();
			
			int a[][]=new int[r][col];
			int c=0;
			for(int i=0;i<a.length;i+=2) {
				for(int j=0;j<a[i].length;j+=2) {
				c++;	
				}
			}
			System.out.println(c);
		}
		
	}
}*/






























































































































































































































