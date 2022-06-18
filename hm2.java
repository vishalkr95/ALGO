
/*
6
A C
B C
C F
D E
E F
F F
 */
import java.util.*;
// we have to find number of employees report to manager
//A C >>> A repotr C so A emp C man
//F f >>> F report F so F is Ceo;
/*public class hm2 {
 
	public static void findCountManager(HashMap<String,String> hm) {
		HashMap<String,HashSet<String>> tree=new HashMap<>();
		String ceo="";
		for(String emp : hm.keySet()) {
			String man=hm.get(emp);
			if(man.equals(emp)) {
				ceo=man;
			}
			else {
				if(tree.containsKey(man)) {
					HashSet<String> hs=tree.get(man);
					hs.add(emp);
					tree.put(man, hs);
				}
				else {
					HashSet<String> hs=new HashSet<String>();
					hs.add(emp);
					tree.put(man, hs);
				}
			}
		}
	   HashMap<String,Integer> size=new HashMap<>();
	   getSize(tree,ceo,size);
	   for(String emp:size.keySet()) {
		 System.out.println(emp+" "+size.get(emp));  
	   }
	}
	public static int getSize(HashMap<String,HashSet<String>> tree,String man,HashMap<String,Integer> size) {
	 if(tree.containsKey(man)==false) {
		 size.put(man, 0);
		 return 1;
	 }
		int s=0;
		for(String emp:tree.get(man)) {
		s+=getSize(tree,emp,size);
	}
		size.put(man,s);
		return s+1;	
	}
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);		
   int n=sc.nextInt();
   HashMap<String ,String> hm=new HashMap<>();
   for(int i=0;i<n;i++) {
	  hm.put(sc.next(), sc.next());
   }
   findCountManager(hm);
	}

}*/
 
/*
4
Chennai Banglore 
Bombay Delhi 
Goa Chennai 
Delhi Goa 
 */
// ek aadmi in jagaho par ja raha hai usaka path batan hai
/*class hm2{
	public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  HashMap<String ,String> hm=new HashMap<>();
  for(int i=0;i<n;i++) {
	  hm.put(sc.next(), sc.next());
  }
  findPath(hm);
 
   }
	public static void findPath(HashMap<String,String> hm) {
		HashMap<String,Boolean> hms=new HashMap<>();
		for(String s: hm.keySet()) {
			String e=hm.get(s);
			hms.put(e,false);
			if(hms.containsKey(s)) {
				hms.put(s, false);
			}
			else {
				hms.put(s, true);
			}
		}
		String strting="";
		for(String str:hms.keySet()) {
			if(hms.get(str)) {
				strting=str;
			}
		}
		//System.out.println(strting);
		printPath(strting,hm);
	}
public static void printPath(String str,HashMap<String,String> hm) {
	if(hm.containsKey(str)==false) {
		System.out.println(str);
		return;
	}
	System.out.print(str+" > ");
	printPath(hm.get(str),hm);
}
}*/

// check all pair of array are divisibale by k or not
/*class hm2{
	public static void main(String [] args) {
		//int a[]= {77,22,56,11,45,34,78,29,23,55,10,20,100};
		class hm2{
	public static void main(String [] args) {
		//int a[]= {77,22,56,11,45,34,78,29,23,55,10,20,100};
		int a[]= {56,52,72,44,80,36,92,40,18,26,30,30};
		int k=8;

		HashMap<Integer,Integer> hm=new HashMap<>();

		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int r=a[i]%k;
			if(r!=0) {
				if(hm.containsKey(k-r)) {
					int of=hm.getOrDefault(k-r,0);
					if(of>1) {
						hm.put(k-r, of-1);
					}
					else {
					hm.remove(k-r);
					}
				}
				else {
					if(hm.containsKey(r)) {
						int f=hm.get(r);
						hm.put(r, f+1);
					}
					else {
						hm.put(r, 1);
					}
				}
			}
			else {
				if(hm.containsKey(r)) {
					hm.remove(r);
				}
				else {
					hm.put(r, 1);
				}
			}
			
		}
		if(hm.size()==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}*/


// OR M2



