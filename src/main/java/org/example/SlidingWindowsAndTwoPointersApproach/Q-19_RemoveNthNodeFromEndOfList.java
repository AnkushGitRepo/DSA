class RemoveNthNodeFromEndOfList{
    // Time complexity: O(n)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, fast and slow.
    // The fast pointer moves n steps ahead of the slow pointer.
    // When the fast pointer reaches the end of the list, the slow pointer will be at the (n+1)th node from the end.
    // We remove the next node of the slow pointer.
    // We return the head of the list.
    public static ListNode1 removeNthFromEnd(ListNode1 head, int n) {
        ListNode1 fast = head, slow = head;
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
        ListNode1 head = new ListNode1(1, new ListNode1(2, new ListNode1(3, new ListNode1(4, new ListNode1(5)))));
        int n = 2;
        ListNode1 result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: 1 2 3 5
        System.out.println();

        head = new ListNode1(1);
        n = 1;
        result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: (empty list)
        System.out.println();

        head = new ListNode1(1, new ListNode1(2));
        n = 1;
        result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: 1
        System.out.println();

        head = new ListNode1(1, new ListNode1(2));
        n = 2;
        result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        // Output: 2
        System.out.println();

    }


}


// Definition for singly-linked list.
 class ListNode1 {
  int val;
  ListNode1 next;
  ListNode1() {}
  ListNode1(int val) { this.val = val; }
  ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }