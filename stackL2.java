
import java.util.*;
import java.io.*;
// next greater element to right
/*
5
5
3
8
-2
7
 */
/*public class stackAndQL2{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = nextGreater(a);
    display(nge);
 }

 public static int[] nextGreater(int[] arr){
   Stack<Integer> st=new Stack<>();
   int ans[]=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--) {
	   while(st.size()>0 && st.peek()<=arr[i]) {
		   st.pop();
	   }
	   if(st.size()==0) {
		   ans[i]=-1;
	   }
	   else {
		   ans[i]=st.peek();
	   }
	   st.push(arr[i]);
   }
   return ans;
 }

}*/
// next greater element to left
/*
5
5
3
8
-2
7
 */
/*public class stackAndQL2 {
	  public static void display(int[] a) {
	    StringBuilder sb = new StringBuilder();

	    for (int val : a) {
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] ngl = nextGreaterToLeft(a);
	    display(ngl);
	  }

	  public static int[] nextGreaterToLeft(int[] arr) {
	   Stack<Integer> st=new Stack<>();
	   int ans[]=new int[arr.length];
	   for(int i=0;i<arr.length;i++) {
		   while(st.size()>0 && st.peek()<=arr[i]) {
			   st.pop();
		   }
		   if(st.size()==0) {
			   ans[i]=-1;
		   }
		   else {
			   ans[i]=st.peek();
		   }
		   st.push(arr[i]);
	   }
	    return ans;
	  }

	}

*/
/*
5
5
3
8
-2
7
 */
// next smaller to right
/*public class stackAndQL2 {
	  public static void display(int[] a) {
	    StringBuilder sb = new StringBuilder();

	    for (int val : a) {
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] nge = nextSmallerToRight(a);
	    display(nge);
	  }

	  public static int[] nextSmallerToRight(int[] arr) {
	     Stack<Integer> st=new Stack<>();
	     int ans[]=new int[arr.length];
	     for(int i=arr.length-1;i>=0;i--) {
	    	 while(st.size()>0 && st.peek()>=arr[i]) {
	    		 st.pop();
	    	 }
	    	 if(st.size()==0) {
	    		ans[i]=-1; 
	    	 }
	    	 else {
	    		 ans[i]=st.peek();
	    	 }
	    	 st.push(arr[i]);
	     }
	    return ans;
	  }

	}
*/
/*
5
5
3
8
-2
7
 */
//next smaller to left
/*public class stackAndQL2 {
	  public static void display(int[] a) {
	    StringBuilder sb = new StringBuilder();

	    for (int val : a) {
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] nge = nextSmallerToLeft(a);
	    display(nge);
	  }

	  public static int[] nextSmallerToLeft(int[] arr) {
	    int ans[]=new int[arr.length];
	    Stack<Integer> st=new Stack<>();
	    for(int i=0;i<arr.length;i++) {
	    	while(st.size()>0 && st.peek()>=arr[i]) {
	    		st.pop();
	    	}
	    	if(st.size()==0) {
	    		ans[i]=-1;
	    	}
	    	else {
	    		ans[i]=st.peek();
	    	}
	    	st.push(arr[i]);
	    }
	    return ans;
	  }

	}

*/
// next greater element 2 
// 
/*
4 1 2
1 3 4 2
 */
/*public class stackAndQL2 {
    public static int[] nextGreaterElement(int[] nums, int[] query) {
        Stack<Integer> st = new Stack<>();
        int ans[]=new int[query.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--) {
        	while(st.size()>0 && st.peek()<=nums[i]) {
        		st.pop();
        	}
        	if(st.size()==0) {
        		hm.put(nums[i],-1);
        	}
        	else {
        		hm.put(nums[i],st.peek());
        	}
        	st.push(nums[i]);
        }
        for(int i=0;i<query.length;i++) {
        	ans[i]=hm.get(query[i]);
        }
        return ans;
    }

    public static int[] getArr(String s){
        String nums[] = s.split(" ");
        int n = nums.length;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = Integer.parseInt(nums[i]);
        }
        return ar;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int query[] = getArr(read.readLine());
        int nums[] = getArr(read.readLine());
        
        int ans[] = nextGreaterElement(nums, query);

       
        for(int e: ans){
            System.out.print(e+" ");
        }
        
    }
}
*/

