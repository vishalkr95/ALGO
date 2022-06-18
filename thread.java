/*class C extends Thread{

	
	public void run() {
		
			System.out.println("AAA");	
		}
		
		
	}
class B extends Thread{

	
	public void run() {
	System.out.println("BBB");	
		
	}

	
}

public class thread {

	public static void main(String[] args) {
		Thread t1 =new Thread(new C());
		Thread t2 =new Thread(new B());
         t1.start();
         t2.start();
	}

}*/
/*class A1 implements Runnable{

	
	public void run() {
	for(int i=1;i<5;i++) {
		System.out.println("A : "+i);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
		
	}
	
}
class B implements Runnable{

	
	public void run() {
		
		for(int i=1;i<5;i++) {
			System.out.println("B : "+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}	
	}
	
}
class thread{
	public static void main(String [] args) {
		Thread t1=new Thread(new A1());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
	}
}*/

 /*class C extends Thread{

	
	public void show() {
		for(int i=1;i<5;i++) {
			
			System.out.println("A : "+i);
		     try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
		
		
	}
class B extends Thread{

	
	public void show() {
		for(int i=1;i<5;i++) {
	System.out.println("B : "+i);
	try {
		Thread.sleep(1000);
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		}
	}

	
}

public class thread {

	public static void main(String[] args) {
		C t1 =new C();
		B t2=new B();
	     t1.show();;
	     t2.show();
	}

}
 */

class C implements Runnable{

	
	public void run() {
		for(int i=1;i<10;i++) {
			
			System.out.println("First");
		     try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
		
		
	}
class B implements Runnable{

	
	public void run() {
		for(int i=1;i<10;i++) {
	System.out.println("second");
	try {
		Thread.sleep(1000);
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		}
	}

	
}

public class thread {

	public static void main(String[] args) {
		Thread t1=new Thread(new C());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
	}

}

/*class B extends Thread{

	
	public void run() {
		
		System.out.println("curret Thread is  "+ currentThread().getName());
		System.out.println("current Thread priority is  "
				+ ""+currentThread().getPriority());
	}

	
}

public class thread {

	public static void main(String[] args) {
		Thread t1=new Thread(new B());
		Thread t2=new Thread(new B());
		
		
		t1.setPriority(1);
		t1.setName("ajeet It");
		t2.setPriority(10);
		t2.setName("AJEET IT");
		t1.start();
		t2.start();
		
	}

}*/
/*class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    private int threadtime;
    
    RunnableDemo( String name, int time) {
      threadtime =time;
      threadName = name;
       System.out.println("Creating " +  threadName );
    }
    
    public void run() {
       System.out.println("Running " +  threadName +":-");
       try {
          for(int i = 10; i > 0; i--) {
             System.out.println( threadName );
             // Let the thread sleep for a while.
             Thread.sleep(threadtime);
          }
       } catch (InterruptedException e) {
          System.out.println(e);
       }
      
    }
    
    public void start () {
       System.out.println("Starting " +  threadName );
       if (t == null) {
          t = new Thread (this, threadName);
          t.start ();
       }
    }
 }
 
 public class thread {
 
    public static void main(String args[]) {
       RunnableDemo R1 = new RunnableDemo( "First",1000);
       R1.start();
       
       RunnableDemo R2 = new RunnableDemo( "Second",2000);
       R2.start();
    }   
 }*/



















































