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

    // Recursive helper function for Japanese-style preorder traversal
    void print_Preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " "); // Print the current node's data

        if (node.right != null) {           // Traverse right subtree first
            print_Preorder(node.right);
        }
        if (node.left != null) {            // Traverse left subtree second
            print_Preorder(node.left);
        }


    }

    // Wrapper function for Japanese-style preorder traversal
    void print_Preorder() {
        print_Preorder(root);
        System.out.println(); // Add a newline for clarity
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Japanese-style Preorder traversal of binary tree is ");
        tree.print_Preorder();

        // Another test case (empty tree)
        BinaryTree emptyTree = new BinaryTree();
        System.out.println("Japanese-style Preorder traversal of empty tree is ");
        emptyTree.print_Preorder();


         // Another test case (single node tree)
        BinaryTree singleNodeTree = new BinaryTree();
        singleNodeTree.root = new Node(8);
        System.out.println("Japanese-style Preorder traversal of single node tree is ");
        singleNodeTree.print_Preorder();

    }
}
