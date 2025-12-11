class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE; // represents nums[k]

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true; // Found nums[i] < nums[k] < nums[j]
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); // Update "2" in the 132 pattern
            }
            stack.push(nums[i]);
        }
        return false;
    }

}