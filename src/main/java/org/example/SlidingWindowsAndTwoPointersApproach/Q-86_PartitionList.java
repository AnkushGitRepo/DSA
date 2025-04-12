class PartitionList{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, before and after.
    // The before pointer points to the head of the list.
    // The after pointer points to the tail of the list.
    // We traverse the list and compare the value of each node with x.
    // If the value is less than x, we add it to the before list.
    // If the value is greater than or equal to x, we add it to the after list.
    // Finally, we connect the before list with the after list and return the head of the before list.
    public static ListNode4 partition(ListNode4 head, int x) {
        ListNode4 before = new ListNode4(0);
        ListNode4 after = new ListNode4(0);
        ListNode4 before_curr = before;
        ListNode4 after_curr = after;

        // Traverse the list and compare the value of each node with x
        while(head != null) {
            // If the value is less than x, add it to the before list
            if(head.val < x) {
                before_curr.next = head;
                before_curr = before_curr.next;
            } else {
                after_curr.next = head;
                after_curr = after_curr.next;
            }

            // Move to the next node
            head = head.next;
        }

        // Connect the before list with the after list
        after_curr.next = null;
        before_curr.next = after.next;

        // Return the head of the before list
        return before.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode4 head = new ListNode4(1, new ListNode4(4, new ListNode4(3, new ListNode4(2, new ListNode4(5, new ListNode4(2))))));
        int x = 3;
        ListNode4 result = partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 1 2 2 4 3 5

        System.out.println();

        head = new ListNode4(2, new ListNode4(1));
        x = 2;
        result = partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 1 2

        System.out.println();

        head = new ListNode4(1, new ListNode4(2, new ListNode4(3)));
        x = 0;
        result = partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 1 2 3

        System.out.println();

        head = new ListNode4(1, new ListNode4(2, new ListNode4(3, new ListNode4(4))));
        x = 5;
        result = partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 1 2 3 4

        System.out.println();

        head = new ListNode4(1, new ListNode4(2, new ListNode4(3, new ListNode4(4))));
        x = 3;
        result = partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 1 2 3 4

        System.out.println();
    }
}

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4() {}
    ListNode4(int val) { this.val = val; }
    ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}