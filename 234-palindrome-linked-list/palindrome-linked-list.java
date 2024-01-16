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
    public boolean isPalindrome(ListNode head) {
        // *******Brute force**********
    //     ListNode temp= head;
    //     Stack <Integer>st=new Stack<>();

    //     while(temp!=null){
    //         st.push(temp.val);
    //         temp=temp.next;

    //     }
    //     temp=head;
    //     while(temp!=null){

    //     if(temp.val!=st.peek()) return false;
    //     temp=temp.next;
    //     st.pop();

    // }
    // return true;
// **********Optimise solution

      
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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
        // *******Brute force**********
    //     ListNode temp= head;
    //     Stack <Integer>st=new Stack<>();

    //     while(temp!=null){
    //         st.push(temp.val);
    //         temp=temp.next;

    //     }
    //     temp=head;
    //     while(temp!=null){

    //     if(temp.val!=st.peek()) return false;
    //     temp=temp.next;
    //     st.pop();

    // }
    // return true;
// **********Optimise solution
    if(head==null || head.next==null )return true;
       ListNode slow = head; 
       ListNode fast = head;
       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }

    ListNode secondHalf= reverseLinkedList(slow.next);
    ListNode firstHalf= head;

       while(secondHalf!=null){
           if(firstHalf.val!=secondHalf.val) {
           reverseLinkedList(slow.next);
           return false;
       }
       
       firstHalf=firstHalf.next;
       secondHalf=secondHalf.next;

}
 reverseLinkedList(slow.next);
 return true;
}
private ListNode reverseLinkedList(ListNode head){
    ListNode prev=null;
    ListNode current=head;
while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}
  
