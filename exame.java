


import java.util.*;
/*
8
1 1 0 1 0 1 0 1 
 */
public class exame {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int l=findlen(arr);
	System.out.println(l);
}
public static int findlen(int arr[]) {
	int sum=0;
	int l=0;
	int ml=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			sum++;
			
		}
		else {
			sum--;
		}
		l++;
		if(sum==0 && ml<l) {
			ml=l;
		}
	}
	return ml;
}
}
