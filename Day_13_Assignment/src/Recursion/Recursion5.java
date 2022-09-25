package Recursion;
import java.util.*;
public class Recursion5 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of stairs");
			int n=sc.nextInt();
			Integer dp[] = new Integer[n+1];
			
			int ans=helper(n,dp);
			System.out.println(ans);
		}
		public static int helper(int n,Integer dp[]) {
			if(n==0)
				return 1;
			if(n<0)
				return 0;
			
			if(dp[n]!=null)
				return dp[n];
			
			return dp[n]=helper(n-1,dp)+helper(n-2,dp)+helper(n-3,dp);
		}
}
