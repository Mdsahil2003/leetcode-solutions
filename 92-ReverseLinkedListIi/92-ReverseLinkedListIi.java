// Last updated: 8/10/2026, 10:33:04 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        
        for(int i = 0 ; curr != null && i < left - 1 ; i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newend = curr;
        ListNode next = curr.next;

        for(int i = 0 ; curr != null && i < right - left + 1 ; i++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
            next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newend.next = curr;
        return head;
    
    }
}