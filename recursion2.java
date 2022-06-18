
import java.util.*;

/*public class recursion2 {

	public static void main(String[] args) {
	String s="pep";
	printAbbereviation(s,"",0,0);

	}
	public static void printAbbereviation(String s,String ans,int count,int pos) {
		if(s.length()==pos) {
			if(count==0) {
			System.out.println(ans);
			}
			else {
				System.out.println(ans+count);
			}
			return;
		}
		if(count>0) {
		printAbbereviation(s,ans+count+s.charAt(pos),0,pos+1);
		}
		else {
			printAbbereviation(s,ans+s.charAt(pos),0,pos+1);
		}
		printAbbereviation(s,ans,count+1,pos+1);
		
		
	}

}*/
/*class recursion2{
	public static void main(String [] args) {
		int a[][]=new int[4][4];
		printNQ(a,0,"");
	}
	public static void printNQ(int [][]a,int i,String ans) {
		if(i==a.length) {
			System.out.println(ans);
			return ;
		}
		for(int j=0;j<a.length;j++) {
			if(isQueenSafe(a,i,j)) {
				a[i][j]=1;
				printNQ(a,i+1,ans+i+j+" ");
				a[i][j]=0;
			}
		}
	}
	public static boolean isQueenSafe(int [][]a,int i,int j) {
		for(int k=i-1;k>=0;k--) {
			if(a[k][j]==1) {
			  return false;	
			}
		}
		for(int k=i-1,l=j-1;k>=0 && l>=0;k--,l--) {
			if(a[k][l]==1) {
			  return false;	
			}
		}
		for(int k=i-1,l=j+1;k>=0 && l<a.length ;k--,l++) {
			if(a[k][l]==1) {
			  return false;	
			}
		}
		return true;
	}
}*/
/*class recursion2{
	public static void main (String [] args) {
		int a[][]=new int[4][4];
		boolean b[]=new boolean[4];
		boolean d[]=new boolean[2*a.length-1];
		boolean rv[]=new boolean[2*a.length-1];
		
		printNQ(a,0,"",b,d,rv);
	}
	public static void printNQ(int [][]a,int i,String ans,boolean b[],boolean d[],boolean rd[]) {
		if(i==a.length) {
			System.out.println(ans);
			return ;
		}
		for(int j=0;j<a.length;j++) {
			if(b[j]!=true && d[i+j]!=true && rd[i-j+a.length-1]!=true) {
				a[i][j]=1;
				b[j]=true;
				d[i+j]=true ;
				rd[i-j+a.length-1]=true;
				printNQ(a,i+1,ans+i+j+" ",b,d,rd);
				a[i][j]=0;
				b[j]=false;
				d[i+j]=false ;
				rd[i-j+a.length-1]=false;
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=4;//no of words
		String words[]= {"dog","cat","dad","good"};
		int tc=9;//total character
		int fre[]= {1,1,1,3,0,0,1,0,0,0,0,0,0,0,2,0,0,0,0,0};
		int score[]= {1,0,5,0,0,3,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int maxscore=Maxscore(words,fre,score,0);
		System.out.println(maxscore);
	}
	public static int Maxscore(String []words,int []fre,int []score,int id) {
		if(id==words.length) {
			return 0;
		}
		int nos=Maxscore(words,fre,score,id+1);
		int swords=0;
		boolean flage=true;
		for(int i=0;i<words[id].length();i++) {
			char c=words[id].charAt(i);
			if(fre[c-'a']==0) {
				flage=false;
			}
			fre[c-'a']--;                                   //galat hai worg answer!
			swords+=score[c-'a'];
		}
		int withs=0;
		System.out.println(swords);
		if(flage==true) {
		 withs=swords+Maxscore(words,fre,score,id+1);
		}
		for(int i=0;i<words[id].length();i++) {
			char c=words[id].charAt(i);
			fre[c-'a']++;
		}
		return Math.max(nos,withs);
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=8;
		int k=4;
	int p=gameofKil(n,k);
	System.out.print(p);
	}
	public static int gameofKil(int n,int k) {
		if(n==1) {
			return 0;
		}
		int x=gameofKil(n-1,k);
		int y=(x+k)%n;
		return y;
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=1000;
		for(int i=1;i<10;i++) {
			printLexicographical(i,n);
		}
	}
	public static void 	printLexicographical(int i,int n) {
		if(i>n) {
			return ;
		}
		System.out.println(i);
		for(int j=0;j<10;j++) {
			printLexicographical(10*i+j,n);
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=1000;
	 print(1,n);	
	
	}
public static void print(int i,int n) {
	if(i>n) {
		return ;
	}
	System.out.println(i);
	for(int j=0;j<10;j++) {
		print(10*i+j,n);
	}
	
}
}*/
/*class recursion2{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		int maxgold=Integer.MIN_VALUE;
		boolean b[][]=new boolean[n][m];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			   if(b[i][j]==false && a[i][j]!=0) {
				  ArrayList<Integer> max=new ArrayList<>();
				 MaxgoldMineCollection(a,i,j,b,max);
				int sum=0;
				for(int s :max) {
					sum+=s;
				}
				maxgold=Math.max(maxgold, sum);
			   }
			}
			
		}
		System.out.println(maxgold);
	}
	public static void MaxgoldMineCollection(int a[][],int i,int j,boolean b[][],ArrayList<Integer> max) {
		if(i<0 || j<0 || i>=a.length || j>=a[0].length || a[i][j]==0 || b[i][j]==true ) {
			return ;
		}
		b[i][j]=true;
		max.add(a[i][j]);
		MaxgoldMineCollection(a,i+1,j,b,max);
		MaxgoldMineCollection(a,i-1,j,b,max);
		MaxgoldMineCollection(a,i,j+1,b,max);
		MaxgoldMineCollection(a,i,j-1,b,max);
	
		
	}
}*/
/*
9
9
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0
 */