// next greater element 2
/*
6
4
10
6
7
9
5
 */
/*public class stackAndQL2 {
    public static int[] nextGreaterElementII(int[] nums) {
        Stack<Integer> st =new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--) {
        	while(st.size()>0 && st.peek()<=nums[i]) {
        		st.pop();
        	}
        	st.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--) {
        	while(st.size()>0 && st.peek()<=nums[i]) {
        		st.pop();
        	}
        	if(st.size()==0) {
        		ans[i]=-1;
        	}
        	else {
        		ans[i]=st.peek();
        		
        	}
        	st.push(nums[i]);
        }
        return ans;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(read.readLine());
        }
        
        int ans[] = nextGreaterElementII(nums);

        n = ans.length;

        System.out.println(n);
        for(int e: ans){
            System.out.println(e);
        }
        
    }
}
*/
// largest area of histogram
/*public class stackL2 {
    public static int largestRectangleArea(int[] heights) {
    	int rs[]=findRightSmaller(heights);
    	int ls[]=findLeftSmaller(heights);
    	int maxarea=Integer.MIN_VALUE;
    	for(int i=0;i<heights.length;i++) {
    		int w=rs[i]-ls[i]-1;
    		int h=heights[i];
    		int area=w*h;
    		maxarea=Math.max(maxarea, area);
    	}
        return maxarea;
    }
    public static int [] findRightSmaller(int a[]) {
    	int ans[]=new int[a.length];
    	Stack<Integer> st=new Stack<>();
    	for(int i=a.length-1;i>=0;i--) {
    		while(st.size()>0 && a[st.peek()]>=a[i]) {
    			st.pop();
    		}
    		if(st.size()==0){
    			ans[i]=a.length;
    		}
    		else {
    			ans[i]=st.peek();
    		}
    		st.push(i);
    	}
    	return ans;
    }
    public static int [] findLeftSmaller(int []a) {
    	int ans[]=new int[a.length];
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<a.length;i++) {
    		while(st.size()>0 && a[st.peek()]>=a[i]) {
    			st.pop();
    		}
    		if(st.size()==0){
    			ans[i]=-1;
    		}
    		else {
    			ans[i]=st.peek();
    		}
    		st.push(i);
    	}
    	return ans;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int heights[] = new int[n];
        for(int i=0;i<n;i++)heights[i] = Integer.parseInt(read.readLine());

        System.out.println(largestRectangleArea(heights));
        
    }
}*/
/*
2
5
10100
10111
 */
/*public class stackL2 {

    public static int maximalRectangle(int[][] ar) { 
    	int a[]=new int[ar[0].length];
    	int maxarea=0;
    	for(int i=0;i<ar.length;i++) {
    		findNewheights(ar[i],a);
    		int area=findmaxareaofHistogram(a);
    		maxarea=Math.max(maxarea, area);
    	}
        return maxarea;
    }
    public static int findmaxareaofHistogram(int heights[]) {
    	int rs[]=findRightSmaller(heights);
    	int ls[]=findLeftSmaller(heights);
    	int maxarea=Integer.MIN_VALUE;
    	for(int i=0;i<heights.length;i++) {
    		int w=rs[i]-ls[i]-1;
    		int h=heights[i];
    		int area=w*h;
    		maxarea=Math.max(maxarea, area);
    	}
        return maxarea;
    }
 public static void findNewheights(int a[],int h[]) {
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==0) {
			 h[i]=0;
		}
		 else {
			 h[i]=h[i]+1;
		 }
	 }
 }
 public static int [] findRightSmaller(int a[]) {
 	int ans[]=new int[a.length];
 	Stack<Integer> st=new Stack<>();
 	for(int i=a.length-1;i>=0;i--) {
 		while(st.size()>0 && a[st.peek()]>=a[i]) {
 			st.pop();
 		}
 		if(st.size()==0){
 			ans[i]=a.length;
 		}
 		else {
 			ans[i]=st.peek();
 		}
 		st.push(i);
 	}
 	return ans;
 }
 public static int [] findLeftSmaller(int []a) {
 	int ans[]=new int[a.length];
 	Stack<Integer> st=new Stack<>();
 	for(int i=0;i<a.length;i++) {
 		while(st.size()>0 && a[st.peek()]>=a[i]) {
 			st.pop();
 		}
 		if(st.size()==0){
 			ans[i]=-1;
 		}
 		else {
 			ans[i]=st.peek();
 		}
 		st.push(i);
 	}
 	return ans;
 }
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(read.readLine());
        int col = Integer.parseInt(read.readLine());
        
        int bmat[][] = new int[row][col];

        for(int i=0;i<row;i++){
            String s = read.readLine();
            for(int j=0;j<col;j++){
                bmat[i][j] = s.charAt(j)-'0';
            }
        }

        int result = maximalRectangle(bmat);
        System.out.println(result);
        
    }
}*/
/*
48 70 284 568 870
48 70 284 870 568
 */
