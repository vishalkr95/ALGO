
import java.util.*;
// faulty keyboard
/*
public class arraysL2 {
	
	public static boolean isPossible(String name, String typed) {
        if(name.length()>typed.length()) {
        	
        	return false;
        }
        int i=0;
        int j=0;
        while(i<name.length()&&j<typed.length()) {
        	if(name.charAt(i)==typed.charAt(j)) {
        		i++;
        		j++;
        	}
        	else if(i>0 && name.charAt(i-1)==typed.charAt(j)) {
        		j++;
        	}
        	else {
        		
        		return false;
        	}
        }
        while(j<typed.length()) {
        	if(name.charAt(i-1)!=typed.charAt(j)) {
        		
        		return false;
        	}
        	j++;
        }
        if(i<name.length()) {
        	return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String name = "mannu";
        String typed =  "mmaannu";

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }
}*/
/*
12
4
2 6 4
0 5 3
1 4 -2
6 9 1
 */
/*public class arraysL2 {

    public static int[] getModifiedArray(int length, int[][] que) {
       int a[]=new int[length];
       for(int i=0;i<que.length;i++) {
    	   int st=que[i][0];
    	   int ei=que[i][1];
    	   int val=que[i][2];
    	   a[st]+=val;
    	   if(ei+1<length) {
    	   a[ei+1]-=val;
    	   }
       }
       int sum=0;
       for(int i=0;i<length;i++) {
    	   sum+=a[i];
    	   a[i]=sum;
       }
       return a;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();

        int nq = scn.nextInt();
        
        int[][] queries = new int[nq][3];

        for(int q = 0; q < nq; q++) {
            queries[q][0] = scn.nextInt();
            queries[q][1] = scn.nextInt();
            queries[q][2] = scn.nextInt();
        }


        int[] res = getModifiedArray(length, queries);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}*/
/*
9
1
8
6
2
5
4
8
3
7
 */
// max water problem
// i.e max area obtained
/*public class arraysL2 {
 public static int mostWater(int[] h) {
	 int maxw=0;
	 for(int i=0;i<h.length-1;i++) {
		for(int j=i+1;j<h.length;j++) {
			int wid=j-i;
			int ht=Math.min(h[i], h[j]);
			int w=ht*wid;
			if(w>maxw) {
				maxw=w;
			}
		}
	 }
      return maxw;
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        int res = mostWater(heights);
        System.out.println(res);
    }
}*/
// m2
/*
9
1
8
6
2
5
4
8
3
7
 */
/*public class arraysL2 {

    public static int mostWater(int[] h) {
       int i=0;
       int j=h.length-1;
       int maxw=0;
       while(i<j) {
    	   int ht=Math.min(h[i], h[j]);
    	   int wid=j-i;
    	   int w=ht*wid;
    	   if(maxw<w) {
    		   maxw=w;
    	   }
    	   if(ht==h[i]) {
    		   i++;
    	   }
    	   else {
    		   j--;
    	   }
       }
       return maxw;
    }

    public static void main(String[] args) {
      
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        int res = mostWater(heights);
        System.out.println(res);
    }
}*/
/*
9
-6 -2 -1 0 1 4 5 7 9
 */
// sorted square of sorted array
/*public class arraysL2 {

    public static int[] sortedSquares(int[] nums) {
       int arr[]=new int[nums.length];
       int i=0;
       int j=nums.length-1;
       int idx=nums.length-1;
       while(i<=j) {
    	 if(nums[i]*nums[i]<nums[j]*nums[j]) {
    		 arr[idx]=nums[j]*nums[j];
    		 j--;
    		 idx--;
    	 }
    	 else {
    		arr[idx]=nums[i]*nums[i];
    		i++;
    		idx--;
    	 }
       }
       return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) 
            nums[i] = scn.nextInt();
        
        int[] res = sortedSquares(nums);

        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}*/

// majority element 1
// frequence greater than len/2
/*
7
2 2 1 1 1 2 2
 */
/*public class arraysL2 {
	public static void printMajorityElement(int[] arr) {
        int val=arr[0];
        int c=1;
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]==val) {
        		c++;
        	}
        	else {
        		c--;
        		if(c==0) {
        			val=arr[i];
        			c=1;
        		}
        	}
        }
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==val) {
        		count++;
        	}
        }
     
        if(count>arr.length/2) {
        	System.out.println(val);
        }
        else {
        	System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
    }
}*/
// next greater elemenet

/*public class arraysL2 {
   
    public static String nextGreaterElement(String str) {
      char c[]=str.toCharArray();
      int i=str.length()-2;
      while(i>=0) {
    	  
    	  if(c[i]<c[i+1]) {
    		  break;
    	  }
    	  i--;
      }
      if(i==-1) {
    	  return "-1";
      }
      else {
    	  int j=c.length-1;
    	  while(j>i) {
    		  if(c[j]>c[i]) {
    			  break;
    		  }
    		  j--;
    	  }
    	  
       	  char ch=c[i];
       	 
    	    c[i]=c[j];
    	    c[j]=ch;
    	   
    	    String res="";
    	    for(int k=0;k<=i;k++) {
    	    	res+=c[k];
    	    }
    	    j=c.length-1;
    	  
    	    while(j>i) {
    	    	res+=c[j];
    	    	j--;
    	    }
    	    return res;
      }
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = "132";
        String res = nextGreaterElement(num);

        System.out.println(res);
    }
}*/
// product of array except itself
// by using division operator
/*
4
1 2 3 4
 */
/*public class arraysL2 {
    
    public static int[] productExceptSelf(int[] arr) {
      
      int cz=0;
     for(int i=0;i<arr.length;i++) {
    		 if(arr[i]==0) {
    			 cz++;
    	 }
     }
     
     if(cz>1) {
    	 return new int[arr.length];
     }
     else if(cz==1){
    	 int mul=1;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]==0) {
        		 continue;
        	 }
       	  mul*=arr[i];
         }
         int res[]=new int[arr.length];
         int idx=0;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]==0) {
        		idx=i;
        		break;
        	 }
         }
         res[idx]=mul;
         return res;
     }
     else {
    	 int mul=1;
         for(int i=0;i<arr.length;i++) {
       	  mul*=arr[i];
         }
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
        	res[i]=mul/arr[i];
        }
        return res;
     }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}*/
/*public class arraysL2 {
    
    public static int[] productExceptSelf(int[] arr) {
      
    
     int rm[]=new int[arr.length];
     int res[]=new int[arr.length];
     int  mult=1;
     for(int i=arr.length-1;i>=0;i--) {
    	 mult=mult*arr[i];
    	 rm[i]=mult;
     }
     mult=1;
     for(int i=0;i<arr.length-1;i++) {
    	 res[i]=mult*rm[i+1];
    	 mult=mult*arr[i];
     }
     
     res[arr.length-1]=mult;
     
     return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}*/
