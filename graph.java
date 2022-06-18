import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*import java.util.*;
import java.lang.*;
public class graph {
class vertiex{
	char lable;
	public vertiex(char lable) {
		this.lable=lable;
	}
}

int maxvertix=20;
int a[][];
int nvertix;
vertiex vertices[];
boolean isvisited[][]=new boolean[20][20];
public graph(){
	a=new int[maxvertix][maxvertix];
	vertices=new vertiex[maxvertix];
}
public void addvertix(char lable) {
	vertices[nvertix++]=new vertiex(lable);
	
}
public void addedge(int s,int e, int k) {
	a[s][e]=k;
	a[e][s]=k;
}
public void printvertix(int i) {
	System.out.println(vertices[i].lable);
}
public void printgraph() {
	for(int i=0;i<6;i++) {
		for(int j=0;j<6;j++)
		{	System.out.print(a[i][j]);}
		System.out.println();
		}
}
public int adjunvisitedvertix(int v) {
	for(int i=0;i<maxvertix;i++) {
		if(a[v][i]!=0 && isvisited[v][i]==false)
			return i;
	}
	return -1;
}
public void dfs(int i) {
	Stack<Integer> s=new Stack<Integer>();
 isvisited[i][i]=true;
 printvertix(i);
 s.add(i);
 while(!s.isEmpty()) {
	 int p=s.peek();
	 int v=adjunvisitedvertix(p);
	 if(v==-1)
	 {
		 s.pop();
	 }
	 else 
	 {   isvisited[v][v]=true;
		 s.add(v);
		 printvertix(v);
	 }
 }
}
public boolean allvisited() {
	for(int i=0;i<maxvertix;i++) {
		if(isvisited[i][i]==true)
			return true;
	}
	return false;
}
public static void main(String[] args) 
{
	graph g=new graph();
	g.addvertix('A');
	g.addvertix('B');
	g.addvertix('C');
	g.addvertix('D');
	g.addvertix('E');
	g.addvertix('F');
	g.addedge(3, 1,4);
	g.addedge(1, 2,6);
	g.addedge(2, 3,7);
	g.addedge(2, 4,8);
	g.addedge(0, 5,2);
	g.addedge(1, 5,3);
	g.dfs(0);
	System.out.println(g.allvisited());
	g.printgraph();

}
}
/*public class graph{
	static class edges{
		int sr;
		int nbr;
		int dt;
		public edges(int sr,int nbr ,int dt) {
			this.sr=sr;
			this.nbr=nbr;
			this.dt=dt;
		}
	}
	public static boolean haspat(ArrayList<edges> []g,int sr,int ds,boolean a[]) {
		if(sr==ds) {
			return true;
		}
		a[sr]=true;
		
		for(edges e : g[sr]) {
			if(a[e.nbr]==false) {
				boolean pathfromnext=haspat(g,e.nbr,ds,a);
				if(pathfromnext) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String []  args) {
		ArrayList<edges> []g =new ArrayList[5];
		for(int i=0;i<5;i++) {
			g[i]=new ArrayList<edges>();
		}
		g[0].add(new edges(0,1,5));
		g[0].add(new edges(0,2,6));
		g[1].add(new edges(1,0,5));
		g[1].add(new edges(1,3,5));
		g[1].add(new edges(1,5,5));
		g[2].add(new edges(2,0,6));
		g[2].add(new edges(2,3,5));
		g[3].add(new edges(3,2,5));
		g[5].add(new edges(5,1,5));
		
		g[2].add(new edges(2,1,5));
		boolean a[]=new boolean[5];
		boolean f=haspat(g,1,3,a);
		System.out.print(f);
		
		System.out.print(g[0].get(0).dt);
	}
}*/

