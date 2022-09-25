package Stack_and_Queues;

import java.util.*;
public class Stack_and_Queues4 {
	public static void main(String args[]) {
		char grid[][] = {{'1','1','1','1','0'},
		                 {'1','1','0','1','0'},
		                 {'1','1','0','0','0'},
		                 {'0','0','0','0','0'}};

		int m=grid.length;
		int n=grid[0].length;
		
		  boolean visited[][] = new boolean[m][n];
	        int count=0;
	        int dirs[][]={{0,1},{1,0},{-1,0},{0,-1}};
	        
	        for(int i=0;i<m;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                if(grid[i][j]=='1' && visited[i][j]==false){
	                    count++;
	                    Queue<int[]> q = new LinkedList<>();
	                    q.add(new int[]{i,j});
	                    visited[i][j]=true;
	                    
	                    while(!q.isEmpty())
	                    {
	                        int curr[] = q.remove();
	                        for(int dir[]: dirs)
	                        {
	                            int x=curr[0]+dir[0];
	                            int y=curr[1]+dir[1];
	                            
	                            if(x<0||y<0||x>=m||y>=n||grid[x][y]=='0'||visited[x][y])
	                                continue;
	                            visited[x][y]=true;
	                            q.add(new int[]{x,y});
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println("Number of islands are: "+count);

	}
}
