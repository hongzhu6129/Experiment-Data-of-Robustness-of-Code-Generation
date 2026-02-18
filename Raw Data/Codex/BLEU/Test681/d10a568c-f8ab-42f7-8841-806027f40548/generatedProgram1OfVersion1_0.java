class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
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

        // Node to delete (e.g., value 3)
        ListNode nodeToDelete = head.next.next; 

        deleteNode(nodeToDelete);

        System.out.println("List after deleting node:");
        printList(head);


        //Another Example: Deleting the tail node requires different handling.
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        nodeToDelete = head.next.next;
        System.out.println("\nOriginal List:");
        printList(head);
         try {
             deleteNode(nodeToDelete); //This will throw an exception if not handled as a special case
        } catch (NullPointerException e) {
             System.out.println("Cannot delete the tail using this method directly.");
        }

        // To delete the tail, you need to iterate and modify the previous node's 'next'.
        ListNode current = head;
        while(current.next != null && current.next.next!=null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("List after deleting tail (correctly):");
         printList(head);



    }

    public static void deleteNode(ListNode node) {
        /*
        This function deletes the given node from a linked list. 
        IMPORTANT: This approach only works if the node to be deleted is NOT the tail node.
        If it's the tail node, a NullPointerException will occur because we're trying to access the 'next' of a null element.
        To handle the tail node, you'd need to traverse from the head and modify the 'next' of the second-to-last node.

        The function modifies the linked list in place.
         */

        if (node == null || node.next == null) { //Special handling if trying to delete the tail
            throw new NullPointerException("Cannot delete the tail node using this method directly.  Provide the previous node instead.");
        }
        // Copy the data from the next node to the current node
        node.val = node.next.val;
        // Update the 'next' pointer to skip the next node
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