/*public class graph{
	static class edges{
		int sr;
		int nbr;
		int dt;
		public edges(int sr,int nbr ,int dt) {
			this.sr=sr;
			this.nbr=nbr;
			this.dt=dt;
		}
	}

	public static void printpath(ArrayList<edges> []g,int sr,int ds,boolean a[],String s) {
		if(sr==ds) {
			System.out.println(s);
			return ;
		}
		a[sr]=true;
		
		for(edges e : g[sr]) {
			if(a[e.nbr]==false) {
				printpath(g,e.nbr,ds,a,s+e.nbr);
			}
		}
		a[sr]=false;
	}
	public static void main(String []  args) {
		ArrayList<edges> []g =new ArrayList[5];
		for(int i=0;i<5;i++) {
			g[i]=new ArrayList<edges>();
		}
		g[0].add(new edges(0,1,1));
		g[0].add(new edges(0,2,2));
		g[1].add(new edges(1,0,1));
		g[1].add(new edges(1,3,6));
		g[1].add(new edges(1,4,5));
		g[2].add(new edges(2,0,2));
		g[2].add(new edges(2,3,3));
		g[3].add(new edges(3,2,3));
		g[3].add(new edges(3,1,6));
		g[4].add(new edges(4,1,5));
		
		g[2].add(new edges(2,1,5));
		boolean a[]=new boolean[5];
		printpath(g,0,4,a,"0");
		
			}
}*/

/*public class graph{
	static class edges{
		int sr;
		int nbr;
		int dt;
		public edges(int sr,int nbr ,int dt) {
			this.sr=sr;
			this.nbr=nbr;
			this.dt=dt;
		}
	}
static int min=Integer.MAX_VALUE;
static int max=Integer.MIN_VALUE;
static String maxpath="";
static String minpsth="";
	public static void printpath(ArrayList<edges> []g,int sr,int ds,boolean a[],String s,int sum) {
		if(sr==ds) {
			if(sum>max) {
				max=sum;
				maxpath=s;
			}
			System.out.println(s);
			return ;
		}
		a[sr]=true;
		
		for(edges e : g[sr]) {
			if(a[e.nbr]==false) {
				printpath(g,e.nbr,ds,a,s+e.nbr,sum+e.dt);
			}
		}
		a[sr]=false;
	}
	public static void main(String []  args) {
		ArrayList<edges> []g =new ArrayList[5];
		for(int i=0;i<5;i++) {
			g[i]=new ArrayList<edges>();
		}
		g[0].add(new edges(0,1,1));
		g[0].add(new edges(0,3,5));
		g[1].add(new edges(1,0,1));
		g[1].add(new edges(1,2,2));
		g[2].add(new edges(2,3,3));
		g[2].add(new edges(2,1,2));
		g[3].add(new edges(3,2,3));
		g[3].add(new edges(3,0,5));
		g[3].add(new edges(3,4,4));
		g[4].add(new edges(4,3,4));
		boolean a[]=new boolean[5];
		printpath(g,0,4,a,"0",0);
		System.out.println(max);
		System.out.print(maxpath);
		
			}
}*/
/*public class graph{
	public static class edge{
		int v;
		int d;
		public edge(int v,int d) {
			this.d=d;
			this.v=v;
		}
	}
	public static void main(String [] args) throws NumberFormatException, IOException {
		System.out.print("enter graph instruction");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		ArrayList<edge> []graph=new ArrayList[n];
		for(int i=0;i<k;i++) {
			String line=br.readLine();
			int v1=Integer.parseInt(line.split(" ")[0]);
			int v2=Integer.parseInt(line.split(" ")[1]);
			graph[v1].add(new edge(v1,v2));
			graph[v2].add(new edge(v2,v1));
		}
		ArrayList<ArrayList<Integer>> comps=new ArrayList<>();
		boolean []visited=new boolean[n];
		for(int v=0;v<n;v++) {
			if(visited[v]==false) {
				ArrayList<Integer> comp=new ArrayList<>();
				allcomp(graph,v,visited,comp);
				comps.add(comp);
			}
		}
		
	}
	public static void allcomp(ArrayList<edge> []graph,int sr,boolean []visited,ArrayList<Integer> comp) {
	visited[sr]=true;
	comp.add(sr);
	for(edge e :graph[sr]) {
		if(visited[e.d]==false) {
			allcomp(graph,e.d,visited,comp);	
		}
	}
	}
}*/

