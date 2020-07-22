/*
Given a M X N matrix with your initial position at the top-left cell, find the number of possible unique paths to reach the bottom-right cell of the matrix from the initial position.

Note: Possible moves can be either down or right at any point in time, i.e., we can move to matrix[i+1][j] or matrix[i][j+1] from matrix[i][j].

Input:
The first line contains an integer T, depicting the total number of test cases. Then following T lines contain two integers M and N depicting the size of the grid.

Output:
Print the number of unique paths to reach the bottom-right cell from the top-left cell.

Expected Time Complexity: O(M*N).
Expected Auxiliary Space: O(M*N).

Constraints:
1 ≤ T ≤ 30
1 ≤ M ≤ 20
1 ≤ N ≤ 20

Example:
Input:
2
2 2
3 4

Output:
2
10

Example:
Testcase 1:
There are only two unique paths to reach the end of the matrix of size two from the starting cell of the matrix.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t > 0)
	    {
	        int m = in.nextInt();
	        int n = in.nextInt();
	   
	        System.out.println(countNumberUniquePath(m,n));
	        t--;
	    }
	}
	static int countNumberUniquePath(int m, int n)
	{
	    
	    if(m == 0)
	        return 0;
	 
	    int[][] path = new int[m][n];
	    for(int i = 0; i<m; i++)
	        path[i][0] = 1;
	    for(int i = 0; i<n; i++)
	        path[0][i] = 1;
	   
	    for(int i = 1; i < m ; i++)
	    {
	        for(int j = 1; j<n ; j++)
	        {
	            path[i][j] = path[i-1][j] + path[i][j-1] ;
	        }
	    }
	    return path[m-1][n-1];
	}
}