/*class hm2{
	public static void main(String [] args) {
		int a[]= {56,52,72,44,80,36,96,40,18,26,30,30};
	    int k=8;

	 HashMap<Integer,Integer> hm=new HashMap<>();
	 for(int v:a) {
		 int r=v%k;
		 int of=hm.getOrDefault(r, 0);
		 hm.put(r, of+1);
	 }
	 for(int v : a) {
		 int r=v%k;
		 if(r==0) {
			if(hm.get(r)%2==1) {
				System.out.println(false);
				return ;
			}
		 }
		 else if(2*r==k) {
			 if(hm.get(r)%2==1) {
					System.out.println(false);
					return ;
				}
		 }
		 else {
			 int f=hm.get(r);
			 int cf=hm.getOrDefault(k-r,0);
			 if(cf!=f) {
				 System.out.println(false);
				 return ;
			 }
		 }
	 }
	 System.out.println(true);
	}
}*/
// different Element in K size windows
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6};
		int k=4;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<k-1;i++) {
			int f=hm.getOrDefault(a[i], 0);
			hm.put(a[i], f+1);
		}
		for(int i=k-1;i<a.length;i++) {
			int f=hm.getOrDefault(a[i], 0);
			hm.put(a[i], f+1);
			System.out.print(hm.size()+" ");
			int of=hm.get(a[i+1-k]);
			if(of>1) {
				hm.put(a[i-k+1],of-1);
			}
			else {
				hm.remove(a[i-k+1]);
			}
		}
	}
}*/
// or
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6};
		int k=4;
		ArrayList<Integer> al=DiffelementInK(a,k);
		System.out.println(al);
	}
	public static ArrayList<Integer> DiffelementInK(int a[],int k){
		ArrayList<Integer> al=new ArrayList<>();
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<k-1;i++) {
			int f=hm.getOrDefault(a[i], 0);
			hm.put(a[i], f+1);
		}
		for(int j=0,i=k-1;i<a.length;i++,j++) {
			int f=hm.getOrDefault(a[i], 0);
			hm.put(a[i], f+1);
			al.add(hm.size());
			int of=hm.get(a[j]);
			if(of>1) {
				hm.put(a[j],of-1);
			}
			else {
				hm.remove(a[j]);
			}
		}
		return al;
	}
}*/
// longest subarray with zero sum
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0, -1);
		int sum=0;
		int l=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(hm.containsKey(sum)) {
				int oi=hm.get(sum);
				l=Math.max(l,i-oi);
			}else {
				hm.put(sum, i);
			}
		}
		System.out.println(l);
	}
}*/
// total sub array with zero sum

/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0,1);
		int sum=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(hm.containsKey(sum)) {
				c+=hm.get(sum);
				hm.put(sum, hm.get(sum)+1);
			}else {
				hm.put(sum, 1);
			}
		}
		System.out.println(c);
	}
}*/
// minimum length subString from s1 in which all char or s2 present
/*class hm2{
	public static void main(String [] args) {
		String s1="timetopractice";
		String s2="toc";
		String s=MinimumLengthSubString(s1,s2);
		System.out.println(s);
	}
	public static String MinimumLengthSubString(String s1,String s2) {
		HashMap<Character,Integer> hm2=new HashMap<>();
		String ans="";
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			hm2.put(c,hm2.getOrDefault(c, 0)+1);
		}
		int rm=s2.length();
		int cm=0;
		int i=0;
		int j=0;
		HashMap<Character,Integer> hm1=new HashMap<>();
		while(true) {
			boolean f1=false;
			boolean f2=false;
			while(i<s1.length() && cm<rm) {
			  char c=s1.charAt(i);
			  hm1.put(c, hm1.getOrDefault(c, 0)+1);
			  if(hm1.get(c)<=hm2.getOrDefault(c, 0)) {
				  cm++;
			  }
			  f1=true;
			  i++;
			}
			while(j<i && rm==cm) {
				
				String sub=s1.substring(j,i);
				if(ans.length()==0 || ans.length()>sub.length()) {
					ans=sub;
				}
				char c=s1.charAt(j);
				int f=hm1.get(c);
				if(f>1) {
					hm1.put(c, f-1);
				}
				else {
					hm1.remove(c);
				}
				if(hm1.getOrDefault(c, 0)<hm2.getOrDefault(c, 0)) {
					cm--;
				}
				j++;
				f2=true;
			}
			if(f1==false && f2==false) {
				break;
			}
			
		}
		return ans;
	}
}*/

// min len substring of unique char
/*class hm2{
	public static void main(String [] args) {
		String str="bbacacdcbbcacdcdca";
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(hs.contains(c)==false) {
				hs.add(c);
			}
		}
		String s=minLenSubString(str,hs);
		System.out.println(s);
	}
	public static String minLenSubString(String str,HashSet<Character> hs) {
		HashMap<Character,Integer> hm=new HashMap<>();
		String ans="";
		int i=0;
		int j=0;
		
		while(true) {
			boolean f1=false,f2=false;
		  while(i<str.length()&&hm.size()<hs.size()) {
			  char c=str.charAt(i);
			  hm.put(c, hm.getOrDefault(c, 0)+1);
			  f1=true;
			  i++;
		  }
		  while(j<i && hm.size()==hs.size()) {
			  String sub=str.substring(j,i);
			  if(ans.length()==0 || ans.length()>sub.length()) {
				  ans=sub;
			  }
			  char c=str.charAt(j);
			  int f=hm.get(c);
			  if(f>1) {
				  hm.put(c,f-1);
			  }
			  else {
				  hm.remove(c);
				   }
			  f2=true;
			  j++;
		  }
		  if(f1==false && f2==false) {
			  break;
		  }
		}
		return ans;
	}
}*/
// longest length unique char string
/*class hm2{
	public static void main(String [] args) {
		String str="abbacbcdbadbdbbdcb";
		String s=longestUniqueCharSubString(str);
		System.out.println(s);
	}
	public static String longestUniqueCharSubString(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		String ans="";
		int i=-1;int j=-1;
		while(true) {
			
			boolean f1=false;
			boolean f2=false;
			while(i<str.length()-1) {
				f1=true;
				i++;
				char c=str.charAt(i);
				hm.put(c, hm.getOrDefault(c, 0)+1);
				int f=hm.get(c);
				if(f==2) {
					break;
				}
				else {
					String sub=str.substring(j+1,i+1);
					if(ans.length()==0|| ans.length()<sub.length()) {
						ans=sub;
					}
				}
				
				
				
			}
			while(j<i) {
				f2=true;
				j++;
				char c=str.charAt(j);
				hm.put(c, hm.get(c)-1);
				if(hm.getOrDefault(c, 0)==1) {
					break;
				}
				
				
			}
			if(f1==false&&f2==false) {
				break;
			}
		}
		return ans;
	}
}*/
 // all subString without reapeating char
