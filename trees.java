
import java.util.*;
/*
15
1
1
-1
1
1
-1
1
-1
-1
1
-1
-1
1
-1
-1
 */
// min camera in binary tree
/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
  static int cameras=0;
    public static int MinCamerasInBT(TreeNode root) {
    	int t=findmincamers(root);
    	if(t==-1) {
    		cameras++;
    	}
        return cameras;
    }
    public static int findmincamers(TreeNode root) {
    	if(root==null) {
    		return 1;
    	}
    	int lc=findmincamers(root.left);
    	int rc=findmincamers(root.right);
    	if(lc==-1|| rc==-1) {
    		cameras++;
    		return 0;
    	}
    	if(lc==0 || rc==0) {
    		return 1;
    	}
    	else {
    		return -1;
    	}
    }

    // input_Section_====================================================================

    public static TreeNode createTree(int[] arr, int idx[]) {
        if (idx[0] > arr.length || arr[idx[0]] == -1){
            idx[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[idx[0]++]);
        
        node.left = createTree(arr, idx);
       
        
        node.right = createTree(arr, idx);
          
        return node;
    }
   public static void print(TreeNode root) {
	   if(root==null) {
		   return ;
	   }
	   System.out.println(root.val);
	   print(root.left);
	   print(root.right);
   }
    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int []idx=new int[1];
        TreeNode root = createTree(arr, idx);
      //  print(root);
        System.out.println(MinCamerasInBT(root));

    }

    public static void main(String[] args) {
        solve();
    }
}*/
/*
13
7
3
2
-1
-1
5
-1
-1
10
-1
12
-1
-1
 */
// is vailed bst
/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
  static int pre=Integer.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
    	if(root==null) {
    		return true;
    	}
    	if(!isValidBST(root.left)) {
    		return false;
    	}
    	if(pre>root.val) {
    		return false;
    	}
    	pre=root.val;
    	if(!isValidBST(root.right)) {
    		return false;
    	}
    	return true;
    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
            IDX[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);
        System.out.println(isValidBST(root));
    }

    public static void main(String[] args) {
        solve();
    }
}*/
// bst from preorder
/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode bstFromPreorder(int[] pre) {
    	TreeNode root=bstFromPre(pre,0,pre.length-1);
        return root;
    }
    public static TreeNode bstFromPre(int pre[],int s,int e) {
    	if(s>e) {
    		return null;
    	}
    	TreeNode root=new TreeNode(pre[s]);
    	int idx=s;
    	while(pre[s]>=pre[idx]) {
    		idx++;
    	}
    	System.out.println(idx-s);
    	int c=idx-s;
    	root.left=bstFromPre(pre,s+1,s+c-1);
    	root.right=bstFromPre(pre,s+c,e);
    	return root;
    }
    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = bstFromPreorder(pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
*/
// house robery in binary tree
/*
15
1
1
-1
1
1
-1
1
-1
-1
1
-1
-1
1
-1
-1
*/
/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
//  static class HousePair{
//	  int withRobber=0;
//	  int withoutRobber=0;
//  }
//  public static HousePair House_pairHelper(TreeNode root) {
//	  if(root==null) {
//		  return new HousePair();
//	  }
//	  HousePair left=House_pairHelper(root.left);
//	  HousePair right=House_pairHelper(root.right);
//	  HousePair p=new HousePair();
//	  p.withoutRobber=Math.max(left.withoutRobber,left.withRobber)+
//			  Math.max(right.withoutRobber,right.withRobber);
//	  p.withRobber=left.withoutRobber+right.withoutRobber+root.val;
//	  return p;
//  }
//    public static int HouseRobber(TreeNode root) {
//    HousePair p=House_pairHelper(root);
//    			
//        return Math.max(p.withoutRobber, p.withRobber);
//    }
         // isko array ke use se bhi kar sakte hai 
public static int[] House_pairHelper(TreeNode root) {
	  if(root==null) {
		  return new int[2];
	  }
	  int left[]=House_pairHelper(root.left);
	  int right[]=House_pairHelper(root.right);
	  int myres[]=new int[2];
	  myres[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
	  myres[1]=left[0]+root.val+right[0];
	  return myres;
}
  public static int HouseRobber(TreeNode root) {
  int ans[]=House_pairHelper(root);
  			
      return Math.max(ans[0],ans[1]);
 }

    // input_Section_====================================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
            IDX[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);
        System.out.println(HouseRobber(root));
    }

    public static void main(String[] args) {
        solve();
    }
}*/
// longest Zig zag path 
/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
  static class pair{
	  int leftlen=0;
	  int rightlen=0;
	  int maxlen=0;
	  public pair() {
		  
	  }
	  public pair(int l,int r) {
		  leftlen=l;
		  rightlen=r;
	  }
  }
  
  public static pair longestZigZagPathHelper(TreeNode root) {
	  if(root==null) {
		  return new pair(-1,-1);
	  }
	  pair left=longestZigZagPathHelper(root.left);
	  pair right=longestZigZagPathHelper(root.right);
	  pair mypair=new pair();
	  mypair.leftlen=left.rightlen+1;
	  mypair.rightlen=right.leftlen+1;
	  mypair.maxlen=Math.max(Math.max(mypair.leftlen,mypair.rightlen), Math.max(left.leftlen, right.rightlen));
	  return mypair;
  }
    public static int longestZigZagPath(TreeNode root) {
    	pair p=longestZigZagPathHelper(root);
        return Math.max(Math.max(p.leftlen,p.rightlen),p.maxlen);
    }

    // input_Section_====================================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    
    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        System.out.println(longestZigZagPath(root));
    }

    public static void main(String[] args) {
        solve();
    }
}
*/

