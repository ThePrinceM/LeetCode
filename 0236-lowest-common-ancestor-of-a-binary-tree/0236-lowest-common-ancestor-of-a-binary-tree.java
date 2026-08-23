/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root == q) return root;
        boolean pLiesInLST=exists(root.left,p);
        boolean qLiesInLST=exists(root.left,q);
        if(pLiesInLST == true && qLiesInLST == true) return lowestCommonAncestor(root.left,p,q);
        if(pLiesInLST == false && qLiesInLST == false) return lowestCommonAncestor(root.right,p,q);
        return root;
    }

    public boolean exists(TreeNode root,TreeNode node){
        if(node == root) return true;
        if(root == null) return false;
        return exists(root.left, node) || exists(root.right,node); 
    }
}