/*class recursion2{
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	solvesuduko(a,0,0);
	}
	public static void solvesuduko(int [][]a,int i,int j) {
		
		if(i==a.length ) {
			display(a);
			return ;
		}
		int ni=0;
		int nj=0;
		if(j==a[0].length-1) {
		   ni=i+1;
		   nj=0;
		}
		else {
			ni=i;
			nj=j+1;
		}
		if(a[i][j]!=0) {
			solvesuduko(a,ni,nj);
		}
		else {
		for(int pos=1;pos<10;pos++) {
			if(isvailed(a,pos,i,j)==true) {
				a[i][j]=pos;
				solvesuduko(a,ni,nj);
				a[i][j]=0;
			}
		}
		}
	}
	public static boolean isvailed(int a[][],int val,int i,int j) {
		for(int k=0;k<a[0].length;k++) {
			if(a[i][k]==val) {
				return false;
			}
		}
		for(int k=0;k<a.length;k++) {
			if(a[k][j]==val) {
				return false;
			}
		}
		int smi=i/3*3;
		int smj=j/3*3;
		for(int k=0;k<3;k++) {
			for(int l=0;l<3;l++) {
				if(a[smi+k][smj+l]==val) {
					return false;
				}
			}
		}
		return true;
	}
	public static void display(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}*/
/*
+-++++++++
+-++++++++
+-++++++++
+-----++++
+-+++-++++
+-+++-++++
+++++-++++
++------++
+++++-++++
+++++-++++
4
LONDON
DELHI 
ICELAND 
ANKARA
 */
