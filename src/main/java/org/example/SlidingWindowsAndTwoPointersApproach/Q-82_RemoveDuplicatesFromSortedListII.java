class RemoveDuplicatesFromSortedListII{
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    // Time complexity: O(n)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers to traverse the linked list.
    // We use a dummy node to keep track of the head of the linked list.
    // We use a pointer to keep track of the previous node.
    // We use a pointer to keep track of the current node.
    // We compare the current node with the next node.
    // If the current node is equal to the next node, we skip the current node and move the previous pointer to the next node.
    // If the current node is not equal to the next node, we move the previous pointer to the current node.
    // We continue this process until we reach the end of the linked list.
    // Finally, we return the head of the linked list.
    public static ListNode3 deleteDuplicates(ListNode3 head) {

        if(head==null) return null;
        ListNode3 FakeHead=new ListNode3(0);
        FakeHead.next=head;
        ListNode3 pre=FakeHead;
        ListNode3 cur=head;

        // Traverse the linked list
        while(cur!=null){
            // Check if the current node is equal to the next node
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }

        // Return the head of the linked list
        return FakeHead.next;
    }

    // Test cases to validate the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        ListNode3 head = new ListNode3(1, new ListNode3(2, new ListNode3(3, new ListNode3(3, new ListNode3(4, new ListNode3(4, new ListNode3(5)))))));
        ListNode3 result = deleteDuplicates(head);
        printList(result); // Expected output: 1 -> 2 -> 5

        head = new ListNode3(1, new ListNode3(1, new ListNode3(1)));
        result = deleteDuplicates(head);
        printList(result); // Expected output: null

        head = new ListNode3(1, new ListNode3(2, new ListNode3(2, new ListNode3(2))));
        result = deleteDuplicates(head);
        printList(result); // Expected output: 1

        head = new ListNode3(1, new ListNode3(2, new ListNode3(3, new ListNode3(4))));
        result = deleteDuplicates(head);
        printList(result); // Expected output: 1 -> 2 -> 3 -> 4

        head = new ListNode3(1, new ListNode3(1, new ListNode3(2, new ListNode3(2, new ListNode3(3, new ListNode3(4))))));
        result = deleteDuplicates(head);
        printList(result); // Expected output: 3 -> 4
    }

    // Helper method to print the linked list
    private static void printList(ListNode3 head) {
        ListNode3 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3() {}
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
}