// vaildateStackSequence
/*public class stackL2 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
       
         int j=0;  
        Stack<Integer> pu=new Stack<>();
        for(int i=0;i<pushed.length;i++) {
        	pu.push(pushed[i]);
        	while(pu.size()>0 && pu.peek()==popped[j]) {
        		
        		pu.pop();
        	    j++;
        	}
        	
        }
       return j==popped.length;
    }

    public static int[] getArr(String s){
        String nums[] = s.split(" ");
        int n = nums.length;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = Integer.parseInt(nums[i]);
        }
        return ar;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int pushed [] = getArr(read.readLine());
        int popped [] = getArr(read.readLine());
        
        boolean result = validateStackSequences(pushed, popped);

        System.out.println(result);
    }
}
*/
// minimum remove to make String vailed
// ()))((
/*public class stackL2 {
    public static int minAddToMakeValid(String s) {
       Stack<Character> st=new Stack<>();
       
       for(int i=0;i<s.length();i++) {
    	   char c=s.charAt(i);
    	   if(c=='(') {
    		   st.push(c);
    	   }
    	   else {
    		   if(st.size()>0 && st.peek()=='(') {
    			   st.pop();
    		   }
    		   else {
    			   st.push(c);
    		   }
    	   }
       }
        return st.size();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int result = minAddToMakeValid(read.readLine());
        System.out.println(result);
    }
}
*/
// remove outermost parenthesis
//(()())(()(())) == (()()) + (()(()))==()()+()(())==()()()(())
/*public class stackL2 {
	  public static String removeOuterParentheses(String s) {
	    Stack<Character> st=new Stack<>();
	    
	    StringBuilder ans=new StringBuilder();
	    for(int i=0;i<s.length();i++) {
	    	char c=s.charAt(i);
	    	if(c=='(') {
	    		if(st.size()>0) {
	    			ans.append(c);
	    		}
	    		st.push(c);
	    	}
	    	else {
	    		st.pop();
	    		if(st.size()>0) {
	    			ans.append(c);
	    		}
	    	}
	    }
	    return ans.toString();
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    String result = removeOuterParentheses(read.readLine());
	    System.out.println(result);
	  }
	}
*/
// score of parentheses
// ()()=1+1 or (())=2*1ie.(A)=2*A
/*public class stackL2 {
    public static int scoreOfParentheses(String s) {
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(c=='(') {
    			st.push(-1);
    		}
    		else {
    			if(st.peek()==-1) {
    				st.pop();
    				st.push(1);
    			}
    			else {
    				int inscore=0;
        			while(st.peek()!=-1) {
        				inscore+=st.pop();
        			}
        			st.pop();
        			st.push(2*inscore);
    			}
    			
    		}
    	}
    	int score=0;
    	while(st.size()>0) {
    		score+=st.pop();
    	}
        return score;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int score = scoreOfParentheses(read.readLine());
        System.out.println(score);
        
    }
}*/
// reverse substring between each pair of parentheses