/*class hm2{
	public static void main(String [] args) {
		String str="aabcbcdbca";
		allsubStringwithoutreapitingChar(str);
	}
	public static void allsubStringwithoutreapitingChar(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		int i=-1;
		int j=-1;
		while(i<str.length()-1) {
			while(i<str.length()-1) {
				
				i++;
				char c=str.charAt(i);
				hm.put(c, hm.getOrDefault(c, 0)+1);
				int f=hm.get(c);
				if(f==2) {
					break;
				}
				else {
					for(int k=j+1;k<=i;k++) {
					String sub=str.substring(k,i+1);
					System.out.println(sub);
					}
				}
			}
			while(j<i) {
				
				j++;
				char c=str.charAt(j);
				hm.put(c, hm.get(c)-1);
				int f=hm.getOrDefault(c, 0);
				if(f==1) {
					for(int k=j+1;k<=i;k++) {
						String sub=str.substring(k,i+1);
						System.out.println(sub);
					}
					break;
				}
			}
		}
	}
}*/
// total subString without reapeting char

/*class hm2{
	public static void main(String [] args) {
		String str="aabcbcdbca";
		int c=allsubStringwithoutreapitingChar(str);
		System.out.println(c);
	}
	public static int allsubStringwithoutreapitingChar(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		int i=-1;
		int j=-1;
		int count=0;
		while(i<str.length()-1) {
			while(i<str.length()-1) {
				
				i++;
				char c=str.charAt(i);
				hm.put(c, hm.getOrDefault(c, 0)+1);
				int f=hm.get(c);
				if(f==2) {
					break;
				}
				else {
					count+=i-j;
					}
				}
			while(j<i) {
				
				j++;
				char c=str.charAt(j);
				hm.put(c, hm.get(c)-1);
				int f=hm.getOrDefault(c, 0);
				if(f==1) {
					count+=i-j;
					break;
				}
			}
		}
		return count;
	}
}*/
// longest substring with exactly k distinct char
/*class hm2{
	public static void main(String [] args) {
		String str="aabcbcdbca";
		int k=2;
		String s=LongestsubString(str,k);
		System.out.println(s);
	}
	public static String LongestsubString(String str,int k) {
		HashMap<Character,Integer> hm=new HashMap<>();
		String ans="";
		int i=-1;
		int j=-1;
		while(true) {
			boolean f1=false;
			boolean f2=false;
			while(i<str.length()-1 && hm.size()<=k) {
				f1=true;
				i++;
				char c=str.charAt(i);
				hm.put(c, hm.getOrDefault(c, 0)+1);
				if(hm.size()==k) {
					String sub=str.substring(j+1,i+1);
					if(ans.length()==0|| ans.length()<sub.length()) {
						ans=sub;
					}
				}
			}
			while(j<i && hm.size()>k) {
				f2=true;
				j++;
				char c=str.charAt(j);
				int f=hm.get(c);
				if(f>1) {
					hm.put(c, f-1);
				}
				else {
					hm.remove(c);
				}
			}
			if(f1==false&& f2==false) {
				break;
			}
		}
		return ans;
	}
}*/
// cout of subarray in which all element are present
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,5,3,5,2,4,1,3,1,4};
	int	c=countSubarraywithallelement(a);
	System.out.println(c);
	}
	public static int countSubarraywithallelement(int a[]) {
		int ans=0;
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(hs.contains(a[i])==false) {
				hs.add(a[i]);
			}
		}
		int i=-1;
		int j=-1;
		HashMap<Integer,Integer> hm=new HashMap<>();
		while(true) {
			boolean f1=false;
			boolean f2=false;
			while(i<a.length-1) {
				i++;
				f1=true;
				hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
				if(hm.size()==hs.size()) {
					ans+=a.length-i;
					break;
				}
				
			}
			while(j<i ) {
				j++;
				f2=true;
				int f=hm.get(a[j]);
				if(f>1) {
					hm.put(a[j], f-1);
					
				}
				else {
					hm.remove(a[j]);
				}
				if(hm.size()==hs.size()) {
					ans+=a.length-i;
				}
				else {
					break;
				}
			}
			if(f1==false&&f2==false) {
				break;
			}
		}
		return ans;
	}
}*/
// max length of all 1's can be produced in maximum k swaps
/*class hm2{
	public static void main(String [] args) {
		int a[]= {1,1,0,1,0,0,1,1,0,1,0,1,1};
		int k=2;
		int l=MaxLenWithAll1sInK(a,k);
		System.out.println(l);
	}
	public static int MaxLenWithAll1sInK(int [] a,int k) {
		int ans=0;
		int j=-1;
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				c++;
			}
			while(c>k) {
				j++;
				if(a[j]==0) {
					c--;
				}
			}
			if(i-j>ans) {
				ans=i-j;
			}
		}
		return ans;
	}
}*/
// max len with contiguous element

