class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class dsa1{
    public ListNode removeFirstNode(ListNode head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }
}