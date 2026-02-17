class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
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
        deleteNode(head.next.next); 

        System.out.println("List after deletion:");
        printList(head);


        // Another test case: deleting the last node (technically not middle, but demonstrating it works)
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("\nOriginal List 2:");
        printList(head2);
        deleteNode(head2.next);
        System.out.println("List after deletion 2:");
        printList(head2);



        //Deleting the first node
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);

        System.out.println("\nOriginal List 3:");
        printList(head3);
        deleteNode(head3); // Note: head3 is the node to be deleted, not the "previous" node.
        System.out.println("List after deletion 3:");
        printList(head3.next); // Print starting from the new head



    }

    public static void deleteNode(ListNode node) {
        // Core logic to delete the given 'node'
        if (node == null || node.next == null) { 
            return; // Cannot delete last node with this method (or a null node).  Handle in calling code.
        }
        node.val = node.next.val; // Copy the value of the next node
        node.next = node.next.next; // Skip over the next node, effectively deleting it

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
