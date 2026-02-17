import java.util.LinkedList;
import java.util.Queue;

class Node {
    char data;
    Node left, right;

    Node(char item) {
        data = item;
        left = right = null;
    }
}

public class SubtreeCheck {

    // Method signatures provided in the prompt (filled with logic)

    static boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data &&
                areIdentical(root1.left, root2.left) &&
                areIdentical(root1.right, root2.right));
    }

    static boolean isSubtree(Node T, Node S) {
        if (S == null) {
            return true; // Empty tree is always a subtree
        }
        if (T == null) {
            return false; 
        }

        if (areIdentical(T, S)) {
            return true;
        }

        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }


    // Helper function for building tree from string (level order) 
    static Node buildTreeFromString(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(str.charAt(0));
        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < str.length()) {
            Node currNode = q.poll();

            if (str.charAt(i) != 'N') {
                currNode.left = new Node(str.charAt(i));
                q.add(currNode.left);
            }
            i++;

            if (i < str.length() && str.charAt(i) != 'N') {
                currNode.right = new Node(str.charAt(i));
                q.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String args[]) {
        String tree1Str = "xxyz"; // Example tree string
        String tree2Str = "yxzx"; // Example subtree string

        Node T = buildTreeFromString(tree1Str);
        Node S = buildTreeFromString(tree2Str);

        System.out.println("Original strings: " + tree1Str + " " + tree2Str + " " + isSubtree(T, S)); 

        // Another test case (true)
        T = buildTreeFromString("xyxz");
        S = buildTreeFromString("xz");
        System.out.println("Original strings: " + "xyxz" + " " + "xz" + " " + isSubtree(T, S));

        // Test case where S is larger than T (false)
        T = buildTreeFromString("ab");
        S = buildTreeFromString("abc");
        System.out.println("Original strings: " + "ab" + " " + "abc" + " " + isSubtree(T, S));

    }
}
