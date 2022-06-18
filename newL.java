import java.util.LinkedList;
import java.util.Scanner;

import java.util.LinkedList;

/*class newL{
	public static void main(String [] args) {
		LinkedList  l=new LinkedList();
		l.add(13);
		l.add(15);
		for(int i=0;i<10;i++) {
			int t=(int) (10*Math.random());
			l.add(t);
		}
		//System.out.println( l.size());
		//System.out.println(l);
		//l.remove();
		//System.out.println(l);
		l.addLast(20);
		//System.out.println(l);
		l.add(5, 30);
		System.out.println(l);
		LinkedList l1=new LinkedList();
		//l1.addAll(l);
		//l1.add("vishal");
		//l1.add("kumar");
		//System.out.println(l1);
		l1=l;
		l1.add("vishal");
		System.out.println(l1);
		System.out.println(l);
		
	}
}*/

/*public class newL {
	
 class node{
	 int data;
	 node next;
	 public node() {}
	 public node(int d) {
		 data=d;
	 }
	 
 }
 
 node head;
 node tail;
 int size=0;
 public void addlast(int v) {
	 if(head==null) {
		tail=head=new node(v); 
		size++;
	 }
	 else {
		node n=new node(v);
		tail.next=n;
		tail=n;
		 size++;
	 }
 }
 public void addfirst(int v) {
	 if(head==null) {
		tail=head=new node(v); 
		size++;
	 }
	 else {
	 node n=new node(v);
	 n.next=head;
	 head=n;
	 size++;
	 }
 }
 public void addatp(int v,int p) {
	 if(p>size) {
		 addlast(v);
	 }
	 else if(p<0) {
		 addfirst(v);
	 }
	 else {
		 node t=head;
		 for(int i=0;i<p;i++) {
			t=t.next; 
		 }
		 node n=new node(v);
		 n.next=t.next;
		 t.next=n;
		 size++;
	 }
 }
 
 public void display() {
	 node t=head;
	 while(t!=null) {
		 
		 System.out.print(t.data+" ");
		 t=t.next;
	 }
	 System.out.println();
 }
 public int deletfirst() {
	 if(head==null) {
		 System.out.print("Linked list is empty");
		 return -1;
	 }
	 else {
	 int v=head.data;
	 head=head.next;
	 size--;
	 return v;
	 }
 }
 public int deletlast() {
	 if(head==null) {
		 System.out.println("Linked list is empty");
		 return -1;
	 }
	 else {
		 node t=head;
		 while(t.next.next!=null) {
			 t=t.next;
		 }
		 int v=t.next.data;
		 tail=t;
		 t.next=null;
		 size--;
		 return v;
	 }
 }
 public int deletatp(int p) {
	 if(p<0) {
	return deletfirst();
	 }
	 else if(p>size) {
	return	 deletlast();
	 }
	 else {
		 node t=head;
		 for(int i=0;i<p;i++) {
			t=t.next;
		 }
		 int v=t.next.data;
		 t.next=t.next.next;
		 size--;
		 return v;
	 }
 }
 public int getfirst() {
	 if(head==null) {
		 System.out.println("Linked list is empty");
		 return -1;
	 }
	 else {
		return head.data; 
	 }
 }
 public int getlast() {
	 if(head==null) {
		 System.out.println("Linked list is empty");
		 return -1;
	 }
	 else {
		return tail.data; 
	 } 
 }
 public int getAtp(int p) {
	 if(head==null) {
		 System.out.println("Linked list is empty");
		 return -1;
	 } 
	 else if(p<0 || p>=size) {
		System.out.println("enter a vailed argumnt");
		return -1;
	 }
	 else {
		 node t=head;
		 for(int i=0;i<p;i++) {
			 t=t.next;
		 }
		 return t.data;
	 }
 }
 private node getnodeAt(int p) {
	 node t=head;
	 for(int i=0;i<p;i++) {
		 t=t.next;
	 }
	 System.out.println(t.data);
	 return t;
 }
 public void reverseLLByData() {
	int li=0;
	int ri=size-1;
	while(li<ri) {
		node l=getnodeAt(li);
		node r=getnodeAt(ri);
		int t=l.data;
		l.data=r.data;
		r.data=t;
		li++;
		ri--;
	}
 }
 public void reverseLLByPointer() {
	 node current=head;
	 node pre=null;
	 while(current!=null) {
		 node temp=current.next;
		 current.next=pre;
		 pre=current;
		 current=temp;
	 }
	
	 node t=tail;
	 tail=head;
	 head=t;
 }
 public void push(int v) {
	 addfirst(v);
 }
 public void pop() {
	 deletfirst();
 }
 public int kthfromend(int p) {
	 node s=head;
	 node f=head;
	 for(int i=0;i<p;i++) {
		f=f.next; 
	 }
	 while(f!=null) {
		 f=f.next;
		 s=s.next;
	 }
	 return s.data;
 }
static newL l;
 public static  newL add(newL l1,newL l2) {
	 l=new newL();
	 int oc=addhelper(l1.head,l1.size,l2.head,l2.size);
	 if(oc>0) {
	 l.addfirst(oc);
	 }
	 return l;
 }
public static int addhelper(node head1,int pv1,node head2,int pv2) {
	if(pv1==0 || pv2==0) {
		return 0;
	}
	if(pv1>pv2) {
	int	oc=addhelper(head1.next,pv1-1,head2,pv2);
	int r=head1.data+oc;
	int d=r%10;
	int nc=r/10;
	l.addfirst(d);
	return nc;
	}
	else if(pv2>pv1) {
		int oc=addhelper(head1,pv1,head2.next,pv2-1);
		int r=head2.data+oc;
		int d=r%10;
		int nc=r/10;
		l.addfirst(d);
		return nc;
	}
	else {
		int oc=addhelper(head1.next,pv1-1,head2.next,pv2-1);
		int r=head1.data+head2.data+oc;
		int d=r%10;
		int nc=r/10;
		l.addfirst(d);
		return nc;
	}
}
 public static void main(String[] args) {
	newL l=new newL();
	l.addfirst(2);
	l.addlast(5);
	l.addlast(6);
	l.addfirst(9);
	l.addfirst(10);
	//l.addatp(25, 3);
	newL l2=l;
	//l.addatp(100, 5);
	//l.addatp(19, -1);
	//l.addatp(177, 1000);
	l.display();
    System.out.println("~____________________________~");
   // int t=l.deletfirst();
	//System.out.println(t);
	//int t1=l.deletfirst();
	//System.out.println(t1);
	System.out.println("~____________________________~");
	//l.display();
	//int d=l.deletlast();
	//System.out.println(d);
	//l.display();
	//int v=l.deletatp(3);
	//System.out.println(v);
	//l.display();
	System.out.println("~____________________________~");
	System.out.println("~____________________________~");
	//int val=l.getAtp(3);
	//System.out.println(val);
	//l.reverseLLByData();
	//System.out.println(l.size);
	//l.display();
	//l.reverseLLByPointer();
	//l.display();
	//int k=l.kthfromend(3);
	//System.out.println(k);
	newL l1=add(l2,l);
	l1.display();
	}

}
class newL{
	class node{
		int data;
		node next;
		public node(int v) {
			data=v;
		}
	}
	node head;
	//node tail;
	int size=0;
	public void push(int v) {
	 if(head==null) {
		head=new node(v); 
		size++;
	 }
	 else {
		node n=new node(v);
		n.next=head;
		head=n;
		size++;
	 }
	}
	public int pop() {
		if(size==0) {
			System.out.println("stack under flow");
			return -1;
		}
		else {
			int t=head.data;
			head=head.next;
			return t;
		}
	}
	public int peek() {
		if(size==0) {
			System.out.println("stack under flow");
			return -1;
		}
		else {
			return head.data;
		}
	}
	public void display() {
		node t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	public static void main(String []args) {
		newL l=new newL();
		for(int i=1;i<5;i++) {
			l.push(i);
		}
		//System.out.println(l.peek());
		//System.out.println(l.size);
		l.display();
		System.out.println(l.pop());
		l.display();
	}
}*/
/*import java.util.*;
class newL{
	class LLtostack{
	LinkedList<Integer> l=new LinkedList<>();
	public void push(int v) {
		l.addFirst(null);
	}
	public int pop() {
		if(l.size()==0) {
			return -1;
		}
		else {
		return l.removeFirst();
		}
	}
	public int peek() {
		return l.getFirst();
	}
	public int size() {
		return l.size();
	}
	
	}
	public static void main(String [] args) {
		
	}
}*/
/*class newL{
	public static LinkedList<Integer> merg(LinkedList<Integer> l1,LinkedList<Integer> l2){
		int i=0;
		int j=0;
		LinkedList<Integer> l=new LinkedList<>();
		while(i<l1.size() && j<l2.size()) {
			if(l1.get(i)<l2.get(j)) {
				l.add(l1.get(i));
				i++;
			}
			else {
				l.add(l2.get(j));
				j++;
			}
		}
	while(i<l1.size()) {
		l.add(l1.get(i));
		i++;
	}
	while(j<l2.size()) {
		l.add(l2.get(j));
		j++;
	}
	return l;
	}
	public static void main(String [] args) {
	LinkedList<Integer> l=new LinkedList<>();
	LinkedList<Integer> l1=new LinkedList<>();
	l.add(3);
	l.add(4);
	l.add(6);
	l1.add(5);
	l1.add(7);
    LinkedList<Integer> l2=merg(l,l1);
    System.out.println(l2);
	}
}*/
/*class newL{
	public static void removeduplicate(LinkedList<Integer> l) {
		for(int i=l.size()-1;i>0;i--) {
			if(l.get(i)==l.get(i-1)) {
				l.remove(i);
			}
		}
	}
	public static LinkedList<Integer> rdc(LinkedList<Integer> l) {
		LinkedList<Integer> r=new LinkedList<>();
		while(l.size()>0) {
			int t=l.removeFirst();
			if(r.size()>0 && t!=r.peek()) {
				r.addLast(t);
			}
			else if(r.size()==0){
				r.add(t);
			}
		}
		return r;
	}
	public static void main(String []args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		//removeduplicate(l);
		//System.out.println(l);
		LinkedList<Integer> l1=l.rdc();
		System.out.println(l1);
		
	}
}*/
/*import java.io.*;
import java.util.*;

public class newL {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    private Node getNodeAt(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
        temp = temp.next;
      }
      return temp;
    }

    public void reverseDI() {
      int li = 0;
      int ri = size - 1;
      while (li < ri) {
        Node left = getNodeAt(li);
        Node right = getNodeAt(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;
      }
    }

    public void reversePI() {
      if (size <= 1) {
        return;
      }

      Node prev = null;
      Node curr = head;
      while (curr != null) {
        Node next = curr.next;

        curr.next = prev;
        prev = curr;
        curr = next;
      }

      Node temp = head;
      head = tail;
      tail = temp;
    }

    public int kthFromLast(int k) {
      Node slow = head;
      Node fast = head;
      for (int i = 0; i < k; i++) {
        fast = fast.next;
      }

      while (fast != tail) {
        slow = slow.next;
        fast = fast.next;
      }

      return slow.data;
    }

    public int mid() {
      Node f = head;
      Node s = head;

      while (f.next != null && f.next.next != null) {
        f = f.next.next;
        s = s.next;
      }

      return s.data;
    }

    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
      LinkedList ml = new LinkedList();

      Node one = l1.head;
      Node two = l2.head;
      while (one != null && two != null) {
        if (one.data < two.data) {
          ml.addLast(one.data);
          one = one.next;
        } else {
          ml.addLast(two.data);
          two = two.next;
        }
      }

      while (one != null) {
        ml.addLast(one.data);
        one = one.next;
      }

      while (two != null) {
        ml.addLast(two.data);
        two = two.next;
      }

      return ml;
    }

    public static Node midNode(Node head, Node tail){
      Node f = head;
      Node s = head;

      while(f != tail && f.next != tail){
        f = f.next.next;
        s = s.next;
      }

      return s;
    }

    public static LinkedList mergeSort(Node head, Node tail){
      if(head == tail){
        LinkedList br = new LinkedList();
        br.addLast(head.data);
        return br;
      }

      Node mid = midNode(head, tail);
      LinkedList fsh = mergeSort(head, mid);
      LinkedList ssh = mergeSort(mid.next, tail);
      LinkedList sl = mergeTwoSortedLists(fsh, ssh);
      return sl;
    }
  
    public void removeDuplicates(){
     
    	LinkedList r=new LinkedList();
    	while(this.size>0) {
    		int v=this.getFirst();
    		this.removeFirst();
    		if(r.size==0 || r.tail.data!=v) {
    		   r.addLast(v);	
    		}
    	}
    	this.head=r.head;
    	this.tail=r.tail;
    	this.size=r.size;
    }
    public void rrd(LinkedList l) {
    	LinkedList r=new LinkedList();
    	while(l.size>0) {
    		int v=l.getFirst();
    		l.removeFirst();
    		if(r.size==0 || r.tail.data!=v) {
    		   r.addLast(v);	
    		}
    	}
    	l.head=r.head;
    	l.tail=r.tail;
    	l.size=r.size;
    	
    }
    public void oddeven() {
    	LinkedList odd=new LinkedList();
    	LinkedList even=new LinkedList();
    	while(this.size>0) {
    		int v=this.getFirst();
    		this.removeFirst();
    		if(v%2==0) {
    			even.addLast(v);
    		}
    		else {
    			odd.addLast(v);
    		}
    	}
    	
    	odd.tail.next=even.head;
    	this.head=odd.head;
    	this.tail=even.tail;
    	this.size=odd.size+even.size;
    	
    	
    }
  
    public void kthreverse(int k) {
    	LinkedList l=null;
    	while(this.size>0){
    		LinkedList curr=new LinkedList();
    		if(this.size>=k) {
    		   for(int i=0;i<k;i++) {
    			int t=this.getAt(0);
    			this.removeFirst();
    			
    			curr.addFirst(t);
    		}
    		}
    		else {
    			int s=this.size;
    			for(int i=0;i<s;i++) {
    				int t=this.getFirst();
        			this.removeFirst();
        			curr.addLast(t);
    			}
    		}
    		if(l==null) {
    			
    			l=curr;
    		}
    		else {
    			
    			l.tail.next=curr.head;
    			l.tail=curr.tail;
    			l.size+=curr.size;
    		}
    	}
    	
    	this.head=l.head;
    	this.tail=l.tail;
    	this.size=l.size;
    }
  
    public void displayreverse() {
    	displayreverseh(this.head);
    }
    private void displayreverseh(Node head) {
    	if(head==null) {
    		return ;
    	}
    	displayreverseh(head.next);
    	System.out.print(head.data+" ");
    }
    public void reversebyrec1() {
    	reversebyrech(this.head);
    	head.next=null;
    	Node t=head;
    	head=tail;
    	tail=t;
    }
    private void reversebyrech(Node head) {
    	if(head==null) {
    		return ;
    	}
    	reversebyrech(head.next);
    	if(head==tail) {
    		
    	}
    	else {
    		head.next.next=head;
    	}
    	
    }
  
    Node left;
    
  public void reversebydata() {
	 
	  left=this.head;
	  reversebydatahelper(this.head,0);
  }
  public void reversebydatahelper(Node head,int floor) {
	  if(head==null) {
		  return ;
	  }
	
	   reversebydatahelper(head.next,floor+1);
	   if(floor>size/2) {
	  int t=left.data;
	  left.data=head.data;
	  head.data=t;
	  left=left.next;
	   }
    }
 
  public boolean isLLisplindram() {
	  
	  left=this.head;
	  return isLLisplindramh(this.head,0);
  }
  public boolean isLLisplindramh(Node head,int f) {
	if(head==null) {
		return true;
	}
	boolean b=isLLisplindramh(head.next,f+1);
	if(b==false) {
		return false;
	}
	else if(left.data!=head.data) {
		return false;
	}else {
		left=left.next;
		return true;
		
	}
  }
  
  public void foldLL() {
	  
	  left=this.head;
	 foldLLhelper(this.head,0);
	 
  }
  
  public void foldLLhelper(Node head,int floor) {
	  if(head ==null) {
		  return ;
	  }
	  foldLLhelper(head.next,floor+1);
	  if(floor>size/2) {
	  Node temp=left.next;
	  left.next=head;
	  head.next=temp;
	  left=temp;
	  }
	  else if(floor==size/2) {
		 tail=head;
		 tail.next=null;
		  
	  }
  }
  public int intersectionpoint(LinkedList l1,LinkedList l2) {
	
	 Node one=l1.head;
	 Node two=l2.head;
	 if(l1.size>l2.size) {
		 for(int i=0;i<l1.size-l2.size;i++) {
			 one=one.next;
		 }
	 }
		 else {
             
			 for(int i=0;i<l2.size-l1.size;i++) {
				 two=two.next;
			 } 
		 }
	while(one.data!=two.data) {
		one=one.next;
		two=two.next;
	}
	 return one.data;
	 }
  
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    LinkedList l1 = new LinkedList();
    LinkedList l2 = new LinkedList();
    String[] values1 = br.readLine().split(" ");
    
    for (int i = 0; i < n1; i++) {
      int d = Integer.parseInt(values1[i]);
      l1.addLast(d);
    }
    int n2 = Integer.parseInt(br.readLine());
    String[] values2 = br.readLine().split(" ");
    for (int i = 0; i < n2; i++) {
      int d = Integer.parseInt(values2[i]);
      l2.addLast(d);
    }
   
    //l1.display();
    //l1.removeDuplicates();
    //l1.display();
   // l1.rrd(l1);
    //l1.display();
    //System.out.print(l1.size);
    //l1.oddeven();
   // l1.display();
   // l1.kthreverse(3);
   // l1.display();
   // l1.displayreverse();
   // l1.reversebyrec1();
   // l1.display();
    //l1.reversebydata();
    //l1.display();
  // boolean b= l1.isLLisplindram();
   //System.out.println(b);
    //l1.foldLL();
    //l1.display();
   int t= l1.intersectionpoint(l1,l2);
   System.out.println(t);
  }
}*/













































































































































































































































































































































































































































































