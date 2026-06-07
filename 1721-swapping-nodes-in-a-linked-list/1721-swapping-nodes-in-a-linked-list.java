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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode beg=head;
        ListNode end=head;
        ListNode fast=head;

        //reach from beg
        for(int i=1;i<k;i++) beg=beg.next;

        //fast pointer at k from end
        for(int i=1;i<k;i++) fast=fast.next;

        //reach from end usinf slow-fast method
        while(fast.next!=null){
            fast=fast.next;
            end=end.next;
        }
        int temp=beg.val;
        beg.val=end.val;
        end.val=temp;
        return head;
    }
}