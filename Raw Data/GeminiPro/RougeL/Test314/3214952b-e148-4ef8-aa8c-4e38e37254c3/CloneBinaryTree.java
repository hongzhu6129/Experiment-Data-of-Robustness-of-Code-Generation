class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class CloneBinaryTree {

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode clonedTree = cloneTree(root);

        System.out.println("Original Tree:");
        traverseTree(root);
        System.out.println("\nCloned Tree:");
        traverseTree(clonedTree); 
    }

    public static TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode newNode = new TreeNode(root.val);
        newNode.left = cloneTree(root.left);
        newNode.right = cloneTree(root.right);

        return newNode;
    }

    private static void traverseTree(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            traverseTree(node.left);
            traverseTree(node.right);
        }
    }
}
