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

    // Method signature as requested: void print_Preorder(Node)
    void print_Preorder(Node node) {
        if (node == null) {
            return;
        }

        // Preorder: root, left, right
        System.out.print(node.data + " ");
        print_Preorder(node.left);
        print_Preorder(node.right);
    }

    // Method signature as requested: void print_Preorder()
    void print_Preorder() {
        print_Preorder(root);  // Call the helper method with the root node
        System.out.println(); // Add a newline for cleaner output
    }


    // Method signature as requested: void main(String[])
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);


        System.out.println("Preorder traversal of binary tree is ");
        tree.print_Preorder();

       
    }
}
