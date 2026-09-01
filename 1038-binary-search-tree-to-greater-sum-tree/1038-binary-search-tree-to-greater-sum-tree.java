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

    public void inorder(TreeNode root, List<TreeNode> ls){
        if(root == null) return;
        inorder(root.left, ls);
        ls.add(root);
        inorder(root.right, ls);
    }

    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        if( root == null) return null;
        inorder(root, ans);
        for(int i=ans.size()-2 ; i >= 0; i--){
            ans.get(i).val = ans.get(i).val + ans.get(i+1).val;
        }
        return root;
    }
}