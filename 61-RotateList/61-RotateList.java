// Last updated: 8/10/2026, 10:33:33 PM
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
        if(k <= 0 || head == null || head.next == null){
            return head;
        }

        ListNode temp1 = head;
        int count = 1;
        while (temp1.next != null) {
            temp1 = temp1.next;
            count++;
        }
        
        k = k % count;

        ListNode temp = head;
        ListNode prev = null;
        for(int i = 0 ; i < k ; i++){
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}