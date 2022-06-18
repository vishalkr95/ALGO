




/*public class test {
	static int x;
	static
	{
		x=5;
		System.out.println("initialisation x"+x);
		x=6;
		System.out.println("initialisation x"+x);
		
	}
	/*public test()
	{
		System.out.println("constructor x"+x);
	}*/
	/*public static void main(String[] args) {
	new test();
	test t2=new test();
	}
	

}*/
 /*class test{
	public void print(int t) {
		System.out.println("test");
	}

}*/
/*class test{
	public static void main(String[] args) {
		
		
			int n=7;
			int sp=n/2;
			int st=1;
			int sp1=-1;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=sp;s++) {
				System.out.print(" ");
			}
			
				System.out.print("*");
			
			for(int j=1;j<=sp1;j++) {
				System.out.print(" ");
			}
			if(i!=1 && i!=n ) {
				System.out.print("*");
			}
			
			if(i<=n/2) {
			 sp--;
			 st+=2;
			 sp1+=2;
			}
			else {
				sp++;
				st-=2;
				sp1-=2;
			}
			
			System.out.println();
			
		}
	
	}
	}

/*class test{
	static class A implements Runnable{
		public void run() {
			int i;
			int sum=0;
			for(i=0;i<10;i++) {
				sum+=i;
				//System.out.println("class A"+i);
			}
			System.out.println("A"+sum);
		}
	}
	static	class B implements Runnable{
			public void run() {
				int i;
				int sum =0;
				for(i=0;i<10;i++) {
					sum+=i;
					//System.out.println("class B"+i);
				}
				System.out.println("B"+sum);
			}
	}
	public static void main(String []args) throws InterruptedException {
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.setPriority(1);
		t2.setPriority(5);
		t1.start();
		t2.start();
		

	}
}*/
/*class test{
	public static void main(String [] args) {
	int n=7;
	int d=n/2+1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(d);
			
		}
		if(i<=n/2) {
			d--;
		}
		else {
			d++;
		}
		System.out.println();
	}
		
}}*/

/*class test{
	public static void print(int n) {
		int s=2*n-1;
		int d=n;
		int a[][]=new int[s][s];
		int k=0;
		while(d>0) {
		for(int i=k;i<s;i++) {
		   for(int j=k;j<s;j++) {
			   if(i==k || j==k || j==s-1 || i==s-1) {
				   a[i][j]=d;
			   }
			   
			  
		   }
		}
		 k++;
		   s--;
		d--;
	}
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n-1;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		}
	public static void main(String [] args) {
		int n=4;
		print(n);
	}
}*/
/*class test{
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length-1;i+=2) {
			int t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
		}
		for(int i: a) {
			System.out.print(i+" ");
		}
	}
}*/

/*class test{
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5};
		swap(a,0);
	}
	public static void swap(int []a,int i) {
		if(i%2==0 &&  a.length-1<=i) {
			return ;
		}
		if(i%2==1 && a.length==1) {
			return ;
		}
		   System.out.println(a[i+1]);
		   System.out.println(a[i]);
		   swap(a,i+2);
		
		
	}
}*/




























































































































































































































































































































































