//(gni(pc(do))ep) // ans  pepcoding
/*public class stackL2 {
    public static String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        	if(c==')') {
        		String rev="";//we can use queue also
        		while(st.peek()!='(') {
        			rev+=st.pop();
        		}
        		st.pop();
        		for(int j=0;j<rev.length();j++) {
        			st.push(rev.charAt(j));
        		}
        	}
        	else {
        		st.push(c);
        	}
        }
        String ans="";
        while(st.size()>0) {
        	ans=st.pop()+ans;
        }
        
        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = reverseParentheses(read.readLine());
        System.out.println(result);
        
    }
}
*/
// minumum remove to make valid parentheses
//a)b(c)d 
// in case of multiple ans remve outer parenthesis
/*public class stackL2 {
    public static String reverseParentheses(String s) {
    	char []arr=s.toCharArray();
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<s.length();i++) {
    	  char c=s.charAt(i);
    	  if(c=='(') {
    		 st.push(i); 
    	  }
    	  else if(c==')') {
    		  if(st.size()==0) {
    			  arr[i]='.';
    		  }
    		  else {
    			  st.pop();
    		  }
    	  }
    	}
    	while(st.size()>0) {
    		int i=st.pop();
    		arr[i]='.';
    	}
    	StringBuilder ans=new StringBuilder();
    	//String ans="";
    	for(char c :arr) {
    		if(c!='.') {
    			ans.append(c);
    			//ans+=c;
    		}
    	}
    	
    	return ans.toString();
    }
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String result = reverseParentheses(read.readLine());
        double d=System.currentTimeMillis();
        System.out.println(result);
        double d2=System.currentTimeMillis();
        System.out.println((int)(d2-d));
        
    }
}

*/
// stock span 
/*
7
100
80
60
70
60
75
85
 */
/*public class stackL2 {

    static class StockSpanner {

        static class Pair{
            int stock;
            int index;
        }
        
        public StockSpanner() {
        }
        
        public int next(int price) {
        	Stack<Integer> cs=new Stack<>();
        	int count=1;
        	while(st.size()>0 && st.peek()<=price) {
        		cs.push(st.pop());
        		count++;
        	}
        	while(cs.size()>0) {
        		st.push(cs.pop());
        	}
        	st.push(price);
            return count;
        }
    }
    static Stack<Integer> st=new Stack<>();
    public static void main(String[] args) throws Exception {
        //BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         Scanner sc=new Scanner(System.in);
        StockSpanner obj = new StockSpanner();
       
        int n=sc.nextInt();
        int a[]=new int[n];
        sc.nextLine();
        for(int i=0;i<n;i++) {
        	a[i]= Integer.parseInt(sc.nextLine());
          }
        int i=0;
        while(i<n){
        	
            System.out.println(obj.next(a[i]));
            i++;
        }        
    }
}
*/
// Exclusive time function
/*
2
4
0:start:0
1:start:2
1:end:5
0:end:6
 */
/*public class stackL2 {
	
	static class pair{
		int id;
		int st;
		int ct;
		public pair(int id,int st,int ct) {
			this.id=id;
			this.st=st;
			this.ct=ct;
		}
	}
  public static int[] findTime(String []s,int n) {
	  int time[]=new int[n];
	  Stack<pair> st=new Stack<>();
	  
	  for(String str:s) {
		  String arr[]=str.split(":");
		  int id=Integer.parseInt(arr[0]);
		  int t=Integer.parseInt(arr[2]);
		  String status=arr[1];
		  if(status.equals("start")) {
			  st.push(new pair(id,t,0));
		  }
		  else {
			
			  pair p=st.pop();
			  int interval=t-p.st+1;
			  
			  int et=interval-p.ct;
			  time[id]+=et;
			  
			  if(st.size()>0) {
				  st.peek().ct+=interval;
			  }
			 
		  }
		  
	  }
	return time;  
  }
    public static void main(String[] args) throws Exception {
        //BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int l=sc.nextInt();
        sc.nextLine();
        String s[]=new String[l];
        for(int i=0;i<l;i++) {
        	s[i]=sc.nextLine();
        }
        int time[]=findTime(s,n);
        for(int t: time) {
        	System.out.println(t);
        }
        
    }
}
*/
// 132 pattern 
/*
4
3
1
4
2
 */
