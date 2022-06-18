import java.util.Arrays;

/*public class sorting {
public static void main(String [] args) {
	int a[]= {4,2,1,6,3,9,8};
	a=bubblesort(a);
	System.out.println(Arrays.toString(a));
}
public static int [] bubblesort(int []a) {
	for(int i=1;i<=a.length-1;i++) {
		for(int j=0;j<a.length-i;j++) {
			if(a[j]>a[j+1]) {
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	return a;
}
}*/
/*public class sorting {
public static void main(String [] args) {
	int a[]= {4,2,1,6,3,9,8};
	a=selectionsort(a);
	System.out.println(Arrays.toString(a));
}
public static int [] selectionsort(int []a) {
	for(int i=0;i<a.length-1;i++) {
		int mi=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[mi]>a[j]) {
				mi=j;
			}
		}
		int t=a[i];
		a[i]=a[mi];
		a[mi]=t;
	}
	return a;
}
}*/
/*public class sorting {
public static void main(String [] args) {
	int a[]= {4,2,1,6,3,9,8};
	a=insertionsort(a);
	System.out.println(Arrays.toString(a));
}
public static int [] insertionsort(int []a) {
	for(int i=1;i<a.length;i++) {
		for(int j=i-1;j>=0;j--) {
			if(a[j]>a[j+1]) {
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			else {
				break;
			}
		}
	}
	
	
	return a;
}
}*/
/*class sorting{
	public static void main(String []args) {
		int a[]= {2,5,12,18,20};
		int b[]= {7,9,11,15,25,28,30,35};
		int c[]=mergetwoarry(a,b);
		System.out.print(Arrays.toString(c));
	}
	public static int [] mergetwoarry(int a[],int b[]) {
		int arr[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
		  if(a[i]<b[j]) {
			  arr[k++]=a[i];
			  i++;
		  }
		  else {
			  arr[k++]=b[j];
			  j++;
		  }
		}
		if(i<a.length) {
			for(int r=i;r<a.length;r++) {
				arr[k++]=a[r];
			}
		}
		if(j<b.length) {
			for(int r=j;r<b.length;r++) {
				arr[k++]=b[r];
			}
		}
		return arr;
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {4,2,1,6,3,9,8};
		a=mergesort(a,0,a.length-1);
		System.out.print(Arrays.toString(a));
	}
	public static int [] mergesort(int a[],int l,int h) {
		if(l==h) {
			int b[]=new int[1];
			b[0]=a[l];
			return b;
		}
		int m=(l+h)/2;
		int c[]=mergesort(a,l,m);
		int d[]=mergesort(a,m+1,h);
		int arr[]=mergetwoarry(c,d);
		return arr;
	}
	public static int [] mergetwoarry(int a[],int b[]) {
		int arr[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
		  if(a[i]<b[j]) {
			  arr[k++]=a[i];
			  i++;
		  }
		  else {
			  arr[k++]=b[j];
			  j++;
		  }
		}
		if(i<a.length) {
			for(int r=i;r<a.length;r++) {
				arr[k++]=a[r];
			}
		}
		if(j<b.length) {
			for(int r=j;r<b.length;r++) {
				arr[k++]=b[r];
			}
		}
		return arr;
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {7,9,4,8,3,6,2,1};
		int p=5;
		a=partioning(a,p);
		System.out.println(Arrays.toString(a));
	}
	public static int [] partioning(int a[],int p) {
		int i=0;
		int j=0;
		for(int k=0;k<a.length;k++) {
			if(a[i]>p) {
				i++;
			}
			else {
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
				i++;
				j++;
			}
		}
		return a;
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {7,9,4,8,3,6,2,1};
		 quicksort(a,0,a.length-1);
		 System.out.println(Arrays.toString(a));
	}
	public static void quicksort(int []a,int l,int h) {
		if(l>=h) {
			return;
		}
		int p=a[h];
		int pi=partioning(a,p);
		quicksort(a,l,pi-1);
		quicksort(a,pi+1,h);
		
	}
	public static int  partioning(int a[],int p) {
		int i=0;
		int j=0;
		for(int k=0;k<a.length;k++) {
			if(a[i]>p) {
				i++;
			}
			else {
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
				i++;
				j++;
			}
		}
		return j-1;
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {7,9,4,8,3,6,2,1,1};
		int k=3;
		int t=quickselect(a,k-1,0,a.length-1);
		System.out.println(t);
		
	}
public static int quickselect(int []a,int i,int l,int h) {
	
	int j=partioning(a,a[h],l,h);
	if(j>i) {
		return quickselect(a,i,l,j-1);
	}
	else if(j<i) {
		return quickselect(a,i,j+1,h);
	}
	else {
		return a[j];
	}
}
public static int  partioning(int a[],int p,int l,int h) {
	int i=l;
	int j=l;
    for(int k=i;k<=h;k++) {
		if(a[i]>p) {
			i++;
		}
		else {
			int t=a[j];
			a[j]=a[i];
			a[i]=t;
			i++;
			j++;
		}
	}
	return j-1;
}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {9,6,3,5,3,4,3,9,6,5,8,9,9};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
	  a=countsort(a,max,min);
	  System.out.println(Arrays.toString(a));
	}
	public static int [] countsort(int a[],int max,int min) {
		int range=max-min+1;
		int f[]=new int[range];
		for(int i=0;i<a.length;i++) {
			f[a[i]-min]+=1;
		}
		for(int i=1;i<f.length;i++) {
			f[i]=f[i]+f[i-1];
		}
		int arr[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
		      int val=a[i];
		      int pos=f[val-min];
			arr[pos-1]=a[i];
			f[a[i]-min]--;
		}
		return arr;
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {213,97,789,143,718};
		radixsort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void radixsort(int []a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		int exp=1;
		while(exp<=max) {
			countsort(a,exp);
			exp*=10;
		}
	}
	public static void countsort(int a[],int exp) {
		
		int f[]=new int[10];
		for(int i=0;i<a.length;i++) {
			f[a[i]/exp%10]+=1;
		}
		for(int i=1;i<f.length;i++) {
			f[i]=f[i]+f[i-1];
		}
		int arr[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
		      int val=a[i]/exp%10;
		      int pos=f[val];
			arr[pos-1]=a[i];
			f[a[i]/exp%10]--;
		}
		for(int i=0;i<a.length;i++) {
			a[i]=arr[i];
		}
	}
}*/
/*class sorting {
	public static void main(String []args) {
		String []a= {"0112000","26121997","08122005","13011986","12011982"};
		sortdates(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sortdates(String a[]) {
		countsort(a,1000000,100,32);
		countsort(a,10000,100,13);
		countsort(a,1,10000,2025);
	}
	public static void countsort(String a[],int div,int mod,int range) {
		int f[]=new int[range];
		for(int i=0;i<a.length;i++) {
			f[Integer.parseInt(a[i],10)/div%mod]++;
		}
		for(int i=1;i<f.length;i++) {
			f[i]=f[i]+f[i-1];
		}
		String arr[]=new String[a.length];
		for(int i=a.length-1;i>=0;i--) {
			int v=Integer.parseInt(a[i],10)/div%mod;
			int pos=f[v];
			arr[pos-1]=a[i];
			f[v]--;
		}
		for(int i=0;i<a.length;i++) {
			a[i]=arr[i];
		}
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int a[]= {1,1,0,1,0,0};
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void sort(int a[]) {
		
		int i=0;
		int j=0;
		while(i<a.length) {
			if(a[i]==0) {
				
				i++;
			}
			else {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j++;
			
			}
		}
	}
	
}*/