/*class hm2{
	public static void main(String [] args) {
		int a[]= {9,2,7,5,6,23,24,22,23,19,17,16,18,39,0};
		int l=maxlenWithContiguouselement(a);
		System.out.println(l);
	}
	public static int maxlenWithContiguouselement(int a[]) {
		int ans=0;
		for(int i=0;i<a.length-1;i++) {
			int min=a[i];
			int max=a[i];
			HashSet<Integer> hs=new HashSet<>();
			hs.add(a[i]);
			for(int j=i+1;j<a.length;j++) {
				if(hs.contains(a[j])) {
					break;
				}
				hs.add(a[j]);
				min=Math.min(min, a[j]);
				max=Math.max(max, a[j]);
				if(max-min==j-i) {
					int l=j-i+1;
					if(l>ans) {
						ans=l;
					}
				}
			}
		}
		return ans;
	}
}*/
// count substring with max k diff char
/*class hm2{
	public static void main(String []args) {
		String str="aabcbcdbca";
		int k=2;
		int c=CountSubStringWithMaxKdiffChar(str,k);
		System.out.println(c);
	}
	public static int CountSubStringWithMaxKdiffChar(String str,int k) {
		int ans=0;
		HashMap<Character,Integer> hm=new HashMap<>();
	  int i=-1,j=-1;
	  while(true) {
		 
		  while(i<str.length()-1) {
			  i++;
			 
			  char c=str.charAt(i);
			  hm.put(c, hm.getOrDefault(c, 0)+1);
			  if(hm.size()>k) {
				  break;
			  }else {
				  ans+=i-j;
			  }
		  }
		  if(i==str.length()-1&&hm.size()<=k) {
			  break;
		  }
		  while(j<i) {
			
			  j++;
			  char c=str.charAt(j);
			  int f=hm.get(c);
			  if(f>1) {
				  hm.put(c, f-1);
			  }
			  else {
				  hm.remove(c);
			  }
			  if(hm.size()<=k) {
				  ans+=i-j;
				  break;
			  }
		  }
	  }
		return ans;
	}
}*/
// count sub array with sum=k;
/*class hm2{
	public static void main(String [] args) {
		int a[]= {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int k=5;
		int c=subarrayWithsumk(a,k);
		System.out.println(c);
	}
	public static int subarrayWithsumk(int a[],int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		int ans=0;
		int sum=0;
		hm.put(0, 1);
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(hm.containsKey(sum-k)) {
				int f=hm.get(sum-k);
				ans+=f;
				}
			if(hm.containsKey(sum)) {
				hm.put(sum, hm.get(sum)+1);
			}else {
			 hm.put(sum, 1);
			}
			}
	    
	     return ans;
		}
	
}*/
/*class hm2{
	public static void main(String [] args) {
		int a[]= {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int k=5;
		int c=subarrayWithsumk(a,k);
		System.out.println(c);
	}
	public static int subarrayWithsumk(int a[],int k) {
		int ans=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				if(sum==k) {
					ans++;
				}
			}
		}
	    
	     return ans;
		}
	
}*/
//  count anagram of ptr in string 
/*class hm2{
	public static void main(String [] args) {
		String str="abbacdadcbab";
		String ptr="abbc";
		int c=SubStringAnagramWithptr(str,ptr);
		System.out.println(c);
	}
	public static int SubStringAnagramWithptr(String str,String ptr) {
		int ans=0;
		HashMap<Character,Integer> hm2=new HashMap<>();
		for(int i=0;i<ptr.length();i++) {
			char c=ptr.charAt(i);
			hm2.put(c, hm2.getOrDefault(c, 0)+1);
		}
		HashMap<Character,Integer> hm1=new HashMap<>();
		for(int i=0;i<ptr.length();i++) {
			char c=str.charAt(i);
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
		}
		int i=ptr.length();
		int j=0;
		while(i<str.length()) {
			if(checkAnagram(hm1,hm2)) {
				ans++;
			}
			char c=str.charAt(i);
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
			char ch=str.charAt(j);
			if(hm1.get(ch)>1) {
				hm1.put(ch, hm1.get(ch)-1);
			}
			else {
				hm1.remove(ch);
			}
			i++;
			j++;
		}
		if(checkAnagram(hm1,hm2)) {
			ans++;
		}
		return ans;
	}
	public static boolean checkAnagram(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2) {
		
		for(char c: hm1.keySet()) {
			int f=hm2.getOrDefault(c, 0);
			if(f!=hm1.get(c)) {
				return false;
			}
		}
		return true;
	}
}*/
// check if two string is k anagram
/*class hm2{
	public static void main(String [] args) {
		String str1="ababaddccc";
		String str2="bcbecabacd";
		int k=3;
		boolean c=checkKanagram(str1,str2,k);
		System.out.println(c);
	}
	public static boolean checkKanagram(String str1,String str2,int k) {
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			char c=str1.charAt(i);
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<str2.length();i++) {
			char c=str2.charAt(i);
			if(hm.containsKey(c)) {
				int f=hm.get(c);
				if(f>1) {
					hm.put(c, f-1);
				}
				else {
					hm.remove(c);
				}
			}
			
		}
		int s=0;
		for(char c:hm.keySet()) {
			s+=hm.get(c);
		}
		if(s<=k) {
			return true;
		}
		else {
			return false;
		}
		
	}
}*/
// find position of element in b if two array are anagram
/*class hm2{
	static class pair{
		int i;
		ArrayList<Integer> al;
		public pair() {
			i=0;
			al=new ArrayList<>();
		}
	}
	public static void main(String [] args) {
		int a[]= {2,7,9,2,8,1,1,3,9};
		int b[]= {3,1,2,9,8,1,7,9,2};
		int arr[]=new int[a.length];
		HashMap<Integer,pair> hm=new HashMap<>();
		for(int i=0;i<b.length;i++) {
			if(hm.containsKey(b[i])) {
				pair p=hm.get(b[i]);
				p.al.add(i);
			}else {
				pair p=new pair();
				p.al.add(i);
				hm.put(b[i], p);
			}
		
		}
		for(int i=0;i<a.length;i++) {
			pair p=hm.get(a[i]);
			arr[i]=p.al.get(p.i);
			p.i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}*/
