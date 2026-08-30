class Solution {

    public int helper(TreeNode root, int low, int high, int[] sum){
        if (root == null) return 0;

        if (root.val < low) {
            return helper(root.right, low, high, sum);
        }
        if (root.val > high) {
            return helper(root.left, low, high, sum);
        }

        // root.val is in range
        sum[0] += root.val;
        helper(root.left, low, high, sum);
        helper(root.right, low, high, sum);
        return sum[0];
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int[] sum = {0};
        return helper(root, low, high, sum);
    }
}
