
import java.util.*;
/*class dsa{
	public static void main(String [] args){
	int a[][]= {{1,3,2},{5,4,3},{9,6,7},{11,5,8,2},{1,3,2,4,8,5}};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			for(int k=j;k<a[i].length;k++) {
				if(a[i][j]>a[i][k]) {
					int t=a[i][j];
					a[i][j]=a[i][k];
					a[i][k]=t;
				}
			}
		}
	}
	
	for(int i=0;i<a.length;i++) {
	System.out.println
	(Arrays.toString(a[i]));
	}
	ArrayList<Integer> al=new ArrayList<>();
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			al.add(a[i][j]);
		}
	}
	Collections.sort(al);
	System.out.println(al);
	System.out.println(al.get(al.size()/2));
	
	}}*/
/*public class dsa{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String str ="ABCD";//abcdabcd
		String s=str + str;
		System.out.print("Enter a String");
		String s1=sc.next();
		int f=1;
		
		for(int i=0;i<str.length();i++) {
			int j=0;
			if(s.charAt(i)==s1.charAt(j)) {
				while(j++<s1.length()-1) {
					
					
					if(s.charAt(i+j)!=s1.charAt(j)) {
						f=0;
						break;
					}
				}
			}
		}
		if(f==1) {
			System.out.println("rotation");
		}
		if(f==0) {
			System.out.println("not rotation");
		}
		
	}
}*/
/*public class dsa{
  static class node{
	  int data;
	  node next;
	  
	  public node(int d) {
		  data=d;
	  }
	  
  }
 static node tail;
 public static node add(int d, node root) {
	 node t=new node(d);
	 if(root==null) {
		 root=tail=t;
		 return root;
	 }
	 else {
		 tail.next=t;
		 tail=t;
	 }
	 return root;
 }
 public static void display(node root) {
	 node t=root;
	 while(t!=null) {
		 System.out.print(t.data +" ");
		 t=t.next;
	 }
	 System.out.println();
 }
public static node reverse(int k,node root) {
	node t=root;
	int i=0;
	node pre=t;
	while(i++<k && t!=null) {
     node temp=t.next; 
     t.next=pre;
     pre=t;
     t=temp;
	}
	if(t!=null) {
		System.out.println(t.data);
		root.next=reverse(k,t);
	
	}
	
	return pre;
}
  public static void main(String [] args) {
	 int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	 node root=null;
	 for(int i=0;i<a.length;i++) {
		root=add(a[i],root);
	 }
	
	 display(root);
	 int k=4;
	root =reverse(k,root);
	display(root);
  }
 
}*/













































































