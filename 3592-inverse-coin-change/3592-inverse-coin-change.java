class Solution {
    public int helper(List<Integer> coins, int idx, int target, int[][] dp){
        if(target == 0) return 1;
        if(target < 0 || idx >= coins.size()) return 0;

        if(dp[idx][target] != -1) return dp[idx][target];
        int take = helper(coins, idx, target-coins.get(idx), dp);
        int skip = helper(coins, idx+1, target, dp);
        dp[idx][target] = take + skip;
        return dp[idx][target];
    }
        
    public List<Integer> findCoins(int[] numWays) {
        int n = numWays.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            int waysWithoutCoin = 0;
            if(!list.isEmpty()){
                int[][] dp = new int[n][n+1];
                for(int[] x : dp) Arrays.fill(x, -1);
                waysWithoutCoin = helper(list, 0, i, dp);
                
            }
            if(numWays[i-1] == waysWithoutCoin) continue;

            list.add(i);
            int[][] dp = new int[n][n+1];
            for(int[] x : dp) Arrays.fill(x, -1);
            int waysWithCoin = helper(list, 0, i, dp);
            if(waysWithCoin != numWays[i-1]) return new ArrayList<>();

        }
    return list;
    }
}