/*public class stackL2{
	public static boolean is132pattren(int a[]) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<a.length;i++) {
			if(st.size()==0) {
				st.push(a[i]);
			}
			else if(st.size()==1) {
				if(st.peek()>=a[i]) {
					st.pop();
					st.push(a[i]);
				}
				else {
					st.push(a[i]);
				}
			}
			else if(st.size()==2) {
				if(st.peek()<=a[i]) {
					st.pop();
					st.push(a[i]);
				}
				else {
					int m=st.pop();
					if(st.peek()<a[i]) {
						return true;
					}
					else {
						st.pop();
						st.push(a[i]);
						st.push(m);
					}
				}
			}
		}
		return false;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(sc.nextLine());
		}
		boolean b=is132pattren(a);
		System.out.println(b);
	}
}*/
// asteroid collision
/*public class stackL2 {

	  public static int[] asteroidCollision(int[] asteroids) {
	    Stack<Integer> st=new Stack<>();
	    for(int i=0;i<asteroids.length;i++) {
	    	if(st.size()==0) {
	    		st.push(asteroids[i]);
	    	}
	    	
	    	else if(st.peek()>0 && asteroids[i]<0)  {
	    		while(st.size()>0 && st.peek()>0 && st.peek()<Math.abs(asteroids[i])) {
    				st.pop();
    			}
    			if(st.size()==0 || st.peek()<0) {
    				st.push(asteroids[i]);
    			}
    			else if(st.peek()==Math.abs(asteroids[i])) {
    				st.pop();
    			}
    			
	    	}
	    	else {
	    		st.push(asteroids[i]);
	    	}
	    	
	    }
	    int a[]=new int[st.size()];
	   for(int i=st.size()-1;i>=0;i--) {
		   a[i]=st.pop();
	   }
	    return a;
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int arr[] = new int[n];
	    for (int i = 0; i < n; i++)arr[i] = Integer.parseInt(read.readLine());
	    int result[] = asteroidCollision(arr);

	    System.out.println(result.length);
	    for (int e : result) {
	      System.out.println(e);
	    }

	  }
	}

*/
// remove k digit from string s so that string becomes minimum
/*
10200
k=1
ans=200
14912
2
ans=112
 */
/*public class stackL2 {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String num = read.readLine();
        int k = Integer.parseInt(read.readLine());

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<num.length() ;i++) {
        	int d=num.charAt(i)-'0';
        	while(k>0 && st.size()>0 && st.peek()>d) {
				st.pop();
				k--;
			}
        	st.push(d);
        }
        while(k>0) {
        	st.pop();
        	k--;
        }
       StringBuilder sb=new StringBuilder();
       while(st.size()>0) {
    	   sb.insert(0,st.pop());
       }
       if(sb.length()==0) {
    	   System.out.println("0");
       }
       else {
    	   while(sb.length()>0 && sb.charAt(0)=='0') {
    		   sb.deleteCharAt(0);
    		}
    	   if(sb.length()==0) {
			   System.out.println("0");
		   }
		   else {
			   System.out.println(sb.toString());
		   }
    	  
       }
       
    }
}
*/
//remove duplicte char
//bcadbc
//ans acdb
/*public class stackL2 {
    public static String removeDuplicateLetters(String s) {
    	HashMap<Character,Integer> hm=new HashMap<>();
    	//HashSet<Character> hs=new HashSet<>();
    	boolean ch[]=new boolean[26];
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		hm.put(c,hm.getOrDefault(c,0)+1);
    		
    	}
    	Stack<Character> st=new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		hm.put(c, hm.get(c)-1);
    		if(ch[c-'a']==false) {
    			while(st.size()>0 && c<=st.peek() && hm.get(st.peek())>0) {
    				ch[st.peek()-'a']=false;
					st.pop();
    			
    				
    			}
    			st.push(c);
    			//hs.add(c);
    			ch[c-'a']=true;
    		}
    		
    	}
    	String ans="";
    	while(st.size()>0) {
    		ans=st.pop()+ans;
    	}
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = removeDuplicateLetters(read.readLine());
        System.out.println(result);
        
    }
}
*/
/*
12
0
1
0
2
1
0
1
3
2
1
2
1
 */
