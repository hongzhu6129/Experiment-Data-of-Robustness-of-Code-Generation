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

        System.out.println("List after deleting 3:");
        printList(head);


        //Another example deleting first node
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);


        System.out.println("\nOriginal List 2:");
        printList(head2);

        deleteNode(head2);
        System.out.println("List 2 after deleting the first node (1):");


        printList(head2); //head2 will now point to the second node

         // Example: Trying to delete a node that doesn't exist
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        System.out.println("\nOriginal List 3:");
        printList(head3);

        deleteNode(new ListNode(5)); // Try to delete 5 (not in the list)
        System.out.println("List 3 after trying to delete a non-existent node (5):");
        printList(head3); // The list remains unchanged

    }

    public static void deleteNode(ListNode node) {
        // The standard "in-place" node deletion method assumes we DON'T have access to the previous node.  We copy the data from the next node into the current node and then delete the next node.
        if (node == null || node.next == null) {
            return; // Cannot delete last node with this method (or if the node itself is null)
        }
        node.val = node.next.val;
        node.next = node.next.next;
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




