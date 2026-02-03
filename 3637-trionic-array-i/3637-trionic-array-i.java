class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 1;
        // Step 1: find p
        while (i < n && nums[i] > nums[i - 1]) i++;
        int p = i - 1;
        if (p == 0 || p >= n - 2) return false;

        // Step 2: find q
        while (i < n && nums[i] < nums[i - 1]) i++;
        int q = i - 1;
        if (q <= p || q >= n - 1) return false;

        // Step 3: final increasing segment
        while (i < n && nums[i] > nums[i - 1]) i++;

        return i == n;
    }
}