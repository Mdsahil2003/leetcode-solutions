// Last updated: 8/10/2026, 10:32:35 PM
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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int count = 1;
                ListNode temp = slow.next;
                while(temp != slow){
                    temp = temp.next;
                    count++;
                }
                length = count;
                break;
            }
        }
            if(length == 0){
                return null;
            }
            ListNode f = head;
            ListNode s = head;

            while(length > 0){
                s = s.next;
                length--;
            }
            while(f != s){
                f = f.next;
                s = s.next;
            }
        return s;
    }
    }
