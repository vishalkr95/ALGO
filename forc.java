import java.util.HashSet;
import java.util.Scanner;



public class forc{
	static HashSet<pair> hs=new HashSet<>();
   static  class pair{
    	long h1;
    	long h2;
    	public pair(long h1,long h2) {
    		this.h1=h1;
    		this.h2=h2;
    	}
    	@Override
    	public boolean equals(Object obj)
    	{
    		

    	if(this == obj)
    			return true;
    		
    		if(obj == null || obj.getClass()!= this.getClass())
    			return false;
    		
           
    		pair p = (pair) obj;
    		
    		// comparing the state of argument with
    		// the state of 'this' Object.
    		return (p.h1==this.h1 && p.h2 == this.h2);
    	}
    	@Override
    	public int hashCode()
    	{
    		
    		
    		return (int)(this.h1+this.h2);
    	}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String bs=sc.nextLine();
        int k=Integer.parseInt(sc.nextLine());
       
        int count=0;
        for(int i=0;i<s.length();i++){
            int bc=0;
            long h1=0;
            long h2=0;
            long p1=31;
            long p2=29;
            long pow1=1;
            long pow2=1;
            long mod=1000000007;
            
            for(int j=i;j<s.length();j++){
               char c=s.charAt(j);
               int p=c-'a';
               int cp=bs.charAt(p);
               
               if(cp=='0'){
                   bc++;
               }
               if(bc>k){
            	   
                   break;
               }
               else{
                   
                   h1=((h1+(s.charAt(j)-'a'+1)*pow1)%mod);
                   h2=((h2+(s.charAt(j)-'a'+1)*pow2)%mod);
                   pow1=(pow1*p1)%mod;
                   pow2=(pow2*p2)%mod;
                   hs.add(new pair(h1,h2));
                   
               }
            }
        }
        System.out.println(hs.size());
        sc.close();
    }
}