/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
 static int pre=Integer.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
    	if(root==null) {
    		return true;
    	}
    	if(!isValidBST(root.left)) {
    		return false;
    	}
    	if(pre>root.val) {
    		return false;
    	}
    	pre=root.val;
    	if(!isValidBST(root.right)) {
    		return false;
    	}
        return true;
    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
            IDX[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);
        System.out.println(isValidBST(root));
    }

    public static void main(String[] args) {
        solve();
    }
}
*/
/*public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode constructFromInOrder(int[] inOrder) {
    	TreeNode root=constructHelper(inOrder,0,inOrder.length-1);
        return root;
    }
    public static TreeNode constructHelper(int [] in,int l,int h) {
    	if(l>h) {
    		return null;
    	}
    	int mid=(l+h)/2;
    	TreeNode node=new TreeNode(in[mid]);
    	node.left=constructHelper(in,l,mid-1);
    	node.right=constructHelper(in,mid+1,h);
    	return node;
    	
    }
    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < n; i++)
            in[i] = scn.nextInt();

        TreeNode root = constructFromInOrder(in);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
*/
//serailize and deserialize binaryTree
public class trees {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
  public static void serializeHelper(TreeNode root,StringBuilder sb) {
	  if(root==null) {
		  sb.append("null,");
		  return ;
	  }
	  sb.append(root.val+",");
	  serializeHelper(root.left,sb);
	  serializeHelper(root.right,sb);
	  
  }
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
    	StringBuilder sb=new StringBuilder();
            serializeHelper(root,sb);
            return sb.toString();
    }
  static class pair{
	  int state;
	  TreeNode node;
	  public pair(TreeNode node,int s) {
		  this.node=node;
		  state=s;
	  }
  }
    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String str) {
           String s[]=str.split(",");
           TreeNode root=new TreeNode(Integer.parseInt(s[0]));
           Stack<pair> st=new Stack<>();
           st.push(new pair(root,0));
           int idx=0;
           while(st.size()>0) {
        	   pair p=st.peek();
        	   if(p.state==0) {
        		   idx++;
        		   String si=s[idx];
        		  if(si.equals("null")==false) {
        			  TreeNode node=new TreeNode(Integer.parseInt(si));
        			  p.node.left=node;
        			  st.push(new pair(node,0));
        			 
        		  }
        		  p.state++;
        	   }
        	   else if(p.state==1) {
        		   idx++;
        		   String si=s[idx];
        		  if(si.equals("null")==false) {
        			  TreeNode node=new TreeNode(Integer.parseInt(si));
        			  p.node.right=node;
        			  st.push(new pair(node,0));
        			 
        		  }
        		  p.state++;
        	   }
        	   else {
        		   st.pop();
        	   }
           }
        return  root;
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        String s = serialize(root);
        //System.out.println(s);
       display(deserialize(s));
    }

    public static void main(String[] args) {
        solve();
    }
}














































































































































































































































































































































