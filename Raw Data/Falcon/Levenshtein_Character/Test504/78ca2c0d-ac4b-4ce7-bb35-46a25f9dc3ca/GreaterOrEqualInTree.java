import java.util.TreeSet;

public class GreaterOrEqualInTree {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int element = 25;

        Integer greaterOrEqual = treeSet.ceiling(element);  // Find the smallest element >= 'element'

        if (greaterOrEqual != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqual);
        } else {
            System.out.println("No element found greater than or equal to " + element);
        }


        element = 15; // Example 2
        greaterOrEqual = treeSet.ceiling(element);

        if (greaterOrEqual != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqual);
        } else {
            System.out.println("No element found greater than or equal to " + element);
        }

         element = 60; // Example 3: Element larger than any in the tree
        greaterOrEqual = treeSet.ceiling(element);

        if (greaterOrEqual != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqual);
        } else {
            System.out.println("No element found greater than or equal to " + element);
        }

    }
}
