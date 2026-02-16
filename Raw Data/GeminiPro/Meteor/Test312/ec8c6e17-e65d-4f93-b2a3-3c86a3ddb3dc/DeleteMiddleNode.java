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

        // Delete the node with value 3 (middle node)
        deleteNode(head.next.next); 

        System.out.println("List after deleting 3:");
        printList(head);


        // Another example - deleting the 2nd node (value 2):
         head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        System.out.println("\nOriginal List:");
        printList(head);
        deleteNode(head.next);
        System.out.println("List after deleting 2:");
        printList(head);



         // Edge case:  Trying to delete the last node. This won't work correctly using this method because we need to modify the *previous* node's "next".
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println("\nOriginal List:");
        printList(head);
        System.out.println("Attempting to delete the last node(3). This will not work as intended!"); // Important note!
        deleteNode(head.next.next);
        System.out.println("List after attempting to delete last node:");
        printList(head);



    }

    public static void deleteNode(ListNode node) {
        // Core logic to delete a node in the middle.
        // This method ASSUMES the node to be deleted is NOT the last node.
        if (node == null || node.next == null) {
            // This function cannot delete the last node, and handles the case where a null node is passed.  An exception could be thrown instead if desired.
            return;
        }


        // Copy the data from the next node to the current node
        node.val = node.next.val;

        // Update the next pointer to skip the next node
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


