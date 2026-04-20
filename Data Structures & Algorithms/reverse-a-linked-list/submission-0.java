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
        ListNode reversed = new ListNode();

        while (head != null) {
            // next is null
            if (reversed.next == null) {
                reversed.next = new ListNode(head.val);
            // val is null
            } 

            if (head.next != null) {
                reversed.val = head.next.val;
            // if all fields of the node are full
            } else {
                return reversed.next;
            }
           
            reversed = new ListNode(0, reversed);
            head = head.next;
        }
        return null;
    }
}
