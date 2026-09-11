class Solution {
    public int count(int[] coins, int idx, int tg, int INF, int[][] dp){
        if(tg == 0) return 0;
        if(tg < 0 || idx < 0) return INF;

        if(dp[idx][tg] != -1) return dp[idx][tg];
        int take = INF;
        if(tg >= coins[idx]){
           int part = count(coins, idx, tg - coins[idx], INF, dp);
           if(part < INF) take = 1 + part;
        }
        int skip = count(coins, idx-1, tg, INF, dp);
        int min = Math.min(take, skip);
        dp[idx][tg] = min;
        return min;
    }

    public int coinChange(int[] coins, int amount) {
        int INF = amount + 1;
        int[][] dp = new int[coins.length][amount + 1];
        for(int[] x : dp) Arrays.fill(x, -1);
        int res = count(coins, coins.length - 1, amount, INF, dp);

        return (res == INF)? -1 : res;
    }
}