import java.util.LinkedList;
import java.util.Queue;

public class RemoveLastElementOfTree {

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Original Tree (Level Order):");
        printLevelOrder(root);

        TreeNode lastElement = removeLastElement(root);

        if (lastElement != null) {
            System.out.println("\nRemoved Last Element: " + lastElement.val);
            System.out.println("\nTree after removing last element (Level Order):");
            printLevelOrder(root);
        } else {
            System.out.println("\nTree is empty. No element to remove.");

        }
    }

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static TreeNode removeLastElement(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode lastNode = null;  // Keep track of the last node encountered

        while (!queue.isEmpty()) {
            lastNode = queue.poll();

            if (lastNode.left != null) {
                queue.offer(lastNode.left);
            }
            if (lastNode.right != null) {
                queue.offer(lastNode.right);
            }
        }

        if(root == lastNode) return removeRoot(root); //Special case if only the root exists

        queue.clear();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left!= null){
                if(current.left == lastNode){
                    current.left = null;
                    break;
                }
                queue.offer(current.left);
            }
             if(current.right!= null){
                if(current.right == lastNode){
                    current.right = null;
                    break;
                }
                queue.offer(current.right);
            }
        }


        return lastNode;

    }

        public static TreeNode removeRoot(TreeNode root){ //Helper function for removing the root
        return null; //returns null since we are deleting the root
    }
    


    // Helper function for level-order traversal (printing)
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            System.out.println(); // Move to next line after each level.
        }

    }

}
