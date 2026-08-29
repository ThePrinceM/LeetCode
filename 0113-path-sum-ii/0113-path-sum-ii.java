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
    public List<List<Integer>> pathSum(TreeNode root, int tSum) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        paths(root, tSum, ls, ans);
        return ans;
    }

    public void paths(TreeNode root, int target, List<Integer> ls, List<List<Integer>> ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(root.val == target){
                ls.add(root.val);
                ans.add(ls);
            }
            return;
        }
        ls.add(root.val);

        List<Integer> l1 = copy(ls);
        List<Integer> l2 = copy(ls);

        paths(root.left,target - root.val, l1,ans);
        paths(root.right,target - root.val, l2,ans);
    }

    public List<Integer> copy(List<Integer> list){
        List<Integer> al = new ArrayList<>();
        for( int e: list){
            al.add(e);
        }
        return al;
    }
}