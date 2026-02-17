import java.util.LinkedList;
import java.util.Queue;

public class RemoveLastElementTree {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Original Tree:");
        printLevelOrder(root); // Print the original tree

        int removedElement = removeLastElement(root);

        if (removedElement != -1) { // Check if the tree is not empty
            System.out.println("\nRemoved element: " + removedElement);
            System.out.println("Tree after removal:");
            printLevelOrder(root);  // Print the modified tree 
        } else {
            System.out.println("Tree is empty.");
        }


    }


    public static int removeLastElement(Node root) {
        if (root == null) {
            return -1; // Handle empty tree
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        Node lastNode = null;
        Node parentOfLast = null;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            lastNode = current; // Update lastNode with current node

            if (current.left != null) {
                parentOfLast = current;
                queue.offer(current.left);
            }
            if (current.right != null) {
                parentOfLast = current;
                queue.offer(current.right);
            }
        }

        if (parentOfLast != null) {
            if (parentOfLast.right == lastNode) {
                parentOfLast.right = null;
            } else {
                parentOfLast.left = null;
            }
        } else { // If the tree has only one node (root)
           root = null; // Set root to null to indicate an empty tree after removal
        }

        return (lastNode != null) ? lastNode.data : -1;
    }




    // Helper function to print the tree level by level (for verification)
    public static void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            System.out.println(); // Newline for next level
        }
    }



}
