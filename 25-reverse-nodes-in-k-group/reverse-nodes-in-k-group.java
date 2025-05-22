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
    public ListNode reverse(ListNode currNode){
        ListNode preNode=null;
        while(currNode!=null){
        ListNode nextNode=currNode.next;
        currNode.next=preNode;
        preNode=currNode;
        currNode=nextNode;
    }
     return preNode;
    }
    public ListNode findkthNode(ListNode temp,int k){
         while(temp!=null && k>1){
            temp=temp.next;
            k--;
         }
         return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode preNode=null;
         while(temp!=null){
          ListNode  kthNode=findkthNode(temp,k);

            if(kthNode==null){
                if(preNode!=null) preNode.next=temp;
                break;
            }else{
                ListNode nextNode=kthNode.next;
                kthNode.next=null;
                ListNode newHead=reverse(temp);
            
            if(temp==head)
            head=newHead;
               else
                preNode.next=newHead;
             preNode=temp;
            temp=nextNode;
         }
         }
         return head;
    }
}