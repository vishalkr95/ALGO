/*import java.math.*;
import java.util.*;
public class biginteget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter");
		BigInteger n1,n2;
		n1=sc.nextBigInteger();
		
		int f=1;
		for(n2=BigInteger.ONE;n2.multiply(n2).compareTo(n1)>=0;n2.add(BigInteger.ONE)) {
			BigInteger m=n1.mod(n2);
			if(m.compareTo(new BigInteger("0"))!=0) {
				System.out.println("not prime");
				f=0;
				break;
			}
		}
		
		if(f==1) {
			System.out.println("prime");
		}
	
	}

}*/


/*import java.math.*;
import java.util.*;
public class biginteget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter");
		BigInteger n1,n2;
		n1=sc.nextBigInteger();
		
		int f=1;
		for(n2=BigInteger.ONE;n2.compareTo(n1)<=0;n2=n2.add(BigInteger.ONE)) {
			BigInteger m=n1.mod(n2);
			if(m.compareTo(new BigInteger("0"))!=0) {
				System.out.println("not prime");
				f=0;
				break;
			}		
			}
		
		if(f==1) {
			System.out.println("prime");
		}
	
	}

}*/
/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class biginteget {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
       BigInteger n1,n2;
       n1=new BigInteger(n);
        int f=1;
        for(n2=BigInteger.TWO;n2.compareTo(n1)<=0;n2=n2.add(BigInteger.ONE)) {
            BigInteger m=n1.mod(n2);
            if(m.compareTo(new BigInteger("0"))!=0) {
                System.out.println("not prime");
                f=0;
                break;
            }        
            }
        
        if(f==1) {
            System.out.println("prime");
        }
     bufferedReader.close();
    }

       
    }*/
    
/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class biginteget {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s=br.readLine();
         int n=Integer.parseInt(s);
         int a[]=new int[n];
         String s1=br.readLine();
         String s2[]=s1.split(" ");
         int count=0;
         for(int i=0;i<n;i++) {
        	a[i]=Integer.parseInt(s2[i]); 
         }
         for(int i=0;i<n;i++) {
        	 int b[]=new int[n];
        	 for(int j=i;j<n;j++) {
        		b[j]=a[j]; 
        		int sum=0;
        		for(int k=0;k<n;k++) {
        			sum +=b[k];
        			}
        		if(sum<0) {
        			count++;
        		}
        	 }
        	 
         }
         System.out.println(count);
    }
}*/

/*import java.util.*;

public class biginteget {

    public static boolean canWin(int leap, int[] game) {
    	int j=0;
        for(int i=0;i<game.length;i++) {
        	if(game[i]==0) {
        		j++;
        	}
        	else {
        		j+=leap;
        		 if(j>=game.length) {
        	        	return true;
        	        }
        	        else {
        	        	if(game[j]==0) {
        	        		i=j;
        	        	}
        	        	else {
        	        		return false;
        	        	}
        	        	
        	        }
        	}
        }
        return false;
       
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fnds c");
        int q = scan.nextInt();
        String s="vi";
        if(s.equals(s))
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}*/
/*import java.util.*;
import java.io.*;

class biginteget{
	public static void main(String []argh)throws Exception
	{    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int t=Integer.parseInt(s);
        int l=t;
        HashMap<String,Integer> hm=new HashMap<>();
        while(t>0){
            String s1=br.readLine();
            String s2=br.readLine();
            int t1=Integer.parseInt(s2);
            hm.put(s1,t1);
            t--;
        }
        String q=br.readLine();
        
        while(q!=null){
            String s3=br.readLine();
            if(hm.containsKey(s3)){
                System.out.println(s3+"="+hm.get(s3));
            }
            else{
                System.out.println("Not found");
            }
            q=br.readLine();
        }
	}
}*/

import java.util.*;
import java.io.*;

class biginteget{
	public static void main(String []argh)throws Exception
	{    
		float a[]= {3.2f,5.4f,2.9f,8.7f};
		Arrays.sort(a);
		for(float f:a) {
		System.out.println(f);}
		
	}}



































