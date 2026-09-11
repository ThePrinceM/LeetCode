class Solution {
    public int path(int m, int n, int[][] dp) {
        if (m < 0 || n < 0)
            return 0;
        if (m == 0 && n == 0)
            return 1;
        if(dp[m][n] != -1) return dp[m][n];
        int right = path(m - 1, n,dp);
        int left = path(m, n - 1,dp);
        dp[m][n] = left + right;

        return  dp[m][n] ;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] e : dp) {
            Arrays.fill(e, -1);
        }
        return path(m - 1, n - 1, dp);
    }
}