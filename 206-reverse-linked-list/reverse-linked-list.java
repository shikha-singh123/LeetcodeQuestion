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
import java.util.Stack;
class Solution {
    public ListNode reverseList(ListNode head) {
        // Brute force approach
    //     ListNode temp=head;
    //     Stack<Integer>st= new Stack<>();
    //      while(temp!=null){
    //     st.push(temp.val);
    //     temp=temp.next;
    //     }

    //     temp=head;
    //      while(temp!=null){
    //     temp.val= st.pop();
    //     temp=temp.next;
    // }
    // return head;
    // <-------Time Complexity O(n)-------->
          ListNode temp=head;
          ListNode pre=null;
          while(temp!=null){
             ListNode front=temp.next;
              temp.next=pre;
              pre=temp;
              temp=front;
          }
          return pre;

    }

}