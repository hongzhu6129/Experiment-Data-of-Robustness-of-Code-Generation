class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class IdenticalTrees {

    public static void main(String[] args) {
        // Example usage:
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);


        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);


        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(2);

        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(4);



        System.out.println("Tree 1 and Tree 2 are identical: " + is_Identical_tree_node(root1, root2)); // Output: true
        System.out.println("Tree 1 and Tree 3 are identical: " + is_Identical_tree_node(root1, root3)); // Output: false
        System.out.println("Tree 3 and Tree 4 are identical: " + is_Identical_tree_node(root3, root4)); // Output: false
        System.out.println("Tree 1 and Tree 5 are identical: " + is_Identical_tree_node(root1, root5)); // Output: false


    }

    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // If both nodes are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        // If one node is null and the other is not, they are not identical
        if (p == null || q == null) {
            return false;
        }
        // If the values of the current nodes are different, they are not identical
        if (p.val != q.val) {
            return false;
        }
        // Recursively check if the left and right subtrees are identical
        return is_Identical_tree_node(p.left, q.left) && is_Identical_tree_node(p.right, q.right);


    }
}
