
public class stq {
 static class apnaQ{
	static int data[];
	 static int tos;
	static int size;
	 public apnaQ(int v) {
		 data=new int[v];
		 tos=0;
		 size=0;
	 }
	 public static int size() {
		 return size;
	 }
	 public static void add(int v) {
		 if(size==data.length) {
			 System.out.println("Queue over flow");
			 
		 }
		 else {
			 int rare=(tos+size)%data.length;
			 data[rare]=v;
			 size++;
		 }
	 }
	 public static int pop() {
		 if(size==0) {
			 System.out.println("Queue under flow");
			 return -1;
		 }
		 else {
			 
			 int t=data[tos];
			tos= (tos+1)%data.length;
			
			size--;
			 return t;
		 }
	 }
	 public static int peek() {
		 if(size==0) {
			 System.out.println("Queue under flow");
			 return -1;
		 }
		 else {
			 int t=data[tos];
			 return t; 
		 }
	 }
	
	 public static void display() {
		for(int i=0;i<size;i++) {
			int idx=(tos+i)%data.length;
			System.out.print(data[idx]+" ");
		}
		System.out.println();
	 } 
 }
	public static void main(String[] args) {
		apnaQ q=new apnaQ(5);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		System.out.println(q.peek());
		System.out.println(q.pop());
		q.display();
		System.out.println(q.peek());
		System.out.println(q.size);

	}

}
