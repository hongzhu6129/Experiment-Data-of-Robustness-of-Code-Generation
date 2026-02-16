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
        root3.right = new TreeNode(4); // Different value


        System.out.println("Tree 1 and Tree 2 are identical: " + is_Identical_tree_node(root1, root2)); // Output: true
        System.out.println("Tree 1 and Tree 3 are identical: " + is_Identical_tree_node(root1, root3)); // Output: false


        // Test case for null trees:
        System.out.println("Two null trees are identical: " + is_Identical_tree_node(null, null)); // Output: true
        System.out.println("Null and non-null tree are identical: " + is_Identical_tree_node(root1, null)); // Output: false




    }

    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // If both nodes are null, they are identical
        if (p == null && q == null) {
            return true;
        }

        // If one is null and the other is not, they are not identical
        if (p == null || q == null) {
            return false;
        }

        // If the values are different, they are not identical
        if (p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return is_Identical_tree_node(p.left, q.left) && is_Identical_tree_node(p.right, q.right);
    }
}

