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
    private List<Integer>answer;
    private void getInOrder(TreeNode node){
        if(node==null) return ;
        getInOrder(node.left);
        answer.add(node.val);
        getInOrder(node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        answer=new ArrayList<>();
        getInOrder(root);
        return answer;
    }
}