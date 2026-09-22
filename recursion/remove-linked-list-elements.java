class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return head;

        // Remove nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return head;

        ListNode i = head;
        ListNode j = i.next;

        while (i != null) {

            // j has reached the end
            if (j == null) {
                return head;
            }

            // j is the node we want to remove
            if (j.val == val) {
                i.next = j.next;
                j = i.next;
            } 
            else {
                i = i.next;
                j = i.next;
            }
        }

        return head;
    }
}