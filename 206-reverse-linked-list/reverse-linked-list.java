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
    public ListNode reverseList(ListNode head) {
//With using stack

Stack<Integer>valueStack=new Stack<>();
while(head!=null){
    valueStack.push(head.val);
    head=head.next;
}
ListNode reList=new ListNode(Integer.MIN_VALUE);
ListNode ptr=reList;
while(!valueStack.isEmpty()){
    ptr.next=new ListNode(valueStack.pop());
    ptr=ptr.next;
}
return reList.next;


    //     if(head==null){
    //         return null;
    //     }
    //     if(head.next==head){
    //         return head;
    //     }
    //     ListNode preNode=null;
    //     ListNode currNode=head;
    //     while(currNode!=null){
    //         ListNode nextNode=currNode.next;
    //         currNode.next=preNode;
    //         preNode=currNode;
    //         currNode=nextNode;

    //         head=preNode;
    //     }
    //     return head;
    // }
}
}