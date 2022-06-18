
import java.util.*;
class hr{
	public static void extraLongFactorials(int n) {
	    // Write your code here
	      String s="1";
	      for(int i=2;i<=n;i++){
	          s=multiply(s,i);
	         //System.out.println(s);
	      }
	     System.out.println(s.length());
	    }
	   public static String multiply(String s,int n){
	       String res="";
	       int f=0;
	       while(n>0){
	           String tmp="";
	           int d1=n%10;
	           n=n/10;
	           int c=0;
	           for(int i=s.length()-1;i>=0;i--){
	              int d2=s.charAt(i)-'0';
	              int d=d1*d2+c;
	              c=d/10;
	              d=d%10;
	              tmp=d+tmp; 
	           }
	           if(c>0){
	               tmp=c+tmp;
	           }
	           for(int i=0;i<f;i++){
	               tmp+="0";
	           }
	           f++;
	           res=findsum(res,tmp);
	           
	       }
	       return res;
	       
	   }
	   public static String findsum(String s1,String s2){
	       int i=s1.length()-1;
	       int j=s2.length()-1;
	       int c=0;
	       String res="";
	       while(i>=0 || j>=0 || c!=0){
	         int d1=(i>=0?s1.charAt(i)-'0':0);
	         int d2=(j>=0?s2.charAt(j)-'0':0);
	         int d=d1+d2+c;
	         c=d/10;
	          res=d%10+res;
	          i--;
	          j--; 
	       }
	       return res;
	   }
	public static void main(String [] args) {
		int n=10000;
		extraLongFactorials(n);
	}
}