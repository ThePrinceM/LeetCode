class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length - 1);
    }

    public TreeNode buildTree(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return null;
        }

        int rootVal = arr[lo];
        TreeNode root = new TreeNode(rootVal);

        if (lo == hi) {
            return root;
        }

        int rst = -1;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] > rootVal) {
                rst = i;
                break;
            }
        }

        if (rst == -1) {
            root.left = buildTree(arr, lo + 1, hi);
            return root;
        }

        root.left = buildTree(arr, lo + 1, rst - 1);
        root.right = buildTree(arr, rst, hi);

        return root;
    }
}