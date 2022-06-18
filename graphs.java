
import java.io.*;
import java.text.NumberFormat;
import java.util.*;

/*public class graphs {
	static class edges{
		int sr;
		int ds;
		int wt;
		public edges(int s,int d,int w) {
			sr=s;
			ds=d;
			wt=w;
		}
	}

	public static void main(String[] args) {
		ArrayList<edges> []graph=new ArrayList[7];
		for(int i=0;i<7;i++) {
			graph[i]=new ArrayList<edges>();
		}
		graph[0].add(new edges(0,1,10));
		graph[0].add(new edges(0,3,40));
		
		graph[1].add(new edges(1,0,10));
		graph[1].add(new edges(1,2,10));
		
		graph[2].add(new edges(2,1,10));
		graph[2].add(new edges(2,3,10));
		
		graph[3].add(new edges(3,0,40));
		graph[3].add(new edges(3,2,10));
		graph[3].add(new edges(3,4,2));
		
		graph[4].add(new edges(4,3,2));
		graph[4].add(new edges(4,5,3));
		graph[4].add(new edges(4,6,8));
		
		graph[5].add(new edges(5,4,3));
		graph[5].add(new edges(5,6,3));
		
		graph[6].add(new edges(6,4,8));
		graph[6].add(new edges(6,5,3));
		
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[i].size();j++) {
				edges e=graph[i].get(j);
				System.out.println(e.sr+" "+e.ds+" @ "+e.wt);
			}
		}
	}

}*/
/*inputs
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
0
6
 */
/*class graphs{
	static class edge{
	  int sr;
	  int nbr;
	  int wt;
	  public edge(int sr,int nbr,int wt) {
		  this.sr=sr;
		  this.nbr=nbr;
		  this.wt=wt;
	  }
	}
	static class pair implements Comparable<pair>{
		String str;
		int wt;
		public pair(String str,int wt ) {
			this.str=str;
			this.wt=wt;
		}
		public int compareTo(pair p) {
			return this.wt-p.wt;
		}
	}
	public static boolean haspath(ArrayList<edge> []graph,int sr,int ds,boolean[] visited) {
		if(sr==ds) {
			return true;
		}
		visited[sr]=true;
	
		for(edge e : graph[sr]) {
		     if(visited[e.nbr]==false) {
		    	 boolean nbrhasp=haspath(graph,e.nbr,ds,visited);
		    		 if(nbrhasp==true) {
		    			 return true;
		    		 }
		    	 }
		     }
		
		return false;
	}
	public static void printallpath(ArrayList<edge> []graph,int sr,int ds,boolean[] visited,String psf) {
		if(sr==ds) {
			psf=psf+sr+".";
			System.out.println(psf);
			return ;
		}
		visited[sr]=true;
		for(edge e : graph[sr]) {
			if(visited[e.nbr]==false) {
				printallpath(graph,e.nbr,ds,visited,psf+sr+" ");
			}
		}
		visited[sr]=false;
	}
	static int largestpath=Integer.MIN_VALUE;
	static String largestpsf="";
	static int smallestpath=Integer.MAX_VALUE;
	static String smallestpsf="";
	static int cil=Integer.MAX_VALUE;
	static String cillpsf="";
	static int floor=Integer.MIN_VALUE;
	static String floorpsf="";
	static PriorityQueue<pair> pq=new PriorityQueue<>();
	
	public static void printallpath(ArrayList<edge> []graph,int sr,int ds,boolean[] visited,String psf,int sum,int cillvalue,int k) {
		if(sr==ds) {
			
			if(sum>largestpath) {
				largestpath=sum;
				largestpsf=psf;
			}
			//System.out.println(psf);
			if(sum<smallestpath) {
				smallestpath=sum;
				smallestpsf=psf;
			}
			if(sum>cillvalue && sum<cil) {
				cil=sum;
			  cillpsf=psf;
			}
			if(sum<cillvalue && sum>floor) {
				floor=sum;
				floorpsf=psf;
			}
			if(pq.size()<k) {
			pq.add(new pair(psf,sum));
			
			}
			else {
			   pair p=pq.peek();
			   if(sum>p.wt) {
				   pq.remove();
				   pq.add(new pair(psf,sum));
			   }
			}
			return ;
		}
		visited[sr]=true;
		for(edge e : graph[sr]) {
			if(visited[e.nbr]==false) {
				printallpath(graph,e.nbr,ds,visited,psf+e.nbr+" ",sum+e.wt,cillvalue,k);
			}
		}
		visited[sr]=false;
	}
	  public static void main(String [] args) throws NumberFormatException, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  int wt=Integer.parseInt(s.split(" ")[2]);
			  graph[v1].add(new edge(v1,v2,wt));
			  graph[v2].add(new edge(v2,v1,wt));
		  }
		  int src=Integer.parseInt(br.readLine());
		  int dest=Integer.parseInt(br.readLine());
		  boolean []visited=new boolean[vertices];
		 // boolean path=haspath(graph,src,drs,visited);
	     // System.out.println(path); 
		 // printallpath(graph,src,dest,visited,"");
		  printallpath(graph,src,dest,visited,src+" ",0,40,3); 
		  System.out.println(largestpsf+" @ "+largestpath);
		  System.out.println(smallestpsf+" @ "+smallestpath);
		  System.out.println(cillpsf+" @ "+cil);
		  System.out.println(floorpsf+" @ "+floor);
		  pair p=pq.peek();
		  System.out.println(p.str+" @ "+p.wt);
		  
	  }
	
}*/
/*
7
5
0 1 10
2 3 10
4 5 10
5 6 10
4 6 10
 */
