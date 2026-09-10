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

    public void checkLeaf(TreeNode root, List<Integer> ls){
        if( root == null) return;
        checkLeaf(root.left,ls);
        checkLeaf(root.right,ls);
        if( root.left == null && root.right == null) ls.add(root.val);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ls1= new ArrayList<>();
        List<Integer> ls2= new ArrayList<>();
        checkLeaf(root1, ls1);
        checkLeaf(root2, ls2);
        return ls1.equals(ls2);
    }
}