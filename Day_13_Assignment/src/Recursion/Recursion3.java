package Recursion;

import java.util.*;
public class Recursion3 {
	static int ans=Integer.MAX_VALUE;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		helper(0,n-1,arr);
		System.out.println(ans);
	}
	public static void helper(int low,int high,int arr[]) {
		
		if(low>high)
			return;
		
		int mid=low+(high-low)/2;
		System.out.println(mid);
		if(mid==arr[mid])
		{
			ans=Math.min(mid, ans);
			helper(low,mid-1,arr);	
		}
		else {
			helper(low,mid-1,arr);
			helper(mid+1,high,arr);
		}
	}
}
