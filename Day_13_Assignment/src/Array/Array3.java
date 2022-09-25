package Array;

import java.util.*;
public class Array3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int rows=sc.nextInt();
		System.out.println("Enter the col size");
		int cols=sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		
		System.out.println("Enter the elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				matrix[i][j]=sc.nextInt();
		}
		
		int col0=1;
		for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
        
        System.out.println("Modified Matrix: ");
        for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
}
