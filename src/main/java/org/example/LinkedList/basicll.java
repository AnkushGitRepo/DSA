class Node{
    int data;
    int length = 0;
    Node next;
    Node(int d){
        data = d;
        next = null;
        length++;
    }

    Node head;

    // Display the linked list
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Display the linked list in reverse order
    public static void displayReverse(Node head){
        if(head == null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    // Insert at last
    public Node insertAtLast(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    // Insert at first
    public Node insertAtFirst(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Insert at position
    public Node insertAtPosition(Node head, int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            return insertAtFirst(head, data);
        }
        Node curr = head;
        for(int i = 0; i < position - 1; i++){
            if(curr == null){
                return head;
            }
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    // Delete at position
    public Node deleteAtPosition(Node head, int position){
        if(head == null){
            return null;
        }
        if(position == 0){
            return head.next;
        }
        Node curr = head;
        for(int i = 0; i < position - 1; i++){
            if(curr == null || curr.next == null){
                return head;
            }
            curr = curr.next;
        }
        if(curr.next == null){
            return head;
        }
        curr.next = curr.next.next;
        return head;
    }

    // Reverse the linked list
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Find the middle of the linked list
    public Node findMiddle(Node head){
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Detect cycle in the linked list
    public boolean detectCycle(Node head){
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // Merge two sorted linked lists
    public Node mergeTwoSortedLists(Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.data < l2.data){
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }

    // Remove duplicates from sorted linked list
    public Node removeDuplicates(Node head){
        if(head == null){
            return null;
        }
        Node curr = head;
        while(curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

}

class basicll{
    public static void main(String[] args) {
        Node list = new Node(1);
        Node head = null;
        head = list.insertAtLast(head, 2);
        head = list.insertAtLast(head, 3);
        head = list.insertAtLast(head, 4);
        head = list.insertAtLast(head, 5);

        System.out.println("Original Linked List:");
        Node.display(head);

        System.out.println("Reversed Linked List:");
        Node.display(list.reverse(head));

        System.out.println("Middle of the Linked List:");
        Node middle = list.findMiddle(head);
        if(middle != null){
            System.out.println(middle.data);
        } else {
            System.out.println("List is empty");
        }
    }

}

