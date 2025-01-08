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
        
        if(head == null || head.next == null){ //the usual exceptions :)
            return head;
        }

        int length = 1; 
        ListNode tail = head; 
        while(tail.next != null){
            tail = tail.next; //tail traverses till it reaches the end.
            length++; //update the length counter
        }

        k = k % length; //important! this ensures that your loop runs even when k > length.
        if(k == 0){ //if k is a multiple of length, it means that your array returns to its original position!
            return head;
        }

        tail.next = head; //make the list circular

        for(int i = 0; i < length - k; i++){ //length - k is a formula used here that ensures that the pointer goes to the node after moving by k iterations!
            tail = tail.next; //tail keeps traversing till it reaches length - kth node which is the node after k iterations
        }

        head = tail.next; //move head to tail.next so it reaches the last node which we have now moved to the first.
        tail.next = null; //disconnect the tail node from the next node as the next node is now the head node pointing to the other nodes.

        return head;
    }
}
