import java.util.Arrays;
import java.util.Stack;

// infix notation.
/*import java.util.Stack;

public class stack {

	public static int precidence(char c) {
		if(c=='+') {
			return 1;
		}
		else if(c=='-') {
			return 1;
		}
		else	if(c=='*') {
			return 2;
		}
		else {
			return 2;
		}
	}
	public static int colculation(int v1,int v2, char c) {
		if(c=='+') {
			return v2+v1;
		}
		else if(c=='-') {
			return v2-v1;
		}
		else	if(c=='*') {
			return v2*v1;
		}
		else {
			return v2/v1;
		}
	}
	public static void main(String [] args) {
		String exp="2+(5-3*6/6)";
		Stack<Character> stc =new Stack<>();
		Stack<Integer> sti =new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(c=='(') {
				stc.push(c);
			}
			else if(Character.isDigit(c)) {
				sti.push(c-'0');
			}
			else if(c=='+' || c=='-' || c=='*' || c=='/') {
				
				while(stc.size()>0 && stc.peek()!='(' && precidence(c)>=precidence(stc.peek())) {
					int v1=sti.pop();
					int v2=sti.pop();
					char ch=stc.pop();
					sti.push(colculation(v1,v2,ch));
				}
				stc.push(c);
			}
			else {
				while(stc.size()>0 && stc.peek()!='(') {
					char ch=stc.pop();
					int v1=sti.pop();
					int v2=sti.pop();
					sti.push(colculation(v1,v2,ch));
				}
				stc.pop();
			}
		}
		while(stc.size()>0) {
			char ch=stc.pop();
			int v1=sti.pop();
			int v2=sti.pop();
			sti.push(colculation(v1,v2,ch));	
		}
		System.out.println(sti.pop());
	}

}*/


