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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        ListNode temp=new ListNode(0);
        ListNode r=temp;
        ListNode t=head;
        int l=0;
        while(head!=null){
            l++;
            head=head.next;
        }
        int res[]=new int[l];
        int p=0;
        head=t;
        while(head!=null){
            res[p]=head.val;
            head=head.next;
            p++;
        }
        Arrays.sort(res);
        for(int i=0;i<l;i++){
            r.next=new ListNode(res[i]);
            r=r.next;
        }
        return temp.next;
    }
}