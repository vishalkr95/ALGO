import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
/*public class pq {
public static void main(String [] args) {
	int a[]= {22,3,13,24,25,99,100,122,125};
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int i=0;i<a.length;i++) {
		pq.add(a[i]);
	}
  while(pq.size()>0) {
	  System.out.print(pq.remove()+" ");
  }
}
}*/
/*class pq{
	public static void main(String [] args) {
          int a[]= {2,10,5,17,7,18,6,4};
          int k=3;
          PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<k;i++) {
        	 pq.add(a[i]);
         }
         for(int i=k;i<a.length;i++) {
        	 if(pq.peek()<a[i]) {
        		pq.remove(); 
        		 pq.add(a[i]);
        	 }
        	
         }
         while(pq.size()>0) {
        	 System.out.println(pq.remove());
         }
	}
}*/
/*class pq{
	public static void main(String [] args) {
		int a[]= {2,3,1,4,6,7,5,8,9};
		int k=2;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<a.length;i++) {
			if(i<=k) {
				pq.add(a[i]);
			}
			else {
				
					System.out.println(pq.remove());
					pq.add(a[i]);
				
			}
		}
		while(pq.size()>0) {
			System.out.println(pq.remove());	
		}
	}
}*/
/*class pq{
	static class medianpq{
	static	PriorityQueue<Integer> lv;
	 static	PriorityQueue<Integer> hv;
	 public medianpq() {
		 lv=new PriorityQueue<>(Collections.reverseOrder());
		 hv=new PriorityQueue<>();
	 }
		public static void add(int v) {
			if(lv.size()==0) {
				lv.add(v);
			}
			else {
				if(hv.size()==0) {
					hv.add(v);
				}
				else {
					if(lv.peek()>v) {
						lv.add(v);
						if(lv.size()>hv.size()+1) {
							hv.add(lv.remove());
						}
					}
					else {
						hv.add(v);
						if(lv.size()<hv.size()) {
							lv.add(hv.remove());
						}
					}
				}
			}
		}
		public static int remove() {
			if(lv.size()==0) {
				System.out.println("stack underflow");
			  return -1;	
			}
			else {
				int v=lv.remove();
				if(lv.size()<hv.size()) {
					lv.add(hv.remove());
				}
				return v;
			}
		}
		public static int median() {
			if(lv.size()==0) {
				System.out.println("stack underflow");
				return -1;
			}
			else {
				return lv.peek();
			}
		}
		public static int size() {
			return lv.size()+hv.size();
		}
	}
public static void main(String [] args) {
	medianpq mq=new medianpq();
	mq.add(10);
	mq.add(20);
	mq.add(30);
	mq.add(40);
	mq.add(50);
	int size=mq.size();
	System.out.println(size);
	System.out.println(mq.median());
	mq.remove();
	System.out.println(mq.median());
	mq.remove();
	System.out.println(mq.median());
	mq.remove();
	System.out.println(mq.median());
	
}
}*/
/*class pq{
	static class pair  implements Comparable<pair>{
		int li;
		int di;
		int v;
		public pair(int li,int di,int v) {
			this.li=li;
			this.di=di;
			this.v=v;
		}
		
		public int compareTo(pq.pair o) {
			
			return this.v-o.v;
		}
	}
	public static ArrayList<Integer> mergeLists(ArrayList<ArrayList<Integer>> als){
		ArrayList<Integer> mr=new ArrayList<>();
		PriorityQueue<pair> pq=new PriorityQueue<>();
		for(int i=0;i<als.size();i++) {
			pq.add(new pair(i,0,als.get(i).get(0)));
		}
		while(pq.size()>0) {
			pair p=pq.remove();
			mr.add(p.v);
			
			p.di++;
			if(p.di<als.get(p.li).size()) {
				p.v=als.get(p.li).get(p.di);
				pq.add(new pair(p.li,p.di,p.v));
			}
		}
		return mr;
	}
	public static void main(String [] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int k = Integer.parseInt(br.readLine());
		    ArrayList< ArrayList< Integer>> lists = new ArrayList<>();
		    for (int i = 0; i < k; i++) {
		      ArrayList< Integer> list = new ArrayList<>();

		      int n = Integer.parseInt(br.readLine());
		      String[] elements = br.readLine().split(" ");
		      for (int j = 0; j < n; j++) {
		    	  
		        list.add(Integer.parseInt(elements[j]));
		    	  
		      }

		     lists.add(list);
		    }

	
	ArrayList<Integer> al=mergeLists(lists);
	System.out.println(al);
	}
}*/

