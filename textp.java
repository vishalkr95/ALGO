
import java.util.*;

/*public class textp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
        String s[]=sc.nextLine().split(" ");
        String s1=s[0];
        String s2=s[1];
        
        find(s1,s2);
    }
    sc.close();
  }
  public static void find(String s1,String s2){
      long p=31;
      long mod=1000000007;
      long h=s2.charAt(0)-'a'+1;
      long pow=p;
      for(int i=1;i<s2.length();i++){
          h=(h+(s2.charAt(i)-'a'+1)*pow)%mod;
          pow=(pow*p)%mod;
          
      }
      long hd[]=new long[s1.length()];
      long pd[]=new long[s1.length()];
      hd[0]=s1.charAt(0)-'a'+1;
      pd[0]=1;
      pow=p;
      for(int i=1;i<s1.length();i++){
          hd[i]=((hd[i-1]+(s1.charAt(i)-'a'+1)*pow)%mod);
          pd[i]=pow;
          pow=(pow*p)%mod;
         
      }
      
      int sp=0;
      int ep=s2.length()-1;
      ArrayList<Integer> al=new ArrayList<>();
      while(ep<s1.length()){
          long win=hd[ep];
          long d=0;
          if(sp>0){
              d=(win-hd[sp-1]+mod)%mod;
          }
          else{
             d=win;
          }
          long s2h=(h*pd[sp])%mod;
          if(d==s2h){
              al.add(sp+1);
          }
          sp++;
          ep++;
      }
      
      System.out.println(al);
      
 }
 }
*/


/*public class textp{
	static HashSet<pair> hs=new HashSet<>();
   static  class pair{
    	long h1;
    	long h2;
    	public pair(long h1,long h2) {
    		this.h1=h1;
    		this.h2=h2;
    	}
    	@Override
    	public boolean equals(Object obj)
    	{
    		

    	if(this == obj)
    			return true;
    		
    		if(obj == null || obj.getClass()!= this.getClass())
    			return false;
    		
           
    		pair p = (pair) obj;
    		
    		// comparing the state of argument with
    		// the state of 'this' Object.
    		return (p.h1==this.h1 && p.h2 == this.h2);
    	}
    	@Override
    	public int hashCode()
    	{
    		
    		// We are returning the Geek_id
    		// as a hashcode value.
    		// we can also return some
    		// other calculated value or may
    		// be memory address of the
    		// Object on which it is invoked.
    		// it depends on how you implement
    		// hashCode() method.
    		return (int)((this.h1)%1000000007);
    	}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String bs=sc.nextLine();
        int k=Integer.parseInt(sc.nextLine());
       
        int count=0;
        for(int i=0;i<s.length();i++){
            int bc=0;
            long h1=0;
            long h2=0;
            long p1=31;
            long p2=29;
            long pow1=1;
            long pow2=1;
            long mod=1000000007;
            
            for(int j=i;j<s.length();j++){
               char c=s.charAt(j);
               int p=c-'a';
               int cp=bs.charAt(p);
               
               if(cp=='0'){
                   bc++;
               }
               if(bc>k){
            	   
                   break;
               }
               else{
                   
                   h1=((h1+(s.charAt(j)-'a'+1)*pow1)%mod);
                   h2=((h2+(s.charAt(j)-'a'+1)*pow2)%mod);
                   pow1=(pow1*p1)%mod;
                   pow2=(pow2*p2)%mod;
                   hs.add(new pair(h1,h2));
                   
               }
            }
        }
        System.out.println(hs.size());
        sc.close();
    }
}*/
/*class pair{
	int id;
    String name;
    public pair(int id,String name) {
    	this.id=id;
    	this.name=name;
    }
    public int getid() {
    	return id;
    }
    public String getName() {
    	return name;
    }
}
class mc implements Comparator<pair>{

	
	public int compare(pair o1, pair o2) {
		if(o1.id<o2.id) {
			return -1;
		}
		return 1;
	}
	
}
class textp{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		pair p1,p2,p3;
		p1=new pair(4,"vishal");
		p2=new pair(3,"suraj");
		p3=new pair(2,"jay");
		Set<pair> s=new TreeSet<>(new mc());
		s.add(p1);
		s.add(p2);
		s.add(p3);
		for(pair p : s) {
			System.out.println(p.id+" "+p.name);
		}
	}
}*/
/*class textp{
	static class node{
		char c;
		node next;
		public node(char c) {
			this.c=c;
			next=null;
		}
	}
	static class ll{
		node root=null;
		public ll() {
			//root=troot;
		}
		public void addF(char c) {
			node n=new node(c);
			if(root==null) {
				root=n;
			}
			else {
				n.next=root;
				root=n;
			}
		}
		public void p() {
			node n=this.root;
			while(n!=null) {
				System.out.print(n.c+" ");
				n=n.next;
			}
		}
	}
	public static void main(String [] args) {
		ll v=new ll();
		v.addF('c');
		v.addF('b');
		v.addF('d');
		v.p();
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		hs.add(5);
		hs.add(1);
		hs.add(2);
		LinkedList<Character> l=new LinkedList<>();
		l.addFirst('c');
		l.remove(0);
		char ch='c';
		boolean c=l.contains(ch);
		System.out.println(c);
	}
}
*/
class textp{
	public static void main(String [] args) {
		int a[]= {2,1,3,7,6,4};
		
		Arrays.sort(a, 0, 3);
		System.out.println(Arrays.toString(a));
	}
}







































