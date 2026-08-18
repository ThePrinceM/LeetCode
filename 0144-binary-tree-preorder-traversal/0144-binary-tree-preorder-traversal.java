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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        pre(l,root);
        return l;

    }

    public void pre(ArrayList<Integer> al,TreeNode root){
        if(root==null) return;
        al.add(root.val);
        pre(al,root.left);
        pre(al,root.right);
    }
}