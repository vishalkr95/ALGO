
/*public class linkedlist {
	class node {
		int data;
		node next;
		public node(int v) {
			data=v;
		}
		
	}
	 node start;
	 node end;
	public void insert(int v,node start) {
		if(start==null)
		{	node n1=new node(v);
		   start=n1;
		   n1.next=null;
		}
		     
		else {
			node n=new node(v);
			n.next=start;
			start=n;
		}
	}
	public void delet(int v,node start) {
		if(start.data==v) {
			start=null;
		     return;	
		}
		else
			delet(v,start.next);
	
	}
	public void print(node start) {
		node n=start;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		}
/*	public node reverse(node start) {
		node t=start;
		node p=null;
		while(t!=null) {
			t.next.next=t;
			t.next=p;
			p=t;
			t=t.next;
		}
		start =t;
		return t;
	}
	public static void main(String[] args)
	{
		linkedlist ll=new linkedlist();
       node start=ll.new node(4);
       node end=ll.new node(2);
		ll.insert(5,start);
		ll.insert(6,start);
		ll.insert(7,start);
		ll.insert(8,end);
		ll.insert(9,end);
		ll.print(start);
	//	ll.delet(8,ll.start);
		System.out.println();
		//ll.print();
		System.out.println();
		//start=ll.reverse(start);
		ll.print(end);
		System.out.println();
	
		
	}
}*/



/*import java.io.*;
import java.util.*;

public class linkedlist {
	   class node{
           int data;
           node next;
           public node(int d){
               data=d;
           }
       }
       node head;
       public void add(int v){
           node n=new node(v);
           if(head==null){
               head=n;
           }
           else{
               node t=head;
               while(t.next!=null){
                   t=t.next;
               }
               t.next=n;
               n.next=null;
           }
       }
       public void print(node head){
           node t=head;
           if(t==null)
            return ;
           while(t!=null){
               System.out.println(t.data);
                  t=t.next;
           }}
       public node reverse(node head) {
    	   node t=head;
    	   node pre=null;
    	   node next=null;
    	   if(t ==null)
    	   {  return null; }
    	   while(t!=null) {
    		   next=t.next;
    		   t.next=pre;
    		   pre=t;
    		   t=next;
    	   }
    	   head= pre;
    	   return head;
       }
    public static void main(String[] args) {
    	linkedlist ll=new linkedlist();
       
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
        	System.out.print("Enter data");
            int b=sc.nextInt();
           ll.add(b);
        }
    ll.print(ll.head);
   ll.head= ll.reverse(ll.head);
   System.out.println();
    ll.print(ll.head);
            
        }
    
}*/
import java.util.*;

/*public class linkedlist{
	class node{
		int data;
		node next;
		public node() {}
		public node(int d) {
			data=d;
		}
	}
	node head;
	public void add(node head,int v) {
		node n=new node(v);
		if(head==null) {
			head=n;
		}
		else {
			node t=head;
		while(t.next!=null)
			t=t.next;
			
		t.next=n;
		n.next=null;
		
	}}
	public void print(node n) {
		if(n==null)
			return;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String [] args) {
		linkedlist l=new linkedlist();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter");
		int b=sc.nextInt();
		node head=l.new node();
		for(int i=0;i<b;i++) {
			System.out.println("enter d");
			int c=sc.nextInt();
			l.add(head, c);
		}
		l.print(head);
	}
}*/
 class linkedlist{
	
	class node{
		int data;
		node next;
		public node() {}
		public node(int v)
		{data=v;}
		}
	node head;
	node tail;
	int size=0;
	public void addfirst(int v) {
	if(head==null) {
		head=tail=new node(v);
		size++;
	}
	else {
		node temp=new node(v);
		temp.next=head;
		head=temp;
		size++;
	}
	}
	int size() {
		return size;
	}
	int middle() {
		node s=head;
		node f=head;
		while(f!=null && f.next!=null) {
			s=s.next;
			f=f.next.next;
		}
		return s.data;
	}
	void display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			}
	}
	public void reverseprint(linkedlist l1) {
		node temp=l1.head;
		helperr(temp);
	}
	private void helperr(node t) {
		if(t==null) {
			return;
		}
		helperr(t.next);
		System.out.print(t.data);
	}
	void insertat(int v,int p,linkedlist l) {
		if(size==0) {
			addfirst(v);
		}
		node temp=l.head;
		node t=new node(v);
		for(int i=0;i<p-1;i++) {
			temp=temp.next;
		}
		t.next=temp.next;
		temp.next=t;
		size++;
		
	}
	void addlast(int v) {
		node temp=new node(v);
		if(size==0) {
			head=tail=temp;
			size++;
		}
		tail.next=temp;
		tail=temp;
	}
	public static void main(String[] args) {
		linkedlist l1=new linkedlist();
		l1.addfirst(5);
		l1.addfirst(6);
		l1.addfirst(7);
		l1.addfirst(8);
		l1.addfirst(9);
		linkedlist l2=new linkedlist();
		l2.addfirst(0);
		l2.addfirst(1);
		l2.addfirst(2);
		System.out.println(l2.size);
		System.out.println(l1.size);
		//System.out.print(l2.middle());
		//l1.display();
		System.out.println();
		//l1.reverseprint(l2);
		//l1.insertat(12, 2, l1);
		l1.addlast(13);
		l1.display();
		System.out.println();
		l2.display();
	}}






























