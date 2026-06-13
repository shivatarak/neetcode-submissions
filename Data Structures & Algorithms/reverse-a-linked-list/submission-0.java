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
        while(head==null || head.next
        ==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode nexttemp=head;
        while(curr!=null){
            nexttemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nexttemp;
        }
        return prev;
    }
}
