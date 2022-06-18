
import java.util.Scanner;

public class Solution {
	public static int findSecretCode(int secretCode,int firstKey,int secondKey)
	{
		int answer=0;
		int p=(int)Math.pow(secretCode,firstKey);
		int r=p%10;
		int z=(int)Math.pow(r,secondKey);
		answer=z%1000000007;
		return answer;
	}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int secretCode = in.nextInt();
	int firstKey = in.nextInt();
	int secondKey = in.nextInt();
	int s=findSecretCode(secretCode,firstKey,secondKey);
	System.out.println(s);
}

}
