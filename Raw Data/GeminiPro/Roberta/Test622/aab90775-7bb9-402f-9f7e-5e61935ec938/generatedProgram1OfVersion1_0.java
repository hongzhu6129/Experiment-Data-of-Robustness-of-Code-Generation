import java.util.LinkedList;
import java.util.Queue;

public class TreeLessThanSeven {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        // Example tree construction
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.left = new Node(9);
        root.right.right = new Node(14);


        System.out.print("Numbers less than 7 in the tree (Level Order Traversal):");
        findLessThanSeven(root);


        System.out.println("\nNumbers less than 7 in the tree (Pre-order Traversal):");
         findLessThanSevenPreOrder(root);



    }




    // Level order (Breadth-First Search)
    public static void findLessThanSeven(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data < 7) {
                System.out.print(current.data + " ");
            }

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }


     //Pre-Order Traversal
    public static void findLessThanSevenPreOrder(Node node) {
        if (node == null) {
            return;
        }
        if (node.data < 7) {
            System.out.print(node.data+ " ");
        }


        findLessThanSevenPreOrder(node.left);
        findLessThanSevenPreOrder(node.right);


    }
}
