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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(-1);
        ListNode curr=dummyHead;
        ListNode tem1= l1; 
        ListNode tem2= l2;
        int carry=0;
        while(tem1!=null || tem2!=null){
        int sum=carry;
            if(tem1!=null) {
                sum+=tem1.val;
                tem1=tem1.next;
            }
            if(tem2!=null){
                 sum+=tem2.val;
                 tem2=tem2.next;
            }
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newNode;
            curr=curr.next;
            // if(ListNode tem1) tem1=tem1.val;
            // if(ListNode tem2) tem2=tem2.val;
             
        }
        if(carry>0){
            ListNode newNode=new ListNode(carry);
            curr.next=newNode;
        }
        return dummyHead.next;
    }
}