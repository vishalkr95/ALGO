
/*public class Btree {
	static class Node{
		int data;
		Node left;
		Node right;
	}
public static Node contructTree(int []pre,int []in,int psi,int pei,int isi,int iei) {
	if(psi>pei || isi>iei) {
		return null;
	}
	Node root=new Node();
	int r=pre[psi];
	root.data=r;
	int idx=isi;
	while(in[idx]!=r) {
		idx++;
	}
	
int count=idx-isi;
root.left=contructTree(pre,in,psi+1,psi+count,isi,idx-1);
root.right=contructTree(pre,in,psi+1+count,pei,idx+1,iei);
	
	return root;
}
public static void display(Node root) {
	if(root==null) {
		return ;
	}
	System.out.print(root.data+" ");
	display(root.left);
	display(root.right);
}
	public static void main(String[] args) {
		int pre[]= {0,1,3,7,8,4,9,10,2,5,11,6};
		int in[]=  {7,3,8,1,9,4,10,0,11,5,2,6};
		Node root=contructTree(pre,in,0,pre.length-1,0,in.length-1);
		display(root);
	}

}*/

public class Btree {
	static class Node{
		int data;
		Node left;
		Node right;
	}
public static Node contructTree(int []post,int []in,int psi,int pei,int isi,int iei) {
	if(psi>pei || isi>iei) {
		return null;
	}
	Node root=new Node();
	int e=post[pei];
	root.data=e;
	int idx=isi;
	
	while(in[idx]!=e) {
		idx++;
	}
	int count=idx-isi;
	root.left=contructTree(post,in,psi,psi+count-1,isi,idx-1);
	root.right=contructTree(post,in,psi+count,pei-1,idx+1,iei);
	return root;
}
public static void display(Node root) {
	if(root==null) {
		return ;
	}
	System.out.print(root.data+" ");
	display(root.left);
	display(root.right);
}
	public static void main(String[] args) {
		int post[]= {7,8,3,9,10,4,1,11,5,6,2,0};
		int in[]=   {7,3,8,1,9,4,10,0,11,5,2,6};
		Node root=contructTree(post,in,0,post.length-1,0,in.length-1);
		display(root);
	}

}



















