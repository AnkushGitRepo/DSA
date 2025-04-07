class RemoveNthNodeFromEndOfList{
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNode result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: 1 2 3 5
        System.out.println();

        head = new ListNode(1);
        n = 1;
        result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: (empty list)
        System.out.println();

        head = new ListNode(1, new ListNode(2));
        n = 1;
        result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: 1
        System.out.println();

        head = new ListNode(1, new ListNode(2));
        n = 2;
        result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: (empty list)
        System.out.println();

    }


}


// Definition for singly-linked list.
// class ListNode {
//  int val;
//  ListNode next;
//  ListNode() {}
//  ListNode(int val) { this.val = val; }
//  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }