package Array;

import java.util.*;
public class Array4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		boolean res=findDuplicateBySorting(arr);
		if(res==false)
			System.out.println("Array do not contain duplicates");
		else
			System.out.println("Array contain duplicates");
		
		boolean res2=findDuplicateBySet(arr);
		if(res2==false)
			System.out.println("Array do not contain duplicates");
		else
			System.out.println("Array contain duplicates");
	}
	public static boolean findDuplicateBySorting(int arr[]){
		
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1])
				return true;
		}
		return false;
	}
	public static boolean findDuplicateBySet(int arr[]) {
		Set<Integer> set = new HashSet<>();
		for(int num: arr) {
			if(set.add(num)==false)
				return true;
		}
		return false;
	}
}