/*class graphs{
	static class edge{
		  int sr;
		  int nbr;
		  int wt;
		  public edge(int sr,int nbr,int wt) {
			  this.sr=sr;
			  this.nbr=nbr;
			  this.wt=wt;
		  }
		}
	public static void connectedcomp(ArrayList<edge> []graph,int i,ArrayList<Integer> all,boolean []visited){
		visited[i]=true;
		all.add(i);
	   for(edge e :graph[i]) {
		      if(visited[e.nbr]==false) {
			   connectedcomp(graph,e.nbr,all,visited);
		   }
		  
	   }
		
		
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  int wt=Integer.parseInt(s.split(" ")[2]);
			  graph[v1].add(new edge(v1,v2,wt));
			  graph[v2].add(new edge(v2,v1,wt));
		  }
		boolean visited[]=new boolean[vertices];
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		for(int i=0;i<graph.length;i++) {
			
			if(visited[i]==false) {
			ArrayList<Integer> all=new ArrayList<>();
			connectedcomp(graph,i,all,visited);
			al.add(all);
			}
			
		}
		System.out.println(al);
		boolean isgraphisconnected;
		if(al.size()==1) {
			isgraphisconnected=true;
		}
		else {
			isgraphisconnected=false;
		}
		System.out.println(isgraphisconnected);
	}
}*/
/*
8
8
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
1 1 1 1 1 1 1 0
1 1 0 0 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 1 1 1 0
1 1 1 1 1 1 1 0
 */
/*class graphs{
	public static void numberofIseland(int [][]graph,int sri,int srj,boolean visited[][]) {
		if(sri<0 || srj<0 || sri>=graph.length || srj>=graph[0].length || graph[sri][srj]==1 || visited[sri][srj]==true) {
			return ;
		}
		visited[sri][srj]=true;
		numberofIseland(graph,sri+1,srj,visited);
		numberofIseland(graph,sri-1,srj,visited);
		numberofIseland(graph,sri,srj+1,visited);
		numberofIseland(graph,sri,srj-1,visited);
		
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int m=Integer.parseInt(br.readLine());
  int n=Integer.parseInt(br.readLine());
  int graph[][]=new int[m][n];
  for(int i=0;i<m;i++) {
	  String s=br.readLine();
	  String []str=s.split(" ");
	  for(int j=0;j<n;j++) {
		graph[i][j]=Integer.parseInt(str[j]); 
	  }
	  
  }
  int count=0;
  boolean visited[][]=new boolean[m][n];
  for(int i=0;i<m;i++) {
	  for(int j=0;j<n;j++) {
		  if(graph[i][j]==0 && visited[i][j]==false) {
			 numberofIseland(graph,i,j,visited);
			 count++;
			 System.out.println(i+" "+j);
		  }
	  }
	  
  }
  System.out.println(count);
	}
}*/
//perfect friend problrm
/*
7
5
0 1
2 3
4 5
5 6
4 6
 */
