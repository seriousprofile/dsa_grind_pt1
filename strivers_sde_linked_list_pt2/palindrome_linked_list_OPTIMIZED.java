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

/*
in this problem, you just have to use the tortoise and hare method to find the middle of the linked list. reverse the list from the n/2th node and compare
the values of the two lists created!
*/
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head; 
        ListNode fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next;
        }

        ListNode first_head = head; 
        ListNode second_head = reverse(slow);

        while(second_head != null){
            if(first_head.val != second_head.val){
                return false;
            } else {
                first_head = first_head.next;
                second_head = second_head.next;
            }
        }

        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head; 
        ListNode fwd = null;

        while(curr != null){
            fwd = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = fwd;
        }
        return prev; 
    }
}
