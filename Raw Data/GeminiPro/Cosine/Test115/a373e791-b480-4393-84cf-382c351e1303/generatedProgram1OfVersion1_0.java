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

    // Method to print preorder traversal of the tree
    void print_Preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        print_Preorder(node.left);
        print_Preorder(node.right);
    }


    void print_Preorder() {
        print_Preorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.print_Preorder();
    }
}