/*class graphs{
	static class edge{
		  int sr;
		  int nbr;
		 
		  public edge(int sr,int nbr) {
			  this.sr=sr;
			  this.nbr=nbr;
			 
		  }
		}
	public static void connectedcomp(ArrayList<edge> []graph,int i,ArrayList<Integer> all,boolean []visited){
		visited[i]=true;
		all.add(i);
	   for(edge e :graph[i]) {
		      if(visited[e.nbr]==false) {
			   connectedcomp(graph,e.nbr,all,visited);
		   }
		  
	   }
		
		
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			 
			  graph[v1].add(new edge(v1,v2));
			  graph[v2].add(new edge(v2,v1));
		  }
		boolean visited[]=new boolean[vertices];
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		for(int i=0;i<graph.length;i++) {
			
			if(visited[i]==false) {
			ArrayList<Integer> all=new ArrayList<>();
			connectedcomp(graph,i,all,visited);
			al.add(all);
			}
			
		}
	int totalpair=0;
	for(int i=0;i<al.size();i++) {
		for(int j=i+1;j<al.size();j++) {
			totalpair +=al.get(i).size()*al.get(j).size();
		}
	}
	System.out.println(totalpair);
	}
}*/
/*
7
9
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
2 5 10
0
 */
/*class graphs{
	static class edge{
		  int sr;
		  int nbr;
		 
		  public edge(int sr,int nbr) {
			  this.sr=sr;
			  this.nbr=nbr;
			 
		  }
		}
	public static void printHamiltonianPath(ArrayList<edge> []graph,int i,String psf,boolean []visited) {
		if(psf.length()==graph.length) {
		  // System.out.println(psf);
			char c=psf.charAt(0);
			char l=psf.charAt(psf.length()-1);
			int s=c-'0';
			int d=l-'0';
			int cycle=0;
			for(edge e : graph[d]) {
				if(e.nbr==s) {
					cycle=1;
					break;
				}
			}
			if(cycle==0) {
				System.out.println(psf+".");
			}
			else {
				System.out.println(psf+"*");
			}
			
		}
		visited[i]=true;
		for(edge e : graph[i]) {
			if(visited[e.nbr]==false) {
				printHamiltonianPath(graph,e.nbr,psf+e.nbr,visited);
			}
		}
		visited[i]=false;
		
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  graph[v1].add(new edge(v1,v2));
			  graph[v2].add(new edge(v2,v1));
		  }	
		  boolean b[]=new boolean[vertices];
		  int src=Integer.parseInt(br.readLine());
		  printHamiltonianPath(graph,src,src+"",b);
	}
}*/
/*class graphs{
	public static void main(String [] args) {
		int n=8;
		
		int visited[][]=new int[n][n];
		printKnighttour(0,1,visited,1);
	}
	public static void printKnighttour(int i,int j,int[][]visited,int count) {
		if(i<0 || j<0 || i>=visited.length || j>=visited[0].length || visited[i][j]>0) {
			return ;
		}
	    else if(count==64) {
			visited[i][j]=count;
			
			print(visited);
			visited[i][j]=0;
			return ;
		}
		visited[i][j]=count;
		printKnighttour(i+2,j+1,visited,count+1);
		printKnighttour(i+1,j+2,visited,count+1);
		printKnighttour(i+2,j-1,visited,count+1);
		printKnighttour(i+1,j-2,visited,count+1);
		printKnighttour(i-2,j+1,visited,count+1);
		printKnighttour(i-1,j+2,visited,count+1);
		printKnighttour(i-2,j-1,visited,count+1);
		printKnighttour(i-1,j-2,visited,count+1);
		visited[i][j]=0;
	}
public static void print(int [][]arr) {
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
}

}*/
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
2
 */