/*class recursion2{
	public static void display(char [][]c) {
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char c[][]=new char[10][10];
		for(int i=0;i<10;i++) {
		 String str=sc.next();
		 c[i]=str.toCharArray();
		}
		int n=sc.nextInt();
		String words[]=new String[n];
		for(int i=0;i<n;i++) {
			words[i]=sc.next();
		}
		
		Crosswordpuzzel(c,words,0);
	}
	public static void Crosswordpuzzel(char c[][],String []words,int idx) {
		if(idx==words.length) {
			
			display(c);
			return ;
		}
		String word=words[idx];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				if(c[i][j]=='-' || c[i][j]==word.charAt(0)) {
					if(canplaceHorizontal(c,word,i,j)) {
					boolean places[]=placehorzontal(c,word,i,j);
						Crosswordpuzzel(c,words,idx+1);
						unplacehorizontal(c,places,i,j);
						
					}
					if(canplaceVertical(c,word,i,j)) {
						boolean places[]=	placevertical(c,word,i,j);
							Crosswordpuzzel(c,words,idx+1);
							unplacevertical(c,places,i,j);
							
						}
				}
			}
		}
	}
	public static boolean canplaceHorizontal(char c[][],String word,int i,int j) {
		if(j-1>=0 && c[i][j-1]!='+') {
			return false;
		}
		else {
		  if(j+word.length()<c[0].length && c[i][j+word.length()]!='+') {
			  return false;
		  }
		}
		for(int jj=0;jj<word.length();jj++) {
			if(j+jj>=c[0].length) {
				return false;
			}
			if(c[i][j+jj]=='-' || c[i][j+jj]==word.charAt(jj)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static boolean[] placehorzontal(char c[][],String words,int i,int j) {
		boolean[] place=new boolean[words.length()];
		for(int jj=0;jj<words.length();jj++) {
			if(c[i][j+jj]=='-') {
				place[jj]=true;
				c[i][j+jj]=words.charAt(jj);
			}
		}
		return place;
	}
	public static void unplacehorizontal(char c[][],boolean []placed,int i,int j) {
		
		for(int jj=0;jj<placed.length;jj++) {
			if(placed[jj]==true) {
				c[i][j+jj]='-';
			}
		}
		
	}
	public static boolean canplaceVertical(char c[][],String word,int i,int j) {
		if(i-1>=0 && c[i-1][j]!='+') {
			return false;
		}
		else {
		  if(i+word.length()<c.length && c[i+word.length()][j]!='+') {
			  return false;
		  }
		}
		for(int ii=0;ii<word.length();ii++) {
			if(i+ii>=c.length) {
				return false;
			}
			if(c[i+ii][j]=='-' || c[i+ii][j]==word.charAt(ii)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static boolean[] placevertical(char c[][],String words,int i,int j) {
		boolean[] place=new boolean[words.length()];
		for(int ii=0;ii<words.length();ii++) {
			if(c[i+ii][j]=='-') {
				place[ii]=true;
				c[i+ii][j]=words.charAt(ii);
			}
		}
		return place;
	}
	public static void unplacevertical(char c[][],boolean []placed,int i,int j) {
		
		for(int ii=0;ii<placed.length;ii++) {
			if(placed[ii]==true) {
				c[i+ii][j]='-';
			}
		}
		
	}

}*/
/*
team
pep
toppr
*/
/*public class recursion2 {

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String s1 = scn.nextLine();
	    String s2 = scn.nextLine();
	    String s3 = scn.nextLine();

	    HashMap<Character, Integer> charIntMap = new HashMap<>();
	    String unique = "";
	    for (int i = 0; i < s1.length(); i++) {
	      if (!charIntMap.containsKey(s1.charAt(i))) {
	        charIntMap.put(s1.charAt(i), -1);
	        unique += s1.charAt(i);
	      }
	    }

	    for (int i = 0; i < s2.length(); i++) {
	      if (!charIntMap.containsKey(s2.charAt(i))) {
	        charIntMap.put(s2.charAt(i), -1);
	        unique += s2.charAt(i);
	      }
	    }

	    for (int i = 0; i < s3.length(); i++) {
	      if (!charIntMap.containsKey(s3.charAt(i))) {
	        charIntMap.put(s3.charAt(i), -1);
	        unique += s3.charAt(i);
	      }
	    }

	    boolean[] usedNumbers = new boolean[10];
	    solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
	  }

	  
	  public static void solution(String unique, int idx, 
								  HashMap<Character, Integer> hm, boolean[] b, 
								  String s1, String s2, String s3) {
		 if(unique.length()==idx){
			int s1sum=getsum(s1,hm);
			int s2sum=getsum(s2,hm);
			int s3sum=getsum(s3,hm);
			if(s1sum+s2sum==s3sum) {
				for(int i=0;i<26;i++) {
					char c=(char)('a'+i);
					if(hm.containsKey(c)) {
						System.out.print(c+"="+hm.get(c)+" ");
					}
					
				}
				System.out.println();
			}
			 return ;
		 }
		  char c=unique.charAt(idx);
		  for(int i=0;i<10;i++) {
			  if(b[i]==false) {
				  b[i]=true;
				  hm.put(c, i);
				  solution(unique,idx+1,hm,b,s1,s2,s3);
				  hm.put(c, -1);
				  b[i]=false;
				  
			  }
		  }
	  }
public static int getsum(String s,HashMap<Character,Integer> hm) {
	String sum="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		sum+=hm.get(c);
	}
	
	return Integer.parseInt(sum);
}
	}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=3;
		boolean b[]=new boolean[n+1];
		
		friendpairing(n,1,b,"");
		
	
	}
	public static void friendpairing(int n,int i,boolean[]b,String ans) {
		if(i>n) {
			System.out.println(ans);
			return ;
		}
		if(b[i]==true) {
			friendpairing(n,i+1,b,ans);
		}
		else {
		b[i]=true ;
		friendpairing(n,i+1,b,ans+i+" ");
		for(int j=i+1;j<=n;j++) {
			if(b[j]==false) {
				b[j]=true;
				friendpairing(n,i+1,b,ans+i+j+" ");
				b[j]=false;
			}
		
		}
		b[i]=false;
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=4;
		int k=3;
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for(int i=0;i<k;i++) {
			ans.add(new ArrayList<>());
		}
		DivideNfriendInKteam(n,1,0,ans,k);
		
	}
	public static void DivideNfriendInKteam(int n,int i,int team,ArrayList<ArrayList<Integer>> ans,int k) {
		if(i>n) {
			if(team==k) {
			   for(ArrayList<Integer> set : ans) {
				   System.out.print(set+" ");
			   }
			   System.out.println();
			}
			return ;
		}
		for(int j=0;j<ans.size();j++) {
			if(ans.get(j).size()>0) {
				ans.get(j).add(i);
				DivideNfriendInKteam(n,i+1,team,ans,k);
				ans.get(j).remove(ans.get(j).size()-1);
			}
			else {
				ans.get(j).add(i);
				DivideNfriendInKteam(n,i+1,team+1,ans,k);
				ans.get(j).remove(ans.get(j).size()-1);
				break;
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String s="ababc";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(hm.containsKey(c)) {
				int of=hm.get(c);
				hm.put(c, of+1);
			}else {
				hm.put(c, 1);
			}
				
		}
		int odd=0;
		Character oddfchar = null;
		int length=0;
		for(char c : hm.keySet()) {
		int of=hm.get(c);	
	   if(of%2!=0) {
		   oddfchar=c;
		   odd++;
	   }
	   hm.put(c, of/2);
	   if(of!=0) {
		   length++;
	   }
	}
	
	if(odd<2) {
		
		palindromicPermutation(1,length,hm,oddfchar,"");
	}
	}
	public static void palindromicPermutation(int cs,int l,HashMap<Character,Integer> hm,
			Character oddf,String ans) {
		
		if(cs>l) {
			System.out.print(ans+" ");
		    String rev="";
		    for(int i=ans.length()-1;i>=0;i--) {
		    	rev+=ans.charAt(i);
		    }
		    System.out.print(ans);
		    if(oddf!=null) {
		    	System.out.print(oddf);
		    }
		    System.out.print(rev);
		    System.out.println();
		   return ; 
		}
		
		for(char c : hm.keySet()) {
			int of=hm.get(c);
			if(of>0) {
				hm.put(c,of-1);
				palindromicPermutation(cs+1,l,hm,oddf,ans+c);
				hm.put(c,of);
			}
		}
		
	}
}*/

