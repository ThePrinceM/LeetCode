class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        int amt=0;
        for(int i=n-1;i>=0;i-=3){
            amt+=cost[i];
            if(i-1>=0) amt+=cost[i-1];
        }
        return amt;
    }
}