// given n length arr with elem 0 to n-1
// max partition to make array sorted
/*
6
2 0 1 3 5 4
 */
/*public class arraysL2 {

    public static int maxChunksToSorted(int[] arr) {
       int max=0;
       int c=0;
       for(int i=0;i<arr.length;i++) {
    	   max=Math.max(max, arr[i]);
    	   if(i==max) {
    		   c++;
    	   }
       }
       return c;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxChunksToSorted(arr);
        System.out.println(res);
    }
}*/
//max partition to sort array 
// not necessary to distinct
/*
8
4 3 6 5 7 12 11 10
 */
/*public class arraysL2 {

    public static int maxChunksToSorted2(int[] arr) {
    	int rm[]=new int[arr.length];
    	int min=Integer.MAX_VALUE;
    	for(int i=arr.length-1;i>=0;i--) {
    		if(arr[i]<min) {
    			min=arr[i];
    			
    		}
    		rm[i]=min;
    	}
       int max=arr[0];
       int c=1;
       for(int i=1;i<arr.length-1;i++) {
    	   max=Math.max(max, arr[i]);
    	   if(max<rm[i+1]) {
    		   c++;
    		 
    	   }
       }
       return c;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxChunksToSorted2(arr);
        System.out.println(res);
    }
}*/
// min jumps with +i -i moves 
/*public class arraysL2 {
   
    public static int minJumps(int x) {
       int i=0;
       int j=1;
       int c=0;
       while(i<x) {
    	   i+=j;
    	   j=j+1;
    	   c++;
       }
     
       if((i-x)%2==0) {
    	   return c;
       }
       else if((i+j-x)%2==0) {
    	   return c+1;
       }
       else {
    	   return c+2;
       }
    }

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int jumps = minJumps(x);
        System.out.println(jumps);
    }
}*/
// max product of three number
/*
6
3 2 -4 -6 5 1
 */
/*public class arraysL2 {

    
    public static int maximumProduct(int[] arr) {
       
    	int max1=Integer.MIN_VALUE;
    	int max2=Integer.MIN_VALUE;
    	int max3=Integer.MIN_VALUE;
    	
    	int min1=Integer.MAX_VALUE;
    	int min2=Integer.MAX_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>max1) {
    			max3=max2;
    			max2=max1;
    			max1=arr[i];
    		}
    		else if(arr[i]>max2) {
    			max3=max2;
    			max2=arr[i];
    		}
    		else if(arr[i]>max3) {
    			max3=arr[i];
    		}
    		if(arr[i]<min1) {
    			min2=min1;
    			min1=arr[i];
    		}
    		else if(arr[i]<min2) {
    			min2=arr[i];
    		}
    	}
    	int maxp=Math.max(min1*min2*max1, max1*max2*max3);
    	return maxp;
    	
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int prod = maximumProduct(arr);
        System.out.println(prod);
    }
}*/

// sort array by parity
/*public class arraysL2 {

    
    public static void sortArrayByParity(int[] nums) {
    	int i=0;
    	for(int j=0;j<nums.length;j++) {
    		if(nums[j]%2==0) {
    			int t=nums[j];
    			nums[j]=nums[i];
    			nums[i]=t;
    			i++;
    		}
    		
    	}
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        sortArrayByParity(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/
/*
3 5
1 0 0 0 1
0 0 0 0 0
0 0 1 0 0
 */
/*class arraysL2{
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int arr[][]=new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int mind=bestMeatingPoint(arr);
	System.out.println(mind);
	}
	public static int bestMeatingPoint(int a[][]) {
		ArrayList<Integer> alx=new ArrayList<>();
		ArrayList<Integer> aly=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]==1) {
					alx.add(i);
				}
			
			}
			
		}
		for(int j=0;j<a[0].length;j++) {
			for(int i=0;i<a.length;i++) {
				if(a[i][j]==1) {
					aly.add(j);
				}
			}
		}
		int mx=alx.get(alx.size()/2);
		int my=aly.get(aly.size()/2);
		int mind=0;
		for(int i=0;i<alx.size();i++) {
			mind+=Math.abs(mx-alx.get(i))+Math.abs(my-aly.get(i));
		}
		return mind;
	}
}*/
// all prime b/w 2 to n
/*public class arraysL2 {
    
    
    public static void printPrimeUsingSieve(int n) {
        boolean a[]=new boolean[n+1];
        for(int i=2;i<=n;i++) {
        	a[i]=true;
        }
        for(int i=2;i*i<=n;i++) {
        	if(a[i]) {
        		unmarkIFactors(a,i,n);
        	}
        }
        for(int i=2;i<=n;i++) {
        	if(a[i]) {
        		System.out.print(i+" ");
        	}
        }
    }

    public static void unmarkIFactors(boolean []a,int i,int n) {
    	for(int j=i*2;j<=n;j+=i) {
    		a[j]=false;
    	}
    }
    public static void main(String[] args) {   
        Scanner scn = new Scanner(System.in);
        int n = 100;
        printPrimeUsingSieve(n);
    }
}*/
// transpose of matrix m*n
/*
2 3
11 12 13
21 22 2
 */
/*public class arraysL2 {
  public static int[][] transpose(int[][] matrix) {
   int [][]mat=new int[matrix[0].length][matrix.length];   
     for(int i=0;i<matrix.length;i++) {
    	 for(int j=0;j<matrix[i].length;j++) {
    		 mat[j][i]=matrix[i][j];
    	 }
     }
     return mat;
	  }

public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int m = scn.nextInt();

	    int[][] matrix = new int[n][m];

	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < m; j++) {
	        matrix[i][j] = scn.nextInt();
	      }
	    }

	    int[][] res = transpose(matrix);

	    for (int i = 0; i < res.length; i++) {
	      for (int j = 0; j < res[0].length; j++) {
	        System.out.print(res[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
	}*/
// transpose of matrix n*n
/*
3
11 12 13
21 22 23
31 32 33
 */
/*public class arraysL2 {

	  public static void transpose(int[][] matrix) {
	   for(int i=0;i<matrix.length;i++) {
		   for(int j=0;j<i;j++) {
			   int t=matrix[i][j];
			   matrix[i][j]=matrix[j][i];
			   matrix[j][i]=t;
		   }
	   }
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[][] matrix = new int[n][n];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        matrix[i][j] = scn.nextInt();
	      }
	    }
	    transpose(matrix);
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        System.out.print(matrix[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
	}*/