/*import java.util.*;
import java.io.*;
class stack{
    public static char claulate(char c){
        if(c==')'){
            return '(';
        }
        if(c=='}'){
            return '{';
        }
        else{
            return '[';
        }
    }
	
	public static void main(String []argh)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> st =new Stack<>();
            int f=0;
            for(int i=0;i<input.length();i++){
               char c=input.charAt(i);
               if(c=='(' || c== '{' || c=='['){
                   st.push(c);
               }
               else{
                   if(st.size()==0){
                       st.push(c);
                   }
                   else{
                  while(st.size()>0 && st.peek()!=claulate(c)){
                   st.pop();   
                  }
                  st.pop();
                   }
            }
            
            
		}
        if(st.size()>0){
                System.out.println(false);
            }
            else{
             System.out.println(true);   
            }
		
	}
}
}*//*class stack{
	public static void main(String [] args) {
		String  str="((a+b)+((c+d)))";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str.charAt(i)!=')') {
				st.push(c);
			}
			else {
				if(st.peek()=='(') {
					System.out.println(true);
					return ;
				}
				else{
					while(st.peek()!='(') {
				
					st.pop();
				}
				st.pop();
				}
			}
		}
		System.out.println(false);
	}
}*/
/*class stack{
	public static char composit(char c) {
		if(c==']') {
			return '[';
		}
		else if(c=='}') {
			return '{';
		}
		else {
			return '(';
		}
	}
	public static void main(String [] args) {
		String str="[(a+b)+{(c+d)*(e/f)}]";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='[' || c=='(' || c=='{') {
				st.push(c);
			}
			else if(c==']' || c==')' || c=='}') {
				if(st.size()==0) {
					System.out.println(false);
					return ;
				}
				else if(composit(c)!=st.peek()) {
					System.out.println(false);
					return ;
				}
				else {
					st.pop();
				}
			}
		}
		if(st.size()>0) {
			System.out.println(false);
			return ;
		}
		else {
			System.out.println(true);
		}
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {2,5,9,3,1,12,6,8,7};
		Stack<Integer> st=new Stack<>();
		int nextgreater[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			if(st.size()==0) {
				nextgreater[i]=-1;
				st.push(a[i]);
			}
			else {
				while(st.size()>0 && st.peek()<=a[i]) {
					st.pop();
				}
				if(st.size()==0) {
					nextgreater[i]=-1;
					st.push(a[i]);
				}
				else {
					nextgreater[i]=st.peek();
					st.push(a[i]);
				}
				
			}
		}
		for(int i :nextgreater) {
			System.out.println(i);
		}
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {2,5,9,3,1,12,6,8,7};
		Stack<Integer> st=new Stack<>();
		int nextgreater[]=new int[a.length];
		st.push(0);
		for(int i=1;i<a.length;i++) {
			  while( st.size()>0 && a[st.peek()]<a[i]) {
				int t=st.pop();
				nextgreater[t]=a[i];
			}
			st.push(i);
			
		}
		while(st.size()>0) {
			int t=st.pop();
			nextgreater[t]=-1;	
		}
		for(int i :nextgreater) {
			System.out.println(i);
		}
		
	}
	
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {2,3,5,2,9,1,12,6,8,7};
       int nse[]=new int[a.length];
      Stack<Integer> st=new Stack<>();
      st.push(a[a.length-1]);
      nse[a.length-1]=-1;
      for(int i=a.length-2;i>=0;i--) {
    	  if(st.size()==0) {
    		  nse[i]=-1;
    		  st.push(a[i]);
    	  }else {
    		  while(st.size()>0 && st.peek()>=a[i]) {
    			  st.pop();
    		  }
    		  if(st.size()==0) {
    			  nse[i]=-1;
    			  st.push(a[i]);
    		  }
    		  else {
    			  nse[i]=st.peek();
    			  st.push(a[i]);
    		  }
    	  }
      }
      for(int i : nse) {
    	  System.out.print(i+" ");
      }
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {9,3,7,5,6,10,12,6,8,2};
		int ngl[]=new int[a.length];
		Stack<Integer> st=new Stack<>();
		st.push(a[0]);
		ngl[0]=-1;
		for(int i=1;i<a.length;i++) {
			if(st.size()==0) {
				ngl[i]=-1;
				st.push(a[i]);
			}
			else {
				while(st.size()>0 && st.peek()<a[i]){
					st.pop();
				}
				if(st.size()==0) {
					ngl[i]=-1;
					st.push(a[i]);
				}
				else {
					ngl[i]=st.peek();
					st.push(a[i]);
				}
			}
		}
		for(int i : ngl) {
			System.out.print(i+" ");
		}
	}
}*/
/*class stack{
	public static void main(String [] args) {
	 int a[]= {2,5,9,3,1,12,6,6,7};
	 int stockspan[]=new int[a.length];
	 Stack<Integer> st=new Stack<>();
	 st.push(0);						
	 stockspan[0]=1;
	 for(int i=1;i<a.length;i++) {
		if(st.size()==0) {
			stockspan[i]=i+1;
			
			st.push(i);
		}
		else {
			while(st.size()>0 && a[st.peek()]<a[i]) {
				st.pop();
			}
			if(st.size()==0) {
				stockspan[i]=i+1;
			}
			else {
				stockspan[i]=i-st.peek();
			}
			st.push(i);
		}
		
	 }
	 for(int i : stockspan) {
		 System.out.print(i+" ");
	 }
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {6,2,5,4,5,1,6};
		int largestArea=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int l=smallerinleft(a,i);			//O(np2)complexcility
			int r=smallerinright(a,i);
			int area=(r-l+1)*a[i];
			largestArea=Math.max(largestArea,area);
		}
		System.out.println(largestArea);
	}
	public static int smallerinleft(int []a,int l) {
		for(int i=l-1;i>=0;i--) {
			if(a[i]<a[l]) {
				return i+1;
			}
		}
		return 0;
	}
	public static int smallerinright(int a[],int r) {
		for(int i=r+1;i<a.length;i++) {
			if(a[i]<a[r]) {
				return i-1;
			}
		}
		return a.length-1;
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {6,2,5,4,5,1,6};
		int ls[]=new int[a.length];
		Stack<Integer> st=new Stack<>();
		st.push(0);
		ls[0]=-1;
		for(int i=1;i<a.length;i++) {
			while(st.size()>0 && a[st.peek()]>=a[i]) {
				st.pop();
			}
			if(st.size()==0) {
				ls[i]=-1;
				st.push(i);
			}
			else {
				ls[i]=st.peek();
				st.push(i);
			}
		}
		int rs[]=new int[a.length];
		Stack<Integer> st1=new Stack<>();
		st1.push(a.length-1);
		rs[a.length-1]=a.length;
		for(int i=a.length-2;i>=0;i--) {
			while(st1.size()>0 && a[st1.peek()]>=a[i]) {
				st1.pop();
			}
			if(st1.size()==0) {
				rs[i]=a.length;
			}
			else {
				rs[i]=st1.peek();
			}
			st1.push(i);
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			int w=rs[i]-ls[i]-1;
			int area=a[i]*w;
			max=Math.max(area,max);
		}
		System.out.println(max);
		
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int a[]= {2,9,3,8,17,12,6,14,4,32,0,7,19,8,12,6};
		int k=4;
		int swindo[]=new int[a.length-3];
		int ng[]=new int[a.length];
		Stack<Integer> st =new Stack<>();
		st.push(a.length-1);
		ng[a.length-1]=a.length;
		for(int i=a.length-2;i>=0;i--) {
			while(st.size()>0 && a[st.peek()]<a[i]) {
				st.pop();
			}
			if(st.size()==0) {
				ng[i]=a.length;
			}
			else {
				ng[i]=st.peek();
			}
			st.push(i);
		}
		
		
		for(int i=0;i<=a.length-k;i++) {
			int j=i;
			while(i+k>ng[j]) {
				j=ng[j];
			}
			swindo[i]=a[j];
		}
		
	
		for(int i :swindo) {
			System.out.println(i);
		}
	}
}*/
/*class stack{
	public static void main(String [] args) {
		int n=5;
		int a[][]= {{0,1,1,1,1},
				    {1,0,0,1,0},
				    {1,0,0,1,0},
				    {0,0,0,0,0},
				    {0,1,0,1,0}};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<b.length;i++) {
			b[i]=true;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i==j) {						//ghatiya answer very long time 
					continue;
				}
				if(a[i][j]==1 || a[j][i]==0) {
					b[i]=false;
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]==true) {
				System.out.println(i);
			}
		}
		}
	}*/