// rain water
/*public class stackL2 {
    public static int trap(int[] height) {
    	int rm[]=findrightmax(height);
    	int lm=0;
    	int water=0;
    	for(int i=0;i<height.length;i++) {   		
    		if(height[i]>=height[lm]) {
    			lm=i;
    		}
    		water+=Math.min(height[lm], height[rm[i]])-height[i];
    		
    	}
    	return water;
  }
    public static int[] findrightmax(int h[]) {
    	int ans[]=new int[h.length];
    	int max=h.length-1;
    	for(int i=h.length-1;i>=0;i--) {
    		if(h[max]<h[i]) {
    			max=i;
    		}
    		ans[i]=max;
    		
    	}
    	return ans;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i] = Integer.parseInt(read.readLine());
        int result = trap(arr);
        System.out.println(result);
        
    }
}
*/
/*
5
1
4
2
5
3
 */
// vailed subarray
/*public class stackL2 {

	  public static int validSubarrays(int[] nums) {
	   int count =0;
	   for(int i=0;i<nums.length;i++) {
		   int j=i;
		   while(j<nums.length) {
			   if(nums[i]>nums[j]) {
				   
				   break;
			   }
			   else {
				   j++;
			   }
		   }
		  
		   count+=j-i;
	   }
	   return count;
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int nums[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      nums[i] = Integer.parseInt(read.readLine());
	    }

	    int count = validSubarrays(nums);

	    System.out.println(count);

	  }
	}
*/
// m2
/*public class stackL2 {

	  public static int validSubarrays(int[] nums) {
		  int ns[]=findNextSmaller(nums);
		 int count=0;
		System.out.println(Arrays.toString(ns));
		 for(int i=0;i<nums.length;i++) {
			 int idx=ns[i];// next smaller index
			 count+=idx-i;
		 }
	    return count;
	  }
	  public static int[] findNextSmaller(int a[]) {
		  Stack<Integer> st=new Stack<>();
		  int ans[]=new int[a.length];
		  for(int i=a.length-1;i>=0;i--) {
			  while(st.size()>0 && a[st.peek()]>=a[i]) {
				  st.pop();
			  }
			  if(st.size()==0) {
				  ans[i]=a.length;
			  }
			  else {
				  ans[i]=st.peek();
			  }
			  st.push(i);
		  }
		  return ans;
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int nums[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      nums[i] = Integer.parseInt(read.readLine());
	    }

	    int count = validSubarrays(nums);

	    System.out.println(count);

	  }
	}
*/
/*public class stackL2 {
 public static int calculate(int v1,int v2,char c) {
	 if(c=='+') {
		 return v2+v1;
	 }
	 else if(c=='-') {
		 return v2-v1;
	 }
	 else if(c=='*') {
		 return v2*v1;
	 }
	 else {
		 return v2/v1;
	 }
 }
 public static int presidence(char c) {
	 if(c=='*' || c=='/') {
		 return 1;
	 }
	 else {
		 return 0;
	 }
 }
    public static int calculate(String s){
    	s=s.replaceAll(" ","");
    	Stack<Character> op=new Stack<>();
    	Stack<Integer> d=new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(Character.isDigit(c)) {
    			int val=0;
    			while(i<s.length() && Character.isDigit(s.charAt(i))) {
    				val=val*10+(s.charAt(i)-'0');
    				i++;
    			}
    			i--;
    			
    			d.push(val);
    		}
    		else if(c=='(') {
    			
    			op.push(c);
    		}
    		else if(c==')') {
    			while(op.peek()!='(') {
    				int v1=d.pop();
    				int v2=d.pop();
    				char opre=op.pop();
    				int v=calculate(v1,v2,opre);
    				d.push(v);
    			}
    			op.pop();
    		}
    		else {
    			while(op.size()>0 && op.peek()!='(' && presidence(c)<=presidence(op.peek())) {
    				int v1=d.pop();
    				int v2=d.pop();
    				char opre=op.pop();
    				int v=calculate(v1,v2,opre);
    				d.push(v);
    				
    			}
    			op.push(c);
    			
    		}
    	}
    	
    	while(op.size()>0) {
    		int v1=d.pop();
			int v2=d.pop();
			char opre=op.pop();
			int v=calculate(v1,v2,opre);
			d.push(v);
    	}
        return d.pop();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int result = calculate(read.readLine());
        System.out.println(result);
        
    }
}*/
// basic claculator s contain only -, + and digit

