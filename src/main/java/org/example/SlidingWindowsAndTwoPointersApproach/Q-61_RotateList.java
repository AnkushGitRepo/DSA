class RotateList{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, fast and slow.
    // The fast pointer moves n steps ahead of the slow pointer.
    // When the fast pointer reaches the end of the list, the slow pointer will be at the (n+1)th node from the end.
    // We remove the next node of the slow pointer.
    // We return the head of the list.
    public static ListNode2 rotateRight(ListNode2 head, int n) {
        // If the list is empty or has only one node, return the head
        if (head==null||head.next==null) return head;
        ListNode2 dummy=new ListNode2(0);
        dummy.next=head;
        ListNode2 fast=dummy,slow=dummy;

        int i;
        for (i=0;fast.next!=null;i++)//Get the total length
            fast=fast.next;

        for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
            slow=slow.next;

        fast.next=dummy.next; //Do the rotation
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        ListNode2 head = new ListNode2(1, new ListNode2(2, new ListNode2(3, new ListNode2(4, new ListNode2(5)))));
        int n = 2;
        ListNode2 result = rotateRight(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 4 5 1 2 3

        System.out.println();

        head = new ListNode2(1, new ListNode2(2));
        n = 1;
        result = rotateRight(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 2 1

        System.out.println();

        head = new ListNode2(1, new ListNode2(2, new ListNode2(3)));
        n = 4;
        result = rotateRight(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 3 1 2

        System.out.println();
        head = new ListNode2(1);
        n = 0;
        result = rotateRight(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 1

        System.out.println();

        head = new ListNode2(1, new ListNode2(2, new ListNode2(3, new ListNode2(4))));
        n = 3;
        result = rotateRight(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 2 3 4 1
    }
}

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
    ListNode2(int x, ListNode2 next) { val = x; this.next = next; }
}
