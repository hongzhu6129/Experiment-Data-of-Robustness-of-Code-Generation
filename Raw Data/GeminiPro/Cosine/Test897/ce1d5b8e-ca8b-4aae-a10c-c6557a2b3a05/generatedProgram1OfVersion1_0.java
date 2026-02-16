public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        TreeNode root = sortedArrayToBST(nums);
        traverseTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return creation(nums, 0, nums.length - 1);
    }

    private static TreeNode creation(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2; // Avoid potential overflow
        TreeNode node = new TreeNode(nums[mid]);
        node.left = creation(nums, start, mid - 1);
        node.right = creation(nums, mid + 1, end);
        return node;
    }

    private static void traverseTree(TreeNode root) {
        if (root != null) {
            traverseTree(root.left);
            System.out.print(root.val + " ");
            traverseTree(root.right);

        }
    }



    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}