// minim length we have to sort after that full array become sorted
/*public class arraysL2 {

	  public static void main(String[] args) {
	    int a[]= {2,6,4,8,10,9,15};
	    int l=findminlen(a);
       System.out.println(l);
	  }
  public static int findminlen(int a[]) {
	  int ed=-1;
	  int max=a[0];
	  for(int i=1;i<a.length;i++) {
		  if(max>a[i]) {
			  ed=i;
		  }
		  else {
			  max=Math.max(max, a[i]);
		  }
	  }
	  int st=0;
	  int min=a[a.length-1];
	  for(int i=a.length-2;i>=0;i--) {
		  if(min<a[i]) {
			  st=i;
		  }
		  else {
			  min=Math.min(min, a[i]);
		  }
	  }
	  return ed-st+1;
  }
}
*/
// ratate matrix by 90 deg clockwise
/*
3
11 12 13
21 22 23
31 32 33
 */
/*public class arraysL2 {

	  public static void rotate(int[][] matrix) {
	    for(int i=0;i<matrix.length;i++) {
	    	for(int j=0;j<i;j++) {
	    		int t=matrix[i][j];
	    		matrix[i][j]=matrix[j][i];
	    		matrix[j][i]=t;
	    	}
	    }
	    for(int i=0;i<matrix.length;i++) {
	    	for(int j=0;j<matrix[i].length/2;j++) {
	    		int t=matrix[i][j];
	    		matrix[i][j]=matrix[i][matrix.length-j-1];
	    		matrix[i][matrix.length-j-1]=t;
	    	}
	    }
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[][] matrix = new int[n][n];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        matrix[i][j] = scn.nextInt();
	      }
	    }
	    rotate(matrix);
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        System.out.print(matrix[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
	}
*/
// reverse vowel of string 
/*public class arraysL2 {
	 
	  public static String reverseVowels(String s) {
		  char ch[]=s.toCharArray();
	    int i=0;
	    int j=s.length()-1;
	    while(i<j) {
	    	while(i<j) {
	    		if(isVowel(ch[i])) {
	    			break;
	    		}
	    		i++;
	    	}
	    	while(i<j) {
	    		if(isVowel(ch[j])) {
	    			break;
	    		}
	    		j--;
	    	}
	    	
	    	swap(ch,i,j);
	    	
	    	i++;
	    	j--;
	    }
	    String str="";
	    for(int k=0;k<ch.length;k++) {
	    	str+=ch[k];
	    }
	    return str;
	  }
	  public static boolean isVowel(char c) {
		  if(c=='a'||c=='e'|| c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			  return true;
		  }
		  return false;
	  }
  public static void swap(char ch[],int i,int j) {
	 char c=ch[i];
	 ch[i]=ch[j];
	 ch[j]=c;
  }
	  public static void main(String[] args) {
	   
	    String str = "Education";

	    String res = reverseVowels(str);
	    System.out.println(res);
	  }
	}
*/
/*
6
3 5 2 1 6 4
 */
/*public class arraysL2 {

	  public static int [] wiggleSort(int[] arr) {
	    Arrays.sort(arr);
	    int a[]=new int[arr.length];
	    int i=0;
	    int j=arr.length-1;
	    int idx=0;
	    while(idx<arr.length ) {
	    	
	    	a[idx++]=arr[i++];
	    	
	    	a[idx++]=arr[j--];
	    }
	    return a;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);

	    int n = scn.nextInt();
	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	   arr= wiggleSort(arr);

	    for (int val : arr) {
	      System.out.print(val + " ");
	    }
	    System.out.println();
	  }

	}*/
// m2
/*public class arraysL2 {

	  public static void wiggleSort(int[] arr) {
	     
		  for(int i=0;i<arr.length-1;i++) {
			  if(i%2==0) {
				  if(arr[i]>arr[i+1]) {
					  int t=arr[i];
					  arr[i]=arr[i+1];
					  arr[i+1]=t;
				  }
			  }
			  else {
				  if(arr[i]<arr[i+1]) {
					  int t=arr[i];
					  arr[i]=arr[i+1];
					  arr[i+1]=t;
				  }
			  }
		  }
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);

	    int n = scn.nextInt();
	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	    wiggleSort(arr);

	    for (int val : arr) {
	      System.out.print(val + " ");
	    }
	    System.out.println();
	  }

	}
*/
// add string 
/*public class arraysL2 {

	  public static String addStrings(String num1, String num2) {
	    int i=num1.length()-1;
	    int j=num2.length()-1;
	    int c=0;
	    String s="";
	    while(i>=0 || j>=0) {
	    	int d1=(i>=0?num1.charAt(i):'0')-'0';
	    	int d2=(j>=0?num2.charAt(j):'0')-'0';
	    	int d=d1+d2+c;
	    	c=d/10;
	    	d=d%10;
	    	s=d+s;
	    	i--;
	    	j--;
	    }
	    if(c>0) {
	    	s=c+s;
	    }
	    return s;
	  }
	  
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String n1 = "856213";
	    String n2 = "576";

	    String res = addStrings(n1, n2);
	    System.out.println(res);
	  }
	}

*/
// kya string me 1 char ko delet karke palindrom bna sakate hai
/*public class arraysL2 {

	  public static boolean validPalindrome(String s) {
	     int i=0;
	     int j=s.length()-1;
	     while(i<j) {
	    	 if(s.charAt(i)==s.charAt(j)) {
	    		 i++;
	    		 j--;
	    	 }
	    	 else {
	    		 if(isPalindrom(s.substring(i,j))|| isPalindrom(s.substring(i+1,j+1))){
	    			 return true;
	    		 }
	    		 else {
	    			 return false;
	    		 }
	    	 }
	     }
	     return false;
	  }
   public static boolean isPalindrom(String s) {
	   int i=0;
	   int j=s.length()-1;
	   while(i<j) {
		   if(s.charAt(i)!=s.charAt(j)) {
			   return false;
		   }
	   }
	   return true;
   }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.nextLine();

	    boolean res = validPalindrome(str);
	    System.out.println(res);
	  }
	}*/
