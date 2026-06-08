/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        int s1=0;
        int s2=0;


        while(l1!=null){
            l1=l1.next;
            s1++;
        }

        while(l2!=null){
            l2=l2.next;
            s2++;
        }
        l1=headA;
        l2=headB;
        if(s1!=s2){
            for(int i=0; i<Math.abs(s1-s2);i++){
                if(s1>s2) l1=l1.next;
                else l2=l2.next;
            }
            while(l1!=l2){
                l1=l1.next;
                l2=l2.next;
            }
            return l1;
        }else {
            while(l1!=l2){
                l1=l1.next;
                l2=l2.next;
            }
            return l1;
        }
        
    }
}