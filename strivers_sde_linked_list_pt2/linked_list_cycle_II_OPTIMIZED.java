/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*
notes:
in this problem, there's two phases: 
1. detecting a cycle: done using the tortoise and hare method! slow advances by 1 node, fast by 2. if they are at the same node at some point,
a cycle is detected!
2. determining the first node of this cycle: use the tortoise and hare method but this time, advance slow by 1 node and fast ALSO by 1 node. the point
where they meet is the first node of the cycle!
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                slow = slow.next; 
                fast = fast.next;
            }

            return slow; 
            }
        }

        return null;
    }
}
