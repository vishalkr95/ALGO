import java.util.Arrays;

/*import java.util.Arrays;

public class gready {
	static class activity implements Comparable<activity>{
		int a;
		int b;
		activity(){}
		activity(int a,int b){
			this.a=a;
			this.b=b;
		}
		public int compareTo(activity e) {
			return this.b-e.b;
		}
	}

	public static void main(String[] args) {
		int a[]= {0,3,1,5,5,8};
		int a1[]= {6,4,2,8,7,9};
		activity []act=new activity[a.length];
		for(int i=0;i<a.length;i++) {
			act[i]=new activity(a[i],a1[i]);
		}
		Arrays.sort(act);
		for(activity i : act) {
			System.out.println(i.a +" "+i.b);
		}
 int count =1;
 int en=act[0].b;
 for(int i=1;i<act.length;i++) {
	
	 if(act[i].a>=en) {
		 en=act[i].b;
		 count++;
	 }
 }
 System.out.println(count);
	}

}*/
/*
class gready{
	public static int change(int n,int a[]) {
	   int c=0;
	   while(n>=0) {
		   int t=0;
		for(int i=a.length-1;i>=0;i--) {
			if(n>=a[i]) {
				t=i;
				c++;
				break;
			}
		}
		n=n-a[t];
	   }
	return c;	
	}
	public static void main(String [] args) {
		int a[]= {1,2,5,10,20,50,100,500,1000};
		int n=121;
		int c=change(n,a);
		System.out.println(c);
		
	}
}
*/
/*class gready{
 static class p implements Comparable<p>{
	  int a,b;
	  float c;
	  p(int a,int b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
	  }
	  public int compareTo(p o) {
		  if(this.c>o.c) {
			  return -1;
		  }
		  else {
			  return 1;
		  }
	  }
  }
	public static void main(String[] args) {
		int w[]= {6,10,3,5,1,3};
		int v[]= {6,2,1,8,3,5};
		int c=10;
		p a[]=new p[w.length];
	for(int i=0;i<w.length;i++) {
		a[i]=new p(w[i],v[i],(float)(w[i]*1.0)/v[i]);
	}
	Arrays.sort(a);
	float price=0;
	for(int i=a.length-1;i>=0;i--) {
		if(c>=0 && a[i].a<=c) {
			c=c-a[i].a;
			price+=a[i].b;
		}
		else if(c>=0 && a[i].a>c) {
			price+=c*a[i].c;
			c=0;
			break;
		}
	}
	System.out.println(price);
	}
}*/


































































































































































