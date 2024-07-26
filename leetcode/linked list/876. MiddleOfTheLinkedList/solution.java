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
class solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int middle_count = 1;

        int count = 1;

        while (head.next != null) {
            head = head.next;
            count++;
            if (count%2 == 0) {
                while (middle_count != (count/2 + 1)) {
                    middle = middle.next;
                    middle_count++;
                }
            }

            else {
                while (middle_count != count/2 + 1) {
                    middle = middle.next;
                    middle_count++;
                }
            }
        }
        return middle;
    }
}