// string lables partition
/*public class arraysL2 {

	  public static List<Integer> partitionLabels(String s) {
	   HashMap<Character,Integer> hm=new HashMap<>();
	   for(int i=0;i<s.length();i++) {
		   hm.put(s.charAt(i),i);
	   }
	   List<Integer> al=new ArrayList<>();
	   char c=s.charAt(0);
	   int pre =-1;
	   int maxs=hm.get(c);
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	maxs=Math.max(hm.get(ch),maxs);
	    	if(maxs==i) {
	    		al.add(i-pre);
	    	pre=i;
	    	}
	    }
	   return al;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String str = "ababcbacadefegdehijhklij";

	    List<Integer> res = partitionLabels(str);
	    for (int val : res) {
	      System.out.print(val + " ");
	    }
	  }
	}
*/
/*
5
5 0 3 8 6
*/
// partition of array into disjoint interval
/*public class arraysL2 {
	
	  public static int partitionDisjoint(int[] arr) {
	   int rm[]=new int[arr.length];
	   int min=Integer.MAX_VALUE;
	   for(int i=arr.length-1;i>=0;i--) {
		   min=Math.min(min, arr[i]);
		   rm[i]=min;
	   }
	   
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<arr.length-1;i++) {
		   max=Math.max(max, arr[i]);
		   if(max<=rm[i+1]) {
			   return i+1;
		   }
	   }
	   return arr.length;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	    int len = partitionDisjoint(arr);
	    System.out.println(len);
	  }
	}*/
// multiply string 
/*public class arraysL2 {

	  public static String multiplication(String num1, String num2) {
	   
		  String num="";
		  for(int i=num2.length()-1;i>=0;i--) {
			  int f=num2.charAt(i)-'0';
			  String fres="";
			  int c=0;
			  for(int j=num1.length()-1;j>=0;j--) {
				  int d=num1.charAt(j)-'0';
				  int val=d*f+c;
				  c=val/10;
				  fres=val%10+fres;
			  }
			  if(c>0) {
				  fres=c+fres;
			  }
			  int k=num2.length()-i-1;
			  for(int j=0;j<k;j++) {
				  fres+=0;
			  }
			
			  num=add(num,fres);
		  }
		  return num;
	  }
	  public static String add(String num1,String num2) {
		  String ans="";
		  int c=0;
		  int i=num1.length()-1;
		  int j=num2.length()-1;
		  while(i>=0 || j>=0 || c!=0) {
			  int d1=(i<0?'0':num1.charAt(i))-'0';
		      int d2=(j<0?'0':num2.charAt(j))-'0';
		    	int d=d1+d2+c;
		    	c=d/10;
		    	d=d%10;
		    	ans=d+ans;
		    	i--;
		    	j--;
		  }
		  return ans;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);

	    String str1 = "99999999999999999999999999999999999999999999999999999999999999999999999999999999";
	    String str2 = "999999999999999999999999999999999999999999999999999999999999999999";

	    String res = multiplication(str1, str2);
	    System.out.println(res);
	  }
	}*/

// multiply complex number
/*public class arraysL2 {

	  public static String complexNumberMultiply(String num1, String num2) {
		  // num1=a+bi
		  // num2=c+di
		  // num=(a*c)-(b*d)+(a*d+c*b)i;
	    String s1[]=num1.split("\\+");
	    String s2[]=num2.split("\\+");
	  
	    int a=Integer.parseInt(s1[0]);
	    int b=Integer.parseInt(s1[1].substring(0,s1[1].length()-1));
	    int c=Integer.parseInt(s2[0]);
	    int d=Integer.parseInt(s2[1].substring(0,s2[1].length()-1));
	    int rel=(a*c)-(b*d);
	    int img=(a*d)+(c*d);
	    return rel+"+"+img+"i";
	    
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String num1 = scn.nextLine();
	    String num2 = scn.nextLine();
	    String res = complexNumberMultiply(num1, num2);
	    System.out.println(res);
	  }
	}*/


// total number of sub array with maxvalue>=left and maxvalue<=right
/*
4
2 1 4 3
2
3
 */
/*public class arraysL2 {

	  public static int numSubarrayBoundedMax(int[] arr, int left, int right) {
		  int dp[]=new int[arr.length];
		 
		  int lm=-1;
		  if(arr[0]>=left && arr[0]<=right) {
			  dp[0]=1;
		  }
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]<left) {
				 dp[i]=dp[i-1]*2;
			 }
			 else if(arr[i]>=left && arr[i]<=right) {
				 dp[i]=dp[i-1]+i-lm;
			 }
			 else {
				 dp[i]=dp[i-1];
				 lm=i;
			 }
		 }
		 return dp[dp.length-1];
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	    int left = scn.nextInt();
	    int right = scn.nextInt();

	    int count = numSubarrayBoundedMax(arr, left, right);
	    System.out.println(count);
	  }
	}
*/
// m2
/*public class arraysL2 {

	  public static int numSubarrayBoundedMax(int[] arr, int left, int right) {
		 int c=0;
		 int st=-1;
		 int ei=0;
		 int prec=0;
		 while(ei<arr.length) {
			 if(arr[ei]<left) {
				 c+=prec;
			 }
			 else if(arr[ei]>=left && arr[ei]<=right) {
				 prec=ei-st;
				 c+=prec;
				 
			 }
			 else {
				 prec=0;
				 st=ei;
			 }
			 ei++;
		 }
		 return c;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	    int left = scn.nextInt();
	    int right = scn.nextInt();

	    int count = numSubarrayBoundedMax(arr, left, right);
	    System.out.println(count);
	  }
	}*/

// maximum number after one swap
/*public class arraysL2 {

	  public static String maximumSwap(String num) {
		  char c[]=num.toCharArray();
	    int rm[]=new int[num.length()];
	    int max=Integer.MIN_VALUE;
	    int maxi=num.length()-1;
	    for(int i=num.length()-1;i>=0;i--) {
	    	int d=num.charAt(i)-'0';
	    	if(max>d) {
	    		rm[i]=maxi;
	    	}
	    	else {
	    		max=d;
	    		maxi=i;
	    		rm[i]=i;
	    	}
	    }
	    for(int i=0;i<num.length()-1;i++) {
	    	if((c[i]-'0')<rm[i+1]) {
	    		char ch=c[i];
	    		c[i]=c[rm[i+1]];
	    		c[rm[i+1]]=ch;
	    		break;
	    	}
	    }
	    String ans="";
	    for(char ch: c) {
	    	ans+=ch;
	    }
	    return ans;
	  }

	  public static void main(String[] args) {
	   
	    String str = "99376942";
	    String ans = maximumSwap(str);
	    System.out.println(ans);
	  }
	}
*/
// m2
/*
 */
/*public class arraysL2 {

	 
	  public static String maximumSwap(String num) {
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    for(int i=0;i<num.length();i++) {
	    	int d=num.charAt(i)-'0';
	    	hm.put(d, i);
	    }
	    char c[]=num.toCharArray();
	    int f=1;
	    for(int i=0;i<num.length();i++) {
	    	int d=c[i]-'0';
	    	for(int j=9;j>d;j--) {
	    	  if(hm.containsKey(j)) {
	    		  int li=hm.get(j);
	    		  if(li>i) {
	    			  char ch=c[i];
	    			  c[i]=c[li];
	    			  c[li]=ch;
	    			  f=0;
	    			  break;
	    		  }
	    	  }
	    	}
	    	if(f==0) {
	    		break;
	    	}
	    }
	    String ans="";
	    for(char ch : c) {
	    	ans+=ch;
	    }
	    return ans;
	  }

	  public static void main(String[] args) {
	   
	    String str = "99376942";
	    String ans = maximumSwap(str);
	    System.out.println(ans);
	  }
	}

*/

