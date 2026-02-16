class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class IdenticalBinaryTrees {

    public static void main(String[] args) {
        // Example usage:
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(4); // Different value

        TreeNode tree4 = new TreeNode(1);
        tree4.left = new TreeNode(2);


        System.out.println("Tree 1 and Tree 2 are identical: " + is_Identical_tree_node(tree1, tree2)); // Output: true
        System.out.println("Tree 1 and Tree 3 are identical: " + is_Identical_tree_node(tree1, tree3)); // Output: false
        System.out.println("Tree 1 and Tree 4 are identical: " + is_Identical_tree_node(tree1, tree4)); // Output: false



    }

    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // Both nodes are null, they are identical
        if (p == null && q == null) {
            return true;
        }

        // One is null and the other isn't, they are not identical
        if (p == null || q == null) {
            return false;
        }

        // If values don't match, they are not identical
        if (p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return is_Identical_tree_node(p.left, q.left) && is_Identical_tree_node(p.right, q.right);
    }
}
