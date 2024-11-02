/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/



class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node currentLevel = root;

        while (currentLevel != null) {
            Node current = currentLevel;
            Node nextLevelHead = null;
            Node prev = null;

            while (current != null) {
                // Connect the left child
                if (current.left != null) {
                    if (prev != null) prev.next = current.left;
                    else nextLevelHead = current.left;
                    prev = current.left;
                }

                // Connect the right child
                if (current.right != null) {
                    if (prev != null) prev.next = current.right;
                    else nextLevelHead = current.right;
                    prev = current.right;
                }

                current = current.next;
            }

            currentLevel = nextLevelHead;
        }

        return root;
    }
}


 