/*public class stackL2 {

    public static int calculate(String s){
    	Stack<Integer> st=new Stack<>();
    	int sum=0;
    	int sign=+1;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(Character.isDigit(c)) {
    			int val=0;
    			while(i<s.length() && Character.isDigit(s.charAt(i))) {
    				val=val*10+(s.charAt(i)-'0');
    				i++;
    			}
    			i--;
    			val*=sign;
    			sign=1;
    			sum+=val;
    		}
    		else if(c=='(') {
    			st.push(sum);
    			st.push(sign);
    			sum=0;
    			sign=+1;
    		}
    		else if(c==')') {
    			sum*=st.pop();
    			sum+=st.pop();
    		}
    		else if(c=='-') {
    			sign*=-1;
    		}
    	}
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int result = calculate(read.readLine());
        System.out.println(result);
        
    }
}
*/
// basic claculator string contain -,+,*,/ and digit
/*public class stackL2 {
	 public static int calculate(int v1,int v2,char c) {
		 if(c=='+') {
			 return v2+v1;
		 }
		 else if(c=='-') {
			 return v2-v1;
		 }
		 else if(c=='*') {
			 return v2*v1;
		 }
		 else {
			 return v2/v1;
		 }
	 }
	 public static int presidence(char c) {
		 if(c=='*' || c=='/') {
			 return 1;
		 }
		 else {
			 return 0;
		 }
	 }
	    public static int calculate(String s){
	    	s=s.replaceAll(" ","");
	    	Stack<Character> op=new Stack<>();
	    	Stack<Integer> d=new Stack<>();
	    	for(int i=0;i<s.length();i++) {
	    		char c=s.charAt(i);
	    		if(Character.isDigit(c)) {
	    			int val=0;
	    			while(i<s.length() && Character.isDigit(s.charAt(i))) {
	    				val=val*10+(s.charAt(i)-'0');
	    				i++;
	    			}
	    			i--;
	    			
	    			d.push(val);
	    		}
	    		
	    		else {
	    			while(op.size()>0 && presidence(c)<=presidence(op.peek())) {
	    				int v1=d.pop();
	    				int v2=d.pop();
	    				char opre=op.pop();
	    				int v=calculate(v1,v2,opre);
	    				d.push(v);
	    				
	    			}
	    			op.push(c);
	    			
	    		}
	    	}
	    	
	    	while(op.size()>0) {
	    		int v1=d.pop();
				int v2=d.pop();
				char opre=op.pop();
				int v=calculate(v1,v2,opre);
				d.push(v);
	    	}
	        return d.pop();
	    }

	    public static void main(String[] args) throws Exception {
	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	        int result = calculate(read.readLine());
	        System.out.println(result);
	        
	    }
	}

*/
/*
8
2
4
3
3
5
4
9
6
4
 */
// lexicographical order samllest subsequence

