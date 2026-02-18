import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementFromTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        int keyToRemove = 5; 

        root = removeNode(root, keyToRemove);

        // Print the modified tree (Inorder traversal for example)
        printInorder(root); // Output will vary depending on the keyToRemove
    }

    public static Node removeNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data == key) {
            // Node to remove is the root
            return removeRoot(root); 
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        Node keyNode = null, parent = null;
        while (!q.isEmpty()) {
            parent = q.poll();

            if (parent.left != null) {
                if (parent.left.data == key) {
                    keyNode = parent.left;
                    break; 
                }
                q.offer(parent.left);
            }

            if (parent.right != null) {
                if (parent.right.data == key) {
                    keyNode = parent.right;
                    break;
                }
                q.offer(parent.right);
            }
        }


        if (keyNode != null) {
            // Replace the key node with the deepest node
            Node deepestNode = getDeepestNode(root);
            int temp = deepestNode.data;
            deleteDeepestNode(root, deepestNode);
            keyNode.data = temp;
        }
        return root;
    }

    private static Node removeRoot(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        if(root.left == null) {
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }
        Node deepest = getDeepestNode(root.left);
        int value = deepest.data;
        deleteDeepestNode(root, deepest);
        root.data = value;
        return root;
    }

    private static Node getDeepestNode(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
        return temp;
    }

    private static void deleteDeepestNode(Node root, Node deepestNode) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp.right != null) {
                if (temp.right == deepestNode) {
                    temp.right = null;
                    return;
                } else {
                    q.offer(temp.right);
                }
            }

            if (temp.left != null) {
                if (temp.left == deepestNode) {
                    temp.left = null;
                    return;
                } else {
                    q.offer(temp.left);
                }
            }

        }

    }

    // Utility function for Inorder Traversal (to print/check the tree)
    public static void printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }


}