/*public class graph{
	public static class edge{
		int v;
		int nbr;
		public edge(int v,int nbr) {
			this.v=v;
			this.nbr=nbr;
		}
		
	}
	public static void main(String [] args) {
		ArrayList<edge> []graph=new ArrayList[7];
		for(int i=0;i<7;i++) {
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new edge(0,1));
		graph[1].add(new edge(1,0));
		graph[2].add(new edge(2,3));
		graph[3].add(new edge(3,2));
		graph[4].add(new edge(4,5));
		graph[4].add(new edge(4,6));
		graph[5].add(new edge(5,4));
		graph[5].add(new edge(5,6));
		graph[6].add(new edge(6,5));
		graph[6].add(new edge(6,4));
		ArrayList<ArrayList<Integer>> comps=new ArrayList<>();
		boolean []visited =new boolean[7];
		for(int v=0;v<7;v++) {
			if(visited[v]==false) {
				ArrayList<Integer> comp=new ArrayList<>();
				graphcomp(graph,visited,v,comp);
				comps.add(comp);
			}
		}
		System.out.print(comps);
	}
	public static void graphcomp(ArrayList<edge> []graph,boolean []visited,int v,ArrayList<Integer> comp) {
		visited[v]=true;
		comp.add(v);
		for(edge e : graph[v]) {
			if(visited[e.nbr]==false) {
				graphcomp(graph,visited,e.nbr,comp);
			}
		}
	}
}*/

/*public class graph{
	public static class edge{
		int v;
		int nbr;
		public edge(int v,int nbr) {
			this.v=v;
			this.nbr=nbr;
		}
		
	}
	public static class pair{
		int v;
		String psf;
		public pair(int v,String psf) {
			this.v=v;
			this.psf=psf;
		}
	}
	public static void main(String [] args) {
		ArrayList<edge> []graph=new ArrayList[7];
		for(int i=0;i<7;i++) {
			graph[i]=new ArrayList<>();
		}

		graph[0].add(new edge(0,3));
		graph[0].add(new edge(0,1));
		graph[2].add(new edge(2,3));
		graph[2].add(new edge(2,1));
		graph[3].add(new edge(3,0));
		graph[3].add(new edge(3,2));
		graph[3].add(new edge(3,4));
		graph[4].add(new edge(4,3));
		graph[4].add(new edge(4,5));
		graph[4].add(new edge(4,6));
		graph[5].add(new edge(5,4));
		graph[5].add(new edge(5,6));
		graph[6].add(new edge(6,5));
		graph[6].add(new edge(6,4));
		boolean []visited=new boolean[7];
	Queue<pair>	q=new LinkedList<>();
	q.add(new pair(0,0+""));
		while(q.size()>0) {
			pair temp=q.remove();
			if(visited[temp.v]) {
				continue;
			}
			visited[temp.v]=true;
			System.out.println(temp.v+"@"+temp.psf);
			for(edge e: graph[temp.v]) {
				if(visited[e.nbr]==false) {
					q.add(new pair(e.nbr, temp.psf+e.nbr));
				}
			}
		}
}
}*/
public class graph{
	public static class edge{
		int v;
		int nbr;
		public edge(int v,int nbr) {
			this.v=v;
			this.nbr=nbr;
		}
		
	}
	public static class pair{
		int v;
		String psf;
		public pair(int v,String psf) {
			this.v=v;
			this.psf=psf;
		}
	}
	public static void main(String [] args) {
		ArrayList<edge> []graph=new ArrayList[7];
		for(int i=0;i<7;i++) {
			graph[i]=new ArrayList<>();
		}
 
		graph[0].add(new edge(0,3));
		graph[0].add(new edge(0,1));
		graph[2].add(new edge(2,3));
		graph[2].add(new edge(2,1));
		graph[3].add(new edge(3,0));
		graph[3].add(new edge(3,2));
		graph[3].add(new edge(3,4));
		graph[4].add(new edge(4,3));
		graph[4].add(new edge(4,5));
		graph[4].add(new edge(4,6));
		graph[5].add(new edge(5,4));
		graph[5].add(new edge(5,6));
		graph[6].add(new edge(6,5));
		graph[6].add(new edge(6,4));	
		boolean []visited=new boolean[7];
      boolean iscycle=false;
      for(int v=0;v<7;v++) {
    	  if(visited[v]==false) {
    		  iscycle=search(graph,v,visited);
    	  }
      }
      if(iscycle) {
    	  System.out.print(iscycle);
      }
      else {
    	  System.out.print(false); 
      }
      
}
	public static boolean search(ArrayList<edge> []graph,int v,boolean []visited) {
		Queue<pair>	q=new LinkedList<>();
		
		q.add(new pair(v,v+""));
			while(q.size()>0) {
				pair temp=q.remove();
				if(visited[temp.v]) {
					return true;
				}
				visited[temp.v]=true;
				
				for(edge e: graph[temp.v]) {
					if(visited[e.nbr]==false) {
						q.add(new pair(e.nbr, temp.psf+e.nbr));
					}
				}
			}
			return false;
    }
}







































































































































































