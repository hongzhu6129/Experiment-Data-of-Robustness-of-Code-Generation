class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void remove_Duplicates() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next node
            }
        }
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(21);
        llist.push(14);
        llist.push(14);
        llist.push(11);
        llist.push(7);
        llist.push(7);

        System.out.println("List before removing duplicates:");
        llist.printList();

        llist.remove_Duplicates();

        System.out.println("List after removing duplicates:");
        llist.printList();
    }

}
