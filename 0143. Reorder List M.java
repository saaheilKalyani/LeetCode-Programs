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
    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev; 
            prev = curr; 
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode ptr = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l2 = reverse(slow.next);
        slow.next=null;
        ListNode l1 = head;
        while(l2!=null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
    }
}