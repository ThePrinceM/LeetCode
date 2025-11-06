class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length, result = 0;
        int totalSum = 0;
        
        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }
        
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int leftSum = currSum;
                int rightSum = totalSum - currSum;
                
                // If left sum equals right sum, both directions work
                if (leftSum == rightSum) {
                    result += 2;
                }
                // If difference is 1, one direction works
                else if (Math.abs(leftSum - rightSum) == 1) {
                    result += 1;
                }
            }
            currSum += nums[i];
        }
        
        return result;
    }
}