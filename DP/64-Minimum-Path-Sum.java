// https://leetcode.com/problems/minimum-path-sum/
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >=0; j--) {
                if (i+1 == m && j+1 == n) dp[i][j] = grid[i][j];
                else if (i+1 == m) dp[i][j] = dp[i][j+1] + grid[i][j];
                else if (j+1 == n) dp[i][j] = dp[i+1][j] + grid[i][j];
                else dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + grid[i][j];
            }
        }
        return dp[0][0];
    }
}
