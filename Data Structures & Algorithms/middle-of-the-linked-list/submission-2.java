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
//   [1,2,3,4,5]
// a-1 b-1
// a-2 b-3
// a-3 b-5
//
// [1,2,3,4,5,6] 
// a-1 b-1
// a-2 b-3
// a-3 b-5
// a-4 b-x

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            middle = middle.next;
            fastPointer = fastPointer.next.next;
        }
        return middle;
    }
}