/*public class stackL2 {
	  public static int[] smallest(int[] nums, int k) {
	    int arr[]=new int[k];
	    
	    int j=0;
	    int idx=0;
	    while(k>0) {
	    	idx=findSmallestin(nums,idx,nums.length-k);
	    	
	    	arr[j++]=nums[idx];
	    	idx=idx+1;
	    	k--;
	    	
	    }
	    return arr;
	  }
public static int findSmallestin(int a[],int l,int h) {
	int idx=0;
	int min=Integer.MAX_VALUE;
	for(int i=l;i<=h;i++) {
		if(min>a[i]) {
			min=a[i];
			idx=i;
		}
	}
	return idx;
}
	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int arr[] = new int[n];
	    for (int i = 0; i < n; i++)arr[i] = Integer.parseInt(read.readLine());
	    int k = Integer.parseInt(read.readLine());
	    int ans[] = smallest(arr, k);
	    System.out.println(ans.length);

	    for (int e : ans) {
	      System.out.println(e);
	    }

	  }
	}
*/
//lexicographical order samllest subsequence
//m2
/*public class stackL2 {
	  public static int[] smallest(int[] nums, int k) {
	  Stack<Integer> st=new Stack<>();
	  int li=nums.length-k;
	  for(int i=0;i<nums.length;i++) {
		  if(st.size()==0) {
			  st.push(nums[i]);
		  }
		  else if(st.peek()>nums[i]) {
			  while(st.size()>0  && st.peek()>nums[i] && i<li+st.size()) {
				  st.pop();
			  }
			  st.push(nums[i]);
		  }
		  else if(st.size()<k){
			  st.push(nums[i]);
		  }
	  }
	  System.out.println(st);
	  int ans[]=new int[k];
	  for(int i=k-1;i>=0;i--) {
		  ans[i]=st.pop();
	  }
	  return ans;
}
	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int arr[] = new int[n];
	    for (int i = 0; i < n; i++)arr[i] = Integer.parseInt(read.readLine());
	    int k = Integer.parseInt(read.readLine());
	    int ans[] = smallest(arr, k);
	    System.out.println(ans.length);

	    for (int e : ans) {
	      System.out.println(e);
	    }

	  }
	}
*/
// design a stack with increment op
/*
3
push 1
push 2
pop
push 2
push 3
push 4
increment 5 100
increment 2 100
pop
pop
pop
pop
 */
/*public class stackL2 {
    public static class CustomStack {
    
        int value[];
        int increment[];
        int index;
        
        public CustomStack(int maxSize) {
            value = new int[maxSize];
            increment = new int[maxSize];
            index=-1;
        }
        
        public void push(int x) {
            
        	
        	if(index<value.length-1) {
        		index++;
        		value[index]=x;
        	}
        }
        
        public int pop() {
        	if(index>=0) {
        		int v=value[index];
        		index--;
                return v;
        	}
        	
        	return -1;
        }
        
        public void increment(int k, int val) {
        	if(k<index) {
        		for(int i=0;i<k;i++) {
              	  value[i]=value[i]+val; 
                 }
        	}
        	else {
        		for(int i=0;i<=index;i++) {
                	  value[i]=value[i]+val; 
                   }

        	}
           
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int maxsize = Integer.parseInt(read.readLine());

        CustomStack cs = new CustomStack(maxsize);
        
        while(true){
            String task[] = read.readLine().split(" ");
            if(task[0].equals("push")){
                cs.push(Integer.parseInt(task[1]));
            }else if(task[0].equals("pop")){
                System.out.println(cs.pop());
            }else if(task[0].equals("increment")){
                cs.increment(Integer.parseInt(task[1]), Integer.parseInt(task[2]));
            }else{
                break;
            }
        }
        System.out.println("exit");
    }
}
*/
// is vailed 
/*public class stackL2 {
	  public static boolean isValid(String s) {
	  
	  Stack<Character> st=new Stack<>();
	  for(int i=0;i<s.length();i++) {
		  char c=s.charAt(i);
		  if(c=='c') {
			  if(st.size()<2) {
				  return false;
			  }
			  if(st.peek()=='b') {
				  char p=st.pop();
				  if(st.peek()=='a') {
					  st.pop();
				  }
				  else {
					  st.push(p);
				  }
				  
			  }
		  }
		  else {
			  st.push(c);
		  }
	  }
	  if(st.size()==0) {
		  return true;
	  }
	  else {
		  return false;
	  }
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    boolean result = isValid(read.readLine());
	    System.out.println(result);

	  }
	}

*/
























































































































































































