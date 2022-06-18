import java.util.Scanner;

/*public class pre {
public static void main(String [] args) {
	int a[]={1,1,2,2,2,2};
	int c=0;
	int t=5;
	for(int i=0;i<a.length-1;i++) {
		int j=i+1;
		int k=a.length-1;
		while(j<k) {
			int sum=a[i]+a[j]+a[k];
			if(sum<t) {
				j++;
				
			}
			else if(sum>t) {
				k--;
			}
			else {
				//System.out.print(a[i]+" "+a[j]+" "+a[k]+" ");
				int lv=a[j];
				int hv=a[k];
				int cl=0;
				int ch=0;
				
				while(j<=k && a[j]==lv) {
					j++;
					cl++;
				}
				
				while(j<=k && a[k]==hv) {
					ch++;
					k--;
				}
				if(ch==1 && j==k) {
					cl++;
					c+=cl*(cl-1)/2;
					//System.out.println(cl);
				}
				else if(ch==0) {
					c+=cl*(cl-1)/2;
				}
				else {
					c+=cl*ch;
					//System.out.println(cl+" "+ch);
				}
			}
		}
	}
	System.out.println(c);
}
}*/

/*class pre{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		long sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int v=0;
		sc.nextLine();
		while(q-->0) {
			String s[]=sc.nextLine().split(" ");
			int t=Integer.parseInt(s[0]);
			if(t==1) {
				int p=Integer.parseInt(s[1]);
				int val=Integer.parseInt(s[2]);
				if(a[p-1]!=0) {
				   System.out.println(sum-a[p-1]+val);
				   
				   
				}
				else {
					System.out.println(sum-v+val);
				}
				a[p-1]=val;
				
			}
			else {
				int val=Integer.parseInt(s[1]);
				System.out.println(val*n);
				sum=val*n;
				a=new int[n];
				
				v=val;
				
			}
		}
	}
}*/
/*
1
9 4
1 2 0
1 3 1
1 6 1
3 4 0
3 5 1
4 7 1
4 8 1
7 6 1
 */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pre
{
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
    public static void printg(ArrayList<edge> g[],int v,boolean b[]) {
    	b[v]=true;
    	String s="";
    	s+=v+" > ";
    	for(edge e : g[v]) {
    		s+=e.nbr+" ";
    		if(b[e.nbr]==false) {
    			printg(g,e.nbr,b);
    		}
    	}
    	System.out.println(s);
    	
    }
		public static int findsize(ArrayList<edge> g[],int v,boolean b[]){
		   
		    int t=0;
		    b[v]=true;
		    for(edge e : g[v]){
		        if(b[e.nbr]==false){
		         t+=findsize(g,e.nbr,b);   
		        }
		        
		    }
		    return t+1;
		}
	public static void main (String[] args) throws NumberFormatException, IOException 
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int vist=Integer.parseInt(br.readLine());
		 while(vist-->0){
		     String nk=br.readLine();
		      int vertices=Integer.parseInt(nk.split(" ")[0]);
		      int k=Integer.parseInt(nk.split(" ")[1]);
		  ArrayList<edge> []graph=new ArrayList[vertices+1];
		  for(int i=0;i<vertices+1;i++) {
			  graph[i]=new ArrayList<edge>();
		  }
		  
		  for(int i=0;i<vertices-1;i++) {
			  String s=br.readLine();
			 
			  int v1=Integer.parseInt(s.split(" ")[0]);
			  int v2=Integer.parseInt(s.split(" ")[1]);
			  int wt=Integer.parseInt(s.split(" ")[2]);
			  graph[v1].add(new edge(v1,v2,wt));
			  graph[v2].add(new edge(v2,v1,wt));
		  }
		 // boolean vv[]=new boolean[vertices+1];
		  //printg(graph,1,vv);
		  ArrayList<edge> al=graph[1];
		  ArrayList<Integer> l=new ArrayList<>();
		  ArrayList<Integer> size=new ArrayList<>();
		  int c=0;
		  
		  for(edge e : al) {
			  if(e.wt==0) {
				  boolean visited[]=new boolean[vertices+1];
				  visited[e.sr]=true;
				 c+=findsize(graph,e.nbr,visited);
			  }
		  }
		  if(c>=k) {
			  System.out.println(-1+" "+c);
		  }
		  else {
			  System.out.println(1);
		  }
		  
		 }
		
		 
	}
}
























