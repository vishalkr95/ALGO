
import java.util.*;
public class binaryTree2 {
    static class Node{
    	int data;
    	Node left;
    	Node right;
    	public Node() {}
    	public Node(int data,Node left, Node right ) {
    		this.data=data;
    		this.left=left;
    		this.right=right;
    	}
    	public Node(int data) {
    		this.data=data;
    		left=null;
    		right=null;
    	}
    }
    public static Node constructTree(Integer a[]) {
    	Node root=new Node(a[0],null,null);
    	Stack<pair> st=new Stack();
    	root=new Node(a[0]);
    	pair p=new pair(root,1);
    	st.push(p);
    	int idx=0;
    	while(st.size()>0) {
    		pair t=st.peek();
    		if(t.state==1) {
    			idx++;
    		  if(a[idx]!=null) {
    			  Node n=new Node(a[idx],null,null);
    			  t.node.left=n;
    			  pair np=new pair(n,1);
    			  t.state++;
    			  st.push(np);
    		  }
    		  else {
    			 
    			 t.state++;
    		  }
    		}
    		else if(t.state==2) {
    			idx++;
      		  if(a[idx]!=null) {
      			  Node n=new Node(a[idx]);
      			  t.node.right=n;
      			  pair np=new pair(n,1);
      			  t.state++;
      			  st.push(np);
      		  }
      		  else {
      			 t.state++;
      		  }
    		}
    		else {
    		st.pop();	
    		}
    		
    	}
    	return root;
    }
    static class pair{
    	Node node;
    	int state;
    	public pair(Node n,int s) {
    		node=n;
    		state=s;
    	}
    }
    public static void display(Node root) {
    	if(root==null) {
    		return ;
    	}
    	String s="";
    	if(root.left==null) {
    		s+=".";
    	}
    	else {
    		s+=root.left.data+" ";
    	}
    	s +="<-"+root.data+"->";
    	if(root.right==null) {
    	  s+=".";	
    	}
    	else {
    		s+=root.right.data+" ";
    	}
    	System.out.println(s);
    	display(root.left);
    	display(root.right);
    }
   public static int size(Node root) {
	   
	   if(root==null) {
		   return 0;
	   }
	  
	   int ls=size(root.left);
	   int rs=size(root.right);
	   return ls+rs+1;
   }
   public static int sum(Node root) {
	   if(root==null) {
		   return 0;
	   }
	   int ls=sum(root.left);
	   int rs=sum(root.right);
	   return ls+rs+root.data;
   }
   public static int max(Node root) {
	  
	   if(root==null) {
		   return Integer.MIN_VALUE;
	   }
	 
	   int lm=max(root.left);
	  
	   int rm=max(root.right);
	   int max=Math.max(root.data,Math.max(lm, rm));
	    return max;
   }
   public static int min(Node root) {
	   
	   if(root==null) {
		   return Integer.MAX_VALUE;
	   }
	  
	   int lm=min(root.left);
	 
	    int rm=min(root.right);
	   int min=Math.min(root.data, Math.min(lm, rm));
	    return min;
	   
   }
   public static int height(Node root) {
	   if(root==null) {
		   return -1;
	   }
	   int lh=height(root.left);
	   int rh=height(root.right);
	   return Math.max(lh, rh)+1;
   }
   public static void Treversal(Node root) {
	   if(root==null ) {
		   return ;
	   }
	   System.out.println("Pre"+root.data);
	   Treversal(root.left);
	   System.out.println("In"+root.data);
	   Treversal(root.right);
	   System.out.println("Post"+root.data);
   }
   public static void LevelOrde(Node root) {
	  Queue<Node> q=new ArrayDeque<>();
	  q.add(root);
	  
	   while(q.size()>0) {
		   
		   int s=q.size();
		   for(int i=0;i<s;i++) {
		   Node n=q.remove();
		   if(n.left!=null) {
			  q.add(n.left); 
		   }
		   if(n.right!=null) {
			   q.add(n.right);
		   }
		   System.out.print(n.data+" ");
		   }
		   
		   System.out.println();
	   }
   }
   public static void Iterativepre(Node root) {
	   String pre="";
	   String in="";
	   String post="";
	   Stack<pair> st=new Stack<>();
	   st.add(new pair(root,1));
	   while(st.size()>0) {
		   pair p=st.peek();
		 
		   if(p.state==1) {
			   pre+=p.node.data+" ";
			   if(p.node.left!=null) {
				   st.push(new pair(p.node.left,1));
				  
				   
			   }
              p.state++;
		   }
		   else if(p.state==2) {
			   in+=p.node.data+" ";
			   if(p.node.right!=null) {
				   st.push(new pair(p.node.right,1));
				  
			   }
			   p.state++;
		   }
		   else {
			   post+=p.node.data+" ";
			 st.pop();  
		   }
	   }
	   System.out.println("Pre  "+pre);
	   System.out.println("In  "+in);
	   System.out.println("Post  "+post);
   }
  static ArrayList<Node> paths;
   public static boolean search(Node root,int data) {
	   if(root==null) {
		   return false;
	   }
	   if(root.data==data) {
		  paths.add(root);
		   return true;
	   }
	   boolean l=search(root.left,data);
	   if(l==true) {
		   paths.add(root);
		   return true;
	   }
	   boolean r=search(root.right,data);
	   if(r==true) {
		   paths.add(root);
		   return true;
	   }
	   return false;
   }
   
