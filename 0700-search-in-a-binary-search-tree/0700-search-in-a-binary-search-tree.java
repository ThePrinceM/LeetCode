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
    public TreeNode searchBST(TreeNode root, int num) {
        TreeNode tree = new TreeNode();
        if(root == null) return null;
        if(root.val == num) {
            return root;
        }else if(root.val < num){
            return searchBST(root.right, num);
        }else return searchBST(root.left, num);
    }
}