// TARGET SUM UNIQUE PAIR
/*public class arraysL2 {
  
	public static List<List<Integer>> twoSum(int[] arr, int target) {
	   Arrays.sort(arr);
	   int i=0;
	   int j=arr.length-1;
	   List<List<Integer>> al=new ArrayList<>();
	   while(i<j) {
		  
		   if(arr[i]+arr[j]==target) {
			   List<Integer> ar=new ArrayList<>();
			   ar.add(arr[i]);
			   ar.add(arr[j]);
			   al.add(ar);
			   i++;
			   j--;
			   
			  while(i<j && arr[i]==arr[i-1]) {
				  i++;
				 
			  }
			  while(i<j && arr[j]==arr[j+1]) {
				  j--;
			  }
		   }
		   else if(arr[i]+arr[j]<target) {
			   i++;
		   }
		   else {
			   j--;
		   }
	   }
	  
	   
	   return al;
	  }

	 
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    int target = scn.nextInt();
	    List<List<Integer>> res = twoSum(arr, target);
	    ArrayList<String> finalResult = new ArrayList<>();
	    for (List<Integer> list : res) {
	      Collections.sort(list);
	      String ans = "";
	      for (int val : list) {
	        ans += val + " ";
	      }
	      finalResult.add(ans);
	    }
	    Collections.sort(finalResult);
	    for (String str : finalResult) {
	      System.out.println(str);
	    }
	  }
	}

*/
// minimun number of botes to save the people
/*public class arraysL2 {
	
	  public static int numRescueBoats(int[] people, int limit) {
	   
		  Arrays.sort(people);
		 int i=0;
		 int j=people.length-1;
		 int count =0;
		 while(i<=j) {
			 if(people[i]+people[j]>limit) {
				count++;
				j--;
			 }
			 else {
				 count++;
				 i++;
				 j--;
			 }
		 }
		 
		 return count;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] people = new int[n];

	    for (int i = 0; i < n; i++)
	      people[i] = scn.nextInt();

	    int limit = scn.nextInt();
	    int boats = numRescueBoats(people, limit);
	    System.out.println(boats);
	  }
	}
*/
// target sum of k sets element
/*
6
-1 0 1 2 -1 -4
0
3
 */
