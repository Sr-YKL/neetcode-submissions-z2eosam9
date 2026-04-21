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


//  Size n 
//  n is even
//  i start at 0 
//  i >= 0 and i <= (n/2)-1
//  i = (n-1-i)th
//   [5,4,2,1]
//   [0,1,2,3]
// 
//  0th = 4-1-0= 3
//  1th = 4-1-1= 2;

//  0th + 3th =  5+1 = 6
//  1th + 2th = 6;

//  [10,10,10,10,4,5,6,7]
//  [0 ,1 ,2 ,3 ,4,5,6,7]

// 
//  0th = 8-1-0 = 7; 10+4=14
//  1th = 8-1-1 = 6; 10+5=15
//  2th = 8-1-2 = 5; 10+6=16
//  3th = 8-1-3 = 4; 10+7=17

// while lop with stack

//  s-10(0):: f-10(0) stack = [10-0]
//  s-10(1):: f-10(2) stack = [10-1,10-0]
//  s-10(2):: f-4(4)  stack = [10-2,10-1,10-0]
//  s-10(3):: f-6(6)  stack = [10-3,10-2,10-1,10-0]
//  s-4(4):: f-x(8)   stack = [10-3,10-2,10-1,10-0] 

// continue the slow and pop the stack 
//  s-4(4):: stack = [10-3,10-2,10-1,10-0] 
//  s-5(5):: stack = [10-3,10-2,10-1,10-0] 
//  s-6(6):: stack = [10-3,10-2,10-1,10-0] 
//  s-7(7):: stack = [10-3,10-2,10-1,10-0]  



class Solution {
    public int pairSum(ListNode head) {
        ListNode fast = head, slow = head;
        Deque<ListNode> twinStack = new ArrayDeque<>();
        int maximumTwinSum = 0; 
        while (fast != null && fast.next != null){
            twinStack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        while(twinStack.peek() != null){
            ListNode twin = twinStack.pop();
            maximumTwinSum = Math.max(maximumTwinSum, twin.val + slow.val);
            slow = slow.next; 
        }
        return maximumTwinSum;
    }
}