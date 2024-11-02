/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private ListNode current;

    private TreeNode create(int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;

        // Recursively construct the left subtree
        TreeNode left = create(start, mid - 1);

        // Current node becomes root of the BST for this subtree
        TreeNode node = new TreeNode(current.val);
        node.left = left;

        // Move to the next list node
        current = current.next;

        // Recursively construct the right subtree
        node.right = create(mid + 1, end);

        return node;
    }

    public TreeNode sortedListToBST(ListNode head) {
        // Calculate the length of the linked list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        current = head;
        return create(0, length - 1);
    }
}
