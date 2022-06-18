import java.util.*;
public class tree {
	class node{
		int data;
		node left,right;
		public node(int d) {
			data=d;
		}
	}
//static node root;
	public node insert(int v, node root) {
		if(root==null)
			{root =new node(v);
		return root;}
		else
			{Queue<node> q=new LinkedList<node>();
			q.add(root);
			while(!q.isEmpty()) {
				node temp=q.remove();
				if(temp.left==null)
					{temp.left=new node(v);
					break;
					}
				else
				{
					q.add(temp.left);
					}
				if(temp.right==null)
				{	temp.right=new node(v);
				    break;
				}
				else
					q.add(temp.right);
			}
			return root;
			}
		
			                 }
	public void print(node root) {
		if(root==null)
			return ; 
		else {
			System.out.print(root.data);
			print(root.left);
			print(root.right);
		}
		//System.out.println();
	}
	public void delet(int v, node root) {
		if(root==null)
			return ;
		if(root.data==v)
		{
			if(root.left==null && root.right==null)
				root =null;
			else
				{Queue<node> q=new LinkedList<node>();
				q.add(root);
				while(!q.isEmpty()) {
					node n=q.remove();
					if(n.left!=null && n.right!=null)
						{q.add(n.right);
						 q.add(n.left);
						}
					else
						root=n;
					n=null;
					}
				
				}
		}
		
	}
	public static void main(String[] args) {
		tree t=new tree();
		node root =t.new node(9);
		t.insert(8,root);
		t.insert(6,root);
		t.insert(1,root);
		t.insert(4,root);
		t.insert(2,root);
		t.insert(7,root);
		t.print(root);
		t.delet(9,root);
		System.out.println();
		t.print(root);

		
	}
	}*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class tree{
	class node{ 
		int data;
		node left,right;
		public node(int v) {
			data=v;
		}
	}
	 node root;
	public void insert(int v,node root) {
		if(root==null)
	     {root=new node(v);
	     return;
	     }
		else 
		{
			Queue<node> q=new LinkedList<node>();
			q.add(root);
			while(!q.isEmpty()) {
				node t=q.remove();
				if(t.left==null)
				{
					t.left=new node(v);
					break;
				}
				if(t.right==null) {
					t.right=new node(v);
					break;
				}
				else {
					q.add(t.left);
					q.add(t.right);
				}
			}
			
		}
		
	}
	public void print(node root) {
		if(root==null)
			return;
		else
		{
			System.out.println(root.data);
			print(root.left);
			print (root.right);
			
		}
	}
	public void search(node root ,int v) {
		if(root==null)
			return;
		if(root.data==v)
			System.out.println("value found");
	
		else {
			search(root.left,v);
			search(root.right,v);
		}
	}
	public node deepestnode(node root) {
		Queue<node> q=new LinkedList<node>();
		q.add(root);
		node t=null;
		while(!q.isEmpty()) {
			 t=q.remove();
			if(t.left!=null)
				q.add(t.left);
		   if(t.right!=null)
			   q.add(t.right);
		 }
		return t;
		
	}
	public void delet(node root , int v) {
		if(root==null)
			return;
		if(root.data==v) {
		if(root.left==null && root.right==null) {
			root=null;}
			else
			{root.data
				=deepestnode(root).data;
		     deletdeepestnode(root);
			}
		}
		
		else {
			delet(root.left,v);
			delet(root.right,v);
		}
		
		System.out.println(" value not found");
	}
	public void deletdeepestnode(node root) {
		if(root==null)
			return;
		if(root.left==null &&root.right==null)
			root=null;
		else {
			Queue<node> q =new LinkedList<node>();
			q.add(root);
			node t=null;
			while(!q.isEmpty()) {
				 t=q.remove();
				if(t.left!=null)
					q.add(t.left);
				if(t.right!=null)
					q.add(t.right);
			}
			t=null;
			
		}
	}
	int sum=0;
	public int sum(node root) {
		if(root==null)
			{return 0;}
		sum=sum+root.data;
		sum(root.left);
		sum(root.right);
		return sum;
		
	}
	public void printleftview(node root) {
		if(root==null)
			return;
		else{
			printleftview(root.left);
			System.out.println(root.data);
			
			}
	}
	public void printrightview(node root) {
		if(root==null)
			return;
		else {
			printrightview(root.right);
			System.out.println(root.data);
		}
	}
	public static void main(String [] args) {
		tree tt=new tree();
		node root=tt.new node(11);
		tt.insert(5,root);
		tt.insert(6,root);
		tt.insert(7,root);
		tt.insert(8,root);
		tt.insert(13,root);
		tt.insert(12,root);
		tt.print(root);
	//	tt.search(root, 6);
	//System.out.println(	tt.deepestnode(root).data);
	//tt.delet(root, 11);
	//tt.deletdeepestnode(root);
	//tt.print(root);
   // System.out.println(tt.sum(root));
		System.out.println();
		tt.printleftview(root);
		System.out.println();
		tt.printrightview(root);
	}
}/*
public class tree{
	 private static class Node{
		int data;
		ArrayList<Node> children =new ArrayList<>();
		
	}
	public static Node creat(int arr[]) {
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
	
	public static void display(Node n) {

		String str=n.data +"->";
		for(Node n1 : n.children) {
			str +=n1.data+" ";
		}
		str += ".";
		System.out.println(str);
		for(Node n1 : n.children) {
			display(n1);
		}
	}
	public static void level(Node n) {
	Stack<Node> st =new Stack<>();
	Stack<Node> st1 =new Stack<>();
		st.add(n);
		int l=0;
	while(st.size()>0) {
		Node t=st.pop();
		System.out.print(t.data+" ");
		if(l%2==0) {
		for(Node c: t.children) {
			st1.add(c);
		}}
		else {
			for(int i=t.children.size()-1; i>=0;i--) {
				st1.add(t.children.get(i));
			}
		}
		if(st.size()==0) {
			st=st1;
			st1=new Stack();
			l++;
			System.out.println();
		}
	}
		}
	public static int max(Node n) {
	int maxd=n.data;
	for(Node c: n.children) {
		int t=max(c);
		if(t>maxd) {
			maxd=t;
			}
		}
	
	return maxd;
	}
	public static int height(Node n) {
		int h=-1;
		for(Node c: n.children) {
			int t=height(c);
			if(h<t) {
			h=t;	
			}
		}
		h=h+1;
		return h;
	}
	public static boolean mirror(Node n,Node c) {
	if(n.children.size()!=c.children.size()) {
		return false;
	}
	for(int i=0;i<n.children.size();i++) {
	int j=n.children.size()-1-i	;
	Node p=n.children.get(i);
	Node p1=c.children.get(j);
	return mirror(p,p1);
	}
	return true;
	}
static	int height;
static	int size;
static	int max;
static	int min;
	public static void multi(Node n,int d) {
		size++;
		if(n.data>max) {
			max=n.data;
		}
		if(n.data<min) {
			min=n.data;
		}
		if(d>height) {
			height=d;
		}
		for(Node c:n.children) {
			multi(c,d+1);
		}
		}
	public static boolean issmetric(Node root) {
		return mirror(root,root);
	}
		
	public static void main(String [] args)throws Exception {
	       int arr[]= {1000,20,50,-1,60,-1,-1,900,70,-1,80,110,-1,500,-1,-1,90,-1,-1,40,100,-1,34,-1,-1,-1};
			Node root=creat(arr);
	     // display(root);
		//System.out.print("tree created");
			//level(root);
		//System.out.print(max(root));
			//System.out.print(height(root));
			//mirror(root);
			//level(root);
			/*size=0;
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
			height=0;
			multi(root,0);
			System.out.print(size);
			System.out.print(min);
			System.out.print(max);
			System.out.print(height);*/
			System.out.print(issmetric(root));
	}
}



















































































































































