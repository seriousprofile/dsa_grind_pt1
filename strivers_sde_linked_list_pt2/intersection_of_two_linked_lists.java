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

/* 
NOTES:
1. pointer a at list1
2. pointer b at list 2
3. pointer a travels till end of list, and travels through list b till it reaches a similar point
4. pointer b travels till end of list, switches to a and travels till it meets a similar point
5. according to this logic, the no. of nodes traveled will be same for both pointers! you can return either of 
their values as they're the same!
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while(a != b){

            if(a != null){
                a = a.next;
            } else {
                a = headB;
            }

            if(b != null){
                b = b.next;
            } else {
                b = headA;
            }
        }

        return b;
    }
}