/*public class arraysL2 {

	  public static List<List<Integer>> kSum(int[] arr, int target, int k) {
		  Arrays.sort(arr);
	    List<List<Integer>> al=ksum(arr,target,k,0,arr.length-1);
	    return al;
	  }
	  public static List<List<Integer>> ksum(int []arr,int target,int k ,int i,int j){
		  
		  if(k==2) {
			  List<List<Integer>> al=new ArrayList<>();
			  int l=i;
			  int r=j;
			  while(l<r) {
				 int sum=arr[l]+arr[r];
				 if(sum==target) {
					 List<Integer> a=new ArrayList<>();
					 a.add(arr[l]);
					 a.add(arr[r]);
					 al.add(a);
					 l++;
					 r--;
					 while(l<r && arr[l]==arr[l-1]) {
						 l++;
						 }
					 while(l<r && arr[r]==arr[r+1]) {
						 r++;
					 }
				 }
				 else if(sum<target) {
					 l++;
				 }
				 else {
					 r--;
				 }
			  }
			 
			  return al;
		  }
		  if(arr.length-i<0) {
			  return new ArrayList<>();
		  }
		  List<List<Integer>> ml=new ArrayList<>();
		  for(int id=i;id<arr.length-k;id++) {
			  if(id!=i && arr[id]==arr[id-1]) {
				continue;  
			  }
			  List<List<Integer>> al=ksum(arr,target-arr[id],k-1,id+1,j);
			  for(List<Integer> l: al) {
				  l.add(arr[id]);
				  ml.add(l);
			  }
		  }
		  return ml;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    int target = scn.nextInt();
	    int k = scn.nextInt();
	    List<List<Integer>> res = kSum(arr, target, k);
	    ArrayList<String> finalResult = new ArrayList<>();
	    for (List<Integer> list : res) {
	      Collections.sort(list);
	      String ans = "";
	      for (int val : list) {
	        ans += val + " ";
	      }
	      finalResult.add(ans);
	    }
	    Collections.sort(finalResult);
	    for (String str : finalResult) {
	      System.out.println(str);
	    }
	  }

	}
*/
// find fist +ve missing number 
/*public class arraysL2 {

	  public static int firstMissingPositive(int[] arr) {
	  
		  Arrays.sort(arr);
		  int i=0;
		  while(arr[i]<=0) {
			  i++;
		  }
		  for(int j=i;j<arr.length;j++) {
			 if(j==i) {
				 if(arr[j]!=1) {
					 return 1;
				 }
			 }
			 else {
				 if(arr[j]!=arr[j-1]+1) {
					
					 return arr[j-1]+1;
				 }
			 }
		  }
		  return arr.length;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	    int res = firstMissingPositive(arr);
	    System.out.println(res);
	  }
	}
*/
//paskal trangle
/*class arraysL2{
   public static void main(String [] args) {
	   int n=5;
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<=i;j++) {
			   int v=fact(i)/(fact(i-j)*fact(j));
			   System.out.print(v);
		   }
		   System.out.println();
	   }
   }
   public static int fact(int n) {
	   int f=1;
	   for(int i=2;i<=n;i++) {
		   f*=i;
	   }
	   return f;
   }
}*/
// paskal traingle 2
// if intput r=3
// print 1331
// if inpur r=4
// print 14641
/*public class arraysL2 {

	  public static ArrayList<Integer> pascalRow(int r) {
	    ArrayList<Integer> al=new ArrayList<>();
	    for(int i=0;i<=r;i++) {
	    	int v=fact(r)/(fact(r-i)*fact(i));
	    	al.add(v);
	    }
	    return al;
	  }
  public static int fact(int n) {
	 if(n==0) {
		 return 1;
	 }
	 return n*fact(n-1);
  }
	 
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();

	    ArrayList<Integer> res = pascalRow(n);
	    for (int val : res) {
	      System.out.print(val + " ");
	    }
	    System.out.println();
	  }
	}
*/
// paskal traingle m2
/*public class arraysL2 {

	  public static ArrayList<Integer> pascalRow(int r) {
		  ArrayList<Integer> al=new ArrayList<>();
	     int val=1;
	     for(int j=0;j<=r;j++) {
	    	 al.add(val);
	    	 val=(val*(r-j))/(j+1);
	     }
	     return al;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = 4;

	    ArrayList<Integer> res = pascalRow(n);
	    for (int val : res) {
	      System.out.print(val + " ");
	    }
	    System.out.println();
	  }
	}
*/
/*
public class arraysL2 {

	  public static List<String> findAndReplacePattern(String[] words, String pattern) {
	   List<String> al=new ArrayList<>();
	      for(String word : words) {
	    	  if(isMatching(word,pattern)) {
	    		  al.add(word);
	    	  }
	      }
	   return al;
	  }
public static boolean isMatching(String word,String ptr) {
	HashMap<Character,Character> hm=new HashMap<>();
	HashSet<Character> hs=new HashSet<>();
	for(int i=0;i<ptr.length();i++) {
		char pc=ptr.charAt(i);
		char wc=word.charAt(i);
		if(hm.containsKey(wc)) {
			if(hm.get(wc)!=pc) {
				return false;
			}
			
		}
		else {
			if(hs.contains(pc)) {
				return false;
			}
			hm.put(wc, pc);
			hs.add(pc);
		}
	}
	return true;
}
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String pattern = scn.nextLine();
	    int n = scn.nextInt();
	    scn.nextLine(); // to consume enter after number
	    String[] words = new String[n];
	    for (int i = 0; i < n; i++) {
	      words[i] = scn.nextLine();
	    }
	    List<String> res = findAndReplacePattern(words, pattern);
	    if (res.size() == 0) {
	      System.out.println("Empty");
	      return;
	    }
	    Collections.sort(res);
	    for (String str : res) {
	      System.out.print(str + " ");
	    }
	    System.out.println();
	  }
	}

*/
// consecutive number sum count
// i.e if n=15 15, 8+7, 4+5+6 , 1+2+3+4+5
// ans 4
/*public class arraysL2 {

	  public static int consecutiveNumbersSum(int n) {
		  int count=0;
	    for(int k=1;k*(k-1)<2*n;k++) {
	    	int numerator=n-(k*(k-1)/2);
	    	if(numerator%k==0) {
	    		count++;
	    	}
	    }
	    return count;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int num = scn.nextInt();
	    int res = consecutiveNumbersSum(num);
	    System.out.println(res);
	  }
	}
*/
// push dominoes
/*public class arraysL2 {

	  public static String pushDominoes(String str) {
	   char c[]=new char[str.length()+2];
	   c[0]='L';
	   c[str.length()+1]='R';
	   for(int i=0;i<str.length();i++) {
		   c[i+1]=str.charAt(i);
	   }
	   int j=0;
	   int k=1;
	   while(k<c.length) {
		   while(c[k]=='.') {
			   k++;
		   }
		   if(k-j>1) {
			   solveinnerBody(c,j,k);
			  
		   }
		   j=k;
		   k++;
	   }
//	   String ans="";
//	   for(int i=1;i<c.length-1;i++) {
//		   ans+=c[i];
//	   }
	   StringBuilder ans=new StringBuilder();
	   for(int i=1;i<c.length-1;i++) {
		   ans.append(c[i]);
	   }
	   return ans.toString();
	  }
     public static void solveinnerBody(char c[],int i,int j) {
    	 if(c[i]=='L' && c[j]=='L') {
    		 for(int k=i+1;k<j;k++) {
    			 c[k]='L';
    		 }
    		
    	 }
    	 else if(c[i]=='R' && c[j]=='R') {
    		 for(int k=i+1;k<j;k++) {
    			 c[k]='R';
    		 }
    	 }
    	 else if(c[i]=='L' && c[j]=='R') {
    		 
    	 }
    	 else {
    		 int diff=j-i;
    		 int mid=(i+j)/2;
    		
    		 if(diff%2==0){
    			 // matlab bich in odd len hai
    			 for(int k=i+1;k<mid;k++) {
    				c[k]='R';
    			 }
    			 for(int k=mid+1;k<j;k++) {
    				 c[k]='L';
    			 }
    		 }
    			 else {
    				 for(int k=i+1;k<=mid;k++) {
    					c[k]='R';
    				 }
    				 for(int k=mid+1;k<j;k++) {
    					 c[k]='L';
    				 }
    			 }
    		 }
    	 
     }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.nextLine();
	    String res = pushDominoes(str);
	    System.out.println(res);
	  }
	}
*/

// merge interval
/*
5
1 3
8 10
7 8
9 15
2 6
 */
/*public class arraysL2{
	static class pair implements Comparable<pair>{
		int st;
		int ep;
		public pair(int st,int ep) {
			this.st=st;
			this.ep=ep;
		}
		
		public int compareTo(pair o) {
			
			return this.st-o.st;
		}
	}
    public static int[][] mergeIntervals(int Intervals[][]){
    	
       pair []p=new pair[Intervals.length];
       for(int i=0;i<Intervals.length;i++) {
    	   p[i]=new pair(Intervals[i][0],Intervals[i][1]);
       }
       Arrays.sort(p);
       
       int st=p[0].st;
       int ep=p[0].ep;
       
       List<List<Integer>> al=new ArrayList<>();
       List<Integer> a=new ArrayList<>();
       a.add(st);
       a.add(ep);
       al.add(a);
       for(int i=1;i<p.length;i++) {
    	  pair np=p[i];
    	  if(np.ep<ep) {
    		
    	  }
    	  else if(np.st<ep) {
    		  List<Integer> pl=al.remove(al.size()-1);
    		  pl.remove(1);
    		  pl.add(np.ep);
    		  al.add(pl);
    		  ep=np.ep;
    	  }
    	  else {
    		 List<Integer> nl=new ArrayList<>();
    		 nl.add(np.st);
    		 nl.add(np.ep);
    		 al.add(nl);
    		 st=np.st;
    		 ep=np.ep;
    	  }
       }
       int arr[][]=new int[al.size()][2];
       for(int i=0;i<al.size();i++) {
    	   List<Integer> l=al.get(i);
    	   arr[i][0]=l.get(0);
    	   arr[i][1]=l.get(1);
       }
       return arr;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int input[][] = new int[n][2];

        for(int i = 0 ; i <  n ; i++){
            int sp = scn.nextInt();
            int ep = scn.nextInt();

            input[i][0] = sp;
            input[i][1] = ep;
        }

        int [][]output = mergeIntervals(input);

        System.out.print("[");
        for(int arr[] : output){
            System.out.print(Arrays.toString(arr));
        }
        System.out.println("]");
    }
}*/
/*
5
1 3
8 10
7 8
9 15
2 6
 */
