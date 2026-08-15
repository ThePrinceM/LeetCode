class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        boolean allZero = true;
        for (int v : nums) {
            totalXor ^= v;
            if (v != 0) allZero = false;
        }
        if (totalXor != 0) return n;
        if(allZero) return 0;
        else return n-1;
    }
}
