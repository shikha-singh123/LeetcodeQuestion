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
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null) return null;
        ListNode pre=head;
        ListNode temp=pre.next;

        while(temp!=null){
            if(pre.val==temp.val){
                temp=temp.next;
                continue;
            }else{
            pre.next=temp;
            pre=temp;
            temp=temp.next;
            }
        }
        pre.next=null;
        return head;
    }
}