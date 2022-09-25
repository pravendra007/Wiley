package Recursion;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int n=5;
		boolean isPossible=nQueen(0,arr,5);
		if(isPossible) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Cannot form the formation");
	}
	public static boolean nQueen(int col,int arr[][],int n) {
		if(col>=n)
			return true;
		
		for(int row=0;row<n;row++) {
			
			if(check(row,col,arr))
			{
				arr[row][col]=1;
			
				if(nQueen(col+1,arr,n))
					return true;
				arr[row][col]=0;
			}
		}
		return false;
	}
	public static boolean check(int row,int col, int arr[][]) {
		
		for(int i=0;i<col;i++) {
			if(arr[row][i]==1)
				return false;
		}
		
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(arr[i][j]==1)
				return false;
		}
		
		for(int i=row,j=col;i<arr.length && j>=0;i++,j--) {
			if(arr[i][j]==1)
				return false;
		}
		return true;
	}
}
