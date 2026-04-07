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
        if (head == null || head.next == null) return head;
        ListNode tail = new ListNode(head.val,null);
        while (head.next != null){
            ListNode temp = head.next;
            ListNode newTail = new ListNode(temp.val,tail);
            tail = newTail;
            head = head.next;
        }
        return tail;
    }
}
