
import java.io.*;
import java.util.*;
/*
8
8
7
4
2
5
3
1
10
4
0 7
0 3
2 7
1 6
 */
/*public class segment {

  public static class SegmentTree {
	  int tree[];
	  int arr[];

    SegmentTree(int a[]) {
        arr=a;
        tree=new int[arr.length*4];
        build(1,0,arr.length-1);
    }
    public void build(int node ,int start,int end) {
    	if(start==end) {
    		tree[node]=arr[start];
    		return ;
    	}
    	int mid=(start+end)/2;
    	int left=2*node;
    	int right=2*node+1;
    	build(left,start,mid);
    	build(right,mid+1,end);
    	tree[node]=Math.max(tree[left], tree[right]);
    }

    int query(int l, int r) {
       return query(1,0,arr.length-1,l,r);
    }
    public int query(int node ,int start,int end,int l,int r) {
    	if(end<l || start>r) {
    		return Integer.MIN_VALUE;
    		// e<l right chek karne ki jarurat nahi hai
    		// r>start left chek karne ki jarurat nahi hai
    	}
    	if(start==end) {
    		return tree[node];
    	}
    	else if(l<=start && end<=r) {
    		return tree[node];
    	}
    	else {
    		int mid=(start+end)/2;
    		int lidx=2*node;
    		int ridx=2*node+1;
    	    int left=query(lidx,start,mid,l,r);
    	    int right=query(ridx,mid+1,end,l,r);
    		return Math.max(left, right);
    	}
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(read.readLine());
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(read.readLine());
    }

    SegmentTree obj = new SegmentTree(arr);

    int q = Integer.parseInt(read.readLine());

    StringBuilder out = new StringBuilder();
    while (q-- > 0) {
      String[]inp = read.readLine().split(" ");

      int l = Integer.parseInt(inp[0]);
      int r = Integer.parseInt(inp[1]);

      int ans = obj.query(l, r);
      out.append(ans);
      out.append("\n");
    }

    System.out.println(out);
  }

}*/
/*public class segment {

	  public static class SegmentTree {
         int tree[];
         int arr[];
         
	    SegmentTree(int a[]) {
             arr=a;
             tree=new int[arr.length*4];
             build(1,0,arr.length-1);
	    }
     public void build(int node ,int s,int e) {
    	 if(s==e) {
    		 tree[node]=arr[s];
    		 return ;
    	 }
    	 int mid=(s+e)/2;
    	 build(2*node,s,mid);
    	 build(2*node+1,mid+1,e);
    	 tree[node]=Math.max(tree[2*node],tree[2*node+1]);
     }
	    void update(int pos, int val) {
	    	
             update(1,0,arr.length-1,pos,val);
             
	    }
  public void update(int node,int s,int e,int p,int val) {
	  int mid=(s+e)/2;
	  if(s==e) {
		  arr[s]=val;
		 tree[node]=val; 
	  }
	  else {
		  if(p<=mid){
				 update(2*node,s,mid,p,val);
			}
		  else {
				  update(2*node+1,mid+1,e,p,val);
		}
		  tree[node]=Math.max(tree[node*2],tree[node*2+1]);
	  }
  }
	    public int query(int node ,int s,int e,int l,int r) {
	    	if(e<l || s>r) {
	    		return Integer.MIN_VALUE;
	    	}
	    	if(l<=s && e<=r) {
	    		return tree[node];
	    	}
	    	else {
	    		int mid=(s+e)/2;
	    		int left=query(2*node,s,mid,l,r);
	    		int right=query(2*node+1,mid+1,e,l,r);
	    		return Math.max(left, right);
	    	}
	    }
	    int query(int l, int r) {
             return query(1,0,arr.length-1,l,r);
	    }

	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int arr[] = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = Integer.parseInt(read.readLine());
	    }

	    SegmentTree obj = new SegmentTree(arr);

	    int q = Integer.parseInt(read.readLine());

	    StringBuilder out = new StringBuilder();
	    while (q-- > 0) {
	      String[]inp = read.readLine().split(" ");

	      int t = Integer.parseInt(inp[0]);
	      int l = Integer.parseInt(inp[1]);
	      int r = Integer.parseInt(inp[2]);

	      if (t == 0) {
	        obj.update(l, r);
	      } else {
	        int ans = obj.query(l, r);
	        out.append(ans);
	        out.append("\n");
	      }
	    }

	    System.out.println(out);
	  }

	}
*/
/*public class segment {

	  public static class SegmentTree {
           int tree[];
           int arr[];
	    SegmentTree(int a[]) {
            arr=a;
            tree=new int[arr.length*4];
            build(1,0,arr.length-1);
	    }
      public void build(int node ,int s,int e) {
    	  if(s==e) {
    		  tree[node]=arr[s];
    		  return ;
    	  }
    	  int mid=(s+e)/2;
    	  int l=node*2;
    	  int r=node*2+1;
    	  build(l,s,mid);
    	  build(r,mid+1,e);
    	  tree[node]=tree[l]+tree[r];
      }
	    void update(int pos, int val) {
         update(1,0,arr.length-1,pos,val);
      
	    }
	    public void update(int node ,int s,int e,int pos,int val) {
	    	int mid=(s+e)/2;
	    	if(s==e) {
	    		arr[pos]=val;
	    		tree[node]=val;
	    		return ;
	    	}
	    	else {
	    		if(pos<=mid) {
	    			update(node*2,s,mid,pos,val);
	    		}
	    		else {
	    			update(node*2+1,mid+1,e,pos,val);
	    		}
	    		tree[node]=tree[node*2]+tree[node*2+1];
	    	}
	    }

	    int query(int l, int r) {
          return query(1,0,arr.length-1,l,r);
	    }
   public int query(int node ,int s,int e,int l,int r) {
	   if(e<l || r<s) {
		   return 0;
	   }
	   if(s>=l && e<=r) {
		   return tree[node];
	   }
	   else {
		   int mid=(s+e)/2;
		   int left=query(2*node,s,mid,l,r);
		   int right=query(2*node+1,mid+1,e,l,r);
		   return left+right;
	   }
   }
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int arr[] = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = Integer.parseInt(read.readLine());
	    }

	    SegmentTree obj = new SegmentTree(arr);

	    int q = Integer.parseInt(read.readLine());

	    StringBuilder out = new StringBuilder();
	    while (q-- > 0) {
	      String[]inp = read.readLine().split(" ");

	      int t = Integer.parseInt(inp[0]);
	      int l = Integer.parseInt(inp[1]);
	      int r = Integer.parseInt(inp[2]);

	      if (t == 0) {
	        obj.update(l, r);
	      } else {
	        int ans = obj.query(l, r);
	        out.append(ans);
	        out.append("\n");
	      }
	    }

	    System.out.println(out);
	  }

	}

*/
// update value int given interval 
// i.e 1 2 6   1 se 2 ke value ko +6 karna hai
public class segment {