/*class pq{
	static class Priorityqueue{
		static ArrayList<Integer> data;
		Priorityqueue(){
			data=new ArrayList<>();
		}

public static void add(int v) {
 data.add(v);
 upheapyfy(data.size()-1);
}
private static void upheapyfy(int i) {
	if(i==0) {
		return ;
	}
	int pi=(i-1)/2;
	if(data.get(i)<data.get(pi)) {
		swap(i,pi);
		upheapyfy(pi);
	}
}
private  static void swap(int i,int j) {
	int t=data.get(i);
	data.set(i,data.get(j));
	data.set(j, t);
}
public static int remove() {
	if(data.size()==0) {
	return -1;
	}
	else {
		swap(0,data.size()-1);
		int t=data.remove(data.size()-1);
		downheapyfy(0);
		return t;
	}
}
private static void downheapyfy(int pi) {
	int lc=2*pi+1;
	int rc=2*pi+2;
	int min=pi;
	if(data.size()>lc && data.get(min)>data.get(lc)) {
		min=lc;
	}
	if(data.size()>rc && data.get(min)>data.get(rc)) {
		min=rc;
	}
  if(pi!=min) {
	  swap(pi,min);
	  downheapyfy(min);
  }
}
public static int peek() {
	if(data.size()==0) {
	return -1;
	}
	else {
		return data.get(0);
	}
}
public static int size() {
	return data.size();
}
public static void display() {
	for(int i=0;i<data.size();i++) {
		System.out.println(data.get(i));
	}
}
	}
	public static void main(String [] args) {
		Priorityqueue pq=new Priorityqueue();
		int a[]= {3,5,1,6,4,0};
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		pq.add(-5);
		pq.remove();
	 pq.display();
	}
}
*/
/*class pq{
	static class Priorityqueue{
		static ArrayList<Integer> data;
		Priorityqueue(int a[]){
			data=new ArrayList<>();
			for(int v : a) {
				data.add(v);
			}
			for(int i=data.size()/2-1;i>=0;i--) {
				downheapyfy(i);
			}
		}

public static void add(int v) {
 data.add(v);
 upheapyfy(data.size()-1);
}
private static void upheapyfy(int i) {
	if(i==0) {
		return ;
	}
	int pi=(i-1)/2;
	if(data.get(i)<data.get(pi)) {
		swap(i,pi);
		upheapyfy(pi);
	}
}
private  static void swap(int i,int j) {
	int t=data.get(i);
	data.set(i,data.get(j));
	data.set(j, t);
}
public static int remove() {
	if(data.size()==0) {
	return -1;
	}
	else {
		swap(0,data.size()-1);
		int t=data.remove(data.size()-1);
		downheapyfy(0);
		return t;
	}
}
private static void downheapyfy(int pi) {
	int lc=2*pi+1;
	int rc=2*pi+2;
	int min=pi;
	if(data.size()>lc && data.get(min)>data.get(lc)) {
		min=lc;
	}
	if(data.size()>rc && data.get(min)>data.get(rc)) {
		min=rc;
	}
  if(pi!=min) {
	  swap(pi,min);
	  downheapyfy(min);
  }
}
public static int peek() {
	if(data.size()==0) {
	return -1;
	}
	else {
		return data.get(0);
	}
}
public static int size() {
	return data.size();
}
public static void display() {
	for(int i=0;i<data.size();i++) {
		System.out.println(data.get(i));
	}
}
	}
	public static void main(String [] args) {
		int a[]= {3,5,1,6,4,0};
		Priorityqueue pq=new Priorityqueue(a);
		
	
		for(int i=0;i<a.length;i++) {
			System.out.print( pq.remove()+" ");
		}
	 pq.display();
	}
}*/

