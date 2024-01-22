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
    private void getPostOrder(TreeNode node){
        if(node==null) return;
        getPostOrder(node.left);
        getPostOrder(node.right);
        answer.add(node.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        answer=new ArrayList<>();
        getPostOrder(root);
        return answer ;
    }
}