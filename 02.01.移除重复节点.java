/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;

        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);

        ListNode result = head, tail = head;
        for (ListNode curNode = head.next; curNode != null; curNode = curNode.next) {
            if (!set.contains(curNode.val)) {
                tail.next = curNode;
                tail = curNode;
                set.add(curNode.val);
            }
        }
        tail.next = null;

        return result;
    }
}