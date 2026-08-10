// Last updated: 8/10/2026, 10:31:32 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
}

}