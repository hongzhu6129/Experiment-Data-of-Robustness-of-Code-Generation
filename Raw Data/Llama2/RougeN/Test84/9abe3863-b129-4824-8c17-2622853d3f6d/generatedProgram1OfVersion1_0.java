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
        deleteNode(head.next.next); 

        System.out.println("List after deleting 3:");
        printList(head);


        //Another example - deleting the first node:
        ListNode head2 = new ListNode(10);
        head2.next = new ListNode(20);
        head2.next.next = new ListNode(30);
        System.out.println("\nOriginal List 2:");
        printList(head2);
        deleteNode(head2);
        System.out.println("List 2 after deleting 10:");
        printList(head2);


         //Another example - deleting the last node. You'd pass the second to last node in this case
        ListNode head3 = new ListNode(100);
        head3.next = new ListNode(200);
        head3.next.next = new ListNode(300);
        System.out.println("\nOriginal List 3:");
        printList(head3);
        deleteNode(head3.next);
        System.out.println("List 3 after deleting 200 (effectively last node):");
        printList(head3);


    }

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {  //Handle cases where node is null or last node (can't delete using this method)
             return; // or throw an exception as appropriate for your application
        }
        
        node.val = node.next.val; // Copy the data from the next node
        node.next = node.next.next; // Update the next pointer to skip the next node
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
