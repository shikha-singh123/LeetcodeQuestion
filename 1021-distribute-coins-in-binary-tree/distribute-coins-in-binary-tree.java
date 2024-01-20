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
     static int ans(TreeNode parent, TreeNode child, int count) {
        if (child == null) return count; // Fixed condition for null child

        count = ans(child, child.left, count); // Recursively process left child
        count = ans(child, child.right, count); // Recursively process right child

        if (child.val > 1) {
            int extraCoins = child.val - 1;
            child.val = 1;
            parent.val += extraCoins;
            count += extraCoins;
        } else if (child.val < 1) {
            int neededCoins = 1 + Math.abs(child.val);
            child.val = 1;
            parent.val -= neededCoins;
            count += neededCoins;
        }

        return count;
    }

    public int distributeCoins(TreeNode root) {
         int count = 0;
        count = ans(root, root, count);
        return count;
    }
}