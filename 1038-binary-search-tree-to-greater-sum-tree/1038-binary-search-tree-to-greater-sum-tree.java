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

    public void revInorder(TreeNode root, int[] s){
        if( root == null) return;
        revInorder(root.right, s);
        root.val += s[0];
        s[0] = root.val;
        revInorder(root.left, s);
    }

    public TreeNode bstToGst(TreeNode root) {
        int[] sum = {0};
        revInorder(root, sum);
        return root;
    }
}