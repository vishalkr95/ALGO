import java.util.*;

/*public class hm {

	public static void main(String[] args) {
		String  s= "abracadabara";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hm.containsKey(ch)) {
				int v=hm.get(ch);
				v++;
				hm.put(ch,v);
			}
			else {
				hm.put(ch,1);
			}
		}
		Set<Character> key=hm.keySet();
		System.out.println(hm);
		char c=s.charAt(0);
		for(char c1 : key) {
			int v=hm.get(c1);
			
			if(hm.get(c)<v) {
				c=c1;
			}
			
		}
		System.out.println(c);
			
	}

}*/
/*class hm{
	public static void main(String [] args) {
		int a1[]= {1,1,2,2,2,3,5};
		int a2[]= {1,1,1,2,2,4,5};
		/*HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a1.length;i++) {
			if(hs.contains(a1[i])==false) {
		         hs.add(a1[i]);
			}
		}
		for(int i=0;i<a2.length;i++) {
			if(hs.contains(a2[i])) {
				System.out.println(a2[i]);
				hs.remove(a2[i]);
			}
		}*/
	/*HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<a1.length;i++) {
		if(hm.containsKey(a1[i])) {
			int of=hm.get(a1[i]);
			of++;
			hm.put(a1[i],of);
		}
		else {
			hm.put(a1[i],1);
		}
	}
	for(int i=0;i<a2.length;i++) {
		if(hm.containsKey(a2[i])) {
			System.out.println(a2[i]);
			hm.remove(a2[i]);
		}
	}
	}
}*/
/*class hm{
	public static void main(String [] args) {
		int a1[]= {1,1,2,2,2,3,5};
		int a2[]= {1,1,1,2,2,4,5};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a1.length;i++) {
			if(hm.containsKey(a1[i])) {
				int of=hm.get(a1[i]);
				of++;
				hm.put(a1[i],of);
			}
			else {
				hm.put(a1[i],1);
			}
		}
		for(int i=0;i<a2.length;i++) {
			if(hm.containsKey(a2[i])) {
				if(hm.get(a2[i])>0) {
				System.out.println(a2[i]);
				int of=hm.get(a2[i]);
				of--;
			    hm.put(a2[i],of);
				}
			}
		}
	System.out.println(hm);	
	}
}*/
/*class hm{
	public static void main(String [] args) {
		int a[]= {10,5,9,1,11,8,6,15,3,12,2};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			hm.put(a[i], 1);
		}
		int c=0;
		int e=a[0];
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				int k=a[i];
				int count=0;
				while(hm.containsKey(k++)) {
					count++;
				
				}
				if(count>c) {
					c=count;
					e=a[i];
				}
			}
		}
		for(int i=0;i<c;i++) {
		System.out.println(e++);
		}
	}
}*/
/*class hm{
	public static void main(String [] args) {
		int a[]= {10,5,9,1,11,8,6,15,3,12,2};
		HashMap<Integer,Boolean> hm=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			hm.put(a[i], true);
		}
		for(int i=0;i<a.length;i++) {
			int v=a[i]-1;
			if(hm.containsKey(v)) {
				hm.put(a[i], false);
			}
		}
		int c=1;
		int e=a[0];
		for(int i=0;i<a.length;i++) {
			if(hm.get(a[i])) {
				int v=a[i]+1;
				int count=1;
				while(hm.containsKey(v++)) {
					count++;
				}
				if(count>c) {
					c=count;
					e=a[i];
				}
			}
		}
		for(int i=0;i<c;i++) {
			System.out.println(e++);
		}
	}
}*/
/*class hm{
	static class Hashmap<k,v>{
		 class HMNode{
		  k key;
		  v value;
		public  HMNode(k key ,v value){
			  this.key=key;
			   this.value=value;
			 
		  }
		}
  LinkedList<HMNode> []buckets;
		 int size;
	public Hashmap(){
		size=0;
		  initbuckets(4);
		  
			
		}
	public  void initbuckets(int s) {
		buckets=new LinkedList[s];
		for(int i=0;i<s;i++) {
			buckets[i]=new LinkedList<>();
		}
	}
	public  void put(k key,v value) {
		int bi=Hashfn(key);
		
		int di=Nodeindexinbi(key,bi);
		
		if(di!=-1) {
			HMNode Node =buckets[bi].get(di);
			Node.value=value;
			
		}
		else {
			
		  HMNode node =new HMNode(key,value);
		  
		  buckets[bi].add(node);
		  size++;
		  }
		  double lamda=size*1.0/buckets.length;
		 
		  if(lamda>2.0) {
			  reHashing();
		  }
	}
	public void reHashing(){
		LinkedList<HMNode> []ob=buckets;
		
		initbuckets(2*ob.length);
		size=0;
		for(int i=0;i<ob.length;i++) {
			for(HMNode node : ob[i]) {
				put(node.key,node.value);
			}
		}
		
	}
	public int Hashfn(k key) {
		int hc=key.hashCode();
		return Math.abs(hc)%buckets.length;
		
	}
	public int Nodeindexinbi(k key,int bi) {
		int di=0;
		for(HMNode Node : buckets[bi]) {
			if(Node.key==key) {
				return di;
			}
			di++;
		}
		return -1;
	}
	public v get(k key) {
		int bi=Hashfn(key);
		int di=Nodeindexinbi(key,bi);
		if(di!=-1) {
			HMNode Node =buckets[bi].get(di);
			
		    return Node.value;
			
		}
		else {
			
		return null;
		}
	}
	public boolean containskey(k key) {
		int bi=Hashfn(key);
		int di=Nodeindexinbi(key,bi);
		if(di!=-1) {
			return true;
			
		}
		else {
		return false;
		}
	}
	public v remove(k key) {
		int bi=Hashfn(key);
		int di=Nodeindexinbi(key,bi);
		if(di!=-1) {
			HMNode Node =buckets[bi].get(di);
			buckets[bi].remove(di);
			size--;
		    return Node.value;
			
		}
		else {
			System.out.println("ab ka");
		return null;
		}
	}
	public ArrayList<k> keySet(){
		ArrayList<k> keys=new ArrayList<>();
		for(int i=0;i<buckets.length;i++) {
			for(HMNode Node : buckets[i]) {
				keys.add(Node.key);
			}
		}
		return keys;
	}
	public int size() {
		return size;
	}
	public void display() {
		for(int i=0;i<buckets.length;i++) {
			for(HMNode node : buckets[i]) {
				System.out.println(node.key +" "+ node.value);
			}
		}
	}
	}
	
	public static void main(String [] args) {
		Hashmap<Integer,String> hm=new Hashmap<>();
		
		String []s= {"vishal","kumar","indian","cse","uitan","student","2019","wb","burdwan","raj"};
		for(int i=0;i<10;i++) {
			hm.put(i,s[i]);
		}
		hm.put(11,"raj");
		for(int i=0;i<13;i++) {
			hm.remove(i);
		}
		hm.display();
	}
}*/






























































































