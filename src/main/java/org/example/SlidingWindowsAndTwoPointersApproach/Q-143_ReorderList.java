class ReorderList{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, slow and fast.
    // The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
    // If there is a cycle in the linked list, the fast pointer will eventually meet the slow pointer.
    // If there is no cycle, the fast pointer will reach the end of the linked list.
    // Once the two pointers meet, we can find the starting point of the cycle by moving one pointer to the head of the list
    // and moving both pointers one step at a time until they meet again.

    public static void reorderList(ListNode7 head) {
        if(head==null||head.next==null) return;

        //Find the middle of the list
        ListNode7 p1=head;
        ListNode7 p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode7 preMiddle=p1;
        ListNode7 preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode7 current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }

    // Test cases to validate the solution

    public static void main(String[] args) {
        // Test cases to validate the solution
        ListNode7 head = new ListNode7(1);
        head.next = new ListNode7(2);
        head.next.next = new ListNode7(3);
        head.next.next.next = new ListNode7(4);
        head.next.next.next.next = new ListNode7(5);

        reorderList(head);

        // Print the reordered list
        ListNode7 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();

        head = new ListNode7(1);
        head.next = new ListNode7(2);
        head.next.next = new ListNode7(3);
        head.next.next.next = new ListNode7(4);
        head.next.next.next.next = new ListNode7(5);
        head.next.next.next.next.next = new ListNode7(6);

        reorderList(head);

        // Print the reordered list
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();

        head = new ListNode7(1);
        head.next = new ListNode7(2);
        head.next.next = new ListNode7(3);
        head.next.next.next = new ListNode7(4);
        head.next.next.next.next = new ListNode7(5);
        head.next.next.next.next.next = new ListNode7(6);
        head.next.next.next.next.next.next = new ListNode7(7);
        head.next.next.next.next.next.next.next = new ListNode7(8);
        head.next.next.next.next.next.next.next.next = new ListNode7(9);
        head.next.next.next.next.next.next.next.next = new ListNode7(10);

        reorderList(head);

        // Print the reordered list
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();

        head = new ListNode7(1);
        head.next = new ListNode7(2);
        head.next.next = new ListNode7(3);
        head.next.next.next = new ListNode7(4);
        head.next.next.next.next = new ListNode7(5);
        head.next.next.next.next.next = new ListNode7(6);
        head.next.next.next.next.next.next = new ListNode7(7);
        head.next.next.next.next.next.next.next = new ListNode7(8);
        head.next.next.next.next.next.next.next.next = new ListNode7(9);
        head.next.next.next.next.next.next.next.next = new ListNode7(10);
        head.next.next.next.next.next.next.next.next = new ListNode7(11);
        head.next.next.next.next.next.next.next.next = new ListNode7(12);
        head.next.next.next.next.next.next.next.next = new ListNode7(13);
        head.next.next.next.next.next.next.next.next = new ListNode7(14);
        head.next.next.next.next.next.next.next.next = new ListNode7(15);
        head.next.next.next.next.next.next.next.next = new ListNode7(16);

        reorderList(head);

        // Print the reordered list
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();
    }
}

class ListNode7{
    int val;
    ListNode7 next;
    ListNode7() {}
    ListNode7(int val) { this.val = val; }
    ListNode7(int val, ListNode7 next) { this.val = val; this.next = next; }
}