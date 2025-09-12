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
        ListNode next = null; 
        ListNode prev = null; 
        while (curr != null) {
            next = curr.next;
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }
        return prev; 
    }
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        int cnt = 0;  
        ListNode l1 = head;
        ListNode l2 = null; 
        while (ptr != null) {
            cnt++; 
            ptr = ptr.next;
        }   
        ptr = head;     
        for (int i=0; i< (cnt/2); i++) {
            ptr = ptr.next; 
        }
        l2 = reverse(ptr); 
        ptr = head;
        while (l2 != null) {
            if (l2.val != ptr.val) {
                return false; 
            }
            l2=l2.next;
            ptr = ptr.next;
        }
        return true; 
    }
}