/*class recursion2{
	public static void main(String [] args) {
		String str="abaaba";
		PalindromicPartition(str,"");
	}
	public static void PalindromicPartition(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
			String pre=str.substring(0,i+1);
			String sub=str.substring(i+1);
			if(isPalindrom(pre)) {
				PalindromicPartition(sub,ans+"("+pre+")");
			}
		}
	}
	public static boolean isPalindrom(String str) {
		int l=0;
		int h=str.length()-1;
		while(l<h) {
			if(str.charAt(l)!=str.charAt(h)) {
				return false;
			}
			l++;
			h--;
		}
		return true;
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=4;
		int k=3;
		int a[]= {9,5,4,9};
	ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
	for(int i=0;i<k;i++) {
		ans.add(new ArrayList<>());
	}
	EqualsumSubsetPartition(a,n,0,ans,k,0);
	}
	public static void EqualsumSubsetPartition(int arr[],int n ,int i,ArrayList<ArrayList<Integer>> ans,
			int k,int team) {
		if(i>=n) {
			
			if(team==k) {
				
				int a[]=new int[ans.size()];
				int idx=0;
				for(ArrayList<Integer> al : ans) {
					
					int sum=0;
				   for(int j : al) {
					 sum+=j;  
				   }
				  a[idx++]=sum; 
				
				}
				boolean b=true;
				
				
				for(int j=1;j<a.length;j++) {
					if(a[j]!=a[0]) {
						b=false;
						break;
					}
				}
				if(b==true) {
					for(ArrayList<Integer> al: ans) {
						System.out.print(al);
					}
					System.out.println();
				}
				
			}
			return ;
		}
		for(int j=0;j<ans.size();j++) {
			if(ans.get(j).size()>0) {
				ans.get(j).add(arr[i]);
				EqualsumSubsetPartition(arr,n,i+1,ans,k,team);
				ans.get(j).remove(ans.get(j).size()-1);
			}
			else {
				ans.get(j).add(arr[i]);
				EqualsumSubsetPartition(arr,n,i+1,ans,k,team+1);
				ans.get(j).remove(ans.get(j).size()-1);
				break;
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="mzaddytzaddy";
		String pattern="abcb";
		HashMap<Character,String> hm=new HashMap<>();
	
		
		WordPatternMatching(str,pattern,hm,0,"",pattern);
	}
	public static void WordPatternMatching(String str,String s,HashMap<Character,String> hm,int i,
			String ans,String pattern) {
		
		if(i==s.length()) {
			if(str.length()==0) {
				HashSet<Character> hs=new HashSet<>();
			       for(int j=0;j<pattern.length();j++) {
			    	   char c=pattern.charAt(j);
			    	   if(hs.contains(c)==false) {
			    		   hs.add(c);
			    		   System.out.println(c+" >"+hm.get(c));
			    	   }
			    	  
			       }
			       System.out.println();
			}
			return ;
		}
		char c=s.charAt(i);
		for(int j=0;j<str.length();j++){
		String sub=str.substring(0,j+1);	
		String rsub=str.substring(j+1);
		
		if(hm.containsKey(c)==false) {
			hm.put(c, sub);
			
			WordPatternMatching(rsub,s,hm,i+1,ans+sub+" ",pattern);
			hm.remove(c);
		}
		else {
			if(hm.get(c).equals(sub)) {
				WordPatternMatching(rsub,s,hm,i+1,ans+sub+" ",pattern);	
			}
		}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String words[]= {"micro","saft","hi","ring","hiring","microsaft"};
		String str="microsafthiring";
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<words.length;i++) {
			hs.add(words[i]);
		}
		WordBreak(str,hs,"");
	}
	public static void WordBreak(String str,HashSet<String> hs,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
		}
		for(int i=0;i<str.length();i++) {
			String sub=str.substring(0,i+1);
			
			if(hs.contains(sub)) {
				String ros=str.substring(i+1);
				WordBreak(ros,hs,ans+sub+" ");
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="vaa";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(hm.containsKey(c)) {
				int of=hm.get(c);
				hm.put(c, of+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		printPermutation(str,"",hm);
	}
	public static void printPermutation(String str,String ans,HashMap<Character,Integer> hm) {
		if(ans.length()==str.length()) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int of=hm.get(c);
			if(of>0) {
				hm.put(c, of-1);
				printPermutation(str,ans+c,hm);
				hm.put(c, of);
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="()())()";
		int min=getMinRemove(str);
		RemoveInvailePran(str,min,new HashSet<>());
	}
	public static void RemoveInvailePran(String str,int min,HashSet<String> hs) {
		if(min==0) {
			int nowmin=getMinRemove(str);
			if(nowmin==0) {
			   if(hs.contains(str)==false) {
				   System.out.println(str);
				   hs.add(str);
			   }
			}
			return ;
		}
		for(int i=0;i<str.length();i++) {
			String ls=str.substring(0,i);
			String rs=str.substring(i+1);
			
			RemoveInvailePran(ls+rs,min-1,hs);
		}
	}
	public static int getMinRemove(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(') {
				st.push(c);
			}
			else if(st.size()==0) {
				st.push(c);
			}
			else if(st.peek()==')') {
				st.push(c);
			}
			else {
				st.pop();
			}
		}
		return st.size();
	}
}*/
//niche wala galat hai
/*class recursion2{
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5,6,7};
		int k=4;
		MaxNumAftKSwap(a,k);
		System.out.print(maxnum);
	}
static	int maxnum=Integer.MIN_VALUE;
	public static void MaxNumAftKSwap(int a[],int k) {
		if(k==0) {
			int s=0;
			int exp=a.length-1;
		   for(int i=0;i<a.length;i++) {
			 s+=Math.pow(10, exp)*a[i];
			 exp--;
		   }
		   if(s>maxnum) {							//wrong code;
			   maxnum=s;
		   }
			return ;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			  int t=a[i];
			  a[i]=a[j];
			  a[j]=t;
			  MaxNumAftKSwap(a,k-1); 
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="129345678";
		int k=1;
		MaxNumMaxKswap(str,k);
		System.out.println(max);
	}
	static int max=Integer.MIN_VALUE;
	public static void MaxNumMaxKswap(String str,int k) {
		if(Integer.parseInt(str)>max) {
			max=Integer.parseInt(str);
		}
		if(k==0) {
			return ;
		}
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)>str.charAt(i)) {
					str=swap(str,i,j);
					MaxNumMaxKswap(str,k-1);
					str=swap(str,i,j);
				}
			}
		}
	}
	public static String swap(String str,int i,int j) {
		String ls=str.substring(0,i);
		String ms=str.substring(i+1,j);
		String rs=str.substring(j+1);
		return ls+str.charAt(j)+ms+str.charAt(i)+rs;
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int arr[]= {1,2,3,4,0};
		
		MinSubsetSumDiff(arr,0,new ArrayList<>(),new ArrayList<>(),0,0);
		System.out.println(ans);
	}
	static int minDiff=Integer.MAX_VALUE;
	static String ans="";
	
	public static void MinSubsetSumDiff(int a[],int i,ArrayList<Integer> s1,ArrayList<Integer> s2,
			int s1sum,int s2sum) {
		if(i==a.length) {
			int min=Math.abs(s1sum-s2sum);
			if(min<minDiff) {
				minDiff=min;
				ans=s1+" "+s2;
			}
			
			return ;
		}
		if(s1.size()<(a.length+1)/2) {
		s1.add(a[i]);
		MinSubsetSumDiff(a,i+1,s1,s2,s1sum+a[i],s2sum);
		s1.remove(s1.size()-1);
		}
		if(s2.size()<(a.length+1)/2) {
		s2.add(a[i]);
		MinSubsetSumDiff(a,i+1,s1,s2,s1sum,s2sum+a[i]);
		s2.remove(s2.size()-1);
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int totalbox=4;
		int totalitem=2;
		
		PrintPermutation(new int[totalbox],1,totalitem);
		System.out.println(count);
		
	}
	static int count=0;
public static void PrintPermutation(int []box,int ci,int ti) {
	if(ci>ti) {
		count++;
		System.out.println(Arrays.toString(box));
		return ;
	}
	
	for(int i=0;i<box.length;i++) {
		if(box[i]==0) {
			box[i]=ci;
			PrintPermutation(box,ci+1,ti);
			box[i]=0;
		}
	}
}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int totalbox=4;
		int item=2;
		Combination(1,0,totalbox,item,"");
	}
	public static void Combination(int cb,int ts,int tb,int ti,String ans) {
	if(cb>tb) {
		if(ts==ti) {
			System.out.println(ans);
		}
		return ;
	}
		Combination(cb+1,ts,tb,ti,ans+"-");
		Combination(cb+1,ts+1,tb,ti,ans+"i");
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int totalbox=4;
		int totalitem=3;
		Permutation2(1,new int[totalitem],totalbox,totalitem,"",0);
	}
	public static void Permutation2(int cb,int []box,int tb,int ti,String ans,int ts) {
		if(cb>tb) {
			if(ts==ti) {
			System.out.println(ans);
			}
			return;
		}
		for(int i=0;i<ti;i++) {
			if(box[i]==0) {
				box[i]=1;
				Permutation2(cb+1,box,tb,ti,ans+(i+1),ts+1);
				box[i]=0;
			}
		}
		Permutation2(cb+1,box,tb,ti,ans+0,ts);
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int totalbox=4;
		int totalitem=3;
		Combination2(new int[totalbox],1,totalitem,-1);
	}
	public static void Combination2(int []box,int ci,int ti,int lb) {
		if(ci>ti) {
			for(int i=0;i<box.length;i++) {
				if(box[i]>0) {
					System.out.print("i");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
			return ;
		}
		for(int i=lb+1;i<box.length;i++) {
			if(box[i]==0) {
				box[i]=ci;
				Combination2(box,ci+1,ti,i);
				box[i]=0;
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="aabb";
		HashMap<Character,Integer> hm=new HashMap<>();
		String unique="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(hm.containsKey(c)) {
				int of=hm.get(c);
				hm.put(c, of+1);
			}
			else {
				hm.put(c, 1);
				unique+=c;
			}
		}
		printWordPermutation(unique,str.length(),hm,"");
	}
	public static void printWordPermutation(String uni,int l,HashMap<Character,Integer> hm,String ans) {
		if(ans.length()==l) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<uni.length();i++) {
			char c=uni.charAt(i);
			int of=hm.get(c);
			if(of>0) {
				hm.put(c, of-1);
				printPermutation(uni,l,hm,ans+c);
				hm.put(c, of);
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="aabb";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			hm.put(c, -1);
			
		}
		printWordPermutation2(0,str,hm,new char[str.length()]);
	}
	public static void printWordPermutation2(int cb,String str,HashMap<Character,Integer> hm,char ch[]) {
		if(cb>=ch.length) {
			for(char c :ch) {
				
				System.out.print(c);
			}
			System.out.println();
			return ;
		}
		char c=str.charAt(cb);
		int lo=hm.get(c);
		for(int i=lo+1;i<ch.length;i++) {
			if(ch[i]==0) {
				ch[i]=c;
				hm.put(c, i);
				printWordPermutation2(cb+1,str,hm,ch);
				ch[i]=0;
				hm.put(c, lo);
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="aabbaabbccd";
		int k=3;
	HashSet<Character> hs=new HashSet<>();
	String uni="";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(hs.contains(c)==false) {
			uni+=c;
			hs.add(c);
		}
	
	}
	selectKcharFromStr(0,uni,0,k,"");
	}
public static void selectKcharFromStr(int cl,String uni,int ts,int k,String ans) {
	if(cl==uni.length()) {
		if(ts==k) {
		System.out.println(ans);
		}
		return ;
	}
		char c=uni.charAt(cl);
		selectKcharFromStr(cl+1,uni,ts,k,ans);
		selectKcharFromStr(cl+1,uni,ts+1,k,ans+c);
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="aabbaabbccd";
		int k=3;
	HashSet<Character> hs=new HashSet<>();
	String uni="";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(hs.contains(c)==false) {
			uni+=c;
			hs.add(c);
		}
	
	}
	selectKcharFromStr2(uni,1,k,-1,"");	
	}
	public static void selectKcharFromStr2(String uni,int cs,int ts,int ls,String ans) {
		if(cs>ts) {
			System.out.println(ans);
			return ;
		}
		for(int i=ls+1;i<uni.length();i++) {
			char c=uni.charAt(i);
			selectKcharFromStr2(uni,cs+1,ts,i,ans+c);
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="abcabc";
		int l=2;
		HashSet<Character> hs=new HashSet<>();
		String uni="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(hs.contains(c)==false) {
				uni+=c;
				hs.add(c);
			}
		
		}
		makeLlengthString(uni,l,0,"",new HashSet<>());
	}
public static void makeLlengthString(String uni,int l,int cl,String ans,HashSet<Character> hs) {
	if(cl==l) {
		System.out.println(ans);
		return ;
	}
	for(int i=0;i<uni.length();i++) {
		char c=uni.charAt(i);
		if(hs.contains(c)==false) {
			hs.add(c);
			makeLlengthString(uni,l,cl+1,ans+c,hs);	
			hs.remove(c);
		}
		
	}
}
}*/
/*class recursion2{
	public static void main(String [] args) {
		String str="abcabc";
		int l=2;
		HashSet<Character> hs=new HashSet<>();
		String uni="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(hs.contains(c)==false) {
				uni+=c;
				hs.add(c);
			}
		
		}
		makeLlengthString2(0,uni,0,l,new char[l]);
	}
	public static void makeLlengthString2(int cs,String uni,int ts,int l,char ch[]) {
		if(cs==uni.length()) {
			if(ts==l) {
			System.out.println(Arrays.toString(ch));
			}
			return ;
		}
		char c=uni.charAt(cs);
		makeLlengthString2(cs+1,uni,ts,l,ch);
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==0) {
				ch[i]=c;
				makeLlengthString2(cs+1,uni,ts+1,l,ch);
				ch[i]=0;
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
	int n=2;
	placeNqueenInN$N(0,n,0,0,"");//NqueenCombination
	}
	public static void placeNqueenInN$N(int cs,int tq,int c,int r,String ans) {
		if(r==tq) {
			if(cs==tq) {
			System.out.println(ans);
			}
			return ;
		}
		int nc=0;
		int nr=0;
		String yes="";
		String no="";
		if(c==tq-1) {
			nr=r+1;
			nc=0;
			yes="q\n";
			no="-\n";
		}
		else {
			nr=r;
			nc=c+1;
			yes="q";
			no="-";
		}
		placeNqueenInN$N(cs+1,tq,nc,nr,ans+yes);
		placeNqueenInN$N(cs,tq,nc,nr,ans+no);
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=2;
		PermutationPlaceNqueen(0,n,0,0,"",new HashSet<>());
	}
public static void PermutationPlaceNqueen(int cs,int tq,int r,int c,String ans,HashSet<Integer> hs) {
	if(r==tq) {
		if(cs==tq) {
			System.out.println(ans);
		}
		
		return ;
	}
	int nc=0;
	int nr=0;
	
	char sep='\0';
	if(c==tq-1) {
		nr=r+1;
		nc=0;
		sep='\n';
	}
	else {
		nr=r;
		nc=c+1;
		sep='\t';
	}
	
	for(int i=1;i<=tq;i++) {
		if(hs.contains(i)==false) {
			hs.add(i);
		PermutationPlaceNqueen(cs+1,tq,nr,nc,ans+"q"+i+sep,hs);	
		  hs.remove(i);
		}
	}
	PermutationPlaceNqueen(cs,tq,nr,nc,ans+"-"+sep,hs);
}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=2;
		PermutationPlaceNqueen2(new int[n][n],n,0);
	}
	public static void PermutationPlaceNqueen2(int a[][],int n,int cp) {
		if(cp==n) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(a[i][j]==0) {
						System.out.print("-\t");
					}
					else {
						System.out.print("q"+a[i][j]+"\t");
					}
				}
				System.out.println();
			}
			System.out.println();
			return ;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==0) {
					a[i][j]=cp+1;
					PermutationPlaceNqueen2(a,n,cp+1);
					a[i][j]=0;
				}
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=2;
		NqueenCombi2(0,new int[n][n],n,0,-1);
	}
	public static void NqueenCombi2(int cs,int a[][],int n,int lsi,int lsj) {
		if(cs==n) {
			for(int i=0;i<a.length;i++) {
				   for(int j=0;j<a[i].length;j++) {
					   if(a[i][j]==0) {
						  System.out.print("-");
					   }
					   else {
						   System.out.print("q");
					   }
				   }
				 System.out.println();
				}
			System.out.println();
			return ;
		}
		for(int j=lsj+1;j<a[0].length;j++) {
			 if(a[lsi][j]==0) {
				  a[lsi][j]=1;
				   NqueenCombi2(cs+1,a,n,lsi,j);
				   a[lsi][j]=0;
			   }
		}
		for(int i=lsi+1;i<a.length;i++) {
		   for(int j=0;j<a[i].length;j++) {
			   if(a[i][j]==0) {
				  a[i][j]=1;
				   NqueenCombi2(cs+1,a,n,i,j);
				   a[i][j]=0;
			   }
		   }
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=2;
		PlaceNQueenCombi3(0,0,new int[n*n],n,-1);
	}
	public static void PlaceNQueenCombi3(int i,int cp,int a[],int tq,int lp) {
		
			if(cp==tq) {
				for(int j=0;j<a.length;j++) {
					if(a[j]==0) {
						if((j+1)%tq==0) {
							System.out.println("-");
						}
						else {
							System.out.print("-");	
						}
					}
					else {
						if((j+1)%tq==0) {
							System.out.println("q");
						}
						else {
							System.out.print("q");	
						}
					}
				}
				System.out.println();
				return ;
			}
		for(int j=lp+1;j<a.length;j++) {
			if(a[j]==0) {
				a[j]=1;
				PlaceNQueenCombi3(i+1,cp+1,a,tq,j);
				a[j]=0;
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=2;
		PlaceNQueenCombi3(0,new int[n][n],-1);
	}
	public static void PlaceNQueenCombi3(int cp,int [][]a,int lp) {
		if(cp==a.length) {
			for(int i=0;i<a.length;i++) {
				   for(int j=0;j<a[i].length;j++) {
					   if(a[i][j]==0) {
						  System.out.print("-");
					   }
					   else {
						   System.out.print("q");
					   }
				   }
				 System.out.println();
				}
			System.out.println();
			return ;
		}
		for(int i=lp+1;i<a.length*a.length;i++) {
			int r=i/a.length;
			int c=i%a.length;
			if(a[r][c]==0) {
				a[r][c]=1;
				PlaceNQueenCombi3(cp+1,a,i);
				a[r][c]=0;
			}
		}
			
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=4;
		PlaceNQueenCombiSafely(0,new int[n][n],-1);	
	}
	public static void PlaceNQueenCombiSafely(int cp,int a[][],int lp) {
		if(cp==a.length) {
			for(int i=0;i<a.length;i++) {
				   for(int j=0;j<a[i].length;j++) {
					   if(a[i][j]==0) {
						  System.out.print("-  ");
					   }
					   else {
						   System.out.print("q  ");
					   }
				   }
				 System.out.println();
				}
			System.out.println();
			return ;
		}
		for(int i=lp+1;i<a.length*a.length;i++) {
			int r=i/a.length;
			int c=i%a.length;
			if(a[r][c]==0 && isVailed(a,r,c)) {
				a[r][c]=1;
				PlaceNQueenCombiSafely(cp+1,a,i);
				a[r][c]=0;
			}
		}
	}
	public static boolean isVailed(int a[][],int i,int j) {
		for(int l=j-1;l>=0;l--) {
			if(a[i][l]==1) {
				return false;
			}
		}
		for(int k=i-1;k>=0;k--) {
			if(a[k][j]==1) {
				return false;
			}
		}
		for(int l=j-1,k=i-1;l>=0 && k>=0;l--,k--) {
			if(a[k][l]==1) {
				return false;
			}
		}
		for(int l=j+1,k=i-1;l<a.length && k>=0;l++,k--) {
			if(a[k][l]==1) {
				return false;
			}
		}
		return true;
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int n=4;
		PlaceNQueenPermuSafely(0,new int[n][n],-1,new HashSet<>());	
		System.out.println(count);
	}
	static int count=0;
	public static void PlaceNQueenPermuSafely(int cp,int a[][],int lp,HashSet<Integer> hs) {
		if(cp==a.length) {
			for(int i=0;i<a.length;i++) {
				   for(int j=0;j<a[i].length;j++) {
					   if(a[i][j]==0) {
						  System.out.print("-  ");
					   }
					   else {
						   System.out.print("q"+a[i][j]+"  ");
					   }
				   }
				 System.out.println();
				}
			System.out.println();
			count++;
			return ;
		}
		for(int i=lp+1;i<a.length*a.length;i++) {
			int r=i/a.length;
			int c=i%a.length;
			if(a[r][c]==0 && isVailed(a,r,c)) {
				for(int j=1;j<=a.length;j++) {
					if(hs.contains(j)==false) {
					a[r][c]=j;
					hs.add(j);
					PlaceNQueenPermuSafely(cp+1,a,i,hs);
					a[r][c]=0;
					hs.remove(j);
					}
				}
			}
		}
	}
	public static boolean isVailed(int a[][],int i,int j) {
		for(int l=j-1;l>=0;l--) {
			if(a[i][l]>0) {
				return false;
			}
		}
		for(int k=i-1;k>=0;k--) {
			if(a[k][j]>0) {
				return false;
			}
		}
		for(int l=j-1,k=i-1;l>=0 && k>=0;l--,k--) {
			if(a[k][l]>0) {
				return false;
			}
		}
		for(int l=j+1,k=i-1;l<a.length && k>=0;l++,k--) {
			if(a[k][l]>0) {
				return false;
			}
		}
		return true;
	}
}*/

