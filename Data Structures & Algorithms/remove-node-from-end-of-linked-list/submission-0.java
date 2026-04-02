class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        if (length == n) {
            return head.next;
        }
        curr = head;
        for (int i = 0; i < length - n - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}