/*class sorting{
	public static void main(String [] args) {
		int a[]= {1,2,0,1,0,2,0,1,2,0,0,2,1,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int a[]) {
		partition(a,0);
		partition(a,1);
	}
	public static void partition(int a[],int p) {
		int i=0;
		int j=0;
		while(i<a.length) {
			if(a[i]>p) {
				i++;
			}
			else {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j++;
			}
		}
	}
}*/

/*class sorting{
	public static void main(String [] args) {
		int a[]= {1,2,0,1,0,2,0,1,2,0,0,2,1,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int a[]) {
		partition(a);
		
	}
	public static void partition(int a[]) {
		int i=0;
		int j=0;
		int k=a.length-1;
		while(i<=k) {
			if(a[i]==1) {
				i++;
			}
			else if(a[i]==0){
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j++;
			}
			else if(a[i]==2) {
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				
				k--;
			}
		}
	}
}*/
/*class sorting{
	public static void main(String []args) {
		int a[]= {7,15,3,18,6,4,19,2,12,11,9};
		Arrays.sort(a);
		int s=15;
		printsum(a,s);
	}
	public static void printsum(int a[],int s) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]<s) {
				i++;
			}
			else if(a[i]+a[j]>s) {
				j--;
			}
			else {
				System.out.println(a[i]+" "+a[j]);
				i++;
				j--;
			}
		}
	}
}*/
/*class sorting{
	public static void main(String [] args) {
		int []a= {20,30,40,10};
		int i=serchpivot(a);
		System.out.println(i);
	}
	public static int serchpivot(int []a) {
	int	l=0;
	 int h=a.length-1;
		while(l<h) {
			int m=(l+h)/2;
			if(a[m]<a[h]) {
				h=m;
			}
			else {
				l=m+1;
			}
		}
		return l;
	}
}*/








































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































