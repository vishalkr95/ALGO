
import java.util.*;
import java.io.*;
 public class iknow{
	public static void main(String  []args) {
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);//false
		int c=128;
		int d=128;
		System.out.println(c==d);//true
		String s1="vishal";
		String s2="vishal";
		System.out.println(s1==s2);//true
		String s3=new String("vishal");
		String s4=new String("vishal");
		System.out.println(s3==s4);//false
		System.out.println(a.equals(b));//true
		System.out.println(s3.equals(s4));// true
		System.out.println(Integer.valueOf(a)==Integer.valueOf(b));//false
		System.out.println(a.intValue()==b.intValue());//false
	}
}