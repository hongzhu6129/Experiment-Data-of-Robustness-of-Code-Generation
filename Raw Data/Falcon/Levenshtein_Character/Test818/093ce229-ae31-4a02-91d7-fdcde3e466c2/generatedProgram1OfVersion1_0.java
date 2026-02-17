class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListReversal {

    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move 'prev' one step forward
            current = next;      // Move 'current' one step forward
        }

        return prev; // 'prev' is now the new head of the reversed list
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListReversal list = new LinkedListReversal();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        System.out.println("Original Linked List:");
        list.printList(head);

        head = list.reverse(head); // Reverse the list

        System.out.println("Reversed Linked List:");
        list.printList(head);

        // Example with a single-node list:
        Node singleNode = new Node(10);
        System.out.println("Original Single Node List:");
        list.printList(singleNode);
        singleNode = list.reverse(singleNode);
        System.out.println("Reversed Single Node List:");
        list.printList(singleNode);


        //Example with an empty list:
        Node emptyList = null;
        System.out.println("Original Empty List:");
        list.printList(emptyList);
        emptyList = list.reverse(emptyList);
        System.out.println("Reversed Empty List:"); // Remains empty.
        list.printList(emptyList);

    }
}



