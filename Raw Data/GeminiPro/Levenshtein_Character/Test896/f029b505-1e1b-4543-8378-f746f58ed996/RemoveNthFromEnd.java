class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.print("Original node: ");
        printList(head);

        head = removeNthFromEnd(head, 2);
        System.out.print("\nAfter removing 2nd element from end: ");
        printList(head);


        // Another test case
        ListNode head2 = new ListNode(1);
        System.out.print("\n\nOriginal node: ");
        printList(head2);
        head2 = removeNthFromEnd(head2, 1);
        System.out.print("\nAfter removing 1st element from end: ");
        printList(head2); // Should be empty


         // Another test case
        ListNode head3 = new ListNode(1, new ListNode(2));
        System.out.print("\n\nOriginal node: ");
        printList(head3);
        head3 = removeNthFromEnd(head3, 1);
        System.out.print("\nAfter removing 1st element from end: ");
        printList(head3); // Should be 1



    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {  // Note: <= n to handle removing the head node correctly
            if (fast == null) {         // Handle cases where n is greater than the list length.
                return head;         // Nothing to remove, return original list
            }
            fast = fast.next;

        }


        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return the head of the modified list
    }


    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
