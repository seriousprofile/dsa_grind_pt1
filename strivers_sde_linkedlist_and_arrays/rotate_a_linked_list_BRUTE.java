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

      //the usual exceptions :)
        if(head == null || head.next == null){
            return head; 
        } 

      //to ensure it doesnt cause a problem if k is greater than the length!
        int length = 0;
        ListNode current = head; 
        while (current != null) {
            current = current.next;
            length++;
        }
        k = k % length;

      //this part is for running the code that helps in moving the last node to the first!
        for (int i = 0; i < k; i++){
            ListNode temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode end = temp.next; //assign an end pointer to the last node
            temp.next = null; //disconnect the last node from the last second node
            end.next = head; //connect the last node to the first node
            head = end; //finally, move the head pointer to the last node so it is now the first node!
        }
        return head;
    }
}
