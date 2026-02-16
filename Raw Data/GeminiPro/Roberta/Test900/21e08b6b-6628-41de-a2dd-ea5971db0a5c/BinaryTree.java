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

class BinaryTree {

    boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        return (root1.data == root2.data
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right));
    }


    boolean isSubtree(Node T, Node S) {
        if (S == null)
            return true;

        if (T == null)
            return false;

        if (areIdentical(T, S))
            return true;

        return isSubtree(T.left, S)
                || isSubtree(T.right, S);
    }



    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        Node T = new Node('x');
        T.left = new Node('x');
        T.right = new Node('y');
        T.left.left = new Node('z');


        Node S = new Node('x');
        S.left = new Node('y');
        S.right = new Node('z');



        if (tree.isSubtree(T, S))
            System.out.println("true");
        else
            System.out.println("false");



         T = new Node('x');
        T.left = new Node('x');
        T.right = new Node('y');
        T.left.left = new Node('z');


        S = new Node('x');
        S.left = new Node('x');
        S.right = new Node('z');



        if (tree.isSubtree(T, S))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
