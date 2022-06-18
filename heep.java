import java.util.*;

/*public class heep {
public static void main(String [] args) {
  HashMap<String ,Integer>	hm=new HashMap<>();
	hm.put("vishal",98);
	hm.put("kumar",33);
	hm.put("sah",28);
	
	System.out.println(hm);
	Set<String> key= hm.keySet();
	for(String s : key) {
	System.out.println(s+" "+hm.get(s) );	
	}
	
	System.out.print(hm.containsKey("vishal"));
	
	}

	
 }*/

/*public class heep {
public static void main(String [] args) {
  HashMap<Character ,Integer>	hm=new HashMap<>();
 String s="vishalvishalvisiiiii";
 for(int i=0;i<s.length();i++) {
	 char c=s.charAt(i);
	 if(hm.containsKey(c)) {
		 int of=hm.get(c);
		 hm.put(c, of+1);
	 }
	 else {
		 hm.put(c, 1);
	 }
 }
 System.out.print(hm);
 Character mfc=s.charAt(0);
 for(Character x: hm.keySet() ) {
	 if(hm.get(x)>hm.get(mfc)) {
		mfc=x; 
	 }
 }
 System.out.print(mfc+"   "+hm.get(mfc));
 
 
}}*/
/*public class heep {
public static void main(String [] args) {
  int a[]= {1,2,3,4,1,2,3,5};
  int a1[]= {1,1,1,3,4,3};
  HashMap<Integer,Integer> hm=new HashMap<>();
  for(int i=0;i<a.length;i++) {
	  if(hm.containsKey(a[i])) {
	hm.put( a[i], hm.get(a[i])+1);} 
	  else {
		  hm.put(a[i],1);
	  }
  }
  for(int i=0;i<a1.length;i++) {
	  if(hm.containsKey(a1[i])&& hm.get(a1[i])>0) {
		  System.out.print(a1[i]);
		  hm.put(a1[i],hm.get(a1[i])-1);
	  }
  }
  }
}*/
/*public class heep {
public static void main(String [] args) {
  int a[]= {10,5,9,1,11,8,6,15,3,2,12,4};
  HashMap<Integer,Boolean> hm=new HashMap<>();
  for(int v: a) {
	  hm.put(v,true);
  }
  for(int v:a) {
	  if(hm.containsKey(v-1)) {
		  hm.put(v,false);
	  }
  }
  int ml=0;
  int sp=0;
  for(int v :a) {
	 if(hm.get(v)) {
		int hl=1;
		int ls=v;
		while(hm.containsKey(ls+hl)) {
			hl++;
		}
		if(hl>ml) {
			ml=hl;
			sp=ls;
		}
		 
	 }
  }
  for(int i=sp;i<sp+ml;i++) {
	  System.out.println(i);
  }
 

}}*/
/*public class heep{
	public static void main(String [] agrs) {
		int a[]= {1,3,6,9,2,4,5};
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		while(pq.size()>0) {
			System.out.println(pq.remove());
		}
		System.out.println();
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		int k=3;
		for(int i=0;i<a.length;i++) {
		if(i<k) {
		pq1.add(a[i]);	
		}
		else {
			if(pq1.peek()<a[i]) {
				pq1.remove();
				pq1.add(a[i]);
			}
			
		}}
		while(pq1.size()>0) {
			System.out.println(pq1.remove());
		}
		
		
	}
}*/
/*public class heep{
	public static ArrayList<Integer> creatheep(ArrayList<Integer> at) {
		for(int i= (at.size())/2;i>0;i--) {
			downheapyfy(at,i);
		}
		return at;
	}
	private static void downheapyfy(ArrayList<Integer> at,int i) {
		if(i>at.size()) {
			return;
		}
		int min=i;
		int li=2*i+1;
		if(li<at.size() && at.get(li)<at.get(min)) {
			min=li;
		}
		int ri=2*i+2;
		if(ri<at.size() && at.get(ri)<at.get(min)) {
			min=ri;
		}
		if(min!=i) {
			swap(at,i,min);
			downheapyfy(at,min);
		}
	}
	private static void swap(ArrayList<Integer> at,int i,int j) {
		int t=at.get(i);
		at.set(i,at.get(j));
		
		at.set(j,t);
	}
	public static ArrayList<Integer> add(ArrayList<Integer> at,int v) {
		at.set(at.size()-1,v);
          at=upheapyfy(at,at.size()-1);
		return at;
	}
	private static ArrayList<Integer> upheapyfy(ArrayList<Integer> at,int i) {
		int pi=(i-1)/2;
		if(at.get(i)<at.get(pi)) {
			swap(at,i,pi);
			upheapyfy(at,pi);
		}
		return at;
	}
	public static int remove(ArrayList<Integer> at) {
		int t=at.get(0);
		at.set(0,at.get(at.size()-1));
		at.remove(at.size()-1);
		downheapyfy(at,0);
		return t;
	}
/*	public static int [] delet(int []a,int i) {
		int b[]=new int[i];
		for(int j=0;j<i;j++) {
			b[j]=a[j];
		}
		return b;
	}*/
	
	/*public static void main(String []args) {
		int a[]= {0,3,6,9,2,4,7,11,12,13,14,15,16,17,5};
    ArrayList<Integer> at=new ArrayList<>();
    for(int i=0;i<a.length;i++) {
    	at.add(a[i]);
    }
    
	at=creatheep(at);
	
	add(at,1);
	System.out.println(at);
	while(at.size()>0) {
	System.out.println(remove(at));	
	System.out.println(at);
	}
	
	
	}*/
import java.util.*;

public class heep {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character ,Integer>    hm=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(hm.containsKey(c)==false){
              return false;  
            }
            hm.put(c,hm.get(c)-1);
        }
        return true;
    }

    public static void main(String[] args) {
    	
    	String s="vishal";
    	String s1="vishal";
    	System.out.print(isAnagram(s,s1));
    }}

























































































































































































































































































































