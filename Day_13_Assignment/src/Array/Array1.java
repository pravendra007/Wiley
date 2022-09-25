package Array;

import java.util.*;
public class Array1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		int arr[] = new int[65536];
		int flag=0;
		for(char ch: s.toCharArray()) {
			if(ch!=' ')
			{
				arr[(int)ch]++;
				if(arr[(int)ch]==2)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("String contains unique characters");
		else
			System.out.println("String  does not contain unique characters");
	}
}
