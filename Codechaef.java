
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechaef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int vist=Integer.parseInt(sc.nextLine());
		while(vist-->0){
		    int n=Integer.parseInt(sc.nextLine());
		    String s=sc.nextLine();
		   StringBuilder sb1=new StringBuilder(s);
		   StringBuilder sb2=new StringBuilder(sb1);
		   sb2.reverse();
		   int c=0;
		   for(int i=0;i<=n/2;i++) {
			if(sb1.charAt(i)!=sb2.charAt(i)) {
			  c++;	
			}
		   }
		   System.out.println((int)Math.ceil(c*1.0/2));
		}
	}
}