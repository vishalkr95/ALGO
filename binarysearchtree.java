
/*public class binarysearchtree {
	static class node{
		int data;
		node left,right;
		public node() {}
		public node(int d,node left,node right) {
			this.data=d;
			this.left=left;
			this.right=right;
		}
	}


	public static node creatbst(Integer a[],int l,int h) {
		if(l>h) {
			return null;
		}
		int mid=(l+h)/2;
		
		node n=new node(a[mid],null,null);
		
		n.left=creatbst(a,l,mid-1);
		n.right=creatbst(a,mid+1,h);
		return n;
	}
	public static void display(node n) {
		if(n==null) {
			return;
		}
		System.out.print(n.data);
		display(n.left);
		
		display(n.right);
	}
	public static void main(String [] args) {
		Integer a[]= {1,2,3,4,5,6};
		
		node root=creatbst(a,0,a.length-1);
		display(root);
		
	}
}*/
