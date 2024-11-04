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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstCPI=-1;
        int preCPI=-1;
        int currentIndex=1;
        ListNode curr=head.next;
        ListNode pre=head;
        int res[]=new int[2];
        res[0]=Integer.MAX_VALUE;

        while(curr.next!=null){
            ListNode nextNode=curr.next;
            if((curr.val<nextNode.val && curr.val<pre.val)||
            (curr.val>nextNode.val && curr.val>pre.val)){
                if(preCPI==-1){
                    firstCPI=currentIndex;
                    preCPI=currentIndex;
                }else{
                    res[0]=Math.min(res[0],currentIndex-preCPI);
                    preCPI=currentIndex;
                }
            }
            pre=pre.next;
            curr=curr.next;
            currentIndex++;
        }
        if(firstCPI!=-1 && res[0]!=Integer.MAX_VALUE){
            res[1]=preCPI-firstCPI;

        }else{
            res[0]=-1;
            res[1]=-1;
        }
        return res;

    }
}