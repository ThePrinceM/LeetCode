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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     size++;
        // }
        // if(size==n) return head.next;
        // temp=head;
        // for(int i=1;i<=size-n-1;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;

        //M-2 : slow fast method

        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return head;
    }
}