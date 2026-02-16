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
        ListNode nodeToDelete = head.next.next; 
        deleteNode(nodeToDelete);

        System.out.println("List after deletion:");
        printList(head);


        //Another example, deleting from the "middle" in a different sized list
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
         head2.next.next.next.next.next = new ListNode(6);

        System.out.println("\nOriginal List 2:");
        printList(head2);

        // Delete the node with value 4
        ListNode nodeToDelete2 = head2.next.next.next;
        deleteNode(nodeToDelete2);


        System.out.println("List 2 after deletion:");
        printList(head2);
    }


    public static void deleteNode(ListNode node) {
        // This function assumes the node to be deleted is NOT the tail
        if (node == null || node.next == null) {
            return; // Nothing to delete or cannot delete the tail this way
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
