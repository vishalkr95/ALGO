import java.util.*;

/*public class genericTree {
	static class Node{
		int data;
		ArrayList<Node> child=new ArrayList<>();
		public Node() {}
		public Node(int data) {
			this.data=data;
		}
	}
	static class pair{
		Node n;
		int l;
		pair(Node n,int l){
			this.n=n;
			this.l=l;
		}
	}
	public static Node generateTree(Node root,int []arr) {
		Stack<Node> st=new Stack<>();
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]==-1) {
	    		st.pop();
	    	}
	    	else {
	    		Node t=new Node(arr[i]);
	    		if(st.size()==0) {
	    			root=t;
	    		}
	    		else {
	    			st.peek().child.add(t);
	    		}
	    		st.push(t);
	    	}
	    }
	return	root;
	}
/*public static void display(Node root) {
	if(root==null) {
		return ;
	}
	System.out.print(root.data+" >");
	for(int i=0;i<root.child.size();i++) {
		System.out.print(root.child.get(i).data+" ");
	}
	System.out.println();
	for(int i=0;i<root.child.size();i++) {
		display(root.child.get(i));
	}
}
	public static void display(Node root) {
		
		String s=root.data+" > ";
		for(Node c : root.child) {
			s+=c.data+" ";
		}
		System.out.println(s);
		for(Node c: root.child) {
			display(c);
		}
	}

	
	public static int size(Node root) {
	 int size=0;
		for(Node c: root.child) {
			 size+=size(c);
		}
		return size+1;
	}
	
	public static int max(Node root) {
		int max=Integer.MIN_VALUE;
		for(Node c : root.child) {
			int m=max(c);
			max=Math.max(m, max);
		}
		return Math.max(max,root.data);
	}
	
	public static int height(Node root) {
		int h=-1;
		for(Node c: root.child) {
			int h1=height(c);
			h=Math.max(h1, h);
		}
		return h+1;
	}
	public static void traversal(Node root) {
		System.out.println("Node pre "+root.data);
		for(Node c: root.child) {
			System.out.println("Edge pre "+root.data+" "+c.data);
			traversal(c);
			System.out.println("Edge post "+root.data+" "+c.data);
		}
		System.out.println("Node post "+root.data);
	}
	
	public static void levelorder(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(q.size()>0) {
			Node t =q.remove();
			System.out.print(t.data+" ");
			for(Node c: t.child) {
				q.add(c);
			}
			
		}
		
	}
	public static void levelorerlinewise(Node root) {
		Queue<Node> q=new LinkedList<>();
		Queue<Node> q1=new LinkedList<>();
		q.add(root);
		while(q.size()>0) {
			while(q.size()>0) {
			Node t=q.remove();
			for(Node c : t.child) {
				q1.add(c);
			}
			System.out.print(t.data+" ");
			}
			System.out.println();
			while(q1.size()>0) {
				q.add(q1.remove());
			}
		
		}
	}
	public static void levelordeZigzag(Node root) {
		Stack<Node> stm=new Stack<>();
		Stack<Node> sth=new Stack<>();
		
		stm.add(root);
		int i=0;
		while(stm.size()>0) {
			Node t=stm.pop();
			if(i%2==0) {
				for(Node c: t.child) {
					sth.add(c);
				}
				
			}
			else {
				for(int j=t.child.size()-1;j>=0;j--) {
				  sth.add(t.child.get(j));
				 
				}
				
			}
			System.out.print(t.data+" ");
			if(stm.size()==0) {
				stm=sth;
				sth=new Stack<>();
				System.out.println();
				i++;
			}
		}
	}
	
	public static void leveloder2(Node root) {
		Queue<Node> q=new ArrayDeque<>();
		q.add(root);
		q.add(new Node(-1));
		
		while(q.size()>0) {
			Node t=q.remove();
			if(t.data==-1) {
				System.out.println();
				if(q.size()>0) {
					q.add(new Node(-1));
				}
			}
			else {
				System.out.print(t.data+" ");
				for(Node c: t.child) {
					q.add(c);
				}
				
			}
		}
	}
	
	public static void levelorde3(Node root) {
		Queue<Node> q=new ArrayDeque<>();
		q.add(root);
		while(q.size()>0) {
			int s=q.size();
			for(int i=0;i<s;i++) {
				Node t=q.remove();
				for(Node c : t.child) {
					q.add(c);
				}
				System.out.print(t.data+" ");
			}
			System.out.println();
		}
	}
	
	public static void levelorder4(Node root) {
		Queue<pair> q=new ArrayDeque<>();
		q.add(new pair(root,1));
		int l=1;
		while(q.size()>0) {
			pair p=q.remove();
			if(p.l>l) {
				l=p.l;
				System.out.println();
			}
			System.out.print(p.n.data+" ");
			for(Node c : p.n.child) {
				q.add(new pair(c,p.l+1));
			}
		
		}
	}
	public static void mirrorimage(Node root) {
		int i=0;
		int j=root.child.size()-1;
		while(i<j) {
			Node t=root.child.get(i);
			root.child.set(i, root.child.get(j));
			root.child.set(j, t);
			i++;
			j--;
		}
		for(Node c : root.child) {
			mirrorimage(c);
		}
	}
	public static void removeleef(Node root) {
		for(int i=root.child.size()-1;i>=0;i--) {
			Node c=root.child.get(i);
			if(c.child.size()==0) {
				root.child.remove(c);
			}
			else {
				removeleef(c);
			}
		}
	}
	public static void liniarise(Node root) {
		for(Node c : root.child) {
			liniarise(c);
		}
		while(root.child.size()>1) {
			Node lc=root.child.remove(root.child.size()-1);
			Node sl=root.child.get(root.child.size()-1);
			Node ln=getlast(sl);
			ln.child.add(lc);
		}
	}
	public static Node getlast(Node n) {
		
		while(n.child.size()!=0) {
			n=n.child.get(0);
		
		}
		return n;
	}
	public static boolean search(int n , Node root) {
		if(root.data==n) {
			return true;
		}else {
		    
		     for(Node c: root.child) {
		    	boolean b=search(n,c);
		    	if(b==true) {
		    		return true;
		    	}
		    	
		     }
		}
		return false;
	}
	public static ArrayList<Integer> rootToNodePath(Node root,int v){
		if(root.data==v) {
			ArrayList<Integer> a=new ArrayList<>();
			a.add(v);
			return a;
		}
		
		for(Node c : root.child) {
			ArrayList<Integer> r=new ArrayList<>();
			r=rootToNodePath(c,v);
			if(r.size()>0) {
				r.add(root.data);
				return r;
			}
		}
		
		return new ArrayList<>();
	}
	public static int loweatcommanA(int a,int b,Node root) {
		ArrayList<Integer> l1=rootToNodePath(root,a);
		ArrayList<Integer> l2=rootToNodePath(root,b);
	  int p1=l1.size()-1;
	  int p2=l2.size()-1;
	 
	  while(p1>=0 && p2>=0 && l1.get(p1)==l2.get(p2)) {
		  p1--;
		  p2--;
	  }
	  p1++;
	  p2++;
	  
	 return l1.get(p1);
	 // return p1+p2; for distance between two nodes
	}
public static boolean isTreeissimilar(Node root1,Node root2) {
	
	if(root1.child.size()!=root2.child.size()) {
		return false;
	}

	for(int i=0;i<root1.child.size();i++) {
		Node one=root1.child.get(i);
		Node two=root2.child.get(i);
	boolean b=isTreeissimilar(one,two);
	if(b==false) {
		return false;
	}
	}
	return true;
}
public static boolean areTreemirrorinshape(Node root1,Node root2) {
	mirrorimage(root2);
	boolean b=isTreeissimilar(root1,root2);
	if(b==true) {
		return true;
	}
	return false;
}
public static boolean areTreeMirror2(Node root1,Node root2) {
	if(root1.child.size()!=root2.child.size()) {
		return false;
	}
	for(int i=0;i<root1.child.size();i++) {
		int j=root1.child.size()-1-i;
		Node c1=root1.child.get(i);
		Node c2=root2.child.get(j);
		if(areTreeMirror2(c1,c2)==false) {
			return false;
		}
		}
	return true;
}
public static boolean isSymmetric(Node root) {
	if(root.child.size()==0) {
		return true;
	}
	for(int i=0;i<root.child.size()/2;i++) {
		int j=root.child.size()-1-i;
		Node c1=root.child.get(i);
		Node c2=root.child.get(j);
		if(isTreeissimilar(c1,c2)==false) {
			return false;
		}
	}
	return true;
}
public static boolean isSymmetric2(Node root) {
	return areTreeMirror2(root,root);
}
static int size=0;
static int min=Integer.MAX_VALUE;
static int max=Integer.MIN_VALUE;
static int height=0;
public static void multisolve(Node root,int depth) {
	if(root==null) {
		return ;
	}
	size++;
	min=Math.min(root.data, min);
	max=Math.max(root.data, max);
   height=Math.max(height, depth);
	for(Node c :root.child) {
		multisolve(c,depth+1);
	}
	
}
static Node predecessor=null;
static Node successor=null;
static int state=0;
public static void predAndSucc(Node root,int data) {
	if(state==0) {
		if(root.data==data) {
			state=1;
		}else {
			predecessor=root;
		}
	}
	else if(state==1) {
		successor=root;
		state=2;
	}
	
	for(Node c : root.child) {
		predAndSucc(c,data);
	}
}
static int cail=Integer.MAX_VALUE;
static int floor=Integer.MIN_VALUE;
public static void cailAndfloor(Node root,int data) {
	if(root.data<data) {
		floor=Math.max(root.data,floor);
	}
	else {
		cail=Math.min(cail, root.data);
	}
	for(Node c : root.child) {
		cailAndfloor(c,data);
	}
}

public static int Kthlargest(Node root,int k) {
	int factor=Integer.MAX_VALUE;
   
	for(int i=0;i<k;i++) {
		cailAndfloor(root,factor);
		factor=floor;
		floor=Integer.MIN_VALUE;
	}
	return factor;
}
static int maxs=Integer.MIN_VALUE;
static Node maxsnode=null;
public static int maximumsum(Node root) {
	int tmps=0;
	for(Node c : root.child) {
	int	cs=maximumsum(c);
		tmps+=cs;
	}
	tmps +=root.data;
	if(tmps>maxs) {
		maxs=tmps;
		maxsnode=root;
	}
	return tmps;
}
static int dia=0;
public static int diameter(Node root) {
	int h=-1;
	int sh=-1;
	for(Node c : root.child) {
		int ch=diameter(c);
		if(ch>h) {
			sh=h;
			h=ch;
		}
		else if(ch>sh) {
			sh=ch;
		}
	}
	
	if(sh+h+2>dia) {
		dia=sh+h+2;
	}
	h++;
	return h;
}
public static void iterativePreAndPost(Node root) {
	Stack<pair> st=new Stack<>();
	st.push(new pair(root,-1));
	String pre="";
	String pos="";
	while(st.size()>0) {
	pair p=st.peek();
	if(p.l==-1) {
		pre+=p.n.data+" ";
		p.l++;
	}
	else if(p.l==p.n.child.size()) {
		pos+=p.n.data+" ";
		st.pop();
	}
	else {
		pair np=new pair(p.n.child.get(p.l),-1);
		st.push(np);
		p.l++;
	}
	}
	System.out.println(pre);
	System.out.println(pos);
}
public static void main(String[] args) {
		int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    Node root=new Node();
    //int arr[]= {10,20,30,-1,-1,40,-1,-1};
   // int a[]= {1,2,-1,3,4,-1,-1,-1};
  root=  generateTree(root,arr);
  Node root1=new Node();
       int arr1[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        //int arr1[]= {10,20,-1,30,40,-1,-1};
        root1=generateTree(root1,arr1);
   //display(root);
   //int s=size(root);
  // System.out.println(s);
   // int m=max(root);
    //System.out.println(m);
	//int h=height(root);
	//System.out.println(h);
    //traversal(root);
   // levelorder(root);
  //  levelorerlinewise(root);
   // levelordeZigzag(root);
   //leveloder2(root);
   // levelorde3(root);
   // levelorder4(root);
   // mirrorimage(root);
    //levelorder4(root);
   // removeleef(root);
    //levelorde3(root);
   // liniarise(root);
    //display(root);
  //boolean b=  search(100,root);
  //System.out.println(b);
   // ArrayList<Integer> a=rootToNodePath(root,110);
    //System.out.println(a);
	//int t=loweatcommanA(110,70,root);//same for distance between two node
	//System.out.println(t);
 // boolean b=isTreeissimilar(root,root1);
//	System.out.println(b);
 //boolean b= areTreemirrorinshape(root,root1);
 //System.out.println(b);
      // boolean b= areTreeMirror2(root,root1);
       //System.out.println(b);
     //  boolean b= isSymmetric(root);
      // System.out.println(b);
      // boolean   b=isSymmetric2(root);
     //  System.out.println(b);
  // multisolve(root,0);
   //System.out.println(size);
  // System.out.println(max);
  // System.out.println(min);
   //System.out.println(height);
   // predAndSucc(root,30);
     if(predecessor!=null) {
     System.out.println(predecessor.data);
     }
     else {
    	 System.out.println("predecessor not found");
     }
     if(successor!=null) {
     System.out.println(successor.data);
     }
     else {
    	 System.out.println("sucessor not found");
     }
    //  cailAndfloor(root,5);
     //System.out.println(cail);
     //System.out.println(floor);
    // int k= Kthlargest(root,3);
     //System.out.println(k);
      //  maximumsum(root);
       // System.out.println(maxsnode.data+"   "+maxs);
      // diameter(root);
       // System.out.println(dia);
        iterativePreAndPost(root);
    }

}*/
/*class genericTree{
	static class Node {
		int data;
		ArrayList<Node> child;
		public Node() {}
		public Node(int data) {
			this.data=data;
			child=new ArrayList<>();
		}
		
	}
	public static Node constructTree(Node root,int []arr) {
	Stack<Node> st=new Stack<>();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==-1) {
			st.pop();
		}
		else {
			Node n=new Node(arr[i]);
			if(st.size()==0) {
				root=n;
			}
			else {
			Node t=st.peek();
			t.child.add(n);
			}
			st.push(n);
		}
	}
	return root;
	}
  public static class GenericTree implements Iterable<Integer>{
	  Node root;
    public GenericTree(Node root) {
    	this.root=root;
    }
	
	public Iterator<Integer> iterator() {
		Iterator obj=new GenericTreeNode(root); 
		return obj;
	}
	  
  }
  public static class GenericTreeNode implements Iterator {
   Integer nval;
   Stack<pair> st;
	public GenericTreeNode(Node root) {
	     st=new Stack<>();
	     st.push(new pair(root,-1));
	     next();
	}
	public boolean hasNext() {
		if(nval==null) {
		return false;	
		}
		else {
		return true;
		}
	}

	
	public Integer next() {
		Integer i=nval;
		nval=null;
		while(st.size()>0) {
			pair p=st.peek();
			if(p.state==-1) {
				nval=p.node.data;
				p.state++;
				break;
			}
			else if(p.state==p.node.child.size()) {
				st.pop();
			}
			else {
				st.push(new pair(p.node.child.get(p.state),-1));
				p.state++;
			}
		}
		
		return i;
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
	public static void main(String [] args) {
		int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
	    Node root=new Node();
	  root =constructTree(root,arr);
	   GenericTree gt=new GenericTree(root) ;
	 
	  for(int val : gt) {
		System.out.println(val+" ");  
	  }
	  //System.out.println();
	  Iterator<Integer> gti=gt.iterator();
	  while(gti.hasNext()!=false) {
		 
		  System.out.println(gti.next());
		  
	  }
	}
}*/

