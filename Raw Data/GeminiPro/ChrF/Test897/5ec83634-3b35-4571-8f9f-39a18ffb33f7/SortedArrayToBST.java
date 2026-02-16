public class SortedArrayToBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6}; // Example sorted array
        TreeNode root = sortedArrayToBST(nums);
        traverseTree(root); // Output: 2 1 4 6 5 3 (or a similar pre-order traversal)
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

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = creation(nums, start, mid - 1);
        root.right = creation(nums, mid + 1, end);

        return root;
    }

    private static void traverseTree(TreeNode root) { // Pre-order traversal
        if (root != null) {
            System.out.print(root.val + " ");
            traverseTree(root.left);
            traverseTree(root.right);
        }
    }
}