/*class graphs{
	static class edge{
		int sr;
		int dst;
		public edge(int sr,int dst) {
			this.sr=sr;
			this.dst=dst;
		}
	}
	static class pair{
		int v;
		String path;
		public pair(int l,String s) {
			v=l;
			path=s;
		}
	}
	public static void printBFS(ArrayList<edge> []graph,int src,boolean []visited) {
	  Queue<pair> q=new ArrayDeque<>();
	   q.add(new pair(src,src+""));
	   visited[src]=true;
	  while(q.size()>0) {
		 pair p=q.remove();
		 System.out.println(p.v+"@"+p.path);
		 for(edge e : graph[p.v]) {
			 if(visited[e.dst]==false) {
				 visited[e.dst]=true;
				 q.add(new pair(e.dst,p.path+e.dst));
			 }
		 }
	  }
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			 
			  graph[v1].add(new edge(v1,v2));
			  graph[v2].add(new edge(v2,v1));
		  }	
		  int src=Integer.parseInt(br.readLine());
		  boolean visited[]=new boolean[vertices];
		  printBFS(graph,src,visited);
	}
}*/
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
 */
/*
5
4
0 1
1 2
2 3
3 4
 */
/*
7
5
0 1
2 3
4 5
4 6
5 6
 */
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		public edge(int sr,int nbr) {
			this.sr=sr;
			this.nbr=nbr;
		}
	}
	static class pair{
		int v;
		String path;
		public pair(int l,String s) {
			v=l;
			path=s;
		}
	}
	public static boolean isCyclepresent(ArrayList<edge> []graph,int sr,boolean []visited) {
		
		Queue<Integer> q=new ArrayDeque<>();
		q.add(sr);
		
		while(q.size()>0) {
			int t=q.remove();
			if(visited[t]==true) {
				return true;
			}
			else {
			visited[t]=true;
			for(edge e : graph[t]) {
				if(visited[e.nbr]==false) {
				q.add(e.nbr);
				}
			}
			}
		}
	return false;	
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			 
			  graph[v1].add(new edge(v1,v2));
			  graph[v2].add(new edge(v2,v1));
		  }	
		  boolean []visited=new boolean[vertices];
		  for(int i=0;i<vertices;i++) {
			  if(visited[i]==false) {
				boolean b=isCyclepresent(graph,i,visited);
				if(b==true) {
					System.out.println(true);
					return ;
				}
			  }
		  }
		  System.out.println(false);
	}
}*/
/*
5
4
0 1
1 2
2 3
3 4
 */
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
 */
/*
7
5
0 1
2 3
4 5
4 6
5 6
 */
