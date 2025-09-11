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
        if (head == null || head.next == null || k == 0) return head;
        ListNode ptr = head;
        int cnt=1; 
        while (ptr.next!=null) {
            ptr = ptr.next;
            cnt++; 
        }
        ptr.next=head;
        ptr = head;
        int no = cnt - (k % cnt);
        for (int i=1; i<no; i++) {
            ptr=ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        return head;
    }
}