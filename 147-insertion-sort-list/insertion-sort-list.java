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
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
        
        List<Integer>arr=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            arr.add(current.val);
            current=current.next;
        }
        for(int i=1;i<arr.size();i++){
            int key=arr.get(i);
            int j=i-1;

            while(j>=0 && arr.get(j)>key){
                arr.set(j+1,arr.get(j));
                j=j-1;
            }
            arr.set(j+1,key);
        }
        current=head;
        for(int i=0;i<arr.size();i++){
            current.val=arr.get(i);
            current=current.next;
        }
        return head;
    }
}