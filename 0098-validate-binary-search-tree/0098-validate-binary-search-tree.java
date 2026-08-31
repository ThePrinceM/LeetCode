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

    public int minNode(TreeNode root){
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null) return root.val;
        return minNode(root.left);
    }

    public int maxNode(TreeNode root){
        if (root == null) return Integer.MIN_VALUE;
        if (root.right == null) return root.val;
        return maxNode(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        // check that all nodes in left subtree are < root.val
        if (root.left != null && maxNode(root.left) >= root.val) return false;

        // check that all nodes in right subtree are > root.val
        if (root.right != null && minNode(root.right) <= root.val) return false;

        // recursively ensure left and right subtrees are valid BSTs
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
