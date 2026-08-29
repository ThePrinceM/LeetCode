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

    public int helper(TreeNode root, long sum){
        if(root == null) return 0;
        int count = 0;
        if( root.val == sum) count++;  // dont return
        count += helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
        return count;

    }

    public int pathSum(TreeNode root, int targetSum) {
        if( root == null) return 0;
        return helper(root , targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum); // this line ensures that even we need to count thepath which does not starts from the root of the tree
    }
}