class genericTree{
	static class Node{
		int data;
		ArrayList<Node> child;
		public Node() {}
		public Node(int data) {
			this.data=data;
			child=new ArrayList<>();
			}
		}
	public static Node constructTree(Node root,int []a) {
		Stack<Node> st=new Stack<>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==-1) {
				st.pop();
			}
			else {
				Node t=new Node(a[i]);
				if(st.size()==0) {
					root=t;
				}
				else {
					st.peek().child.add(t);
				}
				st.push(t);
			}
		}
		return root;
	}
	public static class GenericTree implements Iterable<Integer>{
		Node root;
       public GenericTree(Node root) {
    	   this.root=root;
       }
		
		public Iterator<Integer> iterator() {
			Iterator obj=new  GenericTraversal(root);
			return obj;
		}
		
	}
	public static class GenericTraversal implements Iterator<Integer>{
		Integer nval;
		Stack<pair> st;
		public GenericTraversal(Node root) {
			st=new Stack();
			st.push(new pair(root,-1));
			next();
		}

		
		public boolean hasNext() {
			if(nval==null) {
			return false;
			}
			else {
				return true ;
			}
		}

		
		public Integer next() {
			Integer i;
			i=nval;
			nval=null;
			while(st.size()>0) {
				pair p=st.peek();
				if(p.state==-1) {
					nval=p.node.data;
					p.state++;
					break;
					
				}
				else if(p.state==p.node.child.size()) {
					st.pop();
				}
				else {
					Node n=p.node.child.get(p.state);
					pair np=new pair(n,-1);
					st.push(np);
					p.state++;
				}
			}
			
			return i;
		}
	}
    public static class pair{
       Node node;
       int state;
       public pair(Node n,int s) {
    	   node=n;
    	   state=s;
       }
    }
	public static void main(String [] args) {
		int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
	    Node root=new Node();
	  root =constructTree(root,arr);
	  GenericTree gt=new GenericTree(root);
	  for(int v : gt) {
		  System.out.print(v+" ");
	  }
	}
}













































































































































































































































































































































