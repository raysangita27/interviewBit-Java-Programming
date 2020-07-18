Problem Description

/*
Given a 2D integer array A of size M x N, you need to find a path from top left to bottom right which minimizes the sum of all numbers along its path.

NOTE: You can only move either down or right at any point in time.



Input Format
First and only argument is an 2D integer array A of size M x N.



Output Format
Return a single integer denoting the minimum sum of a path from cell (1, 1) to cell (M, N).



Example Input
Input 1:

 A = [  [1, 3, 2]
        [4, 3, 1]
        [5, 6, 1]
     ]


Example Output
Output 1:

 9


Example Explanation
Explanation 1:

 The path is 1 -> 3 -> 2 -> 1 -> 1
 So ( 1 + 3 + 2 + 1 + 1) = 8
 */
 
 public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();
        int n = A.get(0).size();
        int[][] path = new int[m][n];
        path[0][0] = A.get(0).get(0);
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(i == 0 && j == 0)
                    continue;
                if(i== 0 )
                    path[i][j] = A.get(i).get(j) + path[i][j-1];
                else if(j == 0)
                    path[i][j] = A.get(i).get(j) + path[i-1][j];
                else
                    path[i][j] = Math.min(path[i-1][j], path[i][j-1]) + A.get(i).get(j);
            }
        }
        return path[m-1][n-1];
    }
}
