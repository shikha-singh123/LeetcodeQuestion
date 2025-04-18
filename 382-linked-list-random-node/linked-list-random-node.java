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
class Solution {
 private ArrayList<Integer>al=new ArrayList<>();
  private Random random = new Random();
    public Solution(ListNode head) {
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
          int index = random.nextInt(al.size());
        return al.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */