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
    public static ListNode reverse (ListNode head) {
        ListNode curr = head;
        ListNode prev = null; 
        ListNode next = null; 
        while (curr != null) {
            next = curr.next; 
            curr.next = prev; 
            prev=curr; 
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode ptr = head;
        ListNode slow=head; 
        ListNode fast= head; 
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1= reverse(slow);
        ptr=head;
        int sum=0;
        while (l1 != null) {
            sum = Math.max(sum, (l1.val+ptr.val));
            ptr = ptr.next; 
            l1 = l1.next;
        }
        return sum;
    }
}