//group anagram
/*class hm2{
	public static void main(String [] args) {
		String str[]= {"abcc","acbc","badc","abcd","dabb","babd","dbca","cabc"};
		HashMap<HashMap<Character,Integer>,ArrayList<String>> hm=new HashMap<>();
		for(int i=0;i<str.length;i++) {
			HashMap<Character,Integer> tmphm=new HashMap<>();
			for(int j=0;j<str[i].length();j++) {
				char c=str[i].charAt(j);
				tmphm.put(c, tmphm.getOrDefault(c, 0)+1);
			}
			if(hm.containsKey(tmphm)) {
				ArrayList<String> al=hm.get(tmphm);
				al.add(str[i]);
				hm.put(tmphm, al);
			}
			else {
				ArrayList<String> al=new ArrayList<>();
				al.add(str[i]);
				hm.put(tmphm, al);
			}
		}
		for(HashMap<Character,Integer> hml:hm.keySet()) {
			ArrayList<String> al=hm.get(hml);
			System.out.println(al);
		}
	}
}*/
/*class hm2{
	public static void main(String [] args) {
		String str[]= {"abcc","acbc","badc","abcd","dabb","babd","dbca","cabc"};
		HashSet<String> hs=new HashSet<>();
		ArrayList<ArrayList<String>> al=new ArrayList<>();
		for(int i=0;i<str.length;i++) {
			ArrayList<String> all=new ArrayList<>();
			if(hs.contains(str[i])==false) {
			hs.add(str[i]);
			all.add(str[i]);
			for(int j=0;j<str.length;j++) {
				
					if(hs.contains(str[j])==false) {
						
						if(isAnagram(str[i],str[j])) {
							
							hs.add(str[j]);
							all.add(str[j]);
						}
					}
			}
			al.add(all);
			}
		}
		System.out.println(al);
	}
	public static boolean isAnagram(String str1,String str2) {
		
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			char c=str1.charAt(i);
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<str2.length();i++) {
			char c=str2.charAt(i);
			if(hm.containsKey(c)) {
				int f=hm.get(c);
				if(f>1) {
					hm.put(c, f-1);
				}
				else {
					hm.remove(c);
				}
			}
		}
		if(hm.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
}*/
// is Isomorphic String
// two str is isomorphic if a-x then in all position a-x

/*class hm2{
	public static void main(String [] args) {
		String str1="abacba";
		String str2="xyxzyx";
		boolean b=isIsomorphic(str1,str2);
		System.out.println(b);
	}
	public static boolean isIsomorphic(String str1,String str2) {
		HashMap<Character,Character> hm1=new HashMap<>();
		HashMap<Character,Boolean> hm2=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			char c=str1.charAt(i);
			char ch=str2.charAt(i);
			if(hm1.containsKey(c)) {
				char cv=hm1.get(c);
				if(cv!=ch) {
			        return false;
				}
			}
			else {
				
				if(hm2.containsKey(ch)) {
					return false;
				}
				else {
					hm1.put(c, ch);
					hm2.put(ch, true);
				}
			}
		}
		return true;
	}
}*/
// word pattern is like Isomorphic

