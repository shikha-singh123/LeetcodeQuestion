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
    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Recursively flatten the right subtree
        flatten(root.right);

        // Recursively flatten the left subtree
        flatten(root.left);

        // Set the current node's right to the previously processed node
        root.right = prev;

        // Set the left to null as per "linked list" structure requirement
        root.left = null;

        // Update prev to the current node
        prev = root;
    }
}
