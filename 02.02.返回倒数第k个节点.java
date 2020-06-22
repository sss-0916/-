/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode firstNode = head;
        for (int i = 0; i < k; ++i) {
            firstNode = firstNode.next;
        }

        ListNode secondNode = head;
        while (firstNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        return secondNode.val;
    }
}