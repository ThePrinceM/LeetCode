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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height=levelsOfTree(root);
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<height;i++){
            List<Integer> al=new ArrayList<>();
            nthLevel(root,0,i,al);
            lst.add(al);
        }
        return lst;
        
    }

    public void nthLevel(TreeNode root, int current, int target, List<Integer> list){ 
        // target -> elements of which level we need to print
        if(root == null) return;
        if(current == target ) {
         list.add(root.val);
         return;
        }
        nthLevel(root.left,current+ 1,target, list);
        nthLevel(root.right,current+ 1,target, list);
    }

    public int levelsOfTree(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levelsOfTree(root.left) ,levelsOfTree(root.right));
    }
}