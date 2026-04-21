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
//s-1::f-1
//s-2::f-3
//s-3::f-2
//s-4::f-4
//s+1 == f+1;


class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null ){
           slow = slow.next;
           fast = fast.next.next;
           if (fast == slow ) return true;
        }
        return false;
    }
}
