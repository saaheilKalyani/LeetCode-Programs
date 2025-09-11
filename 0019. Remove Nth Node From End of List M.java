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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0; 
        ListNode ptr = head;
        while (ptr != null) {
            cnt+=1; 
            ptr=ptr.next;
        }
        
        if (cnt==n) {
            return head.next;
        }
        ptr=head;
        //int no=n%cnt;
        int no = cnt-n;
        for (int i=1; i<no; i++) {
            ptr=ptr.next;
        }
        if (n==1) {
            ptr.next = null;
        } else {
        ptr.next=ptr.next.next;
        }
        return head;
    }
}