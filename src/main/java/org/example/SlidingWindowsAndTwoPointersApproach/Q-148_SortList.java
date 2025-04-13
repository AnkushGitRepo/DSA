class SortList{
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    // Merge sort approach
    // The idea is to use the merge sort algorithm to sort the linked list.
    // We find the middle of the linked list using the slow and fast pointer approach.
    // We split the linked list into two halves and recursively sort each half.
    // Finally, we merge the two sorted halves to get the sorted linked list.
    // The merge function merges two sorted linked lists into one sorted linked list.
    // The getMid function finds the middle of the linked list using the slow and fast pointer approach.
    // The sortList function sorts the linked list using the merge sort algorithm.
    // The main function tests the solution with various test cases.
    // The ListNode5 class represents a node in the linked list.
    // It contains an integer value and a reference to the next node in the linked list.
    // The constructor initializes the value of the node.
    // The main function creates a linked list and calls the sortList function to sort the linked list.
    // The printList function prints the values of the linked list.
    public static ListNode5 sortList(ListNode5 head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }
        // Find the middle of the list
        ListNode5 mid = getMid(head);
        ListNode5 left = sortList(head);
        ListNode5 right = sortList(mid);
        return merge(left, right);
    }

    // Function to find the middle of the linked list using the slow and fast pointer approach
    private static ListNode5 getMid(ListNode5 head) {
        ListNode5 slow = head;
        ListNode5 fast = head.next;

        // Move slow pointer one step and fast pointer two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode5 mid = slow.next;
        slow.next = null; // Split the list into two halves
        return mid;
    }

    // Function to merge two sorted linked lists into one sorted linked list
    private static ListNode5 merge(ListNode5 left, ListNode5 right) {
        if (left == null) return right;   // If left list is empty, return right list
        if (right == null) return left;   // If right list is empty, return left list

        // Compare the values of the two lists and merge them
        if (left.val < right.val) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        ListNode5 head = new ListNode5(4);
        head.next = new ListNode5(2);
        head.next.next = new ListNode5(1);
        head.next.next.next = new ListNode5(3);
        ListNode5 sortedList = sortList(head);
        printList(sortedList); // Expected output: 1 -> 2 -> 3 -> 4

        head = new ListNode5(-1);
        head.next = new ListNode5(5);
        head.next.next = new ListNode5(3);
        head.next.next.next = new ListNode5(4);
        head.next.next.next.next = new ListNode5(0);
        sortedList = sortList(head);
        printList(sortedList); // Expected output: -1 -> 0 -> 3 -> 4 -> 5

        head = new ListNode5(1);
        head.next = new ListNode5(2);
        head.next.next = new ListNode5(3);
        head.next.next.next = new ListNode5(4);
        head.next.next.next.next = new ListNode5(5);
        sortedList = sortList(head);
        printList(sortedList); // Expected output: 1 -> 2 -> 3 -> 4 -> 5

        head = new ListNode5(5);
        head.next = new ListNode5(4);
        head.next.next = new ListNode5(3);
        head.next.next.next = new ListNode5(2);
        head.next.next.next.next = new ListNode5(1);
        sortedList = sortList(head);
        printList(sortedList); // Expected output: 1 -> 2 -> 3 -> 4 -> 5

        head = new ListNode5(1);
        head.next = new ListNode5(1);
        head.next.next = new ListNode5(1);
        head.next.next.next = new ListNode5(1);
        head.next.next.next.next = new ListNode5(1);
        sortedList = sortList(head);
        printList(sortedList); // Expected output: 1 -> 1 -> 1 -> 1 -> 1

    }

    private static void printList(ListNode5 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

// Definition for singly-linked list
// This is a simple implementation of a singly-linked list node
class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5(int x) { val = x; }
}