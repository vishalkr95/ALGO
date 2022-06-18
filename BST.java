import java.util.*;



public class BST {
 static class Node{
	 int data;
	 Node left;
	 Node right;
	 public Node() {}
	 public Node(int data) {
		 this.data=data;
	 }
 }
 public static Node constructBST(int a[],int l,int h) {
	if(l>h) {
		return null;
	}
	int mid=(l+h)/2;
	int d=a[mid];
	Node  root=new Node(d);
	root.left=constructBST(a,l,mid-1);
	root.right=constructBST(a,mid+1,h);
	 return root;
 }
 public static void display(Node root) {
	 if(root==null) {
		 return ;
	 }
	 display(root.left);
	 System.out.print(root.data+" ");
	 display(root.right);
 }
 public static int size(Node root) {
	 if(root==null) {
		 return 0;
	 }
	 int l=size(root.left);
	 int r=size(root.right);
	 return l+r+1;
 }
 public static int sum(Node root) {
	 if(root==null) {
		 return 0;
	 }
	 int ls=sum(root.left);
	 int rs=sum(root.right);
	 return ls+rs+root.data;
 }
 public static int min(Node root) {
	 if(root==null) {
		 return Integer.MIN_VALUE;
	 }
	 if(root.left==null) {
		 return root.data;
	 }
	 int lm=min(root.left);
	 return lm;
 }
 public static int max(Node root)
 {
	 if(root==null) {
		 return Integer.MAX_VALUE;
	 }
	 if(root.right==null) {
		 return root.data;
	 }
	 int rd=max(root.right);
	 return rd;
	 
 }
 //static ArrayList<Integer>  al;
 public static boolean find(Node root,int data) {
	 if(root==null) {
		
		 return false;
	 }
	 if(root.data==data) {
		 //al.add(root.data);
		 return true;
	 }
	 else if(root.data>data) {
		// al.add(root.data);
		 return find(root.left,data);
	 }
	 else {
		// al.add(root.data);
		 return find(root.right,data);
	 }
 }
 public static Node addinBST(Node root,int data) {
	 if(root==null) {
		 root=new Node(data);
		 return root ;
	 }
	 if(root.data<data) {
		 root.right=addinBST(root.right,data);
        		
	 }else {
		 root.left= addinBST(root.left,data);
		
	 }
 return	root; 
 }
 public static Node removeNode(Node root,int data) {
	 if(root==null) {
		 return null;
	 }
	 if(root.data==data) {
		 if(root.left!=null && root.right==null) {
			 return root.left;
		 }
		 else if(root.left==null && root.right!=null) {
			 return root.right;
		 }
		 else if(root.left==null && root.right==null) {
			 return null;
		 }
		 else {
			 int max=max(root.left);
				root.data=max;
				
				root.left=removeNode(root.left,max);
				return root;
			
		 }
	 }
	 else if(root.data<data) {
	      root.right=removeNode(root.right,data);
	 }
	 else {
		  root.left=removeNode(root.left,data);
	 }
	 return root;
 }
 static int sum=0;
 public static void replaceNodeWithLSum(Node root) {
	 if(root==null) {
		 return ;
	 }
	replaceNodeWithLSum(root.right);
	int t=root.data;
	 root.data=sum;
	   sum+=t;
	replaceNodeWithLSum(root.left);
	 
 }
 public static ArrayList<Integer> nodeToRootpath(Node root,int data){
	 if(root==null) {
		 return new ArrayList<>(); 
	 }
	 if(root.data==data) {
		 ArrayList<Integer> al=new ArrayList<>();
		 al.add(root.data);
		 return al;
	 }
ArrayList<Integer> l=nodeToRootpath(root.left,data);
if(l.size()>0) {
	l.add(root.data);
	return l;
}
ArrayList<Integer> r=nodeToRootpath(root.right,data);
if(r.size()>0) {
	r.add(root.data);
	return r;
}
	 
 return new ArrayList<>();
 }
 public static int LCA(Node root,int d1,int d2) {
	 if(root==null) {
		 return -1;
	 }
	 if(d1>root.data && d2>root.data) {
	  return LCA(root.right,d1,d2);
	 }
	 else if(d1<root.data && d2<root.data) {
	  return LCA(root.left,d1,d2);
	 }
	 else {
		 return root.data;
	 }
 }
 public static void printNodeinrange(Node root,int l,int h) {
	 if(root==null) {
		 return ;
	 }
	 if(root.data<l) {
		 printNodeinrange(root.right,l,h); 
	 }
	 else if(root.data>h) {
		 printNodeinrange(root.left,l,h);
	 }
	 else {
		 printNodeinrange(root.left,l,h);
		 System.out.print(root.data+" ");
		 printNodeinrange(root.right,l,h);
		
	 }
 }
 public static void TargetSum(Node root,Node node,int target) {
	 if(node==null) {
		 return ;
	 }
	 
	TargetSum(root,node.left,target);
	int c=target-node.data;
	if(node.data<c) {
	if(find(root,c)) {
		System.out.println(node.data+" "+c);
	}
	}
	TargetSum(root,node.right,target);
	
 }
 static ArrayList<Integer> all;
 public static void targetsumhelper(Node root){
	 if(root==null) {
		return ; 
	 }
	 targetsumhelper(root.left);
	 all.add(root.data);
	 targetsumhelper(root.right);
 }
 public static void targetsum2(Node root,int tar) {
	 all=new ArrayList<>();
	 targetsumhelper(root);
	 System.out.println(all);
	int i=0;
	int j=all.size()-1;
	
	while(i<j) {
		if(all.get(i)+all.get(j)>tar) {
			j--;
		}
		if(all.get(i)+all.get(j)<tar) {
			i++;
		}
		if(all.get(i)+all.get(j)==tar) {
			System.out.println(i+" "+j);
			System.out.println(all.get(i)+" "+ all.get(j));
			i++;
			j--;
		}
		
	}
 }
 static class pair{
	 Node node;
	 int state;
	 public pair(Node n,int s) {
		 node=n;
		 state=s;
	 }
 }
 public static Node iterativeINleft(Stack<pair> ls) {
	 
	 while(ls.size()>0) {
		 pair p=ls.peek();
		 if(p.state==0) {
			 if(p.node.left!=null) {
			ls.push((new pair(p.node.left,0)));
			 }
			p.state++;
		 }
		 else if(p.state==1) {
			 if(p.node.right!=null) {
			 ls.push(new pair(p.node.right,0));
			 }
			 p.state++;
			 return p.node;
		 }
		 else {
			 ls.pop();
		 }
		 
	 }
return null;	 
 }
 public static Node iterativeINright(Stack<pair> rs) {
	
	 while(rs.size()>0) {
		 pair p=rs.peek();
		 if(p.state==0) {
			 if(p.node.right!=null) {
			rs.push((new pair(p.node.right,0)));
			 }
			p.state++;
		 }
		 else if(p.state==1) {
			 if(p.node.left!=null) {
			 rs.push(new pair(p.node.left,0));
			 }
			 p.state++;
			 return p.node;
		 }
		 else {
			 rs.pop();
		 }
		 
	 }
return null;	 
 }
public static void targetsumBEST3(Node root,int tar) {
	Stack<pair> l=new Stack<>();
	 Stack<pair> r=new Stack<>();
	 l.push(new pair(root,0));
	 r.push(new pair(root,0));
	Node ls=iterativeINleft(l);
	Node rs=iterativeINright(r);
	while(ls.data<rs.data) {
		if(ls.data+rs.data<tar) {
			ls=iterativeINleft(l);
		}
		else if(ls.data+rs.data>tar) {
			rs=iterativeINleft(r);
		}
		else {
			System.out.println(ls.data+" "+rs.data);
			rs=iterativeINleft(l);
			rs=iterativeINright(r);
		}
	}
	
 }
	 public static void main(String[] args) {
 
	int a[]= {12,25,37,50,62,75,87};
	Node root=constructBST(a,0,a.length-1);
      // display(root);
      // int s=size(root);
       //System.out.println(s);
	//int s=sum(root);
	//System.out.println(s);
	//int m=min(root);
	//System.out.println(m);
	//int ma=max(root);
	//System.out.println(ma);
	//al=new ArrayList<>();
	//boolean b=find(root,37);
	//System.out.println(al);
	//System.out.println(b);
	//addinBST(root,60);
	 //display(root);
	//removeNode(root,60);
	//display(root);
	//replaceNodeWithLSum(root);
	//display(root);
	//ArrayList<Integer> rd=nodeToRootpath(root,62);
	//System.out.println(rd);
	//int lca=LCA(root,62,75);
	//System.out.println(lca);
	// printNodeinrange(root,25,62);
	//TargetSum(root,root.left,100);
	//targetsum2(root,100);
	targetsumBEST3(root,100);
	 
	 }

}