/*class pq{
	static class student implements Comparable<student>{
		int roll;
		int ht;
		int wt;
		public student(int roll,int ht,int wt) {
			this.roll=roll;
			this.ht=ht;
			this.wt=wt;
		}
		public int compareTo(student o) {
			return this.roll-o.roll;
		}
		public String toString() {
			return "roll   "+roll+"  ht  "+ht+"   wt   "+wt;
		}
	}
	static class compareht implements Comparator<student>{
		public int compare(student s1,student s2) {
			return s1.ht-s2.ht;
		}
	}
	static class comparewt implements Comparator<student>{
		public int compare(student s1,student s2) {
			return s1.wt-s2.wt;
		}
	}
	public static void main(String [] args) {
		PriorityQueue<student> pq=new PriorityQueue<>(new comparewt());
		String s[]= {"vishal","kumar","cse"};
		pq.add(new student(2,155,80));
		pq.add(new student(8,156,75));
		pq.add(new student(9,150,82));
		pq.add(new student(21,145,90));
		
		while(pq.size()>0) {
			System.out.println(pq.remove());
		}
	}
}*/

class pq{
	static class Priorityqueue<T>{
		Comparator comp;
		 ArrayList<T> data;
		public Priorityqueue() {
			data=new ArrayList<>();
			comp=null;
		}
		public Priorityqueue(Comparator comp) {
			data=new ArrayList<>();
			this.comp=comp;
		}

public  void add(T v) {
 data.add(v);
 upheapyfy(data.size()-1);
}
private  void upheapyfy(int i) {
	if(i==0) {
		return ;
	}
	int pi=(i-1)/2;
	
	if(isSmaller(i,pi)==true) {
		swap(i,pi);
		upheapyfy(pi);
	}
}
public  boolean isSmaller(int ci,int pi) {
	if(comp==null) {
	Comparable c1=(Comparable)data.get(ci);
	Comparable p1=(Comparable)data.get(pi);
    if(c1.compareTo(p1)<0) {
    	return true;
    }
    else {
    	return false;
    }
	}
	else {
		T ith= data.get(ci);
		T jth=data.get(pi);
		if(comp.compare(ith,jth)<0) {
			return true;
		}
		else {
			return false;
		}
	}
}
private   void swap(int i,int j) {
	T t=data.get(i);
	data.set(i,data.get(j));
	data.set(j, t);
}
public  T remove() {
	if(data.size()==0) {
	return null;
	}
	else {
		swap(0,data.size()-1);
		T t=data.remove(data.size()-1);
		downheapyfy(0);
		return t;
	}
}
private  void downheapyfy(int pi) {
	int lc=2*pi+1;
	int rc=2*pi+2;
	int min=pi;
	if(data.size()>lc && isSmaller(lc,min)) {
		min=lc;
	}
	if(data.size()>rc && isSmaller(rc,min)) {
		min=rc;
	}
  if(pi!=min) {
	  swap(pi,min);
	  downheapyfy(min);
  }
}
public  T peek() {
	if(data.size()==0) {
	return null;
	}
	else {
		return data.get(0);
	}
}
public int size() {
	return data.size();
}
public  void display() {
	for(int i=0;i<data.size();i++) {
		System.out.println(data.get(i));
	}
}
	}
	
   static class student implements Comparable<student>{
			int roll;
			int ht;
			int wt;
			public student(int roll,int ht,int wt) {
				this.roll=roll;
				this.ht=ht;
				this.wt=wt;
			}
			public int compareTo(student o) {
				return this.roll-o.roll;
			}
			public String toString() {
				return "roll   "+roll+"  ht  "+ht+"   wt   "+wt;
			}
		}
  static  class compareht implements Comparator<student>{
		public int compare(student s1,student s2) {
			return s1.ht-s2.ht;
		}
	}
	static class comparewt implements Comparator<student>{
		public int compare(student s1,student s2) {
			return s1.wt-s2.wt;
		}
	}		
		public static void main(String [] args) {
			Priorityqueue<student> pq=new Priorityqueue<>(new comparewt());
			String s[]= {"vishal","kumar","cse"};
			pq.add(new student(2,155,80));
			pq.add(new student(8,156,75));
			pq.add(new student(9,150,82));
			pq.add(new student(21,145,90));
			
			while(pq.size()>0) {
				System.out.println(pq.remove());
			}
		}
	
}












































































































































































































































