   public static ArrayList<Node> nodeToRootpath(Node root,int data){
	   if(root==null) {
		   return new ArrayList<>();
	   }
	   if(root.data==data) {
		   ArrayList<Node> al=new ArrayList<>();
		   al.add(root);
		   return al;
	   }
	   ArrayList la=nodeToRootpath(root.left,data);
	   if(la.size()>0) {
		   la.add(root);
		   return la;
	   }
	   ArrayList ra=nodeToRootpath(root.right,data);
	   if(ra.size()>0) {
		   ra.add(root);
		   return ra;
	   }
	   return new ArrayList<>();
   }
   public static void printKleveldown(Node root,int k) {
	   Queue<Node> q=new ArrayDeque<>();
		  q.add(root);
		  int level=1;
		   while(q.size()>0) {
			 if(level!=k)  
			 {
			   int s=q.size();
			   for(int i=0;i<s;i++) {
			   Node n=q.remove();
			   if(n.left!=null) {
				  q.add(n.left); 
			   }
			   if(n.right!=null) {
				   q.add(n.right);
			   }
			   
			   }
			   level++;
			  
			 }
			 else {
				 int s=q.size();
				   for(int i=0;i<s;i++) {
				   Node n=q.remove();
				   if(n.left!=null) {
					  q.add(n.left); 
				   }
				   if(n.right!=null) {
					   q.add(n.right);
				   }
				   System.out.print(n.data+" ");
				   }
                   break;
				   
			 }
		   } 
   }
   
   public static void printKlevelDown2(Node root,int k) {
	   if(root==null || k<0) {
		   return ;
	   }
	   if(k==0) {
		   System.out.print(root.data+" ");
	   }
	   printKlevelDown2(root.left,k-1);
	   printKlevelDown2(root.right,k-1);
   }
   public static void printKlevelFar(Node root,int data,int k) {
	  paths=new ArrayList<>();
	   search(root,data);
	  
	   for(int i=0;i<paths.size();i++) {
		   printKLevelsDown(paths.get(i), k - i, i == 0 ? null : paths.get(i - 1));//
	   }
   }
   public static void printKLevelsDown(Node node, int k, Node blocker) {
	    if (node == null || k < 0 || node == blocker)
	      return;
	    if (k == 0)
	      System.out.println(node.data);
	    printKLevelsDown(node.left, k - 1, blocker);
	    printKLevelsDown(node.right, k - 1, blocker);

	  }
   public static void pathinsumrange(Node root,int l,int h,String s,int sum) {
	   if(root==null) {
		   return ;
	   }
	   if(root.left==null && root.right==null) {
		   
		   s+=root.data;
		   sum+=root.data;
		   if(sum>=l && sum<=h) {
		    System.out.println(s); 
		   }
	   }
	   pathinsumrange(root.left,l,h,s+root.data+" ",sum+root.data); 
	   pathinsumrange(root.right,l,h,s+root.data+" ",sum+root.data); 
   }
   public static void transformToleft(Node root) {
	   if(root==null) {
		   return ;
	   }
	   Node t=root.left;
	   Node n=new Node(root.data);
	   root.left=n;
	   n.left=t;
	   transformToleft(root.left.left);
	   transformToleft(root.right);
   }
   public static Node transformleft(Node root) {
	   if(root==null) {
		   return null;
	   }
	   Node lc=transformleft(root.left);
	   Node rc=transformleft(root.right);
	   Node nn=new Node(root.data);
	   root.left=nn;
	   nn.left=lc;
	   root.right=rc;
	   return root;
   }
   public static Node transformback(Node node) {
	   if(node==null) {
		   return null;
	   }
	   Node lt=transformback(node.left.left);
	   Node rt=transformback(node.right);
	   node.left=lt;
	   node.right=rt;
	   return node;
   }
   public static void printsinglechildnode(Node root) {
	   if(root==null) {
		   return ;
	   }
	   if(root.left!=null && root.right==null) {
		   System.out.println(root.data);
	   }
	   else if(root.left==null && root.right!=null) {
		   System.out.println(root.data);
	   }
	   printsinglechildnode(root.left);
	   printsinglechildnode(root.right);
   }
   public static Node removeleafs(Node root) {
	   if(root==null) {
		   return null;
	   }
	   if(root.left==null && root.right==null) {
		   root=null;
		   return null;
	   }
	 Node lf=removeleafs(root.left);
	 Node rf=removeleafs(root.right);
	 root.left=lf;
	 root.right=rf;
	   return root;
   }
   static int dia=0;
  public static int diameter(Node root) {
	  if(root==null) {
		  return -1;
	  }
	 
	 int lh=diameter(root.left);
	 int rh=diameter(root.right);
	
	 if(lh+rh+2>dia) {
		 dia=lh+rh+2;
	 }
	 int h=Math.max(lh,rh)+1;
	 return h;
  }
  public static int diameter2(Node root) {
	  if(root==null) {
		  return 0;
	  }
	  int ld=diameter(root.left);
	  int rd=diameter(root.right);
	  int dd=height(root.left)+height(root.right)+2;
	  return Math.max(dd, Math.max(rd,ld));
  }
  public static Diapair diameter3(Node root) {
	  if(root==null) {
		Diapair d=new Diapair(0,-1);
		return d;
	  }
	  Diapair ld=diameter3(root.left);
	  Diapair rd=diameter3(root.right);
	  int f=ld.ht+rd.ht+2;
	  int h=Math.max(ld.ht,rd.ht)+1;
	  int d=Math.max(f, Math.max(ld.dia,rd.dia));
	  Diapair nd=new Diapair(d,h);
	  return nd;
  }
  static class Diapair{
	  int dia;
	  int ht;
	  public Diapair(int d,int h) {
		  dia=d;
		  ht=h;
	  }
  }
  