/*class recursion2{
	public static void main(String [] args) {
		int n=4;
		PlaceNQueenPerMuSafely2(0,new int[n][n]);
		System.out.println(count);
	}
	static int count=0;
	public static void PlaceNQueenPerMuSafely2(int cp,int a[][]) {
		if(cp==a.length) {
			for(int i=0;i<a.length;i++) {
				   for(int j=0;j<a[i].length;j++) {
					   if(a[i][j]==0) {
						  System.out.print("-  ");
					   }
					   else {
						   System.out.print("q"+a[i][j]+"  ");
					   }
				   }
				 System.out.println();
				}
			System.out.println();
			count++;
			return ;
		}
		for(int i=0;i<a.length*a.length;i++) {
			int r=i/a.length;
			int c=i%a.length;
			if(a[r][c]==0 && isVailed(a,r,c)) {
				a[r][c]=cp+1;
				PlaceNQueenPerMuSafely2(cp+1,a);
				a[r][c]=0;
			}
		}
	}
	public static boolean isVailed(int a[][],int i,int j) {
		for(int l=0;l<a.length;l++) {
			if(a[i][l]>0) {
				return false;
			}
		}
		for(int k=0;k<a.length;k++) {
			if(a[k][j]>0) {
				return false;
			}
		}
		for(int l=j-1,k=i-1;l>=0 && k>=0;l--,k--) {
			if(a[k][l]>0) {
				return false;
			}
		}
		for(int l=j+1,k=i-1;l<a.length && k>=0;l++,k--) {
			if(a[k][l]>0) {
				return false;
			}
		}
		for(int l=j-1,k=i+1;l>=0 && k<a.length;l--,k++) {
			if(a[k][l]>0) {
				return false;
			}
		}
		for(int l=j+1,k=i+1;l<a.length && k<a.length;l++,k++) {
			if(a[k][l]>0) {
				return false;
			}
		}
		return true;
	}
}*/

