/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static boolean flag;

    private long max(TreeNode root) {
        if(root == null) return Long.MIN_VALUE;
        long leftMax = max(root.left);
        if(leftMax >= root.val) flag = false;
        long rightMax = max(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    private long min(TreeNode root) {
        if(root == null) return Long.MAX_VALUE;
        long leftMin = min(root.left);
        long rightMin = min(root.right);
        if(rightMin <= root.val) flag = false;
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }

    public boolean isValidBST(TreeNode root) {
        flag = true;
        max(root);
        min(root);
        return flag;
    }
}