// m2
/*public class arraysL2{
    public static int[][] mergeIntervals(int Intervals[][]){
    	Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
    	// lambda expression for sort the array
    	ArrayList<int []> al=new ArrayList<>();
    	for( int Interval [] : Intervals) {
    		if(al.size()==0) {
    			al.add(Interval);
    		}
    		else {
    			int prevl[]=al.get(al.size()-1);
    			if(Interval[0]<prevl[1]) {
    				prevl[1]=Math.max(prevl[1],Interval[1]);
    			}
    			else {
    				al.add(Interval);
    			}
    		}
    	}
    	
    	return al.toArray(new int[al.size()][]);// convert ArrayList to array
     
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int input[][] = new int[n][2];

        for(int i = 0 ; i <  n ; i++),{
            int sp = scn.nextInt();
            int ep = scn.nextInt();

            input[i][0] = sp;
            input[i][1] = ep;
        }

        int [][]output = mergeIntervals(input);

        System.out.print("[");
        for(int arr[] : output){
            System.out.print(Arrays.toString(arr));
        }
        System.out.println("]");
    }
}*/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
// minimum numbers of platform 
/*public class arraysL2 {

	  public static int findPlatform(int[] arr, int[] dep) {
	  
		  Arrays.sort(arr);
		  Arrays.sort(dep);
		  int i=0;
		  int j=0;
		  int maxtrain=0;
		  int maxplatform=0;
		  while(i<arr.length) {
			  if(arr[i]<=dep[j]) {
				  maxtrain++;
				  i++;
			  }
			  else {
				  maxtrain--;
				  j++;
			  }
			  maxplatform=Math.max(maxtrain, maxplatform);
		  }
		  return maxplatform;
	  }

	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    int[] dep = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }

	    for (int i = 0; i < n; i++) {
	      dep[i] = scn.nextInt();
	    }

	    int plateforms = findPlatform(arr, dep);
	    System.out.println(plateforms);
	  }
	}
*/
// meating room
/*
5
1 3
8 10
7 8
9 15
2 6
 */
/*public class arraysL2{
    public static boolean meetingRooms(int intervals[][]){
     Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
     
     int et=intervals[0][1];
     for(int i=1;i<intervals.length;i++) {
    	 if(intervals[i][0]<et) {
    		 return false;
    	 }
    	 else {
    		 et=intervals[i][1];
    	 }
     }
     return true;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int input[][] = new int[n][2];

        for(int i = 0 ; i <  n ; i++){
            int sp = scn.nextInt();
            int ep = scn.nextInt();

            input[i][0] = sp;
            input[i][1] = ep;
        }

        boolean res = meetingRooms(input);
        System.out.println(res);
    }
}
*/
// meating room 2 ==> maximum number of meating room
/*
5
1 3
8 10
7 8
9 15
2 6
 */
/*public class arraysL2 {
	  public static int meetingRooms(int intervals[][]) {
	 int []stp=new int[intervals.length];
	 int []ep=new int[intervals.length];
	 for(int i=0;i<intervals.length;i++) {
		 stp[i]=intervals[i][0];
		 ep[i]=intervals[i][1];
	 }
	  Arrays.sort(stp);
	  Arrays.sort(ep);
	  int i=0;
	  int j=0;
	  int count=0;
	  while(i<stp.length && j<ep.length) {
		  if(stp[i]<ep[j]) {
			  count++;
			  i++;
		  }
		  else {
			  i++;
			  j++;
		  }
	  }
	  return count;
	  }
	  public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);

	    int n = scn.nextInt();
	    int input[][] = new int[n][2];

	    for (int i = 0 ; i <  n ; i++) {
	      int sp = scn.nextInt();
	      int ep = scn.nextInt();

	      input[i][0] = sp;
	      input[i][1] = ep;
	    }

	    System.out.println(meetingRooms(input));
	  }
	}
*/
// m2
/*public class arraysL2 {
	  public static int meetingRooms(int intervals[][]) {
	    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
	    PriorityQueue<Integer> pq=new PriorityQueue<>();
	    for(int []interval:intervals) {
	    	if(pq.size()==0) {
	    		pq.add(interval[1]);
	    	}
	    	else {
	    		if(pq.peek()<interval[0]) {
	    			pq.remove();
	    			pq.add(interval[1]);
	    		}
	    		else {
	    			pq.add(interval[1]);
	    		}
	    	}
	    }
	    return pq.size();
	  }
	  public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);

	    // Input Format
	    int n = scn.nextInt();
	    int input[][] = new int[n][2];

	    for (int i = 0 ; i <  n ; i++) {
	      int sp = scn.nextInt();
	      int ep = scn.nextInt();

	      input[i][0] = sp;
	      input[i][1] = ep;
	    }

	    // Output Format
	    System.out.println(meetingRooms(input));
	  }
	}

/*
3
1 3
5 10
12 17
3
2 4
5 7
9 13
 */
/*public class arraysL2 {
	  public static int[][] intersection(int List1[][], int List2[][]) {
	    int i=0;
	    int j=0;
	    ArrayList<int []> al=new ArrayList<>();
	    while(i<List1.length && j<List2.length) {
	    	int sp=Math.max(List1[i][0],List2[j][0]);
	    	int ep=Math.min(List1[i][1], List2[j][1]);
	    	if(sp<ep) {
	    		int a[]=new int[2];
		    	a[0]=sp;
		    	a[1]=ep;
		    	al.add(a);
	    	}
	    	if(List1[i][1]<List2[j][1]) {
	    		i++;
	    	}
	    	else {
	    		j++;
	    	}
	    }
	    return al.toArray(new int[al.size()][]);
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	 
	    int n = scn.nextInt();
	    int list1[][] = new int[n][2];
	    for (int i = 0 ; i < n ; i++) {
	      list1[i][0] = scn.nextInt();
	      list1[i][1] = scn.nextInt();
	    }

	    int m = scn.nextInt();
	    int list2[][] = new int[m][2];
	    for (int i = 0 ; i < m ; i++) {
	      list2[i][0] = scn.nextInt();
	      list2[i][1] = scn.nextInt();
	    }

	    // output
	    int ans[][] = intersection(list1, list2);
	    System.out.print("[");
	    for (int interval[] : ans) {
	      System.out.print(Arrays.toString(interval));
	    }
	    System.out.println("]");
	  }
	}
*/
// insert interval 
/*
5
1 5
7 9
10 13
16 19
20 25
12 20
 */