   static int Tilt=0;
   public static int TiltofTree(Node root) {
	  if(root==null) {
		  return 0;
	  }
	  
	  int lh=TiltofTree(root.left);
	  int rh=TiltofTree(root.right);
	 Tilt+=Math.abs(lh-rh); 
	 return lh+rh+root.data;
  }
   public static boolean isBst(Node root) {
	   if(root==null || (root.left==null && root.right==null)) {
		   return true;
	   }
	   boolean lb=isBst(root.left);
	   boolean rb=isBst(root.right);
	   if(root.left!=null && root.right==null) {
	      if(root.left.data<root.data && lb) {
	    	  return true;
	      }
	   }
	   else if(root.right!=null && root.left==null) {
		      if(root.data<root.right.data && rb) {
		    	  return true;
		      }
		   }
	   else {
		   
			      if(root.left.data<root.data && root.data<root.right.data && lb && rb) {
			    	  return true;
			      }
	   }
	   return false;
   }
   static class Bstpair{
	   boolean isBst;
	   int min;
	   int max;
   }
   public static Bstpair isBst2(Node root) {
	   if(root==null) {
		   Bstpair b=new Bstpair();
		   b.isBst=true;
		   b.max=Integer.MIN_VALUE;
		   b.min=Integer.MAX_VALUE;
		   return b;
	   }
	   Bstpair lb=isBst2(root.left);
	   Bstpair rb=isBst2(root.right);
	   Bstpair p=new Bstpair();
	   p.isBst=lb.isBst && rb.isBst && (root.data>lb.max && root.data<rb.min);
	   p.max=Math.max(root.data,Math.max(lb.max,rb.max));
	   p.min=Math.min(root.data,Math.max(lb.min,rb.min));
	   return p;
   }
   public static boolean isBalanced(Node root) {
	   if(root==null) {
		   return true;
	   }
	   boolean lb=isBalanced(root.left);
	   boolean rb=isBalanced(root.right);
	   int h=Math.abs(height(root.left)-height(root.right));
	   if(h<=1 && lb && rb) {
		   return true;
	   }
	   return false;
   }
   static boolean bal=true;
   public static int isBalanced2(Node root) {
	   if(root==null) {
		   return -1;
	   }
	   int lh=isBalanced2(root.left);
	   int rh=isBalanced2(root.right);
	   
	 if(Math.abs(lh-rh)>1) {
			   bal=false;
	   }
	   return Math.max(lh, rh)+1;
   }
   static class Balpair{
	   int ht;
	   boolean isBal;
   }
   public static Balpair isBal(Node root) {
	   if(root==null) {
		   Balpair b=new Balpair();
		   b.ht=-1;
		   b.isBal=true;
		   return b;
	   }
	   Balpair lb=isBal(root.left);
	   Balpair rb=isBal(root.right);
	   Balpair nb=new Balpair();
	   nb.isBal=(Math.abs(lb.ht-rb.ht)<=1) && lb.isBal && rb.isBal;
	   nb.ht=Math.max(lb.ht, rb.ht)+1;
	   return nb;
   }
   public static int largestBst(Node root) {
	   if(root==null) {
		   return 0;
	   }
	   int ll=largestBst(root.left);
	   int rl=largestBst(root.right);
	   if(isBst(root)) {
		   return size(root);
	   }
	   else {
		   if(isBst(root.left) && isBst(root.right)==false) {
			   return size(root.left);
		   }
		   else if(isBst(root.left)==false && isBst(root.right)) {
			   return size(root.right);
		   }
		   else {
			   return 0;
		   }
	   }
   }
   static class Bstpair2{
	   boolean isBst;
	   int min;
	   int max;
	   Node croot;
	   int size;
   }
   public static Bstpair2 isBst3(Node root) {
	   if(root==null) {
		   Bstpair2 b=new Bstpair2();
		   b.isBst=true;
		   b.max=Integer.MIN_VALUE;
		   b.min=Integer.MAX_VALUE;
		   b.croot=null;
		   b.size=0;
		   return b;
	   }
	   Bstpair2 lb=isBst3(root.left);
	   Bstpair2 rb=isBst3(root.right);
	   Bstpair2 p=new Bstpair2();
	   p.isBst=lb.isBst && rb.isBst && (root.data>lb.max && root.data<rb.min);
	   p.max=Math.max(root.data,Math.max(lb.max,rb.max));
	   p.min=Math.min(root.data,Math.max(lb.min,rb.min));
	   if(p.isBst) {
		   p.croot=root;
		   p.size=lb.size+rb.size+1;
	   }
	   else if(lb.size>rb.size) {
		   p.croot=lb.croot;
		   p.size=lb.size;
	   }
	   else {
		   p.croot=rb.croot;
		   p.size=rb.size;
	   }
	   return p;
   }
   public static void main(String[] args) {
	Integer a[]= {50,25,112,null,null,35,30,null,null,null,75,60,null,70,null,null,90,null,null};
	Integer arr[]= {20,15,10,null,null,18,16,null,null,19,null,null,25,22,null,null,30,28,null,null,35,null,null};
	Integer arr1[]= {5,10,15,20,null,null,null,null,25,null,30,null,35,null,null};
	Node root;
     root=constructTree(a);
    Node root1;
    root1=constructTree(arr);
    Node root2;
    root2=constructTree(arr1);
	//display(root);
	//int s=size(root);
	//System.out.println(s);
	//int max=max(root);
	//System.out.println(max);
	//int m=min(root);
	//System.out.print(m);
	//int h=height(root);
	//System.out.println(h);
	//Treversal(root);
    // LevelOrde(root);
    // Iterativepre(root);
	//ArrayList<Integer> al=nodeToRootpath(root,70);
	//System.out.println(al );
    // boolean b=search(root,70);
    //System.out.println(b);
	//printKleveldown(root,3);
	//printKlevelDown2(root,2);
	//printKlevelFar(root,37,3);
	//pathinsumrange(root,50,150," ",0);
	//transformToleft(root); 
	//LevelOrde(root1);
    // Node t=transformleft(root);
     //LevelOrde(t);
     //Node tb=transformback(t);
     //LevelOrde(tb);
	//printsinglechildnode(root);
	//Node r=removeleafs(root);
	//LevelOrde(r);
   // int h=diameter(root);
   //System.out.println(dia);
   // System.out.println(h);
  // int d=diameter2(root);
   //System.out.println(d);
   //Diapair d=diameter3(root);
   //System.out.println(d.dia);
    //int t= TiltofTree(root);
    //System.out.println(t);
     //System.out.println(Tilt);
   // boolean b=isBst(root1);
    //System.out.println(b);
   // Bstpair p=isBst2(root1);
    //System.out.println(p.isBst);
   //boolean b= isBalanced(root1);
  // System.out.println(b);
    //isBalanced2(root);
    //System.out.println(bal);
   //Balpair b=isBal(root2);
   //System.out.println(b.isBal);
   //int lbst=largestBst(root1);
   //System.out.println(lbst);
    Bstpair2  bp=isBst3(root1);
    System.out.println(bp.croot.data+"@"+bp.size);
   
   
   
   
   
   }

}

