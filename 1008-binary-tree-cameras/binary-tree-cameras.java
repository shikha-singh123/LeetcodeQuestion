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
    int cam = 0;  // To keep track of the number of cameras needed

    public int dfs(TreeNode root) {
        if (root == null) return 1;  // If the node is null, it is considered covered

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (left == 0 || right == 0) {
            cam++;
            return 2;
        } else if (left == 2 || right == 2) {
            return 1;
        } else {
            return 0;
        }
    }


    public int minCameraCover(TreeNode root) {
         if (root == null) return 0;
        
        int ans = dfs(root);
        if (ans == 0) {
            cam++;
        }
        return cam;
    }
}