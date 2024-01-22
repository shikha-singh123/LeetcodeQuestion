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
    private void getPreOrder(TreeNode node){
        if(node==null) return;
        answer.add(node.val);
        getPreOrder(node.left);
        getPreOrder(node.right);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        answer=new ArrayList<>();
                  getPreOrder(root);
           return answer;
    }
}