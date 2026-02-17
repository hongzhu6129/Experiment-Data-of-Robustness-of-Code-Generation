import java.util.LinkedList;
import java.util.Queue;

public class FindLessThanSeven {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void main(String[] args) {
        // Example tree creation
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        root.left.left.left = new Node(1); // Added some more for testing
        root.left.left.right = new Node(3);


        System.out.print("Numbers less than 7: ");
        findLessThanSeven(root); // Call the method to find and print
        System.out.println(); // Add newline for clarity
    }


    // Method to find numbers less than 7 in a binary tree
    //  (using Breadth-First Search for level order traversal)
    public static void findLessThanSeven(Node root) {
        if (root == null) {
            return; // Handle empty tree
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data < 7) {
                System.out.print(current.data + " "); // Print if less than 7
            }

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
}