/*
4
4
0 1
0 3
1 2
2 3
 */
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		public edge(int sr,int nbr) {
			this.sr=sr;
			this.nbr=nbr;
		}
	}
	static class pair{
		int v;
		int level;
		public pair(int v,int l) {
			this.v=v;
			level=l;
		}
	}
	public static boolean isBipartitr(ArrayList<edge> []graph,int src,int []visited) {
		Queue<pair> q=new ArrayDeque<>();
		q.add(new pair(src,0));
		while(q.size()>0) {
			pair p=q.remove();
			if(visited[p.v]!=-1) {
			   if(visited[p.v]!=p.level) {
				 
				   return false;
			   }
			}
			visited[p.v]=p.level;
			for(edge e : graph[p.v]) {
				if(visited[e.nbr]==-1) {
					q.add(new pair(e.nbr,p.level+1));
				}
			}
		}
		
		return true;
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			 
			  graph[v1].add(new edge(v1,v2));
			  graph[v2].add(new edge(v2,v1));
		  }	
		  int []visited=new int[vertices];
		  Arrays.fill(visited,-1);
		  
		  for(int i=0;i<vertices;i++) {
			  if(visited[i]==-1) {
				boolean b=isBipartitr(graph,i,visited);
				if(b==false) {
					System.out.println(false);
					return ;
				}
			  }
		  }
		  System.out.println(true);
	}
}*/
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
0
3
 */
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		public edge(int sr,int nbr) {
			this.sr=sr;
			this.nbr=nbr;
		}
	}
	static class pair{
		int v;
		int level;
		public pair(int v,int l) {
			this.v=v;
			level=l;
		}
	}
	public static int virousInfection(ArrayList<edge> []graph,int src,int time,boolean []visited) {
		int count =0;
		Queue<pair> q=new ArrayDeque<>();
		q.add(new pair(src,1));
		while(q.size()>0) {
			pair p=q.remove();
			if(visited[p.v]==true) {
				continue;
			}
			if(p.level<=time) {
			visited[p.v]=true;
			count++;
			for(edge e : graph[p.v]) {
				if(visited[e.nbr]==false) {
				q.add(new pair(e.nbr,p.level+1));
				}
			}
		}
			else {
				break;
			}
		}
		return count;
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			 
			  graph[v1].add(new edge(v1,v2));
			  graph[v2].add(new edge(v2,v1));
		  }	
		  int src=Integer.parseInt(br.readLine());
		  int time=Integer.parseInt(br.readLine());
		  boolean []visited=new boolean[vertices];
		  
		 int infectedp=virousInfection(graph,src,time,visited);
		 System.out.println(infectedp);
	}
}*/
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
0
 */
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		int wt;
		public edge(int sr,int nbr,int wt) {
			this.sr=sr;
			this.nbr=nbr;
			this.wt=wt;
		}
	}
   static class pair implements Comparable<pair>{
    	int sr;
    	String path;
    	int wt;
    	public pair(int sr,String s,int wt) {
    		this.sr=sr;
    		this.path=s;
    		this.wt=wt;
    	}
		
		public int compareTo(pair o) {
			
			return this.wt-o.wt;
		}
    }
   public static void printShotestPathDijkstra(ArrayList<edge> []graph,int src,boolean []visited) {
	   PriorityQueue<pair> pq=new PriorityQueue<>();
	   pq.add(new pair(src,src+"",0));
	   while(pq.size()>0) {
		   pair p=pq.remove();
		   if(visited[p.sr]==true) {
			   continue;
		   }
		   visited[p.sr]=true;
		   System.out.println(p.sr+"@"+p.path+"@"+p.wt);
		   for(edge e : graph[p.sr]) {
			   if(visited[e.nbr]==false) {
				   pq.add(new pair(e.nbr,p.path+e.nbr,p.wt+e.wt));
			   }
		   }
	   }
   }
	 public static void main(String [] args) throws NumberFormatException, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  int wt=Integer.parseInt(s.split(" ")[2]);
			  graph[v1].add(new edge(v1,v2,wt));
			  graph[v2].add(new edge(v2,v1,wt));
		  }
		  int src=Integer.parseInt(br.readLine());
		  boolean []visited=new boolean[vertices];
		  printShotestPathDijkstra(graph,src,visited);
}

}*/
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
0
 */
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 25
3 4 2
4 5 3
5 6 3
4 6 8
0
 */
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		int wt;
		public edge(int sr,int nbr,int wt) {
			this.sr=sr;
			this.nbr=nbr;
			this.wt=wt;
		}
	}
   static class pair implements Comparable<pair>{
    	int sr;
    	int via;
    	int wt;
    	public pair(int sr,int s,int wt) {
    		this.sr=sr;
    		this.via=s;
    		this.wt=wt;
    	}
		
		public int compareTo(pair o) {
			
			return this.wt-o.wt;
		}
    }