/*public class arraysL2 {

	  private static int[] newinterval;
	public static int[][] insertIntervals(int List[][], int newInterval[]) {
	   ArrayList<int []> al=new ArrayList<>();
	   int i=0;
	   while(i<List.length) {
		   if(List[i][0]<newInterval[0]) {
			   al.add(List[i]);
			   i++;
		   }
		   else {
			   break;
		   }
	   }
	   if(al.size()==0 || al.get(al.size()-1)[1]<newInterval[0]) {
		   al.add(newInterval);
	   }
	   else {
		   int []lastinterval=al.get(al.size()-1);
		   lastinterval[1]=Math.max(lastinterval[1], newInterval[1]);
		  
	   }
	   while(i<List.length) {
		   int []lastinterval=al.get(al.size()-1);
		   if(List[i][0]<=lastinterval[1]) {
			   lastinterval[1]=Math.max(lastinterval[1],List[i][1]);
		   }
		   else {
			   al.add(List[i]);
		   }
		   i++;
	   }
	   return al.toArray(new int[al.size()][]);
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int intervalList[][] = new int[n][2];
	    for (int i = 0 ; i < n ; i++) {
	      int st = scn.nextInt();
	      int et = scn.nextInt();

	      intervalList[i][0] = st;
	      intervalList[i][1] = et;
	    }
	    int newInterval[] = new int[2];
	    newInterval[0] = scn.nextInt();
	    newInterval[1] = scn.nextInt();

	    int ans[][] = insertIntervals(intervalList, newInterval);

	    System.out.print("[");
	    for (int interval[] : ans) {
	      System.out.print(Arrays.toString(interval));
	    }
	    System.out.println("]");

	  }
	}

*/
// min arrow needed to brust balloons
/*

6
10 13
3 5
5 7
1 5
2 6
12 14
 */
/*public class arraysL2 {
	  public static int minArrows(int coordinates[][]) {
	    Arrays.sort(coordinates,(a,b)->Integer.compare(a[1],b[1]));
	    int arrow=1;
	    int ep=coordinates[0][1];
	    for(int i=1;i<coordinates.length;i++) {
	    	if(coordinates[i][0]<=ep) {
	    		// kucha mat kara 
	    	}
	    	else {
	    		arrow++;
	    		ep=coordinates[i][1];
	    	}
	    }
	    return arrow;
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt(); // number of balloons
	    int coordinates[][] = new int[n][2];
	    for (int i = 0 ; i < n ; i++) {
	      coordinates[i][0] = scn.nextInt();
	      coordinates[i][1] = scn.nextInt();
	    }

	    System.out.println(minArrows(coordinates));
	  }
	}
*/
/*
3
1 5 2
4 8 1
11 15 3
3
 */
/*public class arraysL2 {
	  public static boolean carPooling(int trips[][], int cap) {
		  Arrays.sort(trips,(a,b)->Integer.compare(a[0],b[0]));
	     HashMap<Integer,Integer> hm=new HashMap<>();
	     PriorityQueue<Integer> pq=new PriorityQueue<>();
	     int cp=0;
	     for(int i=0;i<trips.length;i++) {
	    	while(pq.size()>0 && pq.peek()<=trips[i][0]) {
	    		int ep=pq.remove();
	    		int f=hm.get(ep);
	    		cp-=f;
	    	}
	    	int p=trips[i][2];
	    	if(trips[i][0]<trips[i][1]) {
	    	if(cp+p<=cap) {
	    		hm.put(trips[i][1],p);
	    		pq.add(trips[i][1]);
	    		cp+=p;
	    	}
	    	else {
	    		return false;
	    	}
	    	}
	    	
	    	
	     }
	     return true;
	   
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();

	    int trips[][] = new int[n][3];
	    for (int i = 0 ; i < n ; i++) {
	      trips[i][0] = scn.nextInt();
	      trips[i][1] = scn.nextInt();
	      trips[i][2] = scn.nextInt();
	    }
	    int cap = scn.nextInt();

	    if (carPooling(trips, cap)) {
	      System.out.println("YES");
	    } else {
	      System.out.println("NO");
	    }

	  }
	}
*/
//m2
/*
3
1 5 2
4 8 1
11 15 3
3
 */
/*public class arraysL2 {
	  public static boolean carPooling(int trips[][], int cap) {
	    int lastdrop=0;
	    for(int trip[]: trips) {
	    	lastdrop=Math.max(trip[1], lastdrop);
	    }
	    int highway[]=new int[lastdrop+1];
	    for(int trip[]: trips) {
	    	highway[trip[0]]+=trip[2];
	    	highway[trip[1]]-=trip[2];
	    }
	    int sum=0;
	    for(int i=1;i<highway.length;i++) {
	    	sum+=highway[i];
	    	highway[i]=sum;
	    	if(sum>cap) {
	    		return false;
	    	}
	    }
	    return true;
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();

	    int trips[][] = new int[n][3];
	    for (int i = 0 ; i < n ; i++) {
	      trips[i][0] = scn.nextInt();
	      trips[i][1] = scn.nextInt();
	      trips[i][2] = scn.nextInt();
	    }
	    int cap = scn.nextInt();

	    if (carPooling(trips, cap)) {
	      System.out.println("YES");
	    } else {
	      System.out.println("NO");
	    }

	  }
	}

*/
// maximum average subarray
/*
10
-10 5 -6 8 -7 2 -4 8 -6 7
3
 */
/*public class arraysL2 {
	  public static double solution(int nums[], int k) {
	   int sum=0;
	   int i=0;
	   while(i<k) {
		   sum+=nums[i];
		   i++;
	   }
	   
	   double maxave=sum*1.0/k*1.0;
	   while(i<nums.length) {
		   sum=sum-nums[i-k]+nums[i];
		   
		    double nave=sum*1.0/k*1.0;
		   maxave=Math.max(maxave, nave);
		   i++;
	   }
	   return maxave;
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int nums[] = new int[n];
	    for (int i = 0 ; i < n ; i++) {
	      nums[i] = scn.nextInt();
	    }
	    int k = scn.nextInt();

	    System.out.println(solution(nums, k));
	  }
	}
*/
// min length string after removing similar ends
// aaabbcdaoddcccbaa    ans=2(ao)
//pepepep   ans=1(e)
/*public class arraysL2 {
	  public static int minLen(String s) {
	    int i=0;
	    int j=s.length()-1;
	    while(i<j && s.charAt(i)==s.charAt(j)) {
	    	char c=s.charAt(i);
	    	while(i<j && s.charAt(i)==c) {
	    		i++;
	    	}
	    	while(i<=j && s.charAt(j)==c) {
	    		j--;
	    	}
	    }
	    return j-i+1;
	  }
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);

	    String inp = scn.nextLine();
	    int len = minLen(inp);

	    System.out.println(len);
	  }
	}
*/





























































































































































