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
        ListNode ptr = head;
        ListNode prev = null; 
        ListNode next = null; 
        while (ptr != null) {
            next = ptr.next; 
            ptr.next = prev; 
            prev = ptr; 
            ptr = next;
        }
        return prev; 
    }
}