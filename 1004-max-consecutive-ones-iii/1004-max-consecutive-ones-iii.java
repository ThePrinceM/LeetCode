class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, maxLen = 0, count0 = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) count0++;

            // Shrink window from left if zeros exceed k
            while (count0 > k) {
                if (nums[l] == 0) count0--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}