	  public static class SegmentTree {
        int tree[];
        int arr[];
	    SegmentTree(int a[]) {
            arr=a;
            tree=new int[arr.length*4];
            build(1,0,arr.length-1);
	    }
	    public void build(int node ,int s,int e) {
	    	if(s==e) {
	    		tree[node]=arr[s];
	    		return ;
	    	}
	    	else {
	    		int mid=(s+e)/2;
	    		build(node*2,s,mid);
	    		build(2*node+1,mid+1,e);
	    	}
	    }

	    void update(int l, int r, int val) {
          update(1,0,arr.length-1,l,r,val);
	    }
	    public void update(int node,int s,int e,int l,int r,int val) {
	    	if(e<l || s>r) {
	    		return ;
	    	}
	    	if(s==e) {
	    		tree[node]+=val;
	    		arr[s]+=val;
	    		return ;
	    	}
	    	else if(l<=s && e<=r) {
	    		tree[node]+=val;
	    	}
	    	else {
	    		int mid=(s+e)/2;
	    		update(2*node,s,mid,l,r,val);
	    		update(2*node+1,mid+1,e,l,r,val);
	    	}
	    }

	    int query(int ind) {
              return query(1,0,arr.length-1,ind);
	    }
    public int query(int node,int s,int e,int idx) {
    	if(s==e) {
    		return tree[node];
    	}
    	else  {
    		int mid=(s+e)/2;
    		tree[node*2]+=tree[node];
    		tree[node*2+1]+=tree[node];
    		tree[node]=0;
    		if(s<=idx && idx<=mid) {
    		return	query(2*node,s,mid,idx);
    		}
    		else {
    		  return query(2*node+1,mid+1,e,idx);
    		}
    	}
    }
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(read.readLine());
	    int arr[] = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = Integer.parseInt(read.readLine());
	    }

	    SegmentTree obj = new SegmentTree(arr);

	    int q = Integer.parseInt(read.readLine());

	    StringBuilder out = new StringBuilder();
	    while (q-- > 0) {
	      String[]inp = read.readLine().split(" ");

	      int t = Integer.parseInt(inp[0]);

	      if (t == 0) {
	        int ind = Integer.parseInt(inp[1]);
	        long ans = obj.query(ind);
	        out.append(ans + "\n");
	      } else {
	        int l = Integer.parseInt(inp[1]);
	        int r = Integer.parseInt(inp[2]);
	        int val = Integer.parseInt(inp[3]);
	        obj.update(l, r, val);
	      }
	    }

	    System.out.println(out);
	  }

	}












































































































































