

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









































































































































