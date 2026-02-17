import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementFromTree {

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
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int keyToRemove = 5;

        root = removeNode(root, keyToRemove);

        System.out.print("Inorder traversal after removing " + keyToRemove + ": ");
        inorderTraversal(root); // Output should not contain 5
    }

    public static Node removeNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data == key) {
            // Node to be removed is the root
            return removeRoot(root);  // Helper method added
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node keyNode = null, parent = null;

        while (!q.isEmpty()) {
            parent = q.poll();

            if (parent.left != null) {
                if (parent.left.data == key) {
                    keyNode = parent.left;
                    break; 
                }
                q.add(parent.left);
            }

            if (parent.right != null) {
                if (parent.right.data == key) {
                    keyNode = parent.right;
                    break;
                }
                q.add(parent.right);
            }
        }


        if (keyNode != null) {
            // Replace keyNode's data with deepest node's data
            Node deepest = findDeepest(root);  // Helper method added
            keyNode.data = deepest.data;

            // Remove the deepest node using another helper method
            removeDeepest(root, deepest); // Helper method added
        }

        return root;
    }
    // Helper functions to keep main concise
    private static Node removeRoot(Node root){
        if(root == null) return null;
        if(root.left == null) return root.right;
        if(root.right == null) return root.left;
        root.data = findDeepest(root).data;
        removeDeepest(root, findDeepest(root));
        return root;
    }


    private static Node findDeepest(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node deepest = null;
        while(!q.isEmpty()){
            deepest = q.poll();
            if(deepest.left != null) q.add(deepest.left);
            if(deepest.right != null) q.add(deepest.right);
        }
        return deepest;
    }

    private static void removeDeepest(Node root, Node deepest) {
        if (root == null || deepest == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == deepest) {
                temp = null;
                return;
            }
            if (temp.left != null) {
                if (temp.left == deepest) {
                    temp.left = null;
                    return;
                }
                q.add(temp.left);
            }
            if (temp.right != null) {
                if (temp.right == deepest) {
                    temp.right = null;
                    return;
                }
                q.add(temp.right);
            }
        }


    }

    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}


