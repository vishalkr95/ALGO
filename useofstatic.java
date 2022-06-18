
public class useofstatic {
	static int a;
    int b;
    
	public static void staticmethod(int n) {
	   a=n;
	  System.out.println(a);
	}
	public void nonstaticmethod(int n) {
		b=n;
		System.out.println(b);
	}
	class c{
		public static void print() {
			System.out.println(a);
			// here we can not use b 
		}
	}
  public static void main(String [] args) {
	staticmethod(8);
	useofstatic obj=new useofstatic();
	obj.nonstaticmethod(9);
	
  }
}
