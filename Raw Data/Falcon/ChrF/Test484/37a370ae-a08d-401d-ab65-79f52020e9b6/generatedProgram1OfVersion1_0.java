class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Method 1: Recursive approach with a Node parameter
    void print_Preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " "); // Root
        print_Preorder(node.left);     // Left
        print_Preorder(node.right);    // Right
    }

    // Method 2:  Recursive approach without a Node parameter (uses root)
    void print_Preorder() {
        print_Preorder(root);  // Call the helper method with the root node
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal using print_Preorder(Node):");
        tree.print_Preorder(tree.root); // Call with root node
        System.out.println();


        System.out.println("Preorder traversal using print_Preorder():");
        tree.print_Preorder();          //  Call without parameters (uses root)
        System.out.println();


        // Example of an empty tree
        BinaryTree emptyTree = new BinaryTree();
        System.out.println("Preorder traversal of empty tree:");
        emptyTree.print_Preorder(); // Handling the empty tree case correctly

    }
}



