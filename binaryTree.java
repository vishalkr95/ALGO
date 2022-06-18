import java.util.*;

/*public class binaryTree {
	 node root;
	class node{
		int data;
		node next;
		node pre;
		public node() {}
		public node(int v) {
			data=v;
		}
	}
	public node creatbinaryTree() {
		node friat = new node(2);
		node second =new node(3);
		node third =new node(4);
		node fourth =new node();
		{fourth.data=5;}
		root=friat;
		root.next=second;
		root.pre=third;
		root.next.next=fourth;
	return root;
			}
	public int print(node root) {
		//String str="";
		
		if(root==null)
		//	str +=" ";
			System.out.println("empty");
		
		else {
		//	str +=root.data+" ";
			System.out.println(root.data);
			}
		/*if(root.next==null)
			str +=" ";
		else
			str +=root.next.data+" ";
		if(root.pre==null)
			str +=" ";
		else
			str +=root.pre.data +" ";*/
		//System.out.println(str);
		// print(root.next);
	//int v1=	print(root.pre);
	//	return root.data;
		//}
	/*public void insert( int v) {

	if(root==null)
		root.data=v;
	if(v>root.data)
		root.next=insert(root.next;)
	
			
		
	}*/
	
/*	public static void main(String[] args) {
		
    binaryTree bt=new binaryTree();
    node n=bt.creatbinaryTree();
    bt.print(n);
   
	}

}*/

class binaryTree{
	static class node{
		int data;
		node left,right;
		public node(int d,node left,node right) {
			data=d;
			this.left=left;
			this.right=right;
			
		}
		public node() {}
	}
	static class pair{
		node n;
		int s;
		public pair(node n,int s) {
			this.n=n;
			this.s=s;
		}
		
	}
	public static node creattree(Integer []a,node n) {
		Stack<pair> st=new Stack<>();
		n.data=a[0];
		pair pr=new pair(n,1);
		st.add(pr);
		int idx=0;
		while(st.size()>0) {
			pair top=st.peek();
			
			if(top.s==1) {
				idx++;
				if(a[idx]!=null) {
			node t=new node(a[idx],null,null);
			top.n.left=t;
			pair lp=new pair(t,1);
			st.add(lp);
			}
				else {
					top.n.left=null;
				}
				top.s++;
			}
			else if(top.s==2) {
				idx++;
			if(a[idx]!=null) {
				node rn=new node(a[idx],null,null);
				top.n.right=rn;
			pair rp=new pair(rn,1);
			st.add(rp);
			}
			else {
				top.n.right=null;
			}
			top.s++;
			}
            else {
            	top.s++;
				st.pop();
			}
			
		}
		
		return n;
	}
	public static void display(node n) {
		if(n==null) {
			return;
		}
		System.out.println(n.data);
		display(n.left);
		display(n.right);
		
	}
	public static void displaylevel(node n) {
		if(n==null) {
			return;
		}
		String str="";
		str+=n.left==null?". ":n.left.data+ " ";
		str+="-> "+n.data +" ->";
		str+=n.right==null?". ":n.right.data +" ";
		System.out.println(str);
		displaylevel(n.left);
		displaylevel(n.right);
		
	}
	public static void levelorder(node n) {
		if(n==null) {
			return;
		}
		Queue<node> q=new LinkedList<>();
		q.add(n);
		while(q.size()>0) {
			int c=q.size();
			for(int i=0;i<c;i++) {
				n=q.remove();
				System.out.print(n.data);
				if(n.left!=null) {
				q.add(n.left);}
				if(n.right!=null) {
				q.add(n.right);}
			}
			System.out.println();
		}
	}
	public static int height(node n) {
		if(n==null) {
			return -1;
		}
		int lh=height(n.left);
		int rh=height(n.right);
		int max=lh;
		if(lh<rh) {
			max=rh;
		}
		return max+1;
	}
	public static int daimeter(node n) {
		if(n==null) {
			return 0;
		}
		int lh=height(n.left);
		int rh=height(n.right);
		int ld=daimeter(n.left);
		int rd=daimeter(n.right);
		int max=ld>rd?ld:rd;
		return lh+rh+2>max?lh+rh+2:max;
	}
	public static void main(String [] args) {
	Integer a[]= {3,4,5,null,null,6,null,null,7,8,null,null,9,null,null};
	
		node root=new node();
		root=creattree(a,root);
		//display(root);
		//displaylevel(root);
		levelorder(root);
		int h=height(root);
		System.out.println(h);
		int d=daimeter(root);
		System.out.println(d);
	}
}


















































































