/*class recursion2{
	public static void main(String [] args) {
		int n=4;
		PlaceNnightCombiSafely(0,new int[n][n],-1);	
	}
	public static void PlaceNnightCombiSafely(int cp,int a[][],int lp) {
		if(cp==a.length) {
			for(int i=0;i<a.length;i++) {
				   for(int j=0;j<a[i].length;j++) {
					   if(a[i][j]==0) {
						  System.out.print("-  ");
					   }
					   else {
						   System.out.print("N  ");
					   }
				   }
				 System.out.println();
				}
			System.out.println();
			return ;
		}
		for(int i=lp+1;i<a.length*a.length;i++) {
			int r=i/a.length;
			int c=i%a.length;
			if(a[r][c]==0 && isVailed(a,r,c)) {
				a[r][c]=1;
				PlaceNnightCombiSafely(cp+1,a,i);
				a[r][c]=0;
			}
		}
	}
	public static boolean isVailed(int a[][],int i,int j) {
		if(i+2<a.length && j+1<a.length && a[i+2][j+1]>0) {
			return false;
		}
		if(i+1<a.length && j+2<a.length && a[i+1][j+2]>0) {
			return false;
		}
		if(i+2<a.length && j-1>=0 && a[i+2][j-1]>0) {
			return false;
		}
		if(i+1<a.length && j-2>=0 && a[i+1][j-2]>0) {
			return false;
		}
		if(i-2>=0 && j+1<a.length && a[i-2][j+1]>0) {
			return false;
		}
		if(i-2>=0 && j-1>=0 && a[i-2][j-1]>0) {
			return false;
		}
		if(i-1>=0 && j+1<a.length && a[i-1][j+1]>0) {
			return false;
		}
		if(i-1>=0 && j+2<a.length && a[i-1][j+2]>0) {
			return false;
		}
		return true;
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int coin[]= {5,2,3,6,7,12};
		int n=12;
		boolean b[]=new boolean[coin.length];
		canChangeN(0,coin,n,"",b,0,new HashSet<>());
	}
	public static void canChangeN(int s,int []c,int n,String ans,boolean []b,int sum,HashSet<String> hs) {
		if(sum>=n) {
			if(sum==n && hs.contains(ans)==false) {
				hs.add(ans);
			System.out.println(ans);
			}
			return ;
		}
		for(int i=s;i<c.length;i++) {
			if(b[i]==false) {
				b[i]=true;
				canChangeN(i+1,c,n,ans+c[i],b,sum+c[i],hs);
				b[i]=false;
				canChangeN(i+1,c,n,ans,b,sum,hs);
			}
		}
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int coin[]= {5,2,3,6,7,12};
		int n=12;
		canChangeN(0,coin,0,"",n);	
	}
	public static void canChangeN(int i,int []coin,int sum,String ans,int n) {
		if(i==coin.length) {
			if(sum==n) {
				System.out.println(ans);
			}
			return ;
		}
		canChangeN(i+1,coin,sum+coin[i],ans+coin[i],n);
		canChangeN(i+1,coin,sum,ans,n);
		
	}
}*/
/*class recursion2{
	public static void main(String [] args) {
		int coin[]= {2,3,5,6,7};
		int n=12;
		canChangeN(0,coin,0,"",n);	
	}
	public static void canChangeN(int i,int []coin,int sum,String ans,int n) {
		if(i==coin.length) {
			if(sum==n) {
				System.out.println(ans);
			}
			return ;
		}
		
		if(sum<n) {
			canChangeN(i,coin,sum+coin[i],ans+coin[i],n);
			
		}
		
		canChangeN(i+1,coin,sum,ans,n);
		
	}
}*/





















































































































