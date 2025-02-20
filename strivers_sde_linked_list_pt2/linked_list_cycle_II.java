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
a brute force approach would be to use a hashmap to track all the nodes that are visited. using containsKey() method we can determine if a node has already 
been visited or not to detect a cycle! TC and SC are both O(N). space complexity can be reduced to O(1)
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head; 

        HashMap<ListNode, Integer> hm = new HashMap<>();

        while(temp != null){
            if(hm.containsKey(temp)){
                return temp;
            }

            hm.put(temp, 1);
            temp = temp.next;
        }

        return null;
    }
}
