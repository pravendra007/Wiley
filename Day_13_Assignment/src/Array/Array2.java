package Array;

import java.util.*;
public class Array2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=sc.nextInt();
		int mat[][] = new int[n][n];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		
		int i=0,j=n-1;
		while(i<j) {
			for(int col=0;col<n;col++) {
				int temp=mat[i][col];
				mat[i][col]=mat[j][col];
				mat[j][col]=temp;
			}
			i++;
			j--;
		}
		
		System.out.println("Rotated matrix: ");
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++)
				System.out.print(mat[row][col]+" ");
			System.out.println();
		}
	}
}
