import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/*import java.io.*;
import java.util.*;

class Student implements comprable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    public static int comprareTo(Student o){
        return Student.getId()-o.getId();
    }
}

//Complete the code
public class Solution
 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

  /*  public static long solve(List<Integer> arr) {
    // Write your code here
    long count=0;
     for(int i=0;i<arr.size();i++){
         for(int j=i+1;j<arr.size();j++){
             int t=arr.get(i);
             int k=arr.get(j);
             int m=t*k;
             int max=t;
             for(int c=i+1;c<=j;c++){
                 
                 if(max<arr.get(c)){
                   max=arr.get(c);  
                 }
             }
             if(max>=m){
                 count++;
             }
         }
     }
     return count;
    }

}

public class copy {
    public static void main(String[] args) throws IOException {
    	 System.out.print(" enter " );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        long result = Result.solve(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.*;
class Prime{
    public static void checkPrime(int...n){
        for(int i=0;i<n.length;i++){
            int t=n[i];
            
            if(t<2){
               System.out.println(""); 
            }
            else{
                int f=0;
            for(int j=2;j*j<=t;j++){
                if(t%j==0){
                    f=1;
                    System.out.print("");
                }
                  }
            if(f==0){
                   System.out.print(t); 
                }
            }
        }
        System.out.println();
    }
}
public class copy {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}*/

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class copy {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
class pair{
    String s;
    String s1;
    public pair(String s,String s1){
        this.s=s;
        this.s1=s1;
    }
    
}
HashMap<pair,Integer> hm=new HashMap<>();
    for(int i=0;i<t;i++){
        pair p=new pair(pair_left[i],pair_right[i]);
        System.out.print(p);
        if(hm.containsKey(p)){
            
            hm.put(p,hm.get(p)+1);
            
            
            System.out.println(hm.size());
        }
        else{
            hm.put(p,1);
            System.out.println(hm.size());
        }
    }
    }
}*/
/*class copy{
	public static void main(String [] args) {
		String s="<h>my name is <span>vishal kumar</span></h>";
		System.out.println(s.length());
		
	 StringBuilder sb=new StringBuilder(s);
	  int i=sb.length()-1;
	  while(i>=0) {
		  char c=sb.charAt(i);
		  if(c=='>') {
			  int j=i;
			  char ch=sb.charAt(j);
			      while(ch!='<') {
				  j--;
				  ch=sb.charAt(j);
			  }
			     
			      
			      sb=sb.delete(j, i+1);
			     
			      i=j;
			      
		  }
		 i--;
	  }
	  System.out.println(sb);
	}
}*/


/*
 class copy{
	public static void main(String [] args){
	int a[][]= {{1,3,2},{2,4,3},{5,6,3}};
	for(int i=0;i<a.length;i++) {
		//Arrays.sort(a[i]);
		for(int j=0;j<a[i].length;j++) {
			for(int k=j;k<a[i].length;k++) {
				if(a[i][j]>a[i][k]) {
					int t=a[i][j];
					a[i][j]=a[i][k];
					a[i][k]=t;
				}
			}
		}
	}
	for(int i=0;i<a.length;i++) {
	System.out.print(Arrays.toString(a[i]));
	}
	}
}

 */
/*import java.util.*;
class copy{
	public static void main(String [] args){
		long st=System.currentTimeMillis();
	int a[][]= {{1,3,2},{2,4,3},{5,6,3},{4,5,1,2},{1,3,2,4,8,5}};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			for(int k=j;k<a[i].length;k++) {
				if(a[i][j]>a[i][k]) {
					int t=a[i][j];
					a[i][j]=a[i][k];
					a[i][k]=t;
				}
			}
		}
	}
	long st1=System.currentTimeMillis();
	for(int i=0;i<a.length;i++) {
	System.out.println
	(Arrays.toString(a[i]));
	}
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++){
		pq.add(a[i][j])	;
		}
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++){
		a[i][j]=pq.remove();
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(Arrays.toString(a[i]));
		}
	System.out.println();
	long et=System.currentTimeMillis();
	System.out.println(st1-st);
	System.out.println(et-st1);
	System.out.println(et-st);
	}
}*/

/*class copy{
	static class pair implements Comparable<pair>{
		 int roll;
		String name;
		public pair(int r,String n)  {
			roll=r;
			name=n;
		}
		public String toString() {
			return this.roll+" "+this.name;
		}
		public int compareTo(pair p) {
			
			return this.name.compareTo(p.name);
		}
	}
	
	public static void main(String [] args) {
		HashMap<pair , String> hm=new HashMap<>();
		pair p=new pair(1,"vishal");
		hm.put(p, "burdwan");
		pair p1=new pair(2,"kumar");
		hm.put(p1, "aot");
		pair p2=new pair(3,"sah");
		hm.put(p2, "cu");
		pair p3=new pair(4,"arna");
		hm.put(p3, "jp");
		System.out.print(hm);
		System.out.println();
		Set<pair> s=hm.keySet();
		for(pair pn : s) {
			System.out.println(hm.get(pn)+" "+ pn.name+" "+pn.roll+" ");
			
		}
		TreeMap<pair,String> tm=new TreeMap<>(hm);
		System.out.println(tm);
		Object o=new copy();
		System.out.print(o instanceof copy);
		HashMap<String ,Integer> hm1=new HashMap<>();
		hm1.put("vishal", 1);
	      System.out.println(hm1.containsKey("vishal"));
			}
}
/*import java.util.*;
class copy{
    public static char compliment(char c){
        if(c==')'){
            return '(';
        }
        if(c=='}'){
            return '{';
        }
        else{
            return '[';
        }
    }
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		 int j=1;
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> st =new Stack<>();
            int f=1;
           
            for(int i=0;i<input.length();i++){
                char c=input.charAt(i);
                if(c=='(' || c=='{' || c=='['){
                    st.add(c);
                }
                else{
                    if(st.size()==0 || st.peek()!=compliment(c)){
                        System.out.println(input+j +" "+false);
                        j++;
                        f=0;
                        break;
                    }
                    else{
                        st.pop();
                    }
                }
            }
            if(st.size()==0 && f==1){
                System.out.println(input+j +" "+true);
                j++;
            }
            else if(st.size()>0 && f==1){
              System.out.println(input+j +" "+false); 
              j++;
            }
		}
		
	}
}*/
import java.util.*;

//Write your Checker class here
class Checker implements Comparator{
 
@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	Player p1=(Player)o1;
	Player p2=(Player)o2;
	return p2.score-p1.score;
	
}
}
class Player{
 String name;
 int score;

 Player(String name, int score){
     this.name = name;
     this.score = score;
     
 }
}

class copy {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter ");
     int n = scan.nextInt();
     
     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();
  
     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}















































