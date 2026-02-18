class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListReverse {

    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }


    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        Node head = new Node(20);
        head.next = new Node(40);
        head.next.next = new Node(60);
        head.next.next.next = new Node(80);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
