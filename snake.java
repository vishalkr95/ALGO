import java.util.*;
/*
end 99 98 S(7) 96 95 94 93 92 91
81 82 L(99) 84 85 86 87 88 89 90
80 79 78 77 76 75 74 73 72 71
61 S(22) 63 64 65 66 67 68 69 70
60 59 58 S(14) 56 55 54 53 52 51
41 42 43 44 45 46 L(80) 48 49 50
40 39 38 37 36 35 34 33 32 31
21 22 23 L(63) 25 26 27 28 29 30
20 19 S(2) 17 16 15 14 13 12 11
STA 2 3 4 5 6 7 8 9 10
6 6 6 5 4 3 6 6 6 5 6 4 3 1
 */
public class snake {
  public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String arr[][]=new String[10][10];
	for(int i=0;i<10;i++) {
	  String str=sc.nextLine();
	  arr[i]=str.split(" ");
	  
	}
	String s=sc.nextLine();
	String d[]=s.split(" ");
	int cp=0;
	int sns=0;
	int l=0;
	int lc=0;
	for(int i=0;i<d.length;i++) {
		int v=Integer.parseInt(d[i]);
		
			int tp=cp+v;
			if(tp<100) {
				int r=tp/10;
				r=9-r;
				if(tp%10==0) {
					r++;
				}
				int c=tp%10;
				if(r%2==0 && c!=0) {
					c=(10-c);
				}
				else if(r%2!=0){
					c--;
				}
				
			String sl=arr[r][c];
			
			if(sl.charAt(0)=='S') {
				String is=sl.substring(2,sl.length()-1);
				int down=Integer.parseInt(is);
				cp=down;
				lc=cp;
				sns++;
			}
			else if(sl.charAt(0)=='L') {
				String is=sl.substring(2,sl.length()-1);
				int up=Integer.parseInt(is);
				cp=up;
				lc=cp;
				l++;
			}
			else {
				cp+=v;
				lc=cp;
			}
			}
			else if(tp==100) {
				System.out.println("Possible"+" "+sns+" "+l);
				return ;
			}
		}
	
	System.out.println("Not Possible"+sns+" "+l+" "+lc);
  }
}