/*class hm2{
	public static void main(String [] args) {
		String word="abbcaa";
		String words[]= {"the","pep","pep","coding","the","the"};
		boolean b=isLikeIsomorphic(word,words);
		System.out.println(b);
	}
	public static boolean isLikeIsomorphic(String word,String [] words) {
		if(word.length()!=words.length) {
			return false;
		}
		HashMap<Character,String> hm=new HashMap<>();
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			String str=words[i];
			if(hm.containsKey(c)) {
				if(str.equals(hm.get(c))==false) {
					return false;
				}
			}
			else {
				if(hs.contains(str)) {
					return false;
				}
				else {
					hm.put(c, str);
					hs.add(str);
				}
			}
		}
		
		
		return true;
	}
}*/
// count sub array whose sum is divisible by k
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,3,5,4,5,3,4};
		int k=7;
		int c=countSubArrayDividByK(a,k);
		System.out.println(c);
	}
	public static int countSubArrayDividByK(int a[],int k) {
		int ans=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0, 1);
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			int rem=sum%k;
			if(rem<0) {
				rem+=k;
			}
			if(hm.containsKey(rem)) {
				int f=hm.get(rem);
				ans+=f;
				hm.put(rem, f+1);
			}
			else {
				hm.put(rem, 1);
			}
		}
		return ans;
	}
}*/
// longest length in which same number of 0's and 1's 
/*class hm2{
	public static void main(String [] args) {
		int a[]= {0,0,1,0,1,0,1,1,0,0,1,1,1};
		int l=LongestLengthOf0s1s(a);
		System.out.println(l);
		
	}
	public static int LongestLengthOf0s1s(int a[]) {
		int sum=0;
		int ans=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0, -1);
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				sum+=-1;
			}
			else {
				sum+=1;
			}
			if(hm.containsKey(sum)) {
				int idx=hm.get(sum);
				if(i-idx>ans) {
					ans=i-idx;
				}
			}
			else {
				hm.put(sum, i);
			}
		}
		return ans;
	}
}*/
// count all sub array in which equal number of 0's and 1's
/*class hm2{
	public static void main(String [] args) {
		int a[]= {0,0,1,0,1,0,1,1,0,0,1,1,1};
		int c=countsubArrayEqual0s1s(a);
		System.out.println(c);
	}
	public static int countsubArrayEqual0s1s(int a[]) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		int sum=0;
		int ans=0;
		hm.put(0, 1);
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				sum+=-1;
			}
			else {
				sum+=1;
			}
			if(hm.containsKey(sum)) {
				int f=hm.get(sum);
				ans+=f;
				hm.put(sum, f+1);
			}
			else {
				hm.put(sum, 1);
			}
		}
		return ans;
	}
}*/
// longest subArray which sum divisible by k
/*class hm2{
	public static void main(String [] args) {
		int a[]= {5,8,-3,-9,-7,4,11,2,9,-16,8,-9};
		int k=7;
		int l=Lenofsubarray(a,k);
		System.out.println(l);
	}
	public static int Lenofsubarray(int a[],int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		int sum=0;
		hm.put(0,-1);
		int ans=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			int r=sum%k;
			if(r<0) {
				r+=k;
			}
			if(hm.containsKey(r)) {
				int idx=hm.get(r);
				if(i-idx>ans) {
					ans=i-idx;
				}
			}
			else {
				hm.put(r, i);
			}
		}
		return ans;
	}
}*/
// longest length in which equal no of 0's 1's 2's
/*class hm2{
	public static void main(String [] args) {
		int a[]= {1,1,2,0,1,0,1,2,1,2,2,0,1};
		int l=equal0s1s2sLongLen(a);
		System.out.println(l);
	}
	public static int equal0s1s2sLongLen(int a[]) {
		int c0=0;
		int c1=0;
		int c2=0;
		int ans=0;
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("0#0",-1);
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				c0++;
			}
			else if(a[i]==1) {
				c1++;
			}
			else {
				c2++;
			}
			int d10=c1-c0;
			int d21=c2-c1;
			String str=d10+"#"+d21;
			if(hm.containsKey(str)) {
				int idx=hm.get(str);
				if(i-idx>ans) {					
				ans=i-idx;
				}
			}
			else {
				hm.put(str, i);
			}
		}
		return ans;
	}
}*/
// count sub Array in which equal 0's 1's 2's
/*class hm2{
	public static void main(String [] args) {
		int a[]= {1,1,2,0,1,0,1,2,1,2,2,0,1};
		int c=countSubarrayequal0s1s2s(a);
		System.out.println(c);
	}
	public static int countSubarrayequal0s1s2s(int a[]) {
		int c0=0;
		int c1=0;
		int c2=0;
		int ans=0;
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("0#0",1);
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				c0++;
			}
			else if(a[i]==1) {
				c1++;
			}
			else {
				c2++;
			}
			int d10=c1-c0;
			int d21=c2-c1;
			String str=d10+"#"+d21;
			if(hm.containsKey(str)) {
				int f=hm.get(str);
				ans+=f;
				hm.put(str, f+1);
			}
			else {
				hm.put(str, 1);
			}
		}
		return ans;
	}
}*/
// is any pair with equal sum
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,9,3,5,8,6,4};
		boolean b=isPairWithEqualSum(a);
		System.out.println(b);
	}
	public static boolean isPairWithEqualSum(int a[]) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int sum=a[i]+a[j];
				if(hs.contains(sum)) {
					return true;
				}
				else {
					hs.add(sum);
				}
			}
		}
		return false;
	}
}*/
// fractional division till 0 or reapeat
/*class hm2{
	public static void main(String [] args) {
		int num=22;
		int den=7;
		String str=FractionDivision(num,den);
		System.out.println(str);
	}
	public static String FractionDivision(int num,int den) {
		StringBuilder ans=new StringBuilder();
		int q=num/den;
		int r=num%den;
		ans.append(q);
		if(r==0) {
			return ans.toString();
		}
		else {
	        HashMap<Integer,Integer> hm=new HashMap<>();
			ans.append(".");
			while(r!=0) {
				if(hm.containsKey(r)) {
				int len=hm.get(r);
				ans.insert(len, "(");
				ans.append(")");
				break;	
				}
				else {
					hm.put(r,ans.length());
					r=r*10;
					q=r/den;
					r=r%den;
					ans.append(q);
				}
				
			}
		}
		return ans.toString();
	}
}*/
// rabit in forest
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,2,3,1,0,2,3,1};
		int minrabit=minrabit(a);
		System.out.println(minrabit);
	}
	public static int minrabit(int a[]) {
		int ans=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
		}
		for(int key: hm.keySet()) {
			int gs=key+1;
			int report=hm.get(key);
			int ng=(int)Math.ceil(report*1.0/gs*1.0);
			ans+=ng*gs;
		}
		return ans;
	}
}*/
// task completion 
// 15 6
// 2 5 6 7 9 4
// means 15 task(1-15) me se 6 complete ho gaye bache huye kamo ko do logo me alternate batan hai
/*class hm2{
	public static void main(String [] args) {
		int n=15;
		int m=6;
		int a[]= {2,5,6,7,9,4};
		print1s2spersiontask(n,m,a);
	}
	public static void print1s2spersiontask(int n,int m,int a[]) {
		HashSet<Integer> hs=new HashSet<>();
		for(int v:a) {
			hs.add(v);
		}
		ArrayList<Integer> one=new ArrayList<>();
		ArrayList<Integer> two=new ArrayList<>();
		boolean fleg=true;
		for(int i=1;i<=n;i++) {
			if(hs.contains(i)==false) {
				if(fleg) {
					one.add(i);
				}
				else {
					two.add(i);
				}
				fleg=!fleg;
			}
		}
		System.out.println(one);
		System.out.println(two);
	}
}*/
// sum=k
/*class hm2{
	public static void main(String [] args) {
		int a[]= {2,3,4,5,6,7,8};
		int k=8;
		int p=0;
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]<k) {
				i++;
			}
			else if(a[i]+a[j]>k) {
				j--;
			}
			else {
				p++;
				i++;
				j++;
			}
		}
		System.out.println(p);
	}
}*/
// count pair with sum equal k from two sorted matrix
/*class hm2{
	public static void main(String [] args) {
		int m1[][]= {{1,5,6},
				     {8,10,11},
				     {15,16,18}};
		int m2[][]= {{2,4,7},
				     {9,10,12},
				     {13,16,20}};
		int k=21;
		int c=countpairsumk(m1,m2,k);
		System.out.println(c);
	}
	public static int countpairsumk(int m1[][],int m2[][],int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				hm.put(m1[i][j],hm.getOrDefault(m1[i][j], 0)+1);
			}
		}
		int count=0;
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[0].length;j++) {
				int c=k-m2[i][j];
				if(hm.containsKey(c)) {
					count+=hm.get(c);
				}
			}
		}
		return count;
	}
}*/

