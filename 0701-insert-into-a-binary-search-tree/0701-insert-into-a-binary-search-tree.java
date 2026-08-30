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

    public void insert(TreeNode root, int num){
        if(num < root.val){
            if(root.left == null) root.left = new TreeNode(num);
            else insert(root.left, num);
        }else{
            if( root.right == null) root.right = new TreeNode(num);
            else insert(root.right, num);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int num) {
        if(root == null) return new TreeNode(num);
        insert(root, num);
        return root;
    }
}