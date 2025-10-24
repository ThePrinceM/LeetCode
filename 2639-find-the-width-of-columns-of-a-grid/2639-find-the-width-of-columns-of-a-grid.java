class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];

        for (int j = 0; j < n; j++) {
            int maxLen = 0;
            for (int i = 0; i < m; i++) {
                int num = grid[i][j];
                int len = String.valueOf(num).length();
                if (len > maxLen) {
                    maxLen = len;
                }
            }
            ans[j] = maxLen;
        }

        return ans;
    }
}