/*class hm2{
	
	public static void main(String [] args) {
		int a[]= {-8,-3,8,8,4,-6,-4,2,2,1,4,16,8,4,3,9};
		boolean b=isPairPossible(a);
		System.out.println(b);
	}
	public static boolean isPairPossible(int a[]) {
		if(a.length%2!=0) {
			return false;
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int v: a) {
			hm.put(v, hm.getOrDefault(v, 0)+1);
		}
		Integer []arr=new Integer[a.length];
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
		}
		Arrays.sort(arr,(x,y)->{
			return Math.abs(x)-Math.abs(y);
		});
		
		for(int v: arr) {
			int f=hm.get(v);
			if(f==0) {
				continue;
			}
			if(hm.getOrDefault(2*v, 0)==0) {
				return false;
			}
			else {
				hm.put(v, hm.get(v)-1);
				hm.put(2*v, hm.get(2*v)-1);
			}
		}
		return true;
	}
}*/
/*
6
1 0 -1 0 -2 2
0
 */
/*public class hm2 {
	public static ArrayList<ArrayList<Integer>> twosum(int[] a, int target, int si,int ei) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		while(si<ei) {
			int sum=a[si]+a[ei];
			if(sum>target) {
				ei--;
			}
			else if(sum<target) {
				si++;
			}
			else {
				res.add(new ArrayList(Arrays.asList(a[si],a[ei])));
				si++;
				ei--;
				while(si<ei&& a[si]==a[si-1]) {
					si++;
				}
				while(si<ei&& a[ei]==a[ei+1]) {
					ei--;
				}
			}
		}
		return res;
	}
	public static ArrayList<ArrayList<Integer>> threesum(int[] a, int target, int si,int ei) {
		
	      ArrayList<ArrayList<Integer>> res=new ArrayList<>();
	      for(int i=si;i<ei;i++) {
	    	  if(i!=si && a[i]==a[i-1]) {
	    		 continue; 
	    	  }
	    	  ArrayList<ArrayList<Integer>> al=twosum(a,target-a[i],i+1,ei);
	    	
	    		 for(ArrayList<Integer> list :al) {
		    		 list.add(0,a[i]) ;
		    		 res.add(list);
		    	  }
	    	
	    	  
	      }
			return res;
		}
    public static ArrayList<ArrayList<Integer>> fourSum(int[] a, int target, int n) {
		
      Arrays.sort(a);
      ArrayList<ArrayList<Integer>> res=new ArrayList<>();
      for(int i=0;i<a.length;i++) {
    	  if(i!=0 && a[i]==a[i-1]) {
    		 continue; 
    	  }
    	  ArrayList<ArrayList<Integer>> al=threesum(a,target-a[i],i+1,n-1);
    	 
	    		 for(ArrayList<Integer> list :al) {
		    		 list.add(0,a[i]) ;
		    		 res.add(list);
		    	  }
	    	
      }
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<ArrayList<Integer>> ans = fourSum(arr, target, n);
		// for display in sorted order
		Collections.sort(ans,(a,b)->{
            int i = 0;
            int j = 0;
            
            while(i < a.size()){
                if(a.get(i) == b.get(j)){
                    i++;
                    j++;
                }else{
                    return a.get(i) - b.get(j);
                }
            }
            
            return 0;
        }); 
		for (ArrayList<Integer> a : ans) {
			for (int element : a) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}*/
