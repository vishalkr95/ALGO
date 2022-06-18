
//public class prectice {
//	static int count=0;
//	public  void mcm() {
//		System.out.println("mcm");	
//	}
//  public static void main(String [] args) {
//	  System.out.println("main method");
//	  prectice mp=new prectice();
//	  mp.mcm();
//	  pre p=new pre();
//	  p.prem();
//	  p.prem(8);
//	  p.print(0);
//  }
//}
//
// class pre{
//	 
//	 public pre() {
//		 prectice p=new prectice();
//		p.mcm();
//		if(p.count<3) {
//			p.count++;
//			p.main(null);
//		}
//		
//		 
//	 }
//	public  void prem() {
//		System.out.println("prem");
//	}
//	public  void prem(int v) {
//		
//		System.out.println("premval");
//		print(8);
//	}
//	protected void print(int v) {
//		System.out.println(v);
//	}
//}
/*
public class trees{
	 class Node{
		int val;
		Node left;
		Node right;
		public Node() {
			
		}
		public Node(int val) {
		  this.val=val;
		  left=null;
		  right=null;
		}
	}
	 class pair{
		int state=0;
		Node node;
		public pair(Node node,int s) {
			this.node=node;
			state=s;
		}
	}
	static Node root;
	public static Node creatTree(int arr[]) {
		Stack<pair> st=new Stack<>();
		trees t=new trees();
		Node root=t.new Node(arr[0]);
		//root=new Node(arr[0]);
		trees t1=new trees();
		pair np=t1.new pair(root,0);
		st.push(np);
		int idx=0;
		while(st.size()>0) {
			pair p=st.peek();
			if(p.state==0) {
				idx++;
				if(arr[idx]!=-1) {
					Node n=t.new Node(arr[idx]);
					p.node.left=n;
					st.push(t1.new pair(n,0));
				}
				p.state++;
			}
			else if(p.state==1) {
				idx++;
				if(arr[idx]!=-1) {
					Node n=t.new Node(arr[idx]);
					p.node.right=n;
					st.push(t1.new pair(n,0));
				}
				p.state++;
			}
			else {
				st.pop();
			}
		}
		return root;
	}
	public static void display(Node root) {
		if(root==null) {
			return ;
		}
		String s=(root.left==null?"left ":root.left.val+" ");
		s+=root.val;
		s+=(root.right==null?" right":" "+root.right.val);
		System.out.println(s);
		display(root.left);
		display(root.right);
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Node root =creatTree(arr);
		//creatTree(arr);
		
		display(root);
		System.out.println();
		int arr1[]= {2,3,-1,4,7,-1,-1,-1,9,-1,-1};
		Node root1=creatTree(arr1);
		display(root1);
	}
}
*/
/*
3
tom marvoloriddle
2
lord
voldemort
cheap up
1
heapcup
bruce wayne
2
bat
 */
import java.util.*;
/*class prectice
{
	public static void main (String[] args) 
	{
	
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	//System.out.println(t);
	while(t-->0){
		
	    String a=sc.next()+sc.next();
	  
	   // System.out.println(a);
	    int c=sc.nextInt();
	    String cn="";
	    while(c-->0){
	        cn+=sc.next();
	    }
	   // System.out.println(cn);
	    HashMap<Character,Integer> hm=new HashMap<>();
	    for(int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        
	        hm.put(ch,hm.getOrDefault(ch,0)+1);
	    }
	    int flg=0;
	    for(int i=0;i<cn.length();i++){
	        char ch=cn.charAt(i);
	        int f=hm.getOrDefault(ch,0);
	        if(f>0){
	            hm.put(ch,f-1);
	        }
	        else{
	            System.out.println("NO");
	            flg=1;
	            break;
	        }
	    }
	    if(flg==0) {
	    System.out.println("YES");
	    }
	}
	}
}

*/
/*public class prectice
{
int num = 100;
public void calc(int num)
{
this.num = num * 10;
}
public void printNum()
{
System.out.println(num);
}
public static void main(String[] args)
{
prectice obj = new prectice ();
obj.calc(2);
obj.printNum();
}
}*/
public class prectice

{
	public void pr() {
		
	}
	class a{
		public void pr() {
			
		}
	}
public static void main(String[] args)
{
List p = new ArrayList();
p.add(7);
p.add(1);
p.add(5);
p.add(1);
p.remove(1);
System.out.println(Integer.parseInt("null"));
System.out.println(p);
}
}



































