/*class stack{
	public static void main(String [] args) {
		int n=5;
		int a[][]= {{0,1,1,1,1},
				    {1,0,0,1,0},
				    {1,0,0,1,0},
				    {0,0,0,0,0},
				    {0,1,0,1,0}};
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int i=st.pop();
			int j=st.pop();
			if(a[i][j]==0) {
				st.push(i);
			}
			else {
				st.push(j);
			}
		}
		int t=st.pop();
		int f=0;
		for(int i=0;i<a.length;i++) {
			if(i==t) {
				continue;
			}
			else {
			if(a[t][i]==1 || a[i][t]==0) {
				System.out.println("there is no celibrety");
				f=1;
				break;
			}
			
			}
		}
		if(f==0) {
			System.out.println(t);
		}
	}
}*/
/*class stack{
	static class pair implements Comparable<pair>{
		int st;
		int et;
		pair(int s,int e){
			st=s;
			et=e;
		}
		
		public int compareTo(pair o) {
			
			return this.st-o.st;
		}
		
	}
	public static void main(String [] args) {
		int st[]= {22,1,25,14,27,5};
		int et[]= {28,8,27,19,30,12};
		pair []p=new pair[st.length];
		for(int i=0;i<p.length;i++) {
		p[i]=new pair(st[i],et[i]);	
		}
		Arrays.sort(p);
		for(pair t : p) {
			System.out.println(t.st+" "+t.et);
		}
		System.out.println();
		int e=p[0].et;
		int s=p[0].st;
		Stack<pair> stc=new Stack<>();
		stc.push(new pair(s,e));
		for(int i=1;i<p.length;i++) {
			pair r=stc.pop();
			if(p[i].st<=r.et) {
				r.et=Math.max(r.et,p[i].et);
				stc.push(new pair(r.st,r.et));
				
			}
			else {
				stc.push(r);
				stc.push(new pair(p[i].st,p[i].et));
			}
		}
		
	while(stc.size()>0) {
		pair r=stc.pop();
		System.out.println(r.st+" "+r.et);
	}
	
	}
}*/
/*class stack{
	public static void main(String [] args) {
		String str="ddidddid";
		Stack<Integer> st=new Stack<>();
		int i=1;
		for(int j=0;j<str.length();j++) {
			char c=str.charAt(j);
			if(c=='d') {
				st.push(i++);
			}
			else {
				
				st.push(i++);
				while(st.size()>0) {
					System.out.print(st.pop());
				}
			}
		}
		st.push(i);
		while(st.size()>0) {
			System.out.print(st.pop());
		}
	}
}*/
/*class stack{
  static class apnastack{
	  static int data[];
	  static int top;
	  public apnastack(int v) {
		data=new int[v];
		top=-1;
	  }
	public static void push(int v) {
		if(top==data.length-1) {
			int ndata[]=new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				ndata[i]=data[i];
			}
			data=ndata;
		}
		top++;
		data[top]=v;
		
	}
	public static int pop() {
		if(top==-1) {
			System.out.print("stack under flow");
			return -1;
		}
		else {
	  int t=data[top];
	  top--;
	  return t;
		}
	}
	public static int peek() {
		return data[top];
	}
	public static int size() {
		return top+1;
	}
	public static void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(data[i]);
		}
	}
  
  }
		
	
	public static void main(String [] args) {
		apnastack a=new apnastack(5);
		a.push(10);
		a.push(2);
		a.push(6);
		a.push(12);
		a.push(13);
		a.push(14);
		//System.out.println(a.pop());
		//System.out.println(a.peek());
		//System.out.println(a.size());
		//System.out.println(a.pop());
		a.display();
	}
}*/
/*class stack{
	static class minstack{
		static Stack<Integer> st;
		static Stack<Integer> stm;
		public minstack() {
			st=new Stack<>();
			stm=new Stack<>();
		}
		public static void push(int v) {
			if(st.size()==0) {
				st.push(v);
				stm.push(v);
			}
			else {
				if(v<stm.peek()) {
					st.push(v);
					stm.push(v);
				}
				st.push(v);
			}
		}
		public static int pop() {
			if(st.peek()==stm.peek()) {
				stm.pop();
				return st.pop();
			}
			else {
				return st.pop();
			}
		}
		public static int min() {
			return stm.peek();
		}
		
	}
	public static void main(String [] args) {
		minstack m=new minstack();
		m.push(5);
		m.push(7);
		m.push(9);
		m.push(1);
	   System.out.println( m.min());
	   m.pop();
	   System.out.println( m.min());
	}
}*/
/*class stack{
	static class minstack{
		static Stack<Integer> st;
		static int min;
		public minstack() {
			st=new Stack<>();
			min=Integer.MAX_VALUE;
		}
		public static void push(int v) {
		   if(st.size()==0) {
			   st.push(v);
			   min=v;
		   }
		   else {
			   if(v<min) {
				 st.push(v+v-min) ;
				 min=v;
			   }
			   else {
				   st.push(v);
			   }
		   }
		}
		public static int min() {
		  return min;	
		}
		public static int pop() {
			if(st.size()==0) {
				System.out.println("stack under flow");
				return -1;
			}
			else {
				if(st.peek()<min) {
					int v=min;
					min=2*min-st.peek();
					st.pop();
					return v;
				}
				else {
					return st.pop();
				}
			}
		}
		}
	public static void main(String [] args) {
		minstack m=new minstack();
		m.push(5);
		m.push(7);
		m.push(9);
		m.push(1);
		System.out.println(m.min);
		m.pop();
		System.out.println(m.min);
	}
	
}*/
/*class stack{
	static class twostoneArray{
		static int data[];
		static int tos;
		static int top;
		static int size;
		public twostoneArray(int v) {
			data=new int[v];
			tos=-1;
			top=v;
			size=0;
		}
		public static void push1(int v) {
			if(size==data.length) {
				System.out.println("Stack over flow");
			}
			else {
				tos++;
				data[tos]=v;
				size++;
			}
		}
		public static void push2(int v) {
			if(size==data.length) {
				System.out.println("Stack over flow");
			}
			else {
				top--;
				data[top]=v;
				size++;
			}
		}
		public static int pop1() {
			if(tos==-1) {
				System.out.println("stack under flow");
				return -1;
			}
			else {
				int v=data[tos];
				tos--;
				size--;
				return v;
			}
		}
		public static int pop2() {
			if(top==data.length) {
				System.out.println("stack under flow");
				return -1;
			}
			else {
				int v=data[tos];
				top++;
				size--;
				return v;
			}
		}
		public static int size1() {
			return tos+1;
		}
		public static int size2() {
			return data.length-top;
		}
	}
	public static void main(String [] args) {
		twostoneArray t=new twostoneArray(5);
		t.push1(2);
		t.push1(3);
		t.push1(4);
		t.push1(5);
		t.push2(2);
		t.push2(2);
		System.out.println( t.size1());
		System.out.println( t.size);
		
		
	}
}*/


























