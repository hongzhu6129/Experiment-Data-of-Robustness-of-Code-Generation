import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class TreeSize {

    public static void main(String[] args) {

        // Example tree creation
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        int sizeRecursive = getSizeRecursive(root);
        System.out.println("Size of tree (recursive): " + sizeRecursive);

        int sizeIterative = getSizeIterative(root);
        System.out.println("Size of tree (iterative): " + sizeIterative);
    }

    // Recursive approach
    public static int getSizeRecursive(Node node) {
        if (node == null) {
            return 0;
        } else {
            return (getSizeRecursive(node.left) + 1 + getSizeRecursive(node.right));
        }
    }


    // Iterative approach using Level Order Traversal
    public static int getSizeIterative(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);  // Add root to queue
        int count = 0;

        while (!queue.isEmpty()) {
            Node current = queue.poll(); // Remove from queue
            count++;                  // Increment count for each node

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        return count;
    }
}
