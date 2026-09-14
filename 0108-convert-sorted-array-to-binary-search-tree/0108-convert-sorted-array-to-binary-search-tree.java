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

    public TreeNode buildTree(int[] arr, int lo, int hi){
        if(lo > hi) return null;
        int m = (lo + hi)/2;
        TreeNode root = new TreeNode(arr[m]);
        root.left = buildTree(arr , lo,m-1 );
        root.right = buildTree(arr, m+1, hi);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return buildTree(nums, 0, n-1);
    }
}