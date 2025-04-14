class LinkedListCycleII{
    // Floyd's Cycle Detection Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, slow and fast.
    // The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
    // If there is a cycle in the linked list, the fast pointer will eventually meet the slow pointer.
    // If there is no cycle, the fast pointer will reach the end of the linked list.
    // Once the two pointers meet, we can find the starting point of the cycle by moving one pointer to the head of the list
    // and moving both pointers one step at a time until they meet again.
    public static ListNode6 detectCycle(ListNode6 head) {

        // Check if the list is empty or has only one node
        ListNode6 slow = head, fast = head;

        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        // If there is no cycle, return null
        if (fast == null || fast.next == null) return null;

        // Move one pointer to the head of the list
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }

        // Return the starting point of the cycle
        return head;
    }

    // Test cases to validate the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        ListNode6 head = new ListNode6(3);
        head.next = new ListNode6(2);
        head.next.next = new ListNode6(0);
        head.next.next.next = new ListNode6(-4);
        head.next.next.next.next = head.next; // Create a cycle

        ListNode6 result = detectCycle(head);
        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val); // Expected output: 2
        } else {
            System.out.println("No cycle detected");
        }

        head = new ListNode6(1);
        head.next = new ListNode6(2);
        head.next.next = head; // Create a cycle
        result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val); // Expected output: 1
        } else {
            System.out.println("No cycle detected");
        }

        head = new ListNode6(1);
        head.next = new ListNode6(2);
        head.next.next = new ListNode6(3);
        head.next.next.next = new ListNode6(4);
        head.next.next.next.next = null; // No cycle
        result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val); // Expected output: null
        } else {
            System.out.println("No cycle detected"); // Expected output: No cycle detected
        }

        head = new ListNode6(1);
        head.next = new ListNode6(2);
        head.next.next = new ListNode6(3);
        head.next.next.next = new ListNode6(4);
        head.next.next.next.next = new ListNode6(5);
        head.next.next.next.next.next = head.next; // Create a cycle
        result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val); // Expected output: 2
        } else {
            System.out.println("No cycle detected");
        }

        head = new ListNode6(1);
        head.next = new ListNode6(2);
        head.next.next = new ListNode6(3);
        head.next.next.next = new ListNode6(4);
        head.next.next.next.next = new ListNode6(5);
        head.next.next.next.next.next = new ListNode6(6);
        head.next.next.next.next.next.next = null; // No cycle
        result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val); // Expected output: null
        } else {
            System.out.println("No cycle detected"); // Expected output: No cycle detected
        }

    }
}

class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6(int x) { val = x; }
}