class ListNode {
    int val;
    ListNode next;

    ListNode(int d) {
        val = d;
        next = null;
    }
}

public class DeleteMiddleNode {

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Delete the node with value 3 (middle node in this case)
        ListNode nodeToDelete = head.next.next; 
        deleteNode(nodeToDelete);

        System.out.println("List after deleting node 3:");
        printList(head);


        //Another Example:  Delete the node with value 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);


        System.out.println("Original List 2:");
        printList(head2);
        ListNode nodeToDelete2 = head2.next;

        deleteNode(nodeToDelete2);


        System.out.println("List 2 after deleting node 2:");
        printList(head2);



        //Edge case: Trying to delete the last node - this won't work correctly with the given signature restriction
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);

        System.out.println("Original List 3:");
        printList(head3);

        deleteNode(head3.next); // Attempting to delete the last node
        System.out.println("List 3 after (incorrectly) deleting node 2:");
        printList(head3);

    }


    public static void deleteNode(ListNode node) {
        // This method assumes the node to be deleted is NOT the last node.  It's a constraint of the signature.
        if (node != null && node.next != null) {  //Crucial check!
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

