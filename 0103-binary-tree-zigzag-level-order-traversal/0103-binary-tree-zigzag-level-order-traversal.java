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

    public int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    public void nthLevel(TreeNode root,int current, int target, List<Integer> ls){

        if( root == null) return;
        if( current == target){
            ls.add(root.val);
            return;
        }
        nthLevel(root.left, current + 1, target, ls);
        nthLevel(root.right, current + 1, target, ls);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int height = levels(root);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0; i < height ; i ++){
            List<Integer> ls = new ArrayList<>();
            nthLevel(root, 0, i, ls); // we need to go to each level so target changes every time
            if(i % 2 != 0) Collections.reverse(ls);
            ans.add(ls);
        }
        return ans;
        
    }
}