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
        deleteNode(head.next.next); // Deleting the 3


        System.out.println("List after deleting 3:");
        printList(head);


        //Example 2: Delete the  2
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        deleteNode(head.next);


        System.out.println("List after deleting 2:");
        printList(head);
    }


    public static void deleteNode(ListNode node) {
        // Check if the node to be deleted is the last node.  If it is,
        // we can't delete it this way.
        if (node == null || node.next == null) { 
            return; // Or throw an exception indicating an invalid operation
        }

        // Copy the data from the next node to the current node.
        node.val = node.next.val;

        // Update the next pointer to skip the next node.
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
