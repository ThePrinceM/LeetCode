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

    public TreeNode iop(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right != null) temp = temp.right;
        return temp;
    }

    public TreeNode parent(TreeNode root, TreeNode pred){
        if( root.left== pred || root.right == pred) return root;
        TreeNode temp = root.left;
        while(temp.right != pred) temp = temp.right;
        return temp;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            //Case 1 : leaf nodes
            if( root.left == null && root.right == null) return null;

            //Case 2: 1 child node
            else if( root.left == null || root.right == null){
                if(root.left == null) return root.right;
                else return root.left;

            }else{ // Case 3: 2 child nodes-> replace the deleted node with inorder predecessor or inorder successor

                // using inorder predecessor(make sure to mark the parent of predecessor)
                TreeNode pred = iop(root); //iop-> inorder predecessor
                TreeNode predP = parent(root, pred);
                if( root == predP){ // if pred is the node that is child of root that is deleted
                    pred.right = root.right;
                    return pred;
                }
                predP.right = pred.left;
                pred.left = root.left; pred.right = root.right;
                return pred;
            }

        }else if(root.val > key){ //Lst will change
            root.left = deleteNode(root.left , key);

        }else{
            root.right = deleteNode(root.right , key);
        }

        return root;
    }
}