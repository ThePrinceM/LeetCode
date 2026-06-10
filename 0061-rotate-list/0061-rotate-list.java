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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        //base case
        if(head==null || head.next==null || k==0) return head;

        //find the length
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Optimize k if after rotating it becomes the same
        k = k % len;
        if (k == 0) {
            return head;
        }
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode h=slow.next;
        slow.next=null;
        fast.next=head;
        return h;
    }
}