/*
6
1 0 -1 0 -2 2
0
 */
/*class hm2{
	public static ArrayList<ArrayList<Integer>> fourSum(int a[],int t,int n) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if(i!=0&& a[i]==a[i-1]) {
				continue;
			}
			for(int j=i+1;j<a.length;j++) {
				if(j!=i+1&& a[j]==a[j-1]) {
					continue;
				}
				int si=j+1;
				int ei=n-1;
				while(si<ei) {
					int sum=a[i]+a[j]+a[si]+a[ei];
					if(sum>t) {
						ei--;
					}
					else if(sum<t) {
						si++;
					}
					else {
						
						res.add(new ArrayList(Arrays.asList(a[i],a[j],a[si],a[ei])));
						si++;
						ei--;
						while(si<ei&&a[si]==a[si-1]) {
							si++;
						}
						while(si<ei&& a[ei]==a[ei+1]) {
							ei--;
						}
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<ArrayList<Integer>> ans = fourSum(arr, target, n);
		
		for (ArrayList<Integer> a : ans) {
			for (int element : a) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}*/
/*
2
1 2
-2 -1
-1 2
0 2
 */
/*public class hm2 {
	
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	HashMap<Integer,Integer> hm=new HashMap<>();
		for(int e: A) {
			for(int v:B) {
				hm.put(e+v, hm.getOrDefault(e+v, 0)+1);
			}
		}
		int count =0;
		int t=0;
		for(int e1:C) {
			for(int v1:D) {
				count+=hm.getOrDefault(t-(e1+v1), 0);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		int[] arr4 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr3[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr4[i] = sc.nextInt();
		}
		System.out.println(fourSumCount(arr1, arr2, arr3, arr4));
	}

}*/
// first non reapiting char
/*class hm2{
	public static void main(String [] args) {
		String str="vishalvish";
		int idx=firstNonReapitingChar(str);
		System.out.print(str.charAt(idx));
	}
	public static int firstNonReapitingChar(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c : str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			int f=hm.get(c);
			if(f==1) {
				return i;
			}
		}
		return -1;
	}
}*/
/*class hm2{
	public static void main(String [] args) {
		int a[][]= {{2,4,7,},
				    {9,8,12},
				    {13,16,20}};
	     int i=0;
	     int j=a[0].length-1;
	     int t=13;
	     while( j>=0 &&i<a.length) {
	    	 System.out.println(a[i][j]);
	    	 if(a[i][j]>t) {
	    		j--; 
	    	 }
	    	 
	    	 else if(a[i][j]<t) {
	    		 i++;
	    	 }
	    	 else if(a[i][j]==t){
	    		 System.out.println(a[i][j]);
	    		 return ;
	    	 }
	     }
	     System.out.println("sdjdjdjn");
     }
}*/
/*class hm2{
	public static void main(String [] args) {
		int a[][]= {{2,4,7,},
			    {8,9,12},
			    {13,16,20}};
		int t=8;
		System.out.println(search(a,t,0,a.length*a.length-1));
	}
	public static boolean search(int a[][],int t,int li,int ri) {
		while(li<=ri) {
			int mid=(li+ri)/2;
			int r=mid/a.length;
			int c=mid%a.length;
			System.out.println(a[r][c]);
			if(a[r][c]>t) {
				ri=mid-1;
			}
			else if(a[r][c]<t) {
				li=mid+1;
			}
			else {
				return true;
			}
		}
		return false;
	}
}*/
/*public class hm2 {
	
	public static ArrayList<Integer> powerfulIntegers(int x, int y, int bound) {
		ArrayList<Integer> al=new ArrayList<>();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=1;i<20;i*=x) {
			for(int j=1;j<20;j*=y) {
				if(i+j<=10 && hs.contains(i+j)==false) {
					al.add(i+j);
					hs.add(i+j);
				}
			}
			
		}
		return al;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = 2;
		int y = 3;
		int bound = 10;
		ArrayList<Integer> ret = new ArrayList<>();
		ret = powerfulIntegers(x, y, bound);
		Collections.sort(ret);
		for (int i = 0; i < ret.size(); i++) {
			System.out.print(ret.get(i) + " ");
		}
	}

}*/























































































































































































































































































































