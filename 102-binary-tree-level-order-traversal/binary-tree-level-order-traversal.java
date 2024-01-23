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
         List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
               for (int i = 0; i < levelSize; i++) {
            TreeNode treeNode=queue.poll();
            currentLevel.add(treeNode.val);
            if(treeNode.left!=null){
                queue.add(treeNode.left);
            }
                        if(treeNode.right!=null){
                queue.add(treeNode.right);
            }
            

        }
        result.add(currentLevel);
      }
      return result;
    }
    }