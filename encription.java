
import java.util.*;
public class encription {
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
String num=sc.nextLine();
char ch[]=num.toCharArray();
String s=sc.nextLine();
int cp=0;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c=='R') {
		if(cp<ch.length) {
			cp++;	
		}
		
	}
	else if(c=='L') {
		if(cp>0) {
			cp--;	
		}
		
	}
	else if(c=='T') {
      if(cp>=0 && cp<ch.length){
        if(ch[cp]<'9') {
		ch[cp]++;
		}
      }
}
	else if(c=='D') {
      if(cp>=0 && cp<ch.length){
       if(ch[cp]>'0') {
			ch[cp]--;
			} 
      }
	}
	else if(c=='S') {
		i++;
		int  idx=s.charAt(i)-'0'-1;
		if(idx>=0 && idx<ch.length) {
			swap(cp,idx,ch);
		}
}
}
StringBuilder sb=new StringBuilder();
for(int i=0;i<ch.length;i++) {
	sb.append(ch[i]);
}
num=sb.toString();
System.out.print(num);
}
public static void swap(int cp,int idx,char arr[]) {
	char c=arr[cp];
	arr[cp]=arr[idx];
	arr[idx]=c;
}
}




















