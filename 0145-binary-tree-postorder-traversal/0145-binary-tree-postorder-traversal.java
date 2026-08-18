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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        post(l,root);
        return l;
    }

    public void post(ArrayList<Integer> al,TreeNode root){
        if(root==null) return;
        post(al,root.left);
        post(al,root.right);
        al.add(root.val);
    }
}