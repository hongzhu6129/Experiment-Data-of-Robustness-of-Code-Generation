class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.print("Original node: ");
        ListNode.printList(head);

        int n = 2; 
        head = removeNthFromEnd(head, n);

        System.out.print("After removing " + n + "nd element from end: ");
        ListNode.printList(head);


        // another example
         head = new ListNode(1);
        System.out.print("Original node: ");
        ListNode.printList(head);

        n = 1;
        head = removeNthFromEnd(head, n);

        System.out.print("After removing " + n + "st element from end: ");
        ListNode.printList(head);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Use two pointers, 'fast' and 'slow'.
        ListNode fast = head;
        ListNode slow = head;

        // Move 'fast' pointer 'n' steps ahead.
        for (int i = 0; i < n; i++) {
            if (fast == null) {  // Handle cases where n is greater than the list length.
                return head; //Or return null if you prefer that behavior for invalid n.
            }
            fast = fast.next;
        }

        // If fast is null after moving n steps, it means we need to remove the head.
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until 'fast' reaches the end.  'slow' will then be 'n' nodes from the end.
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }


        // Remove the nth node from the end.
        slow.next = slow.next.next;

        return head;
    }
}