public static void MST_Prims(ArrayList<edge> []graph,int src,boolean [] visited) {
	  PriorityQueue<pair> pq=new PriorityQueue<>();
	  pq.add(new pair(src,-1,0));
	  while(pq.size()>0) {
		  pair p=pq.remove();
		  if(visited[p.sr]==true) {
			  continue;
		  }
		  visited[p.sr]=true;
		  if(p.via!=-1) {
		 System.out.println(p.sr+" @ "+p.via+" @ "+p.wt);
		  }
        for(edge e : graph[p.sr]) {    
        	if(visited[e.nbr]==false) {
        	   pq.add(new pair(e.nbr,p.sr,e.wt));	
        	}
        }
	  }
}
	 public static void main(String [] args) throws NumberFormatException, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  int wt=Integer.parseInt(s.split(" ")[2]);
			  graph[v1].add(new edge(v1,v2,wt));
			  graph[v2].add(new edge(v2,v1,wt));
		  }
		  int src=Integer.parseInt(br.readLine());
		  boolean []visited=new boolean[vertices];
		  
		  MST_Prims(graph,src,visited);
}
}*/
/*
7
8
0 1
0 3
1 2
2 3
4 3
4 5
5 6
4 6
*/
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		public edge(int sr,int nbr) {
			this.sr=sr;
			this.nbr=nbr;
		}
	}
	public static void topologicalsort(ArrayList<edge> []graph,int sr
			                                    ,boolean []visited,Stack<Integer> stn) {
		if(visited[sr]==true) {
			return ;
		}
		visited[sr]=true;
		for(edge e : graph[sr]) {
			topologicalsort(graph,e.nbr,visited,stn);
		}
		stn.add(sr);
	}
	 public static void main(String [] args) throws NumberFormatException, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			 
			  graph[v1].add(new edge(v1,v2));
			 
		  }
		 Stack<Integer> st=new Stack<>();
		  boolean []visited=new boolean[vertices];
		  for(int i=0;i<vertices;i++) {
			  if(visited[i]==false) {
				 topologicalsort(graph,i,visited,st);
				 
			  }
		  }
		 
		  while(st.size()>0) {
			  System.out.println(st.pop());
		  }
	 }
}*/
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 25
3 4 2
4 5 3
5 6 3
4 6 8
0
 */
/*class graphs{
	static class edge{
		int sr;
		int nbr;
		int wt;
		public edge(int sr,int nbr,int wt) {
			this.sr=sr;
			this.nbr=nbr;
			this.wt=wt;
		}
	}
	static class pair{
		int sr;
		String path;
		public pair(int sr,String s) {
			this.sr=sr;
			this.path=s;
		}
	}
	public static void printItrrative(ArrayList<edge> []graph,int sr,boolean [] visited) {
		Stack<pair> st=new Stack<>();
		st.add(new pair(sr,sr+""));
		while(st.size()>0) {
			pair p=st.pop();
			if(visited[p.sr]==true) {
				continue ;
			}
			visited[p.sr]=true;
			System.out.println(p.sr+"@"+p.path);
			for(edge e : graph[p.sr]) {
				if(visited[e.nbr]==false) {
					st.add(new pair(e.nbr,p.path+e.nbr));
				}
			}
		}
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int vertices=Integer.parseInt(br.readLine());
		  ArrayList<edge> []graph=new ArrayList[vertices];
		  for(int i=0;i<vertices;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  int eg=Integer.parseInt(br.readLine());
		  for(int i=0;i<eg;i++) {
			  String s=br.readLine();
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  int wt=Integer.parseInt(s.split(" ")[2]);
			  graph[v1].add(new edge(v1,v2,wt));
			  graph[v2].add(new edge(v2,v1,wt));
		  }
		  int src=Integer.parseInt(br.readLine());
		  boolean visited[]=new boolean[vertices];
		  printItrrative(graph,src,visited);
